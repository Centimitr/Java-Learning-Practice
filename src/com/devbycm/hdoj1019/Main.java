package com.devbycm.hdoj1019;

import java.util.Scanner;

/**
 * @author Centimitr
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        while (num--!=0){
            int num2 = in.nextInt();
            if(num2==0)continue;
            else if(num2==1)System.out.println(in.nextInt());
            else {
                int lcm=1;
                while(num2--!=0){
                    int value = in.nextInt();
                    lcm = lcm(max(lcm,value),min(lcm,value));
                }
                System.out.println(lcm);
            }
        }
    }
    public static int max(int a,int b){
        if(a>b)return a;
        else return b;
    }
    public static int min(int a,int b){
        if(a<b)return a;
        else return b;
    }
    public static int gcd(int a,int b){
        if(a%b==0)return b;
        else return gcd(b,a%b);
    }
    public static int lcm(int a,int b){
        return a/gcd(a,b)*b;
    }
}
