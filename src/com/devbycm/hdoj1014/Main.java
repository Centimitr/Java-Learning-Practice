package com.devbycm.hdoj1014;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Centimitr
 */
public class Main {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        while(in.hasNext()){
            int step = in.nextInt();
            int mod = in.nextInt();
            int[] seed = new int[mod];
            boolean flag=true;
            Arrays.fill(seed,0);
            for (int i=1;i<seed.length;i++){
                seed[i]=(seed[i-1]+step)%mod;
            }
            Arrays.sort(seed);
            for (int i=0;i<seed.length;i++){
                if(i!=seed[i])flag=false;
            }
            if (flag)System.out.printf("%10d%10d    Good Choice",step,mod);
            else System.out.printf("%10d%10d    Bad Choice",step,mod);
            System.out.println();
            System.out.println();
        }
    }
}
