package com.company;

import java.util.Scanner;

public class First Digit{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = s.nextInt();
        System.out.print(printnumber(n));
    }
    public static int printnumber(int n) {
        while(n>10){
            n=n/10;
        }
        return n;
    }

}
