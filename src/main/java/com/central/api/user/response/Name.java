package com.central.api.user.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;

import java.io.Serial;
import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
public class Name extends GenericJackson2JsonRedisSerializer implements Serializable {

    @Serial
    private static final long serialVersionUID = -5633315560265232645L;

    private String last;
    private String title;
    private String first;
}