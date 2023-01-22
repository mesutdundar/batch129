package day07ifstatement;

import java.util.Scanner;

public class C04_IfStatement {

    public static void main(String[] args) {

        /*Kullanıcıdan yas degerini alan ve yasın hangi evrede oldugunu asagıdaki tabloya göre yazdıran kodu yazınız
        0-4 == bebek , 5-12== cocuk , 13-20 genc, 21-30 yetiskin , geri kalanlar icin==tanımlanmamıs evre , hata mesajı ==gecerli bir yas giriniz
          */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int age = input.nextInt();
        if (age<5 && age>-1){
            System.out.println("BEBEK");
        } else if (age<13 && age>4) {
            System.out.println("COCUK");
        } else if (age<21 &&  age>12) {
            System.out.println("GENC");
        } else if (age<31 && age>20) {
            System.out.println("YETİŞKİN");
        } else if (age>30 && age<128) {
            System.out.println("TANIMLANMAMIŞ EVRE");
        }else {
            System.out.println("GECERLİ BİR YAS GİRİNİZ");
        }

    }
}
