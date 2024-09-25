package ru.mpei.calcs;

public class RomanCalcs extends Calculations {

    public String firstNumber;
    public String secondNumber;

    public RomanCalcs(String firstNumber, String secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber  = secondNumber;
    }

    @Override
    public int addition() {
        return converToArabic(this.firstNumber) + converToArabic(this.secondNumber);
    }

    @Override
    public int subtraction() {
        return converToArabic(this.firstNumber) - converToArabic(this.secondNumber);
    }

    @Override
    public int multiplication() {
        return converToArabic(this.firstNumber) * converToArabic(this.secondNumber);
    }

    @Override
    public int division() {
        return converToArabic(this.firstNumber) / converToArabic(this.secondNumber);
    }

    private static int converToArabic(String number){
        switch (number){
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
        }
        return -1;
    }

    private static String romanDigit(int n, String one, String five, String ten){

        if(n >= 1)
        {
            switch (n) {
                case 1 -> {
                    return one;
                }
                case 2 -> {
                    return one + one;
                }
                case 3 -> {
                    return one + one + one;
                }
                case 4 -> {
                    return one + five;
                }
                case 5 -> {
                    return five;
                }
                case 6 -> {
                    return five + one;
                }
                case 7 -> {
                    return five + one + one;
                }
                case 8 -> {
                    return five + one + one + one;
                }
                case 9 -> {
                    return one + ten;
                }
            }

        }
        return "";
    }

    public static String convertToRoman(int number) {
        String romanHundred = "";

        String romanOnes = romanDigit(number % 10, "I", "V", "X");
        number /= 10;

        String romanTens = romanDigit(number % 10, "X", "L", "C");
        number /= 10;

        if (number == 1){
            romanHundred = "C";
        }

        String result = romanHundred + romanTens + romanOnes;
        return result;
    }

}