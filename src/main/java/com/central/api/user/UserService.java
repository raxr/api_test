package com.central.api.user;

import com.central.api.user.response.UserResponse;

public interface UserService {

    UserResponse getUSerProfile();

    UserResponse getUserProfileBySeeds(String seed);
}
