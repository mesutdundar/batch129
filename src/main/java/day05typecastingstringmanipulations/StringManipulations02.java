package day05typecastingstringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {
        String s ="Learn Java earn money";

        //Example1: "s" Stringinin money ile bitip bitmedigini kontrol ediniz.
     boolean isEnd =   s.endsWith("money");
        System.out.println(isEnd);

        //example2: "s" Stringindeki money kelimesini "dollar" kelimesine ceviriniz.
        String s1     = s.replace("money","dollar");
        System.out.println(s1); // Learn Java earn dollar

        //eaxample 3: "s" Stringimdeli "earn" kelimesini "win" kelimesine ceviriniz.
        String s2 = s.replace("earn","win");
        System.out.println(s2);

        //example 4: "s" Stringimdeli "a" harflerini "*" a ceviriniz.
        //replace metodunda coklu kareklter ile calısırsanız mecbur cıft tırnak kullancaksınız ama tek karekterle calısırsanız cıft veya tek tırnak kullanbılırsınız.
        String s3= s.replace('a','*');
        System.out.println(s3);

        //note: ama ya ikisi de tek tırnak ya da ikisi de cıft tırnak olmalıdır.
        //example5 :"s" stringindeki "n" harflerini "XXX" a ceviriniz.
        String s4 = s.replace("n","XXX");
        System.out.println(s4);

        //example6: "s" Stringindeki bütün "e" harflerini siliniz.
        String s5 =s.replace("e","");
        System.out.println(s5);

        String t = "Ali 13 yasindadir!...456 ";

        //Example7 :"t" stringingdeki tüm rakamlari yıldıza ceviriniz
        //NOTE: bir grup datayi degistirmek icin replaceAll() kullanilir.
        //NOTE: bir grup datayi ifade etmek için "regular expressions"(Regex) kullanırız.
        String t1 = t.replaceAll("[0-9]","*");
        System.out.println(t1);
        /*
        Meshur Regex'ler ;
        1) tüm rakamlar ==> [0-9]
        2)tüm kücük harfler ==> [a-z]
        3)tüm büyük harfler ==> [A-Z]
        4)tüm kücük ve büyük harfler ==>[a-zA-Z]
        5)tüm harfler ve rakamlar ==> [a-zA-Z0-9]
        6)tüm noktalama işaretleri ==> \\p{Punct}
        7)tüm sesli harfler ==>[aeiouAEIOU]
         x,q,w harfleri  ==> [xqw]
         8) Kucuk harflerden farklı tum charecterler ==> [^a-z]
         9) tum harflerden farklı tum charecterler ==> [^a-zA-Z]
         10)Space dısındaki tum charecterler ==> \\S veya [^ ]
          */
        //example8: "t" stringindeki tüm rakamları ve harfleri "!" e ceviriniz.
        String t2 = t.replaceAll("[a-zA-Z0-9]","!");
        System.out.println(t2);
        //example9:"t" Stringindeki tüm sesli harfleri "?" ne ceviriniz.
        String t3 = t.replaceAll("[aeiouAEIOU]","?");
        System.out.println(t3);
        //example10: "t" Stringindeki kucuk harfler dısındaki tüm charekterleri "<>" ceviriniz
        String t4 = t.replaceAll("[^a-z]","<>");
        System.out.println(t4);
        //example11: "t" Stringindeki tum harfler dısındaki tüm charekterleri "+" ceviriniz
        String t5 = t.replaceAll("[^a-zA-Z]","+");
        System.out.println(t5);
        //example12: "t" Stringindeki space'ler  dısındaki tüm charekterleri "$" ceviriniz
        String t6 = t.replaceAll("[^ ]","+") ;
        System.out.println(t6);
        //example13: "t" stringinndeki sesli harfler dısındaki tum characterleri "&" ceviriniz.
        String t7 =t.replaceAll("[^aeiouAEIOU]","&");
        System.out.println(t7);








    }
}
