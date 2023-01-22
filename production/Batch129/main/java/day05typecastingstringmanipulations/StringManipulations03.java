package day05typecastingstringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {
        /*
        Example 1 : Asagıdaki kurallara gore kullanıcınn gırdıgı passwordu kontrol edınız
        i)en az 8 character olsun
        ii)Space characteri passwordda olmasın
        iii)en az bir tane buyuk harf olsun
        iv)en az bir tane kucuk harf olsun
        v)en az bir tane symbol olsun
        vi)en az bir tane rakam olsun

         */
        Scanner input =  new Scanner(System.in);
        System.out.println("Lütfenn Password'ünüzü giriniz.");
        String pwd = input.nextLine();
        //i) En az 8 character olsun
        boolean first = pwd.length()>7;
        System.out.println(first);
        //ii) space karekteri passwordde olmasın
        boolean second = !pwd.contains(" ");
        System.out.println(second);
        //iii) En az bir tane büyük harf olsun
        //Note: Büyük harf olmaanları sıl,
        //      kalan karekter sayısına bak,
        //      Character sayisi sıfır ıse buyuk harf yok demektır
        //      sıfırdan buyuk ıse buyuk harf var demektır
        boolean third = pwd.replaceAll("[^A-Z]", "").length()>0; //Methodlari ayni satırda yanyana kullanmaya method Chain  denir

        //iv) en az bir tane kucuk harf olsun
        boolean fourth = pwd.replaceAll("[^a-z]","").length()>0;

        //v)en az bir symbol olsun
        boolean fifth= pwd.replaceAll("[a-zA-Z0-9]","").length()>0;

        //vi) en az bir rakam olsun
        boolean sixth =pwd.replaceAll("[^0-9]","").length()>0;


        System.out.println("Password gecerli mi?" +(first && second && third && fourth && fifth && sixth));








    }
}
