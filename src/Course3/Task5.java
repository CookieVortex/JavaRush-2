package Course3;

import java.util.Arrays;
import java.util.Scanner;

//Считать 6 строк и заполнить ими массив strings.
//Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").
public class Task5 {
    public static String[] strings = new String[5];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < strings.length; i++) {
            System.out.println("Введите строку #" + (i + 1) + ":");
            strings[i] = scanner.nextLine();

            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i] != null && strings[i].equals(strings[j])) {
                    strings[i] = null;
                    break;
                }
            }
        }
        System.out.println("Array: " + Arrays.toString(strings));
    }
}
