package com.keyword;

import java.util.Scanner;

public class ArithmeticOperators
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = in.nextInt();
        System.out.println("The Addition of the number is "+(number1+number2));
        System.out.println("The Subtraction of the number is "+(number1-number2));
        System.out.println("The Multiplication of the number is "+(number1*number2));
        System.out.println("The Division of the number is "+(number1/number2));
        System.out.println("The Modulo of the number is "+(number1%number2));
    }
}
