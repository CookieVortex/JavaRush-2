package Course1;

import java.util.Scanner;

//Напиши программу, которая считывает с клавиатуры два
//вещественных числа (double) и выдает сообщение о том, равны ли эти числа с точностью до одной миллионной.
public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        double number1 = scanner.nextDouble();

        if (number == number1) {
            System.out.println("числа равны");
        } else {
            System.out.println("числа не равны");
        }
    }
}
