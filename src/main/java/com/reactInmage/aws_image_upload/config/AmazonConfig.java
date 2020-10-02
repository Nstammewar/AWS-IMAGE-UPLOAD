package com.reactInmage.aws_image_upload.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

@Configuration
public class AmazonConfig {
	@Bean
	public AmazonS3 s3() {
		AWSCredentials awsCredentials= new BasicAWSCredentials(
				"AKIAJBWXQDY36CEC7OUQ",
				"nfpXGjRPReIXqyAk1RcWXLGTmhO73cxMZX2qQ5Fo"
				);
		return AmazonS3ClientBuilder
				.standard().withRegion("us-east-1")
				.withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
				.build();
		
	}
}
