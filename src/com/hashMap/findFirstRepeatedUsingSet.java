package com.hashMap;

import java.util.HashSet;
import java.util.Set;

public class findFirstRepeatedUsingSet {
    private Set<Character> set = new HashSet<>();

    public char repeated(String sentence){
        var array = sentence.toCharArray();
        for(var item : array){
            if(set.contains(item))
                return item;
            set.add(item);
        }
        return Character.MIN_VALUE;
    }
}
