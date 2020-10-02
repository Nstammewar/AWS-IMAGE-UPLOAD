package com.reactInmage.aws_image_upload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@PropertySources({
		@PropertySource("classpath:application.properties"),
		@PropertySource("classpath:auth.properties")
})
public class AwsImageUploadApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsImageUploadApplication.class, args);
	}
}
