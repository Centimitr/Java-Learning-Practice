package com.devbycm.CCF_Simulate001;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Centimitr
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] arr = new int[10001];
        for(int i=0;i<10001;i++){
            arr[i]=0;
        }
        for (int i=0;i<num;i++){
            arr[in.nextInt()]++;
        }
        int max_num=0;
        int max_num_place=0;
        for (int i=0;i<10001;i++){
            if (arr[i]>max_num){
                max_num_place = i;
                max_num = arr[i];
            }
        }
        System.out.println(max_num_place);
    }
}
