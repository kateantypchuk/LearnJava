package org.learn;
import java.util.Scanner;

//Задание. Ввести n чисел с консоли.
//1.     Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
//2.     Вывести числа в порядке возрастания (убывания) значений их длины.

public class OptionalTask<max> {
    public static void main(String[] args) {
        System.out.println("Предполагаемое количество чисел: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] values = new int[n];
        int[] length = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите число: ");
            Scanner scan2 = new Scanner(System.in);
            values[i] = scan2.nextInt();
            length[i] = (String.valueOf(values[i])).length();
        }
        int max = getMax(values);
        System.out.println("Maximum Value is: " + max);
        System.out.println("Maximum Value length is: " + (String.valueOf(max)).length());

        int min = getMin(values);
        System.out.println("Minimum Value is: " + min);
        System.out.println("Minimum Value length is: " + (String.valueOf(min)).length());

        for(int i = values.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( (String.valueOf(values[j])).length() > (String.valueOf(values[j+1])).length() ){
                    int tmp = values[j];
                    values[j] = values[j+1];
                    values[j+1] = tmp;
                }
            }
        }
        for(int i = 0; i < values.length; i++){
            System.out.println(values[i]);
        }
    }

        public static int getMax(int[] inputArray){
            int maxLength = (String.valueOf(inputArray[0])).length();
            int maxLengthValue = inputArray[0];
            for (int i = 1; i < inputArray.length; i++) {
                if ((String.valueOf(inputArray[i])).length() > maxLength) {
                    maxLength = (String.valueOf(inputArray[i])).length();
                    maxLengthValue = inputArray[i];
                }
            }
            return maxLengthValue;
        }

    public static int getMin(int[] inputArray){
        int minLength = (String.valueOf(inputArray[0])).length();
        int minLengthValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if ((String.valueOf(inputArray[i])).length() < minLength){
                minLength = (String.valueOf(inputArray[i])).length();
                minLengthValue = inputArray[i];
            }
        }
            return minLengthValue;
    }
}
