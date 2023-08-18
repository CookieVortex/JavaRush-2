package Course2;

//Используя цикл while вывести на экран сто раз цитату (переменная quote):
public class Task1 {
    public static void main(String[] args) {
        String quote = "Я никогда не буду работать за копейки. Амиго";
        int i = 1;
        while (i <= 100) {
            System.out.println(quote);
            i++;
        }
    }
}
