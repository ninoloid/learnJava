package com.belajarjava;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Hello.printHello("Hello Class");
        Hello2.printHello(new String[]{"Hello2 Class"});
        TakeInput.readInput();
        FromAnotherFile.getMethodFromAnotherFile();
    }
}


class Hello {
    public static void printHello(String... args) {
        System.out.println("Hello, ini dari " + args[0] );
        System.out.println();
    }
}


class Hello2 {
    public static void printHello(String[] args) {
        System.out.println("Hello, ini dari  " + args[0] );
        System.out.println();
    }
}


class TakeInput {
    public static void readInput() {
        Scanner scanner_one = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner_one.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = scanner_one.nextLine();
        System.out.println("Your name is: " + firstName + " " + lastName);
        System.out.println();
    }
}


class FromAnotherFile {
    public static void getMethodFromAnotherFile() {
        Variables.main();
        System.out.println();
    }
}