package com.central.api.user.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;

import java.io.Serial;
import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
public class Street extends GenericJackson2JsonRedisSerializer implements Serializable {

    @Serial
    private static final long serialVersionUID = -4330211463117327797L;

    private int number;
    private String name;
}