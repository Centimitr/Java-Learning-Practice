package com.devbycm.CCF2014032;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Centimitr
 */
public class Main {
    public static void main(String[] args){
        new Main().run();
    }
    public void run(){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[][] arr = new int[N][5];
        int cnt=1;
        for (int i=N-1;i>=0;i--){
            arr[i][0]=in.nextInt();
            arr[i][1]=in.nextInt();
            arr[i][2]=in.nextInt();
            arr[i][3]=in.nextInt();
            arr[i][4]=cnt++;
        }
        for (int i=0;i<M;i++){
            int x=in.nextInt();
            int y=in.nextInt();
            selectTop(arr,N,x,y);
        }
    }
    public void selectTop(int[][] arr,int length,int x,int y){
        boolean flag = false;
        for (int i=0;i<length;i++){
            if (x>=arr[i][0]&&x<=arr[i][2]&&y>=arr[i][1]&&y<=arr[i][3]){
                moveToTop(arr, length, i);
                System.out.println(arr[0][4]);
                flag = true;
                break;
            }
        }
        if(!flag)System.out.println("IGNORED");
    }
    public void moveToTop(int[][] arr,int length,int n){
        int[] arrt= Arrays.copyOf(arr[n],5);
        for (int i=n-1;i>=0;i--){
            arr[i+1]=Arrays.copyOf(arr[i],5);
        }
        arr[0]=Arrays.copyOf(arrt,5);
    }
}
