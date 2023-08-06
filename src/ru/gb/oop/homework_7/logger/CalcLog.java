package ru.gb.oop.homework_7.logger;

import ru.gb.oop.homework_7.interfaces.Operations;
import ru.gb.oop.homework_7.interfaces.WriterLog;

public class CalcLog implements Operations {
    private final Operations readResult;
    private final WriterLog log;
    public CalcLog(Operations readResult, WriterLog log){
        this.readResult = readResult;
        this.log = log;
    }
    @Override
    public Operations sum(double num) {
        double firstNum = readResult.getResult();
        log.log(String.format("Число %f. Начинать складывать с числом %f", firstNum, num));
        return readResult.sum(num);
    }

    @Override
    public Operations div(double num) {
        double firstNum = readResult.getResult();
        log.log(String.format("Число %f. Начинать делить на число %f", firstNum, num));
        return readResult.div(num);
    }

    @Override
    public Operations mult(double num) {
        double firstNum = readResult.getResult();
        log.log(String.format("Число %f. Начать суммирование с числом %f", firstNum, num));
        return readResult.mult(num);
    }

    @Override
    public Operations menos(double num) {
        double firstNum = readResult.getResult();
        log.log(String.format("Число %f. Начинать отнимать от числа %f", firstNum, num));
        return readResult.menos(num);
    }

    @Override
    public double getResult() {
        double result = readResult.getResult();
        log.log(String.format("Результат %f", result));
        return result;
    }
}
