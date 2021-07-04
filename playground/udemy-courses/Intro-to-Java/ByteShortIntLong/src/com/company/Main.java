package com.company;

import java.sql.Wrapper;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        //Wrapper classes are used for all eight primitive types
        int MyMinIntValue = Integer.MIN_VALUE;
        int MyMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + MyMinIntValue);
        System.out.println("Integer Maximum Value = " + MyMaxIntValue);

        //prints out overflow because +1 doesn't fit
        System.out.println("Busted MAX value = " + (MyMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (MyMinIntValue - 1));

        //can be formatted using _, but can be used on Java version 7 or higher
        int myMaxIntTes = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + (myMinByteValue));
        System.out.println("Byte Maximum Value = " + (myMaxByteValue));
    }
}
