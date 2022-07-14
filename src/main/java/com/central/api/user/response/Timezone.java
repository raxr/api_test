package com.central.api.user.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;

import java.io.Serial;
import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
public class Timezone extends GenericJackson2JsonRedisSerializer implements Serializable {

	@Serial
	private static final long serialVersionUID = 6922203991487943205L;

	private String offset;
	private String description;
}