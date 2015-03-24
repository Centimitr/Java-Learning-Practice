package com.devbycm.CCF2013124;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Centimitr
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        BigInteger bigIntA = BigInteger.valueOf(10).pow(num);
        String stringA = bigIntA.toString();
        for(int order=0;order<num;order++){
            for (int a=0;a<4;a++){
//
            }
        }
    }
    public static boolean check3(String s){
        if (s.charAt(0)=='0')return false;
        else return true;
    }
    public static boolean check1_2(String s){
        if (!s.contains("0")||!s.contains("1")||!s.contains("2")||!s.contains("3"))return false;
        else return true;
    }
    public static boolean check1_1(String s){
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)!='0'&&s.charAt(i)!='1'&&s.charAt(i)!='2'&&s.charAt(i)!='3')return false;
        }
        return true;
    }
    public static boolean check2(String s){
        int first_one = s.indexOf('1');
        int last_zero = s.lastIndexOf('0');
        if (last_zero>first_one)return false;
        int first_three = s.indexOf('3');
        int last_two = s.lastIndexOf('2');
        if (last_two>first_three)return false;
        return true;
    }
}
