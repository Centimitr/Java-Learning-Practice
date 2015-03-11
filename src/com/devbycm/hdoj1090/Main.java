package com.devbycm.hdoj1090;

import java.util.Scanner;

/**
 * @author Centimitr
 */
public class Main {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int num,a,b;
        num = cin.nextInt();
        for(int i=0;i<num;i++){
            a = cin.nextInt();
            b = cin.nextInt();
            System.out.println(a+b);
        }
    }
}