package com.upendiproject.localanimalapi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "storage")
public class FileStorageProperties {

    private String location;

    public String getLocation() { return location; }

    public void setLocation(String location) { this.location = location; }
}
