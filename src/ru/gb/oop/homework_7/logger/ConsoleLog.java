package ru.gb.oop.homework_7.logger;

import ru.gb.oop.homework_7.interfaces.WriterLog;

public class ConsoleLog implements WriterLog {
    @Override
    public void log(String message) {
        System.out.println("Log:" + message);
    }
}
