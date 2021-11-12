package com.company;

import java.util.Arrays;
import java.util.Random;

public class Seven {
    static int[][] Array = new int[4][4];
    static Random random = new Random();
    public static void main(String[] args){
        for (int i = 0; i < Array.length; i++){
            for (int i1 = 0; i1 < Array[i].length;i1++){
                Array[i][i1] = -5 + random.nextInt(10);
            }
            System.out.println(Arrays.toString(Array[i]));
        }

        int geom = 1;
        for (int i = 0; i < Array.length - 1; i++){
            if(Array[i + 1][i] < 0) {
                geom *= Array[i + 1][i];
            }
        }

        System.out.println(geom);
        System.out.println(Math.pow(geom, 1f / (Array.length - 1)));
    }
}
