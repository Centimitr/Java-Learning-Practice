package com.devbycm.hdoj1093;

import java.util.Scanner;

/**
 * @author Centimitr
 */
public class Main {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int num1,num2;
        num1 = cin.nextInt();
        for(int i=0;i<num1;i++){
            int sum=0;
            num2= cin.nextInt();
            for(int j=0;j<num2;j++){
                sum+=cin.nextInt();
            }
            System.out.println(sum);
        }
    }
}
