package Course3;

import java.util.Scanner;

//Ввести с клавиатуры число N.
//Считать N целых чисел и заполнить ими массив.
//Найти минимальное число среди элементов массива и вывести в консоль.
public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }

        int min = array[0];

        for (int i = 1; i < 5; i++) {
            if (array[i] < min) {

                min = array[i];
                System.out.println(min);
            }
        }
    }
}
