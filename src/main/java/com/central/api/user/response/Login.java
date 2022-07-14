package com.central.api.user.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;

import java.io.Serial;
import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
public class Login extends GenericJackson2JsonRedisSerializer implements Serializable {

    @Serial
    private static final long serialVersionUID = -635490846136683547L;

    private String sha1;
    private String password;
    private String salt;
    private String sha256;
    private String uuid;
    private String username;
    private String md5;
}