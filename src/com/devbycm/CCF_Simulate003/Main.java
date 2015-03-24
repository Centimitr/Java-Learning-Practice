package com.devbycm.CCF_Simulate003;

import java.util.Scanner;

/**
 * @author Centimitr
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //read
        int num = in.nextInt();
        int[] arr = new int[num];
        int max_height = 0;
        for (int i = 0; i < num; i++) {
            arr[i] = in.nextInt();
            //set max height
            if (i==0)max_height=arr[i];
            else if (max_height<arr[i])max_height=arr[i];
        }
        int max_area=0;
        //get max area
        for (int h=0;h<=max_height;h++){
            int cur_area=0;
            for (int i=0;i<num;i++){
                if (arr[i]>=h){
                    cur_area+=h;
                }else {
                    if (cur_area>max_area){
                        max_area=cur_area;
                    }
                    cur_area=0;
                }
            }
        }
        System.out.println(max_area);
    }
}
