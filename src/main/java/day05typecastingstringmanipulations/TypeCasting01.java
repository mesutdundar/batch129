package day05typecastingstringmanipulations;

public class TypeCasting01 {
      /*
            Numeric primitive data type'larinin birbirine donusturulmesine "type casting" denir.
            Numeric Data Type'lar byte-short-int-long-float-double
            Note1: Kücük data typelarini büyük data typelarina cevirmeyi Java otomatik olarak yapabilir.
                   Bu işleme "AutoWidening" (Otomatik Genişletme) denir.
            Note2: Büyük data typelarini kücük data typelarina cevirmek riskli bir iştir.
                   Bu işlemi kod yazanlar yapar.
                   Bu isleme "ExplicitNarrowing" denir.(acıktan daraltma)
       */

    public static void main(String[] args) {
        //byte data type'ini int data type'ına cevirınız.
        byte age = 13;
        int ageInt = age; //AutoWidening

        //long data typeını short data typeına cevırelım
        long weight = 234 ;
        short weightShort =(short) weight; //explicitNarrowing

        //int data typeını float data typeına cevırınız
        int distance = 865412 ;
        float distanceFloat = distance;

        //double data typeını short data typeına cevırınız
        double number =12.934;
        System.out.println(number);//12.934
        short numberShort = (short) number;
        System.out.println(numberShort);//12

        //Dikkat!
        //Donusum yaptıgımız sayı(260), donusturecegımız data typeının sınırları arasında ıse, java kullandıgımız sayı ıle
        // "mod"ıslemı yapar ve mod ıslemının sonucu sızın yenı degerınız olur!!
        //Exmple1;
        short num = 260;
        System.out.println(num);//260
        byte numByte = (byte) num;
        System.out.println(numByte);//4 (byte toplam 256 sayı var(-128...+127) . 260/256 kalan 4 . bu yüzden kalanı sayı verir.
        //example 2;
        short n = 1023;
        System.out.println(n);//1023
        byte nByte = (byte) n;
        System.out.println(nByte);//-1







    }
}
