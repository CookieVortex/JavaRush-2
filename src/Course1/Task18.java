package Course1;

import java.util.Scanner;

//Эта программа написана с использованием тернарного оператора, но не совсем понятно, что она делает. Думаем, если избавиться от тернарного оператора, то станет намного понятнее.
//Перепиши программу без использования тернарного оператора.
public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 5) {
            System.out.println("Число меньше 5");
        } else
            System.out.println("Число больше 5");
    }
}
