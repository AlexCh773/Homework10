public class Main {
    public static void main(String[] args) {
        task2(task1());
        task3();
    }

    public static String task1() {
        System.out.println("task1:");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName.trim() + " " + firstName.trim() + " " + middleName.trim();
        System.out.println("ФИО сотрудника — " + fullName);
        return fullName;
    }

    public static void task2(String fullName) {
        System.out.println();
        System.out.println("task2:");
        String fullNameInCapitalLetters = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameInCapitalLetters);
    }
    public static void task3() {
        System.out.println();
        System.out.println("task3:");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}