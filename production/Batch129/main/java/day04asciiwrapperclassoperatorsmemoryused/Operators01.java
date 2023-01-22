package day04asciiwrapperclassoperatorsmemoryused;

public class Operators01 {
    /* 1) dört işlem Java matematikte kullanildigi gibi kullanilir.
       NOTE1: int/int ==> int olur.
       NOTE2: double/int ==> double olur. Cunku Javada maematiksel islemlerde farklı data types kllanilirsa sonuc buyuk data typeda olur.


      2)Java'da "logical operator" lar vardır.(&& and symbol)
        AND ve OR işlemleri "logical operator" lardır.
           i)AND işleminden true alabilmek için her şey true olmalıdır.
             AND işlemi "perfectionist" tir.
             AND işleminde bir tane false sonucu false yapar.
           ii)OR işleminde bir tane true sonucu true yapmaya yeter.(|| or symbol)
              OR işleminde sonucun false olması için her şey false olmalıdır.
              OR işlemi "polyanna" gibidir.
          iii) NOT operatoru( ! not symbol) true olanı false, false olani true yapar
               !true=false
               !false=true
               !!true=true

      3)Comparison operatorleri;
      <,>,<=,>=,==,!=(esit degildir)
      NOTE: karsılastırma operatorlerini kullandıgınızda kesinlikle boolean alirsiniz!!!

      NOTE: Biz AND işlemi için "&&" kullaniriz ama "&" kullanim da gecerlidir.
      Farklari nelerdir?
       "&&" kullanim ilk ifade "false" oldugunda digerlerini kontrol etmez dolayisiyla hizli calisir.
              "&" kullanim ilk ifade ne olursa olsun digerlerini kontrol eder dolayisiyla yavas calisir.
              Bu yuzden biz hep "&&" kullaniriz.


     */
    public static void main(String[] args) {
        boolean first =  3<5 ;
        boolean second = 2+3 != 5;
        boolean third = 2+3*5>=19;
        System.out.println(first+" - " +second+" - "+third);
        System.out.println(first&&second);
        System.out.println(first||second);
        System.out.println(second||third);


    }
}
