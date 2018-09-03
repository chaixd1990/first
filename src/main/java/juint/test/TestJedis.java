package juint.test;

import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Map;

public class TestJedis {

    public static void main(String[] args) {
        // 连接远程redis数据库
        Jedis jedis = new Jedis("192.168.238.128",6379);
        // 设置使用的数据库
        jedis.select(14);

        // String类型
        jedis.set("jobs","Java工程师");
        System.out.println(jedis.get("jobs"));
        jedis.set("count","23");
        System.out.println(jedis.get("count"));
        jedis.incrBy("count",10);
        System.out.println(jedis.get("count"));

        // Hash类型


        // list

        // set

        // sorted set (zset)
        Map<String ,Double> zmap = new HashMap();
        zmap.put("语文",88.0);
        zmap.put("数学",99.0);
        zmap.put("英语",77.0);
        zmap.put("体育",99.9);

        Long zset1 = jedis.zadd("zset1", zmap);
        System.out.println(zset1);

    }
}
