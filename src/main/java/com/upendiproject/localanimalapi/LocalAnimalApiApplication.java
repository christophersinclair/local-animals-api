package com.upendiproject.localanimalapi;

import com.upendiproject.localanimalapi.config.FileStorageProperties;
import com.upendiproject.localanimalapi.service.FileStorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@EnableConfigurationProperties(FileStorageProperties.class)
@SpringBootApplication
public class LocalAnimalApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocalAnimalApiApplication.class, args);
	}

	@Bean
	CommandLineRunner init(FileStorageService fileStorageService) {
		return (args) -> {
			fileStorageService.init();
		};
	}

}
