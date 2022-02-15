package com.ccsun.rediscluster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class RedisclusterApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisclusterApplication.class, args);
    }

}
