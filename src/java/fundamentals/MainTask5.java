package java.fundamentals;//Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.import java.util.Scanner;

import java.util.Scanner;

public class MainTask5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int month = scan.nextInt();
        String[] months = {"январь", "феваль", "март", "апрель", "май", "июнь",
                "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        String x;
        try {
            x = months[month - 1];
            System.out.println("Это месяц - " + x + ".");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Такого месяца не существует");
        }
    }
}
