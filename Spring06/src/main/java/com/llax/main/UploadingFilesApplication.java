package com.llax.main;

import com.llax.main.storage.StorageProperties;
import com.llax.main.storage.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
// Tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings. 
// For example, if spring-webmvc is on the classpath, 
// this annotation flags the application as a web application and activates key behaviors, 
// such as setting up a DispatcherServlet
public class UploadingFilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(UploadingFilesApplication.class, args);
	}

	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (args) -> {
			storageService.deleteAll();
			storageService.init();
		};
	}
}
