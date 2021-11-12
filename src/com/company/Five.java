package com.company;

import java.util.Arrays;
import java.util.Random;

public class Five {
    static int[] Array = new int[10];
    static int[] NewArray;
    static int counter = 0, max;
    static Random random = new Random();
    public static void main(String[] args){
        for (int i = 0; i < Array.length; i++){
            Array[i] = -5 + random.nextInt(10);
            if(Array[i] != 0)
                counter++;
        }
        System.out.println(Arrays.toString(Array));

        NewArray = new int[counter];
        max = counter;

        for (int i = 0; i < Array.length; i++){
            if(Array[i] != 0) {
                NewArray[max - counter] = (int) Math.pow(Array[i],2);
                counter--;
            }
        }

        for (int i = 0; i < NewArray.length; i++) {
            int min = NewArray[i];
            int min_i = i;
            for (int j = i+1; j < NewArray.length; j++) {
                if (NewArray[j] < min) {
                    min = NewArray[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = NewArray[i];
                NewArray[i] = NewArray[min_i];
                NewArray[min_i] = tmp;
            }
        }

        System.out.println(Arrays.toString(NewArray));
    }
}
