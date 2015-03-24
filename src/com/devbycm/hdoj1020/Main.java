package com.devbycm.hdoj1020;

import java.util.Scanner;

/**
 * @author Centimitr
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        while (num-- != 0) {
            String line = in.next();
            int curnum = 1;
            char curc = '?';
            for (int i = 0; i < line.length(); i++) {
                if (i == 0) {
                    curc = line.charAt(i);
                    curnum = 1;
                } else {
                    if (curc == line.charAt(i)) {
                        curnum++;
                    } else {
                        if (curnum != 1) System.out.printf("%d", curnum);
                        System.out.printf("%c", curc);
                        curc = line.charAt(i);
                        curnum = 1;
                    }
                }
            }
            if (curnum != 1) System.out.printf("%d", curnum);
            System.out.printf("%c", curc);
            System.out.println();
        }
    }
}

