/*
 * File Name: JedisClientTest.java
 * Class Name: JedisClientTest
 *
 * Copyright 2014 Hengtian Software Inc
 *
 * Licensed under the Hengtiansoft
 *
 * http://www.hengtiansoft.com
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.doris.redisDemo;

import java.util.HashSet;
import java.util.Set;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;

/**
 * @author tingxing
 *
 */
public class JedisClientTest {
    
    public static void main(String[] args){
        Set<HostAndPort> jedisClusterNodes = new HashSet<HostAndPort>();
        //Jedis Cluster will attempt to discover cluster nodes automatically
        jedisClusterNodes.add(new HostAndPort("172.16.129.90", 6380));
        jedisClusterNodes.add(new HostAndPort("172.16.129.90", 6381));
        jedisClusterNodes.add(new HostAndPort("172.16.129.90", 6382));
        JedisCluster jc = new JedisCluster(jedisClusterNodes);
        System.out.println(jc.get("foo"));
    }
    

}
