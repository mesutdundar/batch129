package day06stringmanipulationsifstatement;

public class StringManipulations01 {
    public static void main(String[] args) {
        //Example1: Bir String'in bas ve sonunda "space" characteri varsa siliniz.(trim metodu)
        //               "     Ali Can  " ==> "Ali Can"
        String s = "  Ali Can  ";
        System.out.println(s);
        //trim() methodu bşr Stringin bas ve sonundaki space characterlerini siler, aradali spacelere dokunmaz.
        String sTrimmed =s.trim();
        System.out.println(sTrimmed);
        //Example 2: Asagıda fıyatları verilen urunlerın toplam fıyatını bulunuz.
        //          String tv= "$456.99"; String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98
        String tv1= "$456.99";
        String laptop1 = "$875.99";
        String tv2 =tv1.replace("$","");
        System.out.println(tv2);
        String laptop2 =laptop1.replace("$","");
        System.out.println(laptop2);

        double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2); //burda stringi double'a cevirdim.
        System.out.println(totalPrice);
        //Example 3: verilen ismin ilk isminin ilk harfi ve soy isminin ilk harfini ekrana yazdiriniz.
        //           "Ali Can" ==> AC
        String name = "   ali cAN   ";

        // (method chain taktigi ;) )
        char first =name.trim().toUpperCase().charAt(0);
        System.out.println(first);
        char second =name.trim().toUpperCase().split(" ")[1].charAt(0);// spaceden böldük (split()[] ) , ilk taraf(ali) [0] ikinci taraf(can) [1]
        //String second =name.trim().toUpperCase().split(" ")[1].substring(0,1); (substring kullanarak aynısını yaptım :) )
        System.out.println(second);
        System.out.println(""+first+second);

        //Example 4: Bir String'in hıc character ıcermedıgını (bos Strıng) kontrol eden kodu yazınız
        String str ="";
        //1.yol lenght() methodu kullan
        boolean result1 = str.length()==0;
        System.out.println("String bos mu?" + result1);//true
        //2.yol: isEmpty() methodu [ daha hızlı ve basit]. Java bir konuda method uretmısse o methodu kullanmak en ıyısıdır.
        boolean result2 = str.isEmpty();
        System.out.println("String bos mu?" +result2);//true

        //Example 5: Bir String'in space haric hıcbir character ıcermedıgını kontrol eden kodu yazınız
        String t = "     ";
        //1.yol
        boolean result3 =t.replace(" ","").length()==0;
        System.out.println("sadece space mi var?"+result3);
        //2.yol
        boolean result4 =t.replace(" ","").isEmpty();
        System.out.println("sadece space mi var?"+result4);
        //3.yol
        //isBlank() methodu sadece space ıceren Strıngler ıcın true verır, space dısında bır character ıcerırse false verır
        //isBlank() methodu bos Strıngler ıcın de true verır.
        //ısBlank() ==> space + hıcbır sey icin true         isEmpty ==> sadece hıcbırsey ıcın true verir
        boolean result5=t.isBlank();
        System.out.println("sadece space mi var?"+result5);

        //Example6 : Bir String'de a,e,i characterlerinin ilk görünümlerinin indexleri toplamını ekrana yazdırınız.
        //          "Java is easy to learn" ==> (a 1 dir. , e 8 dir , i de 5 tir.ekrana 14 yazdırmalıyız)
        String r = "Java is easy to learn";

        int idxA = r.indexOf('a');//1
        int idxI = r.indexOf('i');//5
        int idxE = r.indexOf('e');//8
        int idxTotal =idxA+idxE+idxI;//14
        System.out.println("indexler toplamı:"+idxTotal);

        //Example 7 : Bir String'de "java" kelimesinin ilk olarak kacıncı indexte kullanıldıgını gösteren kodu yazınız
        //           "Ah Java vah Java sensiz olmuyor Java. ==>3
        String u = "Ah Java vah Java sensiz olmuyor Java";
        int idxJava = u.indexOf("Java");
        System.out.println(idxJava);
        //index.Of("Java") kullanımında siz "Java" kelimesinin ilk görünümündeki ilk harfin index (yani J'nin) indexinin almıs olursunuz.

        // indexOf() methodunu  ve  lastIndexOf() olmayan characterler icin kullanılırsa her zaman "-1" verir.
        int idxOfXyz = u.indexOf("xyx");
        System.out.println(idxOfXyz);//-1
        //Example 8 : Bir String'de a,e,i characterlerinin son görünümlerinin indexleri toplamını ekrana yazdırınız.
        //"Java is easy to learn" ==> (a 18 dir. , e 17 dir , i de 5 tir.ekrana 40 yazdırmalıyız)
        String v = "Java is easy to learn";
        int idxOfA = v.lastIndexOf('a');//18
        int idxOfE = v.lastIndexOf('e');//17
        int idxOfI = v.lastIndexOf('i');//5
        System.out.println(idxOfE+idxOfA+idxOfI);//40

        //Example9: Bir String'deki tekrarsiz characterleri ekrana yazdiriniz.
        //           abbccdc ==> ad
        String y = "aac";

        char ch1 = y.charAt(0);
        if(y.indexOf(ch1)==y.lastIndexOf(ch1)){
            System.out.println(ch1);
        }

        char ch2 = y.charAt(1);
        if(y.indexOf(ch2)==y.lastIndexOf(ch2)){
            System.out.println(ch2);
        }

        char ch3 = y.charAt(2);
        if(y.indexOf(ch3)==y.lastIndexOf(ch3)){
            System.out.println(ch3);
        }

        //Note: bazı kodlarin bazi sartlara baglı olarak calısması gerekir.
        //      bazı kodları bazı sartlara gore aktıve etmek ıcın "if statement" kullanılır.






        //Example 10: sayi cift ise ekrana cift yazdırınız
        int num = 12;
        if (num>0){
            System.out.println("pozitif");}
        //Example 11: Sayi -1 ile 10 arasinda ise ekrana "Rakam" yazdırız.
        int number =0;
        if(number>-1 && number<10){
            System.out.println("Rakam");
        }
        //Example 12: Sayi uc basamakli ise ekrana "Wooow!" yazdirin.
        int n = -123;
        n = Math.abs(n); //mutlak deger 'abs'
        if(n>99 && n<1000 ){
            System.out.println("Wooow!");
        }

    }
}
