package com.jobs.awsimageupload.datastore;

import com.jobs.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("37f15c0b-8ad7-4444-8176-f961fb9eeda4"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("e5c93b40-9059-48c1-ba71-0632b36972d9"), "antoniojunior", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
