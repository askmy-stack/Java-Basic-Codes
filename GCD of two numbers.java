package com.company;

import java.util.Scanner;

public class GCD of two numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number:");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number:");
        int b = sc.nextInt();
        int ans = 1; //The Initial Answer which will change after implementing the loop
        int x = Math.min(a,b); //Function which will help to find the minimum of two numbers in the given input
        for (int i=1;i<=x; i++) {
            if (a%i==0 && b%i==0) {
                ans=i;
            }
        }
        System.out.println("The GCD of the given two numbers are:" +ans);
    }
}

