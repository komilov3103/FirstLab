package ru.mpei.calcs;

public class ArabicCalcs extends Calculations {

    private int firstNumber;
    private int secondNumber;

    public ArabicCalcs(int firstNumber, int secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public int addition() {
        return this.firstNumber + this.secondNumber;
    }

    @Override
    public int subtraction() {
        return this.firstNumber - this.secondNumber;
    }

    @Override
    public int multiplication() {
        return this.firstNumber * this.secondNumber;
    }

    @Override
    public int division() {
        return this.firstNumber / this.secondNumber;
    }
}
