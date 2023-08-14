package Course1;

//Метод main выводит на экран четыре строки. Все они - яркий пример злоупотребления заглавными буквами.
//Внеси изменения в код, чтобы все буквы в этих строках стали строчными.

public class Task8 {
    public static void main(String[] args) {
        String title = "Senior Lead Principal Software Engineer Data Architect";
        String degree = "In college, I Majored in Political Science and Minored in Religious Studies.";
        String career = "Experienced Team Leader with strong Organizational Skills and a Successful career in Management.";

        //напишите тут ваш код
        System.out.println("RESUME".toLowerCase());
        System.out.println(("TITLE: " + title).toLowerCase());
        System.out.println(("DEGREE: " + degree).toLowerCase());
        System.out.println(("CAREER: " + career).toLowerCase());


//В методе main на экран выводятся три строки.
//Внеси изменения в код, чтобы все буквы в этих строках стали заглавными.

        String caps = "if I type in caps ";
        String usa = "сша";

        //напишите тут ваш код
        System.out.println(usa.toUpperCase());
        System.out.println("Винни Пух".toUpperCase());
        System.out.println((caps + "they know I mean business").toUpperCase());
    }
}
