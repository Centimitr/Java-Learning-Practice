package com.devbycm.hdoj1008;

import java.util.Scanner;

/**
 * @author Centimitr
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int num = in.nextInt();
            if(num==0)break;
            //calculate
            int curFloor=0;
            int time=0;
            for(int i=0;i<num;i++){
                int requestFloor = in.nextInt();
                time+=requestFloor>curFloor?6*(requestFloor-curFloor)+5:4*(curFloor-requestFloor)+5;
                curFloor=requestFloor;
            }
            System.out.println(time);
        }
    }
}
