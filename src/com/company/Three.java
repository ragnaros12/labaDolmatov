package com.company;

public class Three {
    public static void main(String[] args){
        int x = 10;
        if(x <= -3){
            System.out.println("y = " + (Math.pow(x, 3) + 1));
            System.out.println("f = " + Math.pow(Math.E, x + 1));
        }
        else if(x > -3 && x <= 0){
            System.out.println("y = " + (1 + Math.pow(2, Math.tan(x))));
            System.out.println("f = " + Math.pow(x, 4));
        }
        else{
            System.out.println("y = " + (Math.pow(1 / Math.tan(x), 2)));
            System.out.println("f = " + Math.pow(Math.tan(x), 0.25));
        }
    }
}
