package day03scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {

        //kullanicinin bir dikdörtgenin iki kenar uzunlugunu alınız
        //i) alanini hesaplayiniz
        //ii)cevresini hesaplayiniz
        Scanner input = new Scanner(System.in);
        System.out.println("Dikdörtgenin kısa kenar uzunlugunu giriniz");
        float shorSide =input.nextFloat();
        System.out.println("Dikdörtgenin uzun kenar uzunlugunu giriniz");
        float longSide =input.nextFloat();
        System.out.println("Alan ="+ shorSide*longSide);
        System.out.println("Cevre ="+ 2*(shorSide+longSide));
    }
}
