package ru.gb.oop.homework_7.view;

import ru.gb.oop.homework_7.interfaces.CreateCalc;
import ru.gb.oop.homework_7.interfaces.Operations;

import java.util.Scanner;

public class UserViewConsole {
    private CreateCalc createCalc;
    public UserViewConsole(CreateCalc createCalc){
        this.createCalc = createCalc;
    }
    public void programStart(){
        while (true){
            double firstNum = promptDouble("Введите первое число: ");
            Operations operations = createCalc.create(firstNum);
            while (true){
                System.out.println("------------------------------------------------------------------------");
                String operation = prompt("Выберите математическую операцию [/*-+] или [=] для вывода результата -> ");
                if (operation.equals("/")){
                    double num = promptDouble("Введите второе число: ");
                    operations.div(num);
                    continue;
                }
                if (operation.equals("*")){
                    double num = promptDouble("Введите второе число: ");
                    operations.mult(num);
                    continue;
                }
                if (operation.equals("-")){
                    double num = promptDouble("Введите второе число: ");
                    operations.menos(num);
                    continue;
                }
                if (operation.equals("+")){
                    double num = promptDouble("Введите второе число: ");
                    operations.sum(num);
                    continue;
                }
                if (operation.equals("=")){
                    double result = operations.getResult();
                    System.out.println("-----------------------------");
                    System.out.printf("Результат %f\n", result);
                    System.out.println("-----------------------------");
                    break;
                }
            }
            String operation = prompt("Хотите ввести еще? y/n: ");
            if (operation.equals("y")){
                continue;
            }
            break;
        }
    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    private double promptDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }
}
