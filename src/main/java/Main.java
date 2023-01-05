//Условие
//1. Создать объект:
//
//Id — нужно считать по порядку добавления нового пользователя.
//
//Имя пользователя.
//
//Его возраст.
//
//Пол (male/female)
//
//Предусмотреть хранение списка пользователей.
//
//2. Создать счетчик, который будет увеличиваться на единицу при добавлении нового пользователя (id), увеличивать этот счетчик в конструкторе
//
//3. Переопределить методы equals() и hashCode(), toString()
//
//Класс должен уметь:
//
//Возвращать количество пользователей в общем списке, и посчитать количество по признаку пола пользователя.
//
//Посчитать общую сумму по возрасту пользователей, так же учесть по признаку пола. (на примере).
//
//Посчитать средний возраст, как общий так и по признаку пола.
//
//Искать пользователей по полу (MALE/FEMALE).

public class Main {
    public static void main(String[] args) {
        new User("Dzmicer", 35, Sex.MALE);
        new User("Marina", 34, Sex.FEMALE);
        new User("Galina", 7, Sex.FEMALE);


        System.out.println("Все пользователи: All users:");
        User.getAllUsers().forEach(System.out::println);
        System.out.println("Все пользователи: MALE All users: MALE");
        User.getAllUsers(Sex.MALE).forEach(System.out::println);
        System.out.println("Все пользователи: FEMALE All users: FEMALE");
        User.getAllUsers(Sex.FEMALE).forEach(System.out::println);
        System.out.println("================================================");
        System.out.println("       всех пользователей: all users:" + User.getHowManyUsers());
        System.out.println("  всех пользователей MALE:  all MALE users:" + User.getHowManyUsers(Sex.MALE));
        System.out.println("всех пользователей FEMALE: all FEMALE users:" + User.getHowManyUsers(Sex.FEMALE));
        System.out.println("================================================");
        System.out.println("       общий возраст всех пользователей: total age of all users:" + User.getAllAgeUsers());
        System.out.println("  общий возраст всех пользователей MALE: total age of all MALE users: " + User.getAllAgeUsers(Sex.MALE));
        System.out.println("общий возраст всех пользователей FEMALE: total age of all FEMALE users:" + User.getAllAgeUsers(Sex.FEMALE));
        System.out.println("================================================");
        System.out.println("       средний возраст всех пользователей: average age of all users:" + User.getAverageAgeOfAllUsers());
        System.out.println("  средний возраст всех пользователей MALE: average age of all MALE users:" + User.getAverageAgeOfAllUsers(Sex.MALE));
        System.out.println("средний возраст всех пользователей FEMALE: average age of all FEMALE users:" + User.getAverageAgeOfAllUsers(Sex.FEMALE));
        System.out.println("================================================");
    }



}
