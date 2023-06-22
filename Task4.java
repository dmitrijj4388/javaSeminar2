package seminar2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/*
К калькулятору из предыдущего ДЗ добавить логирование.
 */
public class Task4 {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("logCalc.txt",true);
        System.out.println("Добро пожаловать в калькулятор!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double num1 = sc.nextDouble();
        System.out.println("Введите действие (+, -, *, /):");
        char operation = sc.next().charAt(0);
        System.out.println("Введите второе число: ");
        double num2 = sc.nextDouble();
        double result = 0;
        if (operation == '+'){
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/') {
            result = num1 / num2;
        }
        writer.write(num1 + " " + operation + " " + num2 + " " + "=" + " " + result);
        writer.write("\n");
        System.out.printf(num1 + " " + operation + " " + num2 + " " + "=" + " " + result);
        writer.close();
    }
}


