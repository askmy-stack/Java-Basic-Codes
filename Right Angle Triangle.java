package com.company;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
            int s = sc.nextInt();
            RightAngleTriangle(s);
    }
    public static void RightAngleTriangle(int s){
        for(int i=1;i<=s;i++){
            for(int j=1;j<=i;j++){
                if(j==1||i==s){
                    if(i==1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print("*"+" ");
                    }
                }
                else if(i==j){
                    System.out.print(" "+"*");
                }
                else
                    System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}


