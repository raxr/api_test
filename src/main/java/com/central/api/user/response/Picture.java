package com.central.api.user.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;

import java.io.Serial;
import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
public class Picture extends GenericJackson2JsonRedisSerializer implements Serializable {

	@Serial
	private static final long serialVersionUID = 4546680889756524929L;

	private String thumbnail;
	private String large;
	private String medium;
}