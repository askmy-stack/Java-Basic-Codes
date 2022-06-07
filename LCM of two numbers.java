package com.company;

import java.util.Scanner;

public class LCM of two numbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number:");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number:");
        int b = sc.nextInt();
        int x = Math.max(a,b); //Function which will help to find the maximum of two numbers in the given input
        int y = a*b;
        int ans = x;
        for (int i=x;i<=y; i++) {
            if (i%a==0 && i%b==0) {
                ans=i;
                break;
            }
        }
        System.out.println("The LCM of the given two numbers are:" +ans);
    }
}

