package com.devbycm.hdoj1012;

/**
 * @author Centimitr
 */
public class Main {
    public static void main(String[] args){
        System.out.println("n e");
        System.out.println("- -----------");
        System.out.println("0 1");
        System.out.println("1 2");
        System.out.println("2 2.5");
        for(int n=3;n<=9;n++){
            double e=2.5;
            for(int i=3;i<=n;i++){
                e+=f(i);
            }
            System.out.printf("%d %.9f",n,e);
            System.out.println();
        }
    }

    public static double f(int dest){
        int value=1;
        for(int i=1;i<=dest;i++){
            value*=i;
        }
        return 1.0/value;
    };
}
