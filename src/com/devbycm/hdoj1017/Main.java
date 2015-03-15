package com.devbycm.hdoj1017;

import java.util.Scanner;

/**
 * @author Centimitr
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i=0;i<num;i++){
            int order=1;
            while (in.hasNext()){
                int n = in.nextInt();
                int m = in.nextInt();
                if(n==0)break;
                int count=0;
                for(int a=1;a<n-1;a++){
                    for (int b=a+1;b<n;b++){
                        if((a*a+b*b+m)%(a*b)==0){
                            count++;
                        }
                    }
                }
                System.out.println("Case " + (order++) + ": " + count);
            }
            if(i!=num-1)System.out.println();
        }
    }
}
