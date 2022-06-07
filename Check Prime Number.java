package com.company;

import java.util.Scanner;

public class Check Prime Number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int a = sc.nextInt();
        int i = 2;
        while(i<a) {
            if(a%i==0){
                System.out.println("It is not a Prime Number");
                return;
            }
            i++;
        }
        System.out.println("It is a Prime Number");
    }
}

