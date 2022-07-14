package com.central.api.user.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;

import java.io.Serial;
import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
public class Dob extends GenericJackson2JsonRedisSerializer implements Serializable {

	@Serial
	private static final long serialVersionUID = -4134888114202009587L;

	private String date;
	private int age;
}