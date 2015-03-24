package com.devbycm.hdoj1040;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Centimitr
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t--!=0){
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i=0;i<n;i++){
                arr[i]=in.nextInt();
            }
            Arrays.sort(arr);
            for (int i =0 ;i<n;i++){
                if (i!=0)System.out.printf(" ");
                System.out.printf("%d",arr[i]);
            }
            System.out.println();
        }
    }
}
