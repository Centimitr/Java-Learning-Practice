package com.devbycm.hdoj1021;

import java.util.Scanner;

/**
 * @author Centimitr
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,0,2,2,1,0,1};
        while (in.hasNext()){
            int n = in.nextInt();
            System.out.println(arr[n%8]==0?"yes":"no");
        }
    }
}
