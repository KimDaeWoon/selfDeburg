package com.deburger.app.office.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service
public class RedisService {
	
	@Autowired
	private StringRedisTemplate stringRedisTemplate; 
	
	public void getRedisValue(String key) {
		ValueOperations<String, String> valueOperations = stringRedisTemplate.opsForValue();
		System.out.println("redis key" + key);
		System.out.println("reids value" + valueOperations.get(key));
	}
}
