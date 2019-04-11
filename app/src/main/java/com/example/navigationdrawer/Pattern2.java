package com.example.navigationdrawer;

public class Pattern2 {

    public static void main(String[] args) {

        int n = 10;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (j % 2 == 0) {
                    if (i % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print("#");
                    }
                } else {
                    if (i % 2 == 0) {
                        System.out.print("#");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }

    }
}
