package Connect;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Connection;

public class ConnectToRedis {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("redis://default:ykqGawU8o0lPiz458Mrv7g0nBBX3vSOr@redis-14583.c246.us-east-1-4.ec2.cloud.redislabs.com:14583");
        Connection connection = jedis.getConnection();

        String id = jedis.get("id");
        System.out.println("id: " + id );

        String desc = jedis.get("desc");
        System.out.println("desc: " + desc );
    }
}