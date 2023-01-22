package day03scanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

        //kullanıcan iki sayi alip dört işlem yapan ve işlemlerin sonuclarini ekrana yazdiran kodu yaziniz
        Scanner input = new Scanner(System.in);

        System.out.println("iki sayi giriniz");
        double firstNumber = input.nextDouble();
        double secondNumber= input.nextDouble();
        System.out.println(firstNumber+secondNumber);
        System.out.println(firstNumber-secondNumber);
        System.out.println(firstNumber*secondNumber);
        System.out.println(firstNumber/secondNumber);

    }
}
