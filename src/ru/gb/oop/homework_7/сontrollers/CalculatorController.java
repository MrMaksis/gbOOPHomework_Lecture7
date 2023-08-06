package ru.gb.oop.homework_7.сontrollers;

import ru.gb.oop.homework_7.interfaces.Operations;

public class CalculatorController implements Operations {

    private Double inNumber;
    public CalculatorController(Double inNumber){
        this.inNumber = inNumber;
    }

    @Override
    public Operations sum(double num) {
        this.inNumber += num;
        return this;
    }

    @Override
    public Operations div(double num) {
        this.inNumber /= num;
        return this;
    }

    @Override
    public Operations mult(double num) {
        this.inNumber *= num;
        return this;
    }

    @Override
    public Operations menos(double num) {
        this.inNumber -= num;
        return this;
    }

    @Override
    public double getResult() {
        return inNumber;
    }
}
