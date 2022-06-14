package com.company;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
            int s = sc.nextInt();
            InvertedRightAngleTriangle(s);
    }
    public static void InvertedRightAngleTriangle(int s){
        for(int i=1;i<=s;i++){
            for(int j=0; j<=s-i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
