package day05typecastingstringmanipulations;

public class StringManipulations01 {

    //String bir non-primitive data typeıdır ve aynı zamanda bir class'tır.

    public static void main(String[] args) {

        String s ="Java is easy";
                //  "01234567891011" karekter sayıları (index)
        //Example 1 : "s" Stringindeki tüm karakterleri büyük harf yapınız.
        String sUpper = s.toUpperCase();
        System.out.println(sUpper);//JAVA IS EASY
        //Example 2 : "s" Stringindeki tüm karakterleri kücük harf yapınız.
        String sLower = s.toLowerCase();
        System.out.println(sLower); //java is easy
        //Example 3 : "s" Stringindeki ilk karakteri alınız.
        char  firstChar = s.charAt(0);
        System.out.println(firstChar);//J
        //Example 4 : "s" Stringindeki ikinci ve sondan ikinci karekteri alınız ve ekrana yanyana yazdırınız.
        char secondChar =s.charAt(1);//a
        char secondLastChar=s.charAt(10);//s
        //yanyana yazdırma 1.yol
        System.out.print(secondChar);
        System.out.println(secondLastChar);
        //yanyana yazdırma 2.yol
        System.out.println(""+secondChar+secondLastChar);

        //example 5: "s" Stringindeki kullanılan charecter sayısını bulunuz
        int sLength = s.length();
        System.out.println(sLength);
        //example 6: "s" Stringindeki ilk 4 characteri alınız
        String sub1 = s.substring(0,4);//"0" yani ilk index dahil, "4" yani ikinci index haricdir.[0-4) gibi. bitisin bir sonrası olacak o yuzden 3 yerine 4 yazdık
        System.out.println(sub1);//Java
        //example7: "s" Stringindeki "is" kelimesini alınız.
        String sub2 = s.substring(5,7);
        System.out.println(sub2);//is
        //Example8 : "s" Stringindeki easy kelimesini aliniz.
        String sub3 =s.substring(8,12);
        System.out.println(sub3);//easy
        // bir karakterden baslayıp Strıngın sonuna kadar almak ıstersenız 2.ındexı yazmayınız
        String sub4 = s.substring(8);
        System.out.println(sub4);
        //Example 9: "s" Stringinde "money" kelimesinin var olup olmadıgını kontrol ediniz.
        boolean isExist =s.contains("money");
        System.out.println(isExist);

        /*
        Bir methodu ogrenırken 3 sey mutlaka ogrenın ;
        i) bu method ne ıs yapar?
        ii)bu methodun farklı kullanımları nasıldır.
        iii)bu method size ne return(data type) eder.
         */
        //Example 10: "s" Stringinin belli bir harfle baslayıp baslamadıgını kontrol ediniz.
        boolean isStart =s.startsWith("Java");
        System.out.println(isStart);//true
        boolean isEnd = s.endsWith("hard");
        System.out.println(isEnd);//false
        //example 11: "s" String'inin 6.characterden itibaren belli bir harfle baslayıp baslamadıgını kontrol ediniz.
        boolean isBegin = s.startsWith("i",5);
        System.out.println(isBegin); //true



    }
}
