package com.central.api.user;

import com.central.api.user.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserGateway userGateway;

    @Override
    public UserResponse getUSerProfile() {
        return userGateway.getUserProfile();
    }

    @Override
    @Cacheable(value = "userCache")
    public UserResponse getUserProfileBySeeds(String seed) {
        return userGateway.getUserProfileBySeeds(seed);
    }

}
