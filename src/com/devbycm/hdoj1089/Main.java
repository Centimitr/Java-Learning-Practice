package com.devbycm.hdoj1089;

import java.util.Scanner;

/**
 * @author Centimitr
 */
public class Main {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int a,b;
        while (cin.hasNextInt()){
            a=cin.nextInt();
            b=cin.nextInt();
            System.out.println(a+b);
        }
    }
}