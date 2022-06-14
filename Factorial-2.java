package com.company;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
            int n = sc.nextInt();
            Factorial(n);
    }
    public static int Factorial(int n){
        int ans = 1;
        for (int i = 0; i <=n; i++) {
            ans*=1;
        }
        return ans;
    }
}


