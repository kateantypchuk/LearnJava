import java.util.Scanner;

public class MainTask {

public static void main(String[] args) {
            //Приветствовать любого пользователя при вводе его имени через командную строку
            Scanner scan = new Scanner(System.in);
            for (int i = 0; true; i++) {
                System.out.println("Hello " + scan.nextLine());
            }
        }
}

