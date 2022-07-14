package com.central.api.user.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;

import java.io.Serial;
import java.io.Serializable;


@Data
@EqualsAndHashCode(callSuper = true)
public class Info extends GenericJackson2JsonRedisSerializer implements Serializable {

    @Serial
    private static final long serialVersionUID = -8249674654974177893L;

    private String seed;
    private int page;
    private int results;
    private String version;
}