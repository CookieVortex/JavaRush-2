package Course1;

import java.util.Scanner;

//Выведи на экран третью строку в неизменном виде.
//Выведи на экран вторую строку, предварительно преобразовав ее к верхнему регистру.
//Выведи на экран первую строку, предварительно преобразовав ее к нижнему регистру.
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String c = scanner.nextLine();

        System.out.println(c);
        System.out.println(b.toUpperCase());
        System.out.println(a.toLowerCase());
    }
}
