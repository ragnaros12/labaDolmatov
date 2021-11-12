package com.company;

import java.util.Scanner;

public class Second {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int max = Math.max(a,b);
        System.out.println(max);
        System.out.println(Math.cos(max));
    }
}
