package com.ccsun.rediscluster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping(value = "/")
    public String index() {
        redisTemplate.opsForValue().set("tester", "123");
        String tester = (String) redisTemplate.opsForValue().get("tester");
        System.out.println("tester is " + tester);
        return tester;
    }

}
