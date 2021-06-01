package com.upendiproject.localanimalapi.controller;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.NoHandlerFoundException;

import static org.junit.Assert.*;

import javax.servlet.http.HttpServletRequest;

public class BaseControllerTest {

    @Mock
    HttpServletRequest mockedRequest;

    @InjectMocks
    BaseController baseControllerTest;

    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void handleExceptionWhenException() throws Exception {
        ResponseEntity response = baseControllerTest.handleException(mockedRequest, new Exception("Test generic exception"));
        assertEquals(response.getStatusCodeValue(), 500);
    }

    @Test
    public void handleExceptionWhenRuntimeException() throws RuntimeException {
        ResponseEntity response = baseControllerTest.handleRuntimeException(mockedRequest, new RuntimeException("Test runtime exception"));
        assertEquals(response.getStatusCodeValue(), 500);
    }

    @Test
    public void handleExceptionWhenNoHandlerFoundException() throws NoHandlerFoundException {
        ResponseEntity response = baseControllerTest.handle404Exception(mockedRequest, new NoHandlerFoundException("GET", "upendiproject.com", null));
        assertEquals(response.getStatusCodeValue(), 404);
    }

}
