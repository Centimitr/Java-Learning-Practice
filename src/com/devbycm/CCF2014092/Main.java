package com.devbycm.CCF2014092;

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
        boolean[][] arr = new boolean[101][101];
        /*for (int i=0;i<101;i++){
            for (int j=0;j<101;j++){
                System.out.printf("%s",arr[i][j]);
            }
            System.out.println();
        }*/
        for (int i=0;i<101;i++){
            for (int j=0;j<101;j++){
                arr[i][j]=true;
            }
        }
        int N = in.nextInt();
        for (int i=0;i<N;i++){
            int x1=in.nextInt();
            int y1=in.nextInt();
            int x2=in.nextInt();
            int y2=in.nextInt();
            for (int x=x1;x<x2;x++){
                for (int y=y1;y<y2;y++){
                    arr[x][y]=false;
                }
            }
        }
        int num=0;
        for (int i=0;i<101;i++){
            for (int j=0;j<101;j++){
                if (!arr[i][j]){
                    num++;
                }
            }
        }
        System.out.println(num);
    }
}
