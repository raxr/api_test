package com.central.api.user.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;

import java.io.Serial;
import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class ResultsItem extends GenericJackson2JsonRedisSerializer implements Serializable {

    @Serial
    private static final long serialVersionUID = 7250414658429213437L;

    private String nat;
    private String gender;
    private String phone;
    private Dob dob;
    private Name name;
    private Registered registered;
    private Location location;
    private Id id;
    private Login login;
    private String cell;
    private String email;
    private Picture picture;
}