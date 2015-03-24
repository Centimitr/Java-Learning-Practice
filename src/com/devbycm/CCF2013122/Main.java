package com.devbycm.CCF2013122;

import java.util.Scanner;

/**
 * @author Centimitr
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String isbn = in.nextLine();
        String isbninfo = ""+isbn.charAt(0)+isbn.charAt(2)+isbn.charAt(3)+isbn.charAt(4)+isbn.charAt(6)+isbn.charAt(7)+isbn.charAt(8)+isbn.charAt(9)+isbn.charAt(10);
        int veri=0;
        for (int i=0;i<9;i++){
            veri+=((int)isbninfo.charAt(i)-'0')*(i+1);
        }
        veri %=11;
        if (veri==(int)(isbn.charAt(12)=='X'?10:isbn.charAt(12))-'0'){
            System.out.println("Right");
        }else {
            System.out.println(isbn.substring(0,12)+(veri==10?"X":veri));
        }
    }
}
