package com.devbycm.hdoj1018;

import java.util.Scanner;

/**
 * @author Centimitr
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i=0;i<num;i++){
            System.out.println(getDigits(in.nextInt()));
        }
    }
    public static int getDigits(int a){
        double digit = 0;
        for(int i=1;i<=a;i++){
            digit+=Math.log10((double)i);
        }
        return (int)digit+1;
    }
}
