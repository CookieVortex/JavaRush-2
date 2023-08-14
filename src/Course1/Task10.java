package Course1;

import java.util.Scanner;

//Считай с клавиатуры три целых числа.
//Выведи на экран их среднее арифметическое.
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println("Average numbers: " + (a + b + c) / 3);
    }
}
