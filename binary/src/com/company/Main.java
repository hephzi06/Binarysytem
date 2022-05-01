package com.company;

import java.util.Scanner;

public class Main {


    class Converter{
        static String toBinary(int num){
            System.out.println("Enter a base number:    ");
            Scanner scanner = new Scanner(System.in);
            int base_number = scanner.nextInt();

            String binary = "";
            while(num > 0){
                binary = (num%base_number) + binary;
                num /= base_number;
            }
            return binary;
        }
    }

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter the number to be converted :   ");
        int number = myInput.nextInt();
        System.out.println("The answer is " + Converter.toBinary(number));

    }

}
