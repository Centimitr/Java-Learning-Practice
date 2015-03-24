package com.devbycm.CCF2014031;

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
        for(int i=0;i<N;i++){
            arr[i]=Math.abs(in.nextInt());
        }
        Arrays.sort(arr);
        int last=0,cur=0,cnt=0;
        for (int i=0;i<N;i++){
            if(i==0){
                last=arr[i];
            }
            else {
                cur=arr[i];
                if (cur==last)cnt++;
                last=cur;
            }
        }
        System.out.println(cnt);
    }
}
