package com.company;

import java.util.Scanner;

public class Divisors Numbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int a = sc.nextInt();
        int i = 1;
        while(i<=a) {
            if(a%i==0){
                System.out.println("The Divisors of the given Number:"+i);
            }
            i=i+1;
        }

    }
}

