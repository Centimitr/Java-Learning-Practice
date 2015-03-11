package com.devbycm.hdoj1094;

import java.util.Scanner;

/**
 * @author Centimitr
 */
public class Main {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()){
            Scanner lin = new Scanner(cin.nextLine());
            int num = lin.nextInt(),sum=0;
            for(int i=0;i<num;i++){
                sum+=lin.nextInt();
            }
            System.out.println(sum);
        }
    }
}
