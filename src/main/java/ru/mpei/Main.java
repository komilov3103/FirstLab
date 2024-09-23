package ru.mpei;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String firstNumber;
        String secondNumber;
        char operation = ' ';
        int firstNumberIndexEnd = 0;
        int secondNumberIndexStart = 0;
        Calculations calculator = null;
        int result = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == '*' || currentChar == '/' ||
                    currentChar == '+' || currentChar == '-') {
                operation = currentChar;
                firstNumberIndexEnd = i;
                secondNumberIndexStart = i + 1;
            }
        }

        firstNumber = input.substring(0, firstNumberIndexEnd);
        secondNumber = input.substring(secondNumberIndexStart, input.length());
        boolean isRoman = false;

        if (NumberIdentifier.isArbicNumber(firstNumber) &&
                NumberIdentifier.isArbicNumber(secondNumber)) {
             calculator = new ArabicCalcs(Integer.parseInt(firstNumber),
                    Integer.parseInt(secondNumber));
        } else if (NumberIdentifier.isRomanNumber(firstNumber) &&
                NumberIdentifier.isRomanNumber(secondNumber)){
             calculator = new RomanCalcs(firstNumber, secondNumber);
            isRoman = true;
        } else {
            System.out.println("Неверный формат чисел");
            return;
        }

        switch (operation) {
            case '+':
                result = calculator.addition();
                break;
            case '-':
                result = calculator.subtraction();
                break;
            case '*':
                result = calculator.multiplication();
                break;
            case '/':
                result = calculator.division();
                break;
        }

        if (isRoman){
            if (result < 0){
                System.out.println("Неположительный результат");
            } else {
                System.out.println(RomanCalcs.convertToRoman(result));
            }
        } else {
            System.out.println(result);
        }
    }

}
