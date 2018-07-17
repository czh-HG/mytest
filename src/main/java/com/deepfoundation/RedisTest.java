package com.deepfoundation;

import redis.clients.jedis.Jedis;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RedisTest {
    public static void main(String a[]){
        //连接本地redis
        Jedis jedis = new Jedis("localhost");

        System.out.println("连接成功");
        //ping一下
        System.out.println(jedis.ping());

        //设置字符串数据
//        jedis.set("stringkey","sss");
//        System.out.println(jedis.get("stringkey"));
//
//        //存储数据到列表
//        jedis.lpush("list","123");
//        jedis.lpush("list","456");
//        jedis.lpush("list","789");
//        List<String> list = jedis.lrange("list",0,2);
//        for (String s:list
//             ) {
//            System.out.println(s);
//        }

        //获取所有redis键值

        Set<String> keys = jedis.keys("*");
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key);
        }
    }
}
