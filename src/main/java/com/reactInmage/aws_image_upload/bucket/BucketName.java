package com.reactInmage.aws_image_upload.bucket;

public enum BucketName {
	PROFILE_IMAGE("ntreact-spring-image");
	
	private final String name;
	
	public String getName() {
		return name;
	}
	BucketName( String name){
		this.name=name;
	}
}
