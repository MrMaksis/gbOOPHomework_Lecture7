package ru.gb.oop.homework_7;

import ru.gb.oop.homework_7.interfaces.CreateCalc;
import ru.gb.oop.homework_7.logger.ConsoleLog;
import ru.gb.oop.homework_7.logger.CreateLog;
import ru.gb.oop.homework_7.view.UserViewConsole;

public class Main {
    public static void main(String[] args) {
        CreateCalc newCalc = new CreateLog(new ConsoleLog());
        UserViewConsole console = new UserViewConsole(newCalc);
        console.programStart();
    }
}
