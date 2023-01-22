package day02datatypesmethodcreation;

public class Variables01 {
    //note: primitive data typelarini Java olusturmustur, biz olusturamayız.
    //primitive data types --> char-boolean- byte- short-int- long- float- double
    //float: ondalik sayilar için kullanılır. 32 bit
    //double: ondalık sayiialr icin kullanılır.64 bit
    public static void main(String[] args) {
        //Ornek 1: Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturup toplam fiyati ekrana yazdiriniz.
        //note: Java "decimal numbers" i otomatik olarak double kabul eder.Siz data typeini float yazarsaniz otomatikman hata verir.
        //float olmasinda israr ediyorsaniz sonunda F veya f koymalisiniz.
        float shirtPrice = 12.99F;
        float shoesPrice = 15.89F;
        System.out.println(shirtPrice+shoesPrice);
        //println ve print arasındakali fark; print sayıları hemen dibine eklemeye devam eder. 12.9915.89 gibi
        //ornek2 : hucre agirligi ve amipin agirligi icin iki tane variable olusturun ve agirliklari farkiini ekrana yazdirin.
        double weightCell = 0.000000000000112;
        double weightAmip = 0.000000000000023;
        System.out.println(weightCell-weightAmip);
        // 8.9E-14 E==> Exponent number ( üslü sayı)





    }
}
