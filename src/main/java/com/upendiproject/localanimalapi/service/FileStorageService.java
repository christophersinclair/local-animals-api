package com.upendiproject.localanimalapi.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileStorageService {

    void init();

    void store(MultipartFile multipartFile);
}
