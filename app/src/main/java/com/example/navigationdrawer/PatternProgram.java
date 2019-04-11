package com.example.navigationdrawer;

/**
 * if(j%2 == 0) Check for Rows Even/Odd
 * For columns, check (i%2 == 0) to print even/odd
 */

public class PatternProgram {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j % 2 == 0 ? (i % 2 == 0 ? "#" : "*") : (i % 2 == 0 ? "*" : "#"));
            }
            System.out.println();
        }
    }
}
