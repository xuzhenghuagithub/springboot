package com.cnpc.redisson;

import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @SuppressWarnings("all")
    @Autowired
    RedissonClient redissonClient;

    @GetMapping("/redisson")
    public String say()
    {
        RBucket bucket = redissonClient.getBucket("name");
        if(bucket!=null){
            bucket.set("com.cnpc");

        }
        return bucket.get().toString();
    }
}
