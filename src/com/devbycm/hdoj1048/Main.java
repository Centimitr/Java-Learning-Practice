package com.devbycm.hdoj1048;

import java.util.Scanner;

/**
 * @author Centimitr
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            if (in.nextLine().equals("ENDOFINPUT"))break;
            String s = in.nextLine();
            for (int i=0;i<s.length();i++){
                int c = s.charAt(i);
                if (c>='A'&&c<='Z'){
                    if (c<=(int)'E'){
                        c+=21;
                    }
                    else {
                        c-=5;
                    }
                }
                System.out.printf("%c",c);
            }
            System.out.println();
            in.nextLine();
        }
    }
}
