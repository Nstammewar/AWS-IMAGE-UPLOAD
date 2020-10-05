package com.reactInmage.aws_image_upload.datastore;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.reactInmage.aws_image_upload.profile.UserProfile;


@Repository
public class FakeUserProfileDataStore {
	private static  final List<UserProfile>USER_PROFILE=new ArrayList<>();
	
	static {
		USER_PROFILE.add(new UserProfile(UUID.fromString("cabc0913-da01-4ff6-af93-a03bf051da70"),"Pooja Q",null));
		USER_PROFILE.add(new UserProfile(UUID.fromString("db466378-43cc-4b7c-8dff-55a0f611b95f"),"Nilesh Tammewar",null));
	}
	public List<UserProfile> getUserProfiles(){
		 return USER_PROFILE;
	}
}
