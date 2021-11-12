package com.company;

import java.util.Scanner;

public class First {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double x = scanner.nextInt();
        double y = scanner.nextInt();

        System.out.println(Math.min(x,y) / 2);
    }
}
