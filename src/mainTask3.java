import java.util.Scanner;
//Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
public class MainTask3 {
    public static void main(String[] args) {
        System.out.println("Задайте количество чисел");
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        for (int i = 0; i < value; i++) {
            System.out.println(Math.random());
        }
        for (int i = 0; i < value; i++) {
            System.out.print(Math.random());
        }
    }
}
