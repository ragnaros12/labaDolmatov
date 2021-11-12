package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Vector;

public class Six {
    static int[][] Array = new int[5][6];
    static Random random = new Random();
    static Vector<Integer> B = new Vector<>();
    public static void main(String[] args){
        for (int i = 0; i < Array.length; i++){
            for (int i1 = 0; i1 < Array[i].length; i1++) {
                Array[i][i1] = -5 + random.nextInt(10);
            }
            System.out.println(Arrays.toString(Array[i]));
        }

        for (int i = 0; i < Array.length; i++){
            int count = 0;
            for (int i1 = 0; i1 < Array[i].length; i1++){
                if(Array[i][i1] % 2 == 0)
                    count++;
            }
            B.add(count);
        }

        System.out.println(B.toString());
    }
}
