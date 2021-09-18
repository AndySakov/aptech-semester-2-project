package com.aptech.batchc.converter;

/**
 * A class containing all the methods for converting from one number format to another
 * @author Obafemi Teminife
 * @author Godwin Ehikamen
 */
public class Converter {

    /**
    * Converts a decimal number to a binary string
    * @param decimalNumber the decimal number to convert
    * @return the converted binary string
      */
    public String decimalToBinary(int decimalNumber) {
        return Integer.toBinaryString(decimalNumber);
    }

    /**
     * Converts a decimal number to a hexadecimal string
     * @param decimalNumber the decimal number to convert
     * @return the converted hexadecimal string
     */
    public String decimalToHexadecimal(int decimalNumber) {
        return Integer.toHexString(decimalNumber);
    }

    /**
     * Converts a binary string to a decimal number
     * @param binaryString the binary number to convert
     * @return the converted decimal number
     */
    public int binaryToDecimal(String binaryString) {
        return Integer.parseInt(binaryString, 2);
    }

    /**
     * Converts a binary string to a hexadecimal string
     * @param binaryString the binary number to convert
     * @return the converted hexadecimal string
     */
    public String binaryToHexadecimal(String binaryString) {
        int decimal = Integer.parseInt(binaryString, 2);
        return Integer.toHexString(decimal);
    }

    /**
     * Converts a hexadecimal string to a decimal number
     * @param hexString the hexadecimal string to convert
     * @return the converted decimal number
     */
    public int hexadecimalToDecimal(String hexString) {
        return Integer.parseInt(hexString, 16);
    }

    /**
     * Converts a hexadecimal string to a binary string
     * @param hexString the hexadecimal string to convert
     * @return the converted binary string
     */
    public String hexadecimalToBinary(String hexString) {
        int decimal = Integer.parseInt(hexString, 16);
        return Integer.toBinaryString(decimal);
    }

    /**
     * Adds two binary numbers
     * @param number1 the first binary number to add
     * @param number2 the second binary number to add
     * @return the sum of the two numbers
     */
    public String binaryAddition2(String number1, String number2) {
        int num1 = Integer.parseInt(number1, 2);
        int num2 = Integer.parseInt(number2, 2);
        int sum = num1 + num2;
        return Integer.toBinaryString(sum);
    }
}
