package com.devbycm.hdoj1092;

import java.util.Scanner;

/**
 * @author Centimitr
 */
public class Main {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        String l;
        while(true){
            int num,sum=0;
            l = cin.nextLine();
            Scanner lin = new Scanner(l);
            num = lin.nextInt();
            if (num==0)break;
            for (int i=0;i<num;i++){
                sum+=lin.nextInt();
            }
            System.out.println(sum);
        }
    }
}
