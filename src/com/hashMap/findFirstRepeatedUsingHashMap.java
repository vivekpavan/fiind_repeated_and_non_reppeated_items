package com.hashMap;

import java.util.HashMap;
import java.util.Map;

public class findFirstRepeatedUsingHashMap {
    private Map<Character,Integer> map = new HashMap<>();

    public char firstRepeated(String sentence){
        var array =sentence.toCharArray();
        for(var chars : array){
            var count = map.containsKey(chars) ? map.get(chars) : 0;
            map.put(chars,count + 1);
        }
        for(var item : array){
            if(map.get(item) > 1) return item;
        }
        return Character.MIN_VALUE;
    }
}
