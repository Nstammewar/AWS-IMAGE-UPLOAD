package com.reactInmage.aws_image_upload.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

@Configuration
public class AmazonConfig {
	@Value("${accessKey}")
	private String accessKey;
	@Value("${secretKey}")
	private String secretKey;
	@Bean
	public AmazonS3 s3() {
		System.out.println(accessKey+"   "+secretKey);
		AWSCredentials awsCredentials= new BasicAWSCredentials(
				accessKey,secretKey
				);
		return AmazonS3ClientBuilder
				.standard().withRegion("us-east-1")
				.withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
				.build();
		
	}
}
