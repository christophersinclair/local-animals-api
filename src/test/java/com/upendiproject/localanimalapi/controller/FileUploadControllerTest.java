package com.upendiproject.localanimalapi.controller;

import com.upendiproject.localanimalapi.service.FileStorageService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockMultipartFile;

import static org.mockito.BDDMockito.then;

@SpringBootTest
public class FileUploadControllerTest {

    @Autowired
    private FileStorageService fileStorageService;

    @InjectMocks
    FileUploadController fileUploadControllerTest;

    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void shouldSaveUploadedFile() throws Exception {
        MockMultipartFile multipartFile = new MockMultipartFile("file", "test.txt", "text/plain", "File upload test".getBytes());
        ResponseEntity response = fileUploadControllerTest.handleFileUpload(multipartFile);
        then(this.fileStorageService).should().store(multipartFile);
    }
}
