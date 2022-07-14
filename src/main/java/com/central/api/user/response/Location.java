package com.central.api.user.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;

import java.io.Serial;
import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
public class Location extends GenericJackson2JsonRedisSerializer implements Serializable {

	@Serial
	private static final long serialVersionUID = -5130618265034034422L;

	private String country;
	private String city;
	private Street street;
	private Timezone timezone;
	private int postcode;
	private Coordinates coordinates;
	private String state;
}