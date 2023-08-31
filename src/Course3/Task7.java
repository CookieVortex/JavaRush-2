package Course3;

import java.util.Arrays;

//Реализуй метод main(String[]), который выводит массивы strings и ints в консоли с помощью метода Arrays.toString().
public class Task7 {
    public static String[] strings = new String[]{"I", "love", "Java"};
    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

    public static void main(String[] args) {
        String array = Arrays.toString(strings);
        String array1 = Arrays.toString(ints);

        System.out.println(array + array1);
    }
}
