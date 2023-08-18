package Course2;

import java.util.Scanner;

//Ввести с клавиатуры имя и, используя цикл while, 10 раз вывести: <имя> любит меня (переменная text).
//Каждый вывод - с новой строки.
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int num = 1;
        String text = " любит меня.";

        while (num <= 10) {
            System.out.println(name + text);
            num++;
        }
    }
}
