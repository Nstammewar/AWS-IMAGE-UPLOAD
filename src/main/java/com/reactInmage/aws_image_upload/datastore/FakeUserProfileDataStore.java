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
		USER_PROFILE.add(new UserProfile(UUID.randomUUID(),"PoojaQ",null));
		USER_PROFILE.add(new UserProfile(UUID.randomUUID(),"PoojaQ",null));
	}
	public List<UserProfile> getUserProfiles(){
		 return USER_PROFILE;
	}
}
