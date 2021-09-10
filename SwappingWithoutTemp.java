package com.saravanan;

public class SwappingWithoutTemp {
    public static void main(String ...a){
        System.out.println(" Sent values 25, 75, "+ swap(25, 75));
        System.out.println(" Sent values float 56, 88, "+ bitwiseSwap(56, 88));
    }

    public static String swap(int x, int y){
        x = x - y;

        y = x + y;

        x = y - x;

        return "Swapped values: x="+x+", y="+y;
    }

    //works with int and other types too
    public static String bitwiseSwap( long a, long b ){
        a = a ^ b ;

        b = a ^ b ;

        a = a ^ b ;

        return "Bitwise Swapped values are, a="+a+ ", b="+b;
    }
}
