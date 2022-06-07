package com.company;

import java.util.Scanner;

public class Addition of two numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number:");
        int x = sc.nextInt();
        System.out.print("Enter the Second Number:");
        int y = sc.nextInt();

        int z = x+y;
        System.out.println("The Addition of above two numbers is:" +z);
    }
}

