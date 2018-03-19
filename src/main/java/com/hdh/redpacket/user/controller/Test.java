package com.hdh.redpacket.user.controller;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.hdh.redpacket.core.config.RedisTool;
import com.hdh.redpacket.user.model.UserProperty;
import redis.clients.jedis.Jedis;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Test {

//    static LoadingCache<String, String> loadingCache = CacheBuilder.newBuilder()
//            .expireAfterWrite(15, TimeUnit.SECONDS)
//            .maximumSize(1024)
//            .build(new CacheLoader<String, String>() {
//                @Override
//                public String load(String s) throws Exception {
//                    return get(s);
//                }
//            });
//
//    private static Map<String,String> map = new HashMap<>();

    public static void main(String[] args) throws ExecutionException {
        Jedis jedis = RedisTool.getJedis();
        jedis.set("name","aaa");
        jedis.expire("name",2);
        System.out.println(jedis.get("name"));
        RedisTool.returnResource(jedis);
    }


//    public static BigDecimal getWinProbability(List<UserProperty> userProperties){
//        if(userProperties == null || userProperties.size() < 1){
//            return BigDecimal.ZERO;
//        }
//
//        BigDecimal winProb = BigDecimal.ZERO;
//        Map<String,BigDecimal> winProbMap = new HashMap<>();
//        for(int i=0;i<userProperties.size();i++){
//            BigDecimal oneTime = BigDecimal.ONE;
//            for(int j=0;j<userProperties.size();j++){
//                if(i == j){
//                    oneTime = oneTime.multiply(userProperties.get(i).getWinProbability()==null?BigDecimal.ZERO:userProperties.get(i).getWinProbability());
//                }else{
//                    oneTime = oneTime.multiply(new BigDecimal(100).subtract(userProperties.get(j).getWinProbability()==null?BigDecimal.ZERO:userProperties.get(j).getWinProbability()));
//                }
//            }
//            winProb = winProb.add(oneTime);
//        }
//
//        return winProb.divide(new BigDecimal(Math.pow(100,userProperties.size())));
//    }
//    private static String get(String s){
//        System.out.println("get from map");
//        return map.get(s);
//    }
}
