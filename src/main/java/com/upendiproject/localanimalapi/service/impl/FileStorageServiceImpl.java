package com.upendiproject.localanimalapi.service.impl;

import com.upendiproject.localanimalapi.config.FileStorageProperties;
import com.upendiproject.localanimalapi.dao.UpdateSightingDao;
import com.upendiproject.localanimalapi.exception.FileStorageException;
import com.upendiproject.localanimalapi.service.FileStorageService;
import com.upendiproject.localanimalapi.service.IDGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class FileStorageServiceImpl implements FileStorageService {

    private final Path rootLocation;

    @Autowired
    IDGeneratorService idGeneratorService;

    @Autowired
    UpdateSightingDao updateSightingDao;

    @Autowired
    public FileStorageServiceImpl(FileStorageProperties fileStorageProperties) {
        this.rootLocation = Paths.get(fileStorageProperties.getLocation());
    }

    @Override
    public void store(MultipartFile multipartFile) {
        try {
            if (multipartFile.isEmpty()) {
                throw new FileStorageException("Failed to store empty file.");
            }
            Path destinationFile = this.rootLocation.resolve(Paths.get(multipartFile.getOriginalFilename())).normalize().toAbsolutePath();
            if (!destinationFile.getParent().equals(this.rootLocation.toAbsolutePath())) {
                throw new FileStorageException("Cannot store file outside current directory.");
            }
            try (InputStream inputStream = multipartFile.getInputStream()) {
                Files.copy(inputStream, destinationFile, StandardCopyOption.REPLACE_EXISTING);
                Long fileID = idGeneratorService.generate();
                Files.move(destinationFile, destinationFile.resolveSibling(fileID.toString()+".png"));
            }
        } catch (IOException ex) {
            throw new FileStorageException("Failed to store file.", ex);
        }
    }

    @Override
    public void store(MultipartFile multipartFile, Long sightingID) {
        try {
            if (multipartFile.isEmpty()) {
                throw new FileStorageException("Failed to store empty file.");
            }
            Path destinationFile = this.rootLocation.resolve(Paths.get(multipartFile.getOriginalFilename())).normalize().toAbsolutePath();
            if (!destinationFile.getParent().equals(this.rootLocation.toAbsolutePath())) {
                throw new FileStorageException("Cannot store file outside current directory.");
            }
            try (InputStream inputStream = multipartFile.getInputStream()) {
                Files.copy(inputStream, destinationFile, StandardCopyOption.REPLACE_EXISTING);
                Long fileID = idGeneratorService.generate();
                Files.move(destinationFile, destinationFile.resolveSibling(fileID.toString()+".png"));

                updateSightingDao.updateSighting(sightingID, fileID);
            }
        } catch (IOException ex) {
            throw new FileStorageException("Failed to store file.", ex);
        }
    }

    @Override
    public void init() {
        try {
            Files.createDirectories(rootLocation);
        } catch (IOException ex) {
            throw new FileStorageException("Could not initialize storage", ex);
        }
    }
}
