package com.central.api.user;

import com.central.api.user.request.UserRequest;
import com.central.api.user.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<UserResponse> getUserProfile() {
        return ResponseEntity.ok(userService.getUSerProfile());
    }

    @GetMapping("/")
    public ResponseEntity<UserResponse> getUserProfileBySeeds(@RequestBody UserRequest userRequest) {
        return ResponseEntity.ok(userService.getUserProfileBySeeds(userRequest.getSeed()));
    }

}
