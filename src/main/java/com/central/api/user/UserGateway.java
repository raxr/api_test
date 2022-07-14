package com.central.api.user;

import com.central.api.user.response.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "userGateway", url = "https://randomuser.me", path = "/api/")
public interface UserGateway {

    @GetMapping
    UserResponse getUserProfile();

    @GetMapping
    UserResponse getUserProfileBySeeds(@RequestParam(name = "seed") String seed);
}
