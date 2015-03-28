package com.devbycm.CCF2014122;

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
        int n=in.nextInt();
        int[][] arr = new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j]=in.nextInt();
            }
        }
        boolean direction = true;
        for (int i=0;i<n*2-1;i++){
            if (i!=0)System.out.printf(" ");
            printLine(arr,i<n-1?0:n-1,i<n-1?i:i-n+1,direction,i<n-1?(direction?false:true):(direction?true:false));
            direction=!direction;
        }
    }
    public void printLine(int[][] arr,int fixedNum,int orderNum,boolean direction,boolean order){
        for (int i=0;i<Math.abs(fixedNum-orderNum)+1;i++){
            int k=direction?1:-1;
            if (i>0)System.out.printf(" ");
            if (order){
                System.out.print(arr[fixedNum-i*k][orderNum+i*k]);
            }else {
                System.out.print(arr[orderNum-i*k][fixedNum+i*k]);
            }
        }
    }
}
