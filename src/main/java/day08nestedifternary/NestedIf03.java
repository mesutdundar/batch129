package day08nestedifternary;

import java.util.Scanner;

public class NestedIf03 {
    public static void main(String[] args) {
        /*
        Password'un ilk harfi buyuk harf ise
        'A' olursa "gecerli password" yazdıran degilse "gecersiz password" yazdıran
        Alemci ==> Gecerli
        passwordun ilk harfi kucuk ise
        'z' olursa "gecerli" password yazdıran degilse "gecersz password yazdıran
        zehirli ==> Gecerli
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Password'unuzu giriniz...");
        String pwd = input.nextLine();
        char firstChar = pwd.charAt(0);

        if (firstChar>='A' && firstChar<='Z'){
            if (firstChar=='A'){
                System.out.println("Geçerli password");
            }else {
                System.out.println("Geçersiz Password cunku buyuk harf ama 'A' degil...");
            }
        } else if (firstChar>='a' && firstChar<='z'){
            if (firstChar=='z'){
                System.out.println("Geçerli password");
            }else {
                System.out.println("Geçersiz Password cunku kucuk harf ama 'z' degil..");
            }
        }else {
            System.out.println("ilk character harf olmalı");
        }
        /*
        // uzun yolu ( 6 ekmek icin 6 kere bakkala gitmek gibi 6 kere string classa gittigimiz sekli
        if (pwd.charAt(0)>='A' && pwd.charAt(0)<='Z'){
            if (pwd.charAt(0)=='A'){
                System.out.println("Geçerli password");
            }else {
                System.out.println("Geçersiz Password cunku buyuk harf ama 'A' degil...");
            }
        } else if (pwd.charAt(0)>='a' && pwd.charAt(0)<='z'){
            if (pwd.charAt(0)=='z'){
                System.out.println("Geçerli password");
            }else {
                System.out.println("Geçersiz Password cunku kucuk harf ama 'z' degil..");
            }
        }else {
            System.out.println("ilk character harf olmalı");
        }
         */
    }
}
