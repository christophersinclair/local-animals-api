package com.upendiproject.localanimalapi.exception;

public class StorageFileNotFoundException extends FileStorageException {

    public StorageFileNotFoundException(String message) {
        super(message);
    }

    public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
