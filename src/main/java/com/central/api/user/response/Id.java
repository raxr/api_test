package com.central.api.user.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;

import java.io.Serial;
import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
public class Id extends GenericJackson2JsonRedisSerializer implements Serializable {

	@Serial
	private static final long serialVersionUID = -2028609976904506971L;

	private String name;
	private String value;
}