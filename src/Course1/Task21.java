package Course1;

import java.util.Scanner;

//Амиго создал секретное слово для доступа к закрытой информации, но у него сломалась клавиатура, и теперь невозможно набирать буквы в верхнем регистре.
//Напиши программу, которая будет сравнивать введенную строку со строкой из переменной secret, не учитывая регистр.
//Если введенная строка равна строке из переменной secret, программа выводит на экран сообщение "доступ разрешен". В ином случае - "доступ запрещен".
public class Task21 {
    public static String secret = "AmIGo";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        if (secret.equalsIgnoreCase(text)) {
            System.out.println("доступ разрешен");
        } else {
            System.out.println("доступ запрещен");
        }
    }
}
