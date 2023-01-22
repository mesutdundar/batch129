package day03scanner;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {

        //Kullanicidan alacaginiz 5 basamakli
// bir sayinin ilk iki ve son iki basamagindaki
// rakamlari toplamini yazdiran kodu yaziniz
        Scanner input = new Scanner(System.in);
        System.out.println("5 basamakli bir sayi giriniz"); // sayi : (38761)
        int number = input.nextInt();
        int lastDigit = number%10;
        number=number/10;
        int lastSecondDigit = number%10;
        number=number/100;
        int secondDigit =number%10;
        number=number/10;
        int firstDigit=number%10;
        System.out.println(lastDigit+lastSecondDigit+secondDigit+firstDigit);

    }
}
