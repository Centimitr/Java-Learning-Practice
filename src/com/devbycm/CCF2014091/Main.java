package com.devbycm.CCF2014091;

import java.util.Arrays;
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
        int N = in.nextInt();
        int[] arr = new int[N];
        for (int i=0;i<N;i++){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int cnt=0,last=0,cur=0;
        for (int i=0;i<N;i++){
            if (i==0){
                last = arr[i];
            }else {
                cur = arr[i];
                if(cur-last==1){
                    cnt++;
                }
                last=cur;
            }
        }
        System.out.println(cnt);
    }
}
