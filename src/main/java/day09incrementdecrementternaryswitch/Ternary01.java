package day09incrementdecrementternaryswitch;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        // Example 1
        int a = 10;
        int b = 20;
        int r1 = a<b ? a++ : ++b;
        System.out.println(r1);
        System.out.println(a);
        System.out.println(b);

        //Example2 : Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        int c = -4;
        int r2 = c<0 ? c*-1 : c;
        System.out.println(r2);
        int d = 4;
        int r12 = c<0 ? c*-1 : c;
        System.out.println(r12);

        //Example 3: iki sayinin isareti aynı ise bu sayıları carpan , isaretleri farkli ise " farklı isaretli sayıları carpamıyorum"
        //           mesajı veren kodu yazınız
        int m = -5;
        int n = -6;
        Object r3 =(m>0 && n>0) || (m<0 && n<0) ? m*n : "Farklı işareleri çarpamıyorum";
        System.out.println(r3);
        // " Object" bir data type'tır. Object Java'da parent'ı olmayan tek data type'tır. Aynı zamanda tüm data typelar için bir parenttır.
        //Object classların babasıdır. Hz. Adem ornegindeki gibi.Object Javada bütün "non-primitive Data Type(CLASSLAR)larının ortak "Parent(baba) idir.
        //tüm insanlar ==> ademoglu , tüm data typeları(int,String,array,byte vs ) ==> Object
        // FARKLI DATA TYPELAR İCİN ORTAK BİR VARİABLE OLUSTURMAK ISTEDIGINIZDE , DATA TYPE OLARAK "Object" kullanabilirsiniz.


        //Example 4 : Size verilen sayinin 3 basamaklı olup olmadıgını kontorl eden kodu yazınız
      int p = -1000;
      int r = Math.abs(p);
      String r4 =r>99 && r<1000 ? p + "\tüç basamaklıdır" :p + "\tüç basamaklı değildir";
        System.out.println(r4);




    }
}
