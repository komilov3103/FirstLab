package ru.mpei;

public class NumberIdentifier {

    public static boolean isArbicNumber(String number){
        switch (number){
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "10":
                return true;
        }
        return false;
    }

    public static boolean isRomanNumber(String number){
        switch (number){
            case "I":
            case "II":
            case "III":
            case "IV":
            case "V":
            case "VI":
            case "VII":
            case "VIII":
            case "IX":
            case "X":
                return true;
        }
        return false;
    }
}
