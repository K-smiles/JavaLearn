package com.chelu;

import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.Map;

public class test {

    @Test
    public void testString() {

        JedisPool pool = new JedisPool("localhost", 6379);
        Jedis jedis = pool.getResource();
        // 存入数据
        String result = jedis.set("name", "虎哥");
        System.out.println("result = " + result);
        // 获取数据
        String name = jedis.get("name");
        System.out.println("name = " + name);
    }

    @Test
    public void testHash() {
        JedisPool pool = new JedisPool("localhost", 6379);
        Jedis jedis = pool.getResource();
        // 插入hash数据
        jedis.hset("user:1", "name", "Jack");
        jedis.hset("user:1", "age", "21");

        // 获取
        Map<String, String> map = jedis.hgetAll("user:1");
        System.out.println(jedis.get("name"));
        System.out.println(map);
    }

}
