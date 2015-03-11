package com.devbycm.hdoj1096;

import java.util.Scanner;

/**
 * @author Centimitr
 */
public class Main {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int num1 = cin.nextInt();
        for(int i=0;i<num1;i++){
            int num2 = cin.nextInt(),sum=0;
            for(int j=0;j<num2;j++){
                sum+=cin.nextInt();
            }
            System.out.println(sum);
            if(i!=num1-1){
                System.out.println();
            }
        }
    }
}