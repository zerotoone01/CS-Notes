package com.huangxi.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @description TODO
 * @date 2020-08-04
 */
public class TimerUtil {

    public static Map<String,Long> gapTimeStart(){
        Map<String,Long> map = new HashMap<String, Long>();
        long millStartTime = System.currentTimeMillis();
        long nanoStartTime = System.nanoTime();
        map.put("millStartTime",millStartTime);
        map.put("nanoStartTime",nanoStartTime);
        return map;
    }

    public static String gapTimeStatistic(Map<String,Long> startTimePointMap){
        Long millStartTime = startTimePointMap.get("millStartTime");
        if(millStartTime!=null){
            long costTime = System.currentTimeMillis() - millStartTime;
            if(costTime>0){
                return "costTime="+costTime+" ms";
            }
        }
        Long nanoStartTime = startTimePointMap.get("nanoStartTime");
        if(nanoStartTime!=null){
            long costTimeNano = System.nanoTime() - nanoStartTime;
            return "costTime="+costTimeNano+" ns";
        }
        return "no time";
    }
}
