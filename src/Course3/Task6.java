package Course3;

//Проинициализируй массив MULTIPLICATION_TABLE значением new int[10][10],
//заполни его таблицей умножения и выведи в консоли в следующем виде:
public class Task6 {
    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%5d", (i + 1) * (j + 1));
            }
            System.out.println();
        }
    }
}
