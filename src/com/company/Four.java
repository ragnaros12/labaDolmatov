package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Four {/////
    static int[] Array = {2,2,6,4,4};
    static ArrayList<Integer> tweens = new ArrayList<>();
    public static void main(String[] args){
        for(int i=0; i< Array.length; i++) {
            for (int j=i+1; j< Array.length; j++) {
                if(Array[i] == Array[j]) {
                    if(!tweens.contains(Array[i]))
                        tweens.add(Array[i]);
                }
            }
        }
        System.out.println(tweens);
    }
}
