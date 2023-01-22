package day04asciiwrapperclassoperatorsmemoryused;

public class WrapperClass {
    public static void main(String[] args) {

        //primitive:      char  -     boolean  - byte - short - int   -  long  -  float - double
        //Wrapper Class: Character  - Boolean  - Byte - Short - Integer-  Long -  Float - Double
        //Wrapper Classlar non-primitive'dir o yüzden memoryde cok yer kaplar.O yuzden sart degilse wrapper class kullanmayi tercih etmeyiz!



        int n = 12; //primitive(n'nin sonuna nokta koyarsaniz hic method goremezsiniz , cunku "primitive'ler" method içermez.
        Integer m =12; // wrapper class(m'nin sonuna nokta konulunca methodlar cıkar.)

        byte p =23;
        Byte r =43;

        //example1: short data typenin min ve max degerlerini kod yazarak bulunuz.
        short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort);
        short minShort = Short.MIN_VALUE;
        System.out.println(minShort);
        //example2: int data typenin min degeri ile byte data type'nin max degerinin toplamini bulunuz.
        int minInt = Integer.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println(minInt+maxByte);
        System.out.println(Integer.MIN_VALUE + Byte.MAX_VALUE);

        //example3:i) primitive int'i Wrapper Integer'a ceviriniz.
        int num = 22;
        Integer wrapperNum = num;
        System.out.println(wrapperNum);//22
        //ii) Wrapper Byte'ı primitive byte'a ceviriniz.
        Byte k = 43;
        byte primitiveK =k;
        System.out.println(primitiveK);
        //Example4: i) primitive char'i Wrapper Character'e ceviriniz.
        //ii) Wrapper Boolean'i primitive boolean'a ceviriniz.
        char sevgiliBasHarf = 'S';
        Character  wrapperedBasHarf =sevgiliBasHarf;
        System.out.println(wrapperedBasHarf);
        Boolean seviyorMusun = true;
        boolean cokMU = seviyorMusun;
        System.out.println(cokMU);

        //Example 5: Size String olarak verilen iki fiyat'in toplamini ekrana yazdiriniz.

        String shirt = "2300";
        String shoes = "5200";
        System.out.println(shirt+shoes); // 23005200
        //Java'da "+"symbolu iki sayi arasinda kullanilirsa "toplama islemi" olur.
        //Java'da sembolu iki String arasinda veya bir String ve bir sayi arasinda kullanilirsa "concatenation islemi" olur.
        //"concatenation islemi" birleştirme yapar.
        //Note: Concatenation ismlemlerinde Java matematikteki islem onceligi kurallarini kullanir.

        int toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println(toplamFiyat); //7500

        //example 6: Size String olarak verilen iki fiyatin toplamini ekrana yazdiriniz.
        /*NOTE : valueOf() methodu tüm karekterleri rakam olan Stringleri sayilara cevrilir.
                 eger valueOf() methodu kullanirken Stringlerin icine rakam olmaan bir karekter koyarsaniz hata alirsiniz.
                 bu hatayi düzeltmeyi ileride ögrenicez!!!!
         */
        String tv ="$11000";
        String radio ="$3000";
        System.out.println(tv+radio); //$11000$3000

      /*  int totalPrice = Integer.valueOf(tv) + Integer.valueOf(radio);
      System.out.println(totalPrice);  bu sekilde $ işareti oldugu icin hata veriyor. */

    }
}
