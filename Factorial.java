package com.company;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        int i = 1;
        while(n>0) {
            i = i*n;
            n--;
        }
        System.out.println(i);
    }
}
