package com.devbycm.hdoj1001;

import java.util.Scanner;

/**
 * @author Centimitr
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int flag=0;
        while(in.hasNextInt()){
            int n=in.nextInt();
            int sum=0;
            for(int i=0;i<=n;i++){
                sum+=i;
            }
            System.out.println(sum);
            System.out.println();
        }
    }
}
