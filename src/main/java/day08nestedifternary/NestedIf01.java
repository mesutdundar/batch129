package day08nestedifternary;

import java.util.Scanner;

public class NestedIf01 {
    // nested kod uzun ve karmasık oldugu ıcın cok fazla tercıh edılmez .
    // parantez icine cok kod yazmamalıyız.
    //nested= iç içe geçmiş zigon sehpa, kus yuvası
    public static void main(String[] args) {
        /*Example 1: Kullanicidan 3 tane pozitif bir tamsayi aliniz.
                Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
        Eger ucgen ise "eskenar"
        Ucgen olma durumunu
        kontrol ediniz.
        INFO :
        Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenardan buyuk olmali
        herhangi iki kenar farki ucuncu kenardan kucuk olmali
        a+b>c>a-b
        a+c>b>a-c
        b+c>a>b-c
        a=b=c ise eskenar ucgen
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Üçgenin kenarları için 3 tane uzunluk giriniz...");
        /*double a = Math.abs(input.nextDouble());
        double b = Math.abs(input.nextDouble());
        double c = Math.abs(input.nextDouble());
        "direkt girilen ifadeyi mutlak deger yapmak için kullanılabilecek bir yöntem"
        */
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        boolean ucgenMi = (a + b > c && c > Math.abs(a - b)) && (a + c > b && b > Math.abs(a - c)) && (b + c > a && a > Math.abs(b - c));

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("üçgenin kenarları negatif yada 0 olamaz");
        } else if (ucgenMi/*yukarıdaki boolean buradaydı ma parantez içinde cok yer kaplamasın diye cıkarttık burdan*/) {
            if (a == b && a == c && b == c) {
                System.out.println("Üçgen, hem de eşkenar üçgen");
            } else {
                System.out.println("Üçgen ama eşkenar üçgen değil");
            }
        } else {
            System.out.println("Sen Üçgen Değilsin");
        }


    }
}
