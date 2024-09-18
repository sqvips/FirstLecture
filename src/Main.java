import java.util.Scanner;

public class Main {

    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Напишите число: ");
        int a = in.nextInt();
        String b=""; //сохраняем сюда
        while (a>0){
            int remember=a%2;
            b=remember + b;
            a=a/2;
        }
        System.out.println("Итог: " + b);
    }
}