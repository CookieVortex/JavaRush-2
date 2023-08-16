package Course1;

import java.util.Scanner;

//У нас есть программа, которая считывает с клавиатуры два числа и выводит на экран большее из них. Если числа одинаковые, то выводится любое.
//Перепиши программу с использованием тернарного оператора, чтобы ее функционал остался без изменений.
public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();

        int numberC = numberA > numberB ? numberA : numberB;
        System.out.println(numberC);
    }
}
