package java.fundamentals;

//Отобразить в окне консоли аргументы командной строки в обратном порядке

class MainTask2 {
    public static void main(String[] args) {
        for( int i = args.length - 1 ; i >= 0 ; i--)
            System.out.println("Reverse : " + args[i]);
    }
}
