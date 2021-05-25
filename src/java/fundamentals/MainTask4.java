package java.fundamentals;//Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль

import java.util.Scanner;

public class MainTask4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите первое число");
            int x = scan.nextInt();
        System.out.println("введите второе число");
            int y = scan.nextInt();
        System.out.println("введите третье число");
            int z = scan.nextInt();
            System.out.println("Sum= " + (x + y + z));
            System.out.println("Multiply= " + (x * y * z));
    }
}
