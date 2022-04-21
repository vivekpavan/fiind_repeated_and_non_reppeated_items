package com.hashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        //findNonRepeatedUsingHashmap
        var nonRep = new findNonRepeatedUsingHashmap();
        var chars = nonRep.nonRepeated("vivek i");
        System.out.println(chars);

        //findNonRepeated (MINE : I DID IT USING 2 ARRAYS)
        var nonRepeated = new findNonRepeated("vivek i");
        System.out.println(nonRepeated.repeated());

        //findFirstRepeatedUsingHashMap (MINE : I DID IT USING HASHMAP)
        var rep = new findFirstRepeatedUsingHashMap();
        var item = rep.firstRepeated("vivek i");
        System.out.println(item);

        //findFirstRepeatedUsingSet
        var repeated = new findFirstRepeatedUsingSet();
        var value = repeated.repeated("vivek i");
        System.out.println(value);
    }
}
