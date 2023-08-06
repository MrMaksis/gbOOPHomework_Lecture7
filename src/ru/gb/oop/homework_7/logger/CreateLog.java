package ru.gb.oop.homework_7.logger;

import ru.gb.oop.homework_7.сontrollers.CalculatorController;
import ru.gb.oop.homework_7.interfaces.CreateCalc;
import ru.gb.oop.homework_7.interfaces.Operations;
import ru.gb.oop.homework_7.interfaces.WriterLog;

public class CreateLog implements CreateCalc {
    private final WriterLog writerLog;
    public CreateLog(WriterLog writerLog){
        this.writerLog = writerLog;
    }
    @Override
    public Operations create(double num) {
        return new CalcLog(new CalculatorController(num), writerLog);
    }
}
