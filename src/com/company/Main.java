package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisi eleman sayısı : ");

        int n = input.nextInt();

        int x = 0;
        int y = 1;
        int total;

        for (int i = 1; i <= n; i++){
            System.out.print(x + " , ");

            total = x + y;
            x = y;
            y  = total;

        }






    }
}
