package Course4;

//Перед тобой метод signIn(), который приветствует пользователей сайта.
//Сейчас он приветствует всех пользователей, а должен только зарегистрированных.
//Имена всех незарегистрированных пользователей — "user".
//Добавь проверку имени пользователя в начало метода signIn().
//Если имя "user", прерви выполнение метода, используя ключевое слово return.
public class Task1 {
    public static void main(String[] args) {

    }

    public static void signIn(String username) {
        if (username.contains("user")) {
            return;
        } else
            System.out.println("Добро пожаловать " + username);
            System.out.println("Очень скучали по Вам, " + username);
    }
}
