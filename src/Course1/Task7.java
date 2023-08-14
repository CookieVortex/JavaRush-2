package Course1;

//В методе main на экран выводятся значения трех строк.
//Внеси изменения в код, чтобы вместо значений строк вывелась длина каждой строки.
public class Task7 {
    public static void main(String[] args) {
        String emptyString = "";

        System.out.println(emptyString.length());
        System.out.println("Gomu Gomu no Bazooka!".length());
        System.out.println((emptyString + 2 + 2 + "22").length());
    }

}
