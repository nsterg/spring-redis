package com.redis.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import com.redis.spring.data.User;

@Component
public class RegistrationBean {
    @Autowired
    private RedisTemplate<String,User> redisTemplate;
 
    public RedisTemplate<String, User> getRedisTemplate() {
        return redisTemplate;
    }
 
    public void setRedisTemplate(RedisTemplate<String, User> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }
}

