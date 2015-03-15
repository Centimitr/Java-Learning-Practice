package com.devbycm.hdoj1005;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Centimitr
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int a= in.nextInt(),b=in.nextInt(),n = in.nextInt();
            if(a==0&&b==0&&n==0)break;
            //set
            int[] arr = new int[49];
            arr[1]=1;
            arr[2]=1;
            for(int i=3;i<49;i++){
                arr[i]=(a*arr[i-1]+b*arr[i-2])%7;
            }
            //print
            System.out.println(arr[n%48]);
        }
    }
}
