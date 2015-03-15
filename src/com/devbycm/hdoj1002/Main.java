package com.devbycm.hdoj1002;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Centimitr
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        for(int i=0;i<num;i++){
            BigInteger a=in.nextBigInteger(),b=in.nextBigInteger();
            System.out.println("Case "+(+i+1)+":");
            System.out.println(a+" + "+b+" = "+a.add(b));
            if(i!=num-1){
                System.out.println();
            }
        }
    }
}
