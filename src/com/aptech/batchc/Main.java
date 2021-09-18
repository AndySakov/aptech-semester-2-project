package com.aptech.batchc;

import com.aptech.batchc.converter.Converter;

import java.util.Scanner;

public class Main {

    private final Scanner input = new Scanner(System.in);
    private final Converter convert = new Converter();

    public String input(String prompt) {
        System.out.print(prompt);
        return input.nextLine();
    }

    public void println(String output) {
        System.out.println(output);
    }

    public void help() {
        println("\tHelp menu\n" +
                            "\t\t1: Decimal to Binary conversion\n" +
                            "\t\t2: Decimal to Hexadecimal conversion\n" +
                            "\t\t3: Binary to Decimal conversion\n" +
                            "\t\t4: Binary to Hexadecimal conversion\n" +
                            "\t\t5: Hexadecimal to Decimal conversion\n" +
                            "\t\t6: Hexadecimal to Binary conversion\n" +
                            "\t\t7: Add 2 binary numbers\n" +
                            "\t\thelp: Prints this help message\n" +
                            "\t\tquit: Quits the application"
        );
    }

    public void dec2bin() {
        int decimal  = Integer.parseInt(input("Input decimal number: "));
        println("The binary form of " + decimal + " is " + convert.decimalToBinary(decimal));
    }

    public void dec2hex() {
        int decimal  = Integer.parseInt(input("Input decimal number: "));
        println("The hexadecimal form of " + decimal + " is " + convert.decimalToHexadecimal(decimal).toUpperCase());
    }

    public void bin2dec() {
        String binary  = input("Input binary number: ");
        println("The decimal form of " + binary + " is " + convert.binaryToDecimal(binary));
    }

    public void bin2hex() {
        String binary  = input("Input binary number: ");
        println("The hexadecimal form of " + binary + " is " + convert.binaryToHexadecimal(binary).toUpperCase());
    }

    public void hex2dec() {
        String hex  = input("Input hexadecimal number: ");
        println("The decimal form of " + hex + " is " + convert.hexadecimalToDecimal(hex));
    }

    public void hex2bin() {
        String hex  = input("Input hexadecimal number: ");
        println("The binary form of " + hex + " is " + convert.hexadecimalToBinary(hex));
    }

    public void binaryAddition() {
        String num1  = input("Input the first binary number: ");
        String num2  = input("Input the second binary number: ");
        println("The sum of " + num1 + " and " + num2 + " is " + convert.binaryAddition2(num1, num2));
    }



    public static void main(String[] args) {
        boolean run = true;
        System.out.println("Welcome to Aptech Batch C Semester 2 Converter!");
        System.out.println("Input help for the list of supported operations");

        while (run) {
            Main main = new Main();
            String in = main.input(":> ");

            switch (in) {
                case "help":
                    main.help();
                    break;
                case "quit":
                    System.out.println("Bye!");
                    run = false;
                    break;
                case "1":
                    main.dec2bin();
                    break;
                case "2":
                    main.dec2hex();
                    break;
                case "3":
                    main.bin2dec();
                    break;
                case "4":
                    main.bin2hex();
                    break;
                case "5":
                    main.hex2dec();
                    break;
                case "6":
                    main.hex2bin();
                    break;
                case "7":
                    main.binaryAddition();
                    break;
                default:
                    System.out.println("Unrecognised option\nInput help to see options");
            }
        }

    }
}