package org.self.management.utils;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Component
public class RedisTemplate {

    private final StringRedisTemplate template;

    public RedisTemplate(StringRedisTemplate template) {
        this.template = template;
    }

}
