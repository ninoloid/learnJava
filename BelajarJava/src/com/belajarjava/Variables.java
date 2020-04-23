package com.belajarjava;

public class Variables {
    public static void print() {
        // Define your variables below this line
        short short_number = 5;
        int int_number = 1000;
        long long_number = 100000000;
        float float_number = 10.292F;
        double double_number = 10.0;
        char char_name = 'N';
        boolean bool_accept = true;

        System.out.println("Value of Short is: ");
        System.out.println(short_number);

        System.out.println("Value of Int is: ");
        System.out.println(int_number);

        System.out.println("Value of Long is: ");
        System.out.println(long_number);

        System.out.println("Value of Float is: ");
        System.out.println(float_number);

        System.out.println("Value of Double is: ");
        System.out.println(double_number);

        System.out.println("Value of Char is: ");
        System.out.println(char_name);

        System.out.println("Value of Bool is: ");
        System.out.println(bool_accept);
    }

    public static void main() {
        print();
    }
}
