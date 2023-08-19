package Course2;

import java.util.Scanner;

//Вводим данные с клавиатуры и сразу их выводим на экран, пока не будет введено слово "enough".
//Слово "enough" выводить не нужно.
//Для этого необходимо использовать бесконечный цикл (while(true)).
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String message = scanner.nextLine();
            if (message.equals("enough")) {
                break;
            }
            System.out.println(message);
        }
    }
}


//Scanner console = new Scanner(System.in);
//int sum = 0;
//while (console.hasNextInt())
//{
//   int x = console.nextInt();
//   sum = sum + x;
//}
//System.out.println(sum);

//Создаем объект Scanner для чтения данных с консоли.
//В переменной sum будем хранить сумму чисел.
//Пока в консоли вводят целые числа
//
//считываем очередное число в переменную x.
//Добавляем x к сумме чисел (переменная sum).
//
//Выводим подсчитанную сумму на экран.
