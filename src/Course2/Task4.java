package Course2;

//Используя вложенные циклы while
//(цикл в цикле) выведи на экран прямоугольник размером 5 (высота) на 10 (ширина), заполненный буквой 'Q'.
public class Task4 {
    public static void main(String[] args) {

        int n = 0;

        while (n < 5) {
            int m = 0;
            while (m < 10) {
                System.out.print("Q");
                m++;
            }
            System.out.println();
            n++;
        }
    }
}

