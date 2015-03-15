package com.devbycm.hdoj1013;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Centimitr
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            BigInteger num = in.nextBigInteger();
            if (num.equals(BigInteger.valueOf(0))) break;
            System.out.println(digitalRoot(num));
        }
    }

    public static BigInteger digitalRoot(BigInteger a) {
        if (a.compareTo(BigInteger.valueOf(10))==-1) {
            return a;
        } else {
            return digitalRoot(rootAdd(a));
        }
    }

    public static BigInteger rootAdd(BigInteger a) {
        BigInteger root = BigInteger.valueOf(0);
        while (!a.equals(BigInteger.valueOf(0))) {
            root = root.add(a.remainder(BigInteger.valueOf(10)));
            a = a.divide(BigInteger.valueOf(10));
        }
        return root;
    }
}
