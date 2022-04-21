package com.hashMap;

import java.util.HashMap;
import java.util.Map;

//note commented code is my implementation

public class findNonRepeatedUsingHashmap {
    private Map<Character,Integer> map = new HashMap<>();


    public char nonRepeated(String sentence){
        var array = sentence.toCharArray();
        for(var item : array){
            var count = map.containsKey(item) ? map.get(item) : 0;
            map.put(item,count + 1);
//            if(map.containsKey(item)) {
//                var value = map.get(item) + 1;
//                map.put(item,value);
//            }
//            else{
//                map.put(item,count);
//            }
        }

        for (var item : array){
//            if(map.get(item) == 0)
            if(map.get(item) == 1)
                return item;
        }
        return Character.MIN_VALUE;
    }
}
