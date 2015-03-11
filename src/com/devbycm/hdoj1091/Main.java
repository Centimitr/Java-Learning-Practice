package com.devbycm.hdoj1091;

import java.util.Scanner;

/**
 * @author Centimitr
 */
public class Main {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int a,b;
        while(true){
            a = cin.nextInt();
            b = cin.nextInt();
            if(a==0&&b==0){
                break;
            }else {
                System.out.println(a+b);
            }
        }
    }
}
