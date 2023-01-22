package day07ifstatement;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {


    /* iki tane Strıng datanın bırbırıne esıt olup olmadıgını anlamak ıcın "==" degl ; equals() kullanırız.
       i)
       ii)equalsIgnoreCase()==> Buyuk kucuk harf onemsemez
     */

        //Kullanıcıdan gun ısımlerını alınız haftaıcı mı haftasonu mu oldugunu yazdıran kodu yazınız

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir gün ismi giriniz");
        String gunIsmi = input.next();
//I.yol
        if (gunIsmi.equalsIgnoreCase("Cumartesi") || gunIsmi.equalsIgnoreCase("Pazar")) {
            System.out.println("Hafta sonu");
        } else if (gunIsmi.equalsIgnoreCase("Pazartesi") ||
                gunIsmi.equalsIgnoreCase("Salı") ||
                gunIsmi.equalsIgnoreCase("Çarşamba") ||
                gunIsmi.equalsIgnoreCase("Perşembe") ||
                gunIsmi.equalsIgnoreCase("Cuma")) {
            System.out.println("Hafta ici");
        } else {
            System.out.println("Geçerli bir gün ismi giriniz");
        }
        //II.yol
        boolean haftaici = gunIsmi.equalsIgnoreCase("Pazartesi") ||
                gunIsmi.equalsIgnoreCase("Sali") ||
                gunIsmi.equalsIgnoreCase("Carsamba") ||
                gunIsmi.equalsIgnoreCase("Persembe") ||
                gunIsmi.equalsIgnoreCase("Cuma");

        boolean haftasonu = gunIsmi.equalsIgnoreCase("Cumartesi") ||
                gunIsmi.equalsIgnoreCase("Pazar");

        if(haftaici){
            System.out.println("Hafta ici");
        }else if(haftasonu){
            System.out.println("Hafta sonu");
        }else{
            System.out.println("Lutfen gecerli bir gun ismi giriniz");
        }



    }
}
