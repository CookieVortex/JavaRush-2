package Course1;

//В переменную digits нужно записать строку "60".
//Используй переменные x, y, z, пустую строку и конкатенацию строк.
public class Task6 {
    public static void main(String[] args) {
        int x = 2;
        int y = 4;
        int z = 0;

        String digits = "" + (x + y) + z; //напишите тут ваш код

        System.out.println(digits);

        //В переменную hugeAmount нужно записать число 100500.
        //Используй переменные bigAmount, greatAmount и преобразование строки в число.
        //Для объявления и инициализации hugeAmount используй одну команду.


        String bigAmount = "500";
        String greatAmount = "100000";

        int hugeAmount = Integer.parseInt(bigAmount) + Integer.parseInt(greatAmount);

        System.out.println(hugeAmount);

    }
}
