package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i, j;
        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= 9; j++)
                System.out.printf("%d*%d=%d\n", i, j, i * j);

        }
    }
}
