package practice.practiceDTNT.practice01;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {
        //basit hesap makinası
        /*
        Kullanıcıdan alacagımız 2 sayıyı yine kullanıcıya sectirecegimiz dort islemden biri ile isleme koyup yazdırınız
         */
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen\n toplama yapmak için 1\n cıkarma yapmak icin " + "2\n carpma yapmak ıcın 3\n bolme yapmak ıcın 4\n giriniz");//kullanıcıya secmesi icin menu olusturduk
        int islem = input.nextInt();
        System.out.println("Lütfen iki tam sayı giriniz");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        if (islem == 1) {
            System.out.println("Toplama işlemi sonucu:" + num1 + "+" + num2 + "=" + (num1 + num2));
        } else if (islem == 2) {
            System.out.println("Çıkarma işlemi sonucu:" + num1 + "-" + num2 + "=" + (num1 - num2));
        } else if (islem == 3) {
            System.out.println("Çarpma işlemi sonucu:" + num1 + "x" + num2 + "=" + (num1 * num2));
        } else if (islem == 4) {
            System.out.println("Bölme işlemi sonucu:" + num1 + "/" + num2 + "=" + (num1 / num2));
        } else System.out.println("Hatalı seçim yaptınız!Tekrar deneyiniz.");
    }
}
