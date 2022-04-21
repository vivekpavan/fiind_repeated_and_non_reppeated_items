package com.hashMap;

public class findNonRepeated {
    private String sentence;
    private int count;
    public findNonRepeated(String sentence){
        this.sentence =sentence;
    }
    public char repeated(){
        String sentence1 = sentence.trim();
        String sentence2 = sentence1.replaceAll(" ","");
        var array1 = sentence2.toCharArray();
        char[] array2 = new char[array1.length];
        for(var i = 0;i < array1.length;i++){
            array2[i] = array1[i];
        }
        for(var i = 0;i < array1.length;i++){
            for(var j = 0;j < array1.length;j++) {
                if(i == j) continue;
                if (array1[i] == array2[j]) count++;
            }
                if(count == 0) return ((array1[i]));
                count =0;
        }
        //just for the sake of returning something we return the below statement
        return Character.MIN_VALUE;
    }
}
