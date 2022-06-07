package com.company;

import java.util.Scanner;

public class Fibonacci Numbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int a = sc.nextInt();
        if (a==0) {
            System.out.print(1);
        }
        else if (a==1) {
            System.out.print(1+"");
            System.out.print(1);
        }
        else {
            System.out.print(1+"");
            System.out.print(1+"");
            int x=1;
            int y=1;
            for (int i = 2; i <=a ; i++) {
                int z = x+y;
                System.out.print(z+"");
                x=y;
                y=z;
            }
        }
    }
}

