package Course3;

import java.util.Arrays;

//Исправь работу метода main(String[]), который выводит в консоли true, если arrayFirst равняется arraySecond, иначе — false.
public class Task9 {
    public static int[][] arrayFirst = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    public static int[][] arraySecond = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

    public static void main(String[] args) {
        System.out.println(Arrays.deepEquals(arrayFirst, arraySecond));
    }
}
