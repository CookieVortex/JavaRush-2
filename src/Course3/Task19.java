package Course3;

//Перед тобой программа, которая выводит информацию о человеке в консоли. К сожалению, она не компилируется.
//Измени минимальное необходимое количество модификаторов доступа в классе Person, чтобы код скомпилировался.
public class Task19 {
    private static void main(String[] args) {
        Person person = new Person("Иван", "Иванов");
        System.out.println("Досье.");
        System.out.println("Имя: " + person.getFirstName());
        System.out.println("Фамилия: " + person.getLastName());
        System.out.println("Полное имя: " + person.getFullName());
    }
}
