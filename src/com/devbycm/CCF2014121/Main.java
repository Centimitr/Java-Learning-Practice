package com.devbycm.CCF2014121;

import java.util.Scanner;

/**
 * @author Centimitr
 * @score 100
 */
public class Main {
    public static void main(String[] args){
        new Main().run();
    }
    public void run(){
        Scanner in = new Scanner(System.in);
        int[] arr=new int[1001];
       /* for (int i:arr){
            i=0;
        }*/
        int N = in.nextInt();
        for (int i=0;i<N;i++){
            int a=in.nextInt();
            if (i!=0)System.out.printf(" ");
            System.out.printf("%d",++arr[a]);
        }
    }
}
