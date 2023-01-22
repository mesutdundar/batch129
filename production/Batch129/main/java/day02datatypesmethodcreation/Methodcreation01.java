package day02datatypesmethodcreation;
//sout: System.out.println kısaltması
public class Methodcreation01 {
    /* Java'da method nasil olustulur?
    1)main methodun disinda olusturulmalıdır.
    2)access modifier + return type + method ismi + () + {}

    Olusturulan methodlar nasil kullanilir?
    1) main methodun icinden kullanilir.
    2)method'un ismi + () yazin
    3)islem yapacagiiz sayilari parantezin icine yaziniz.

     */
    public static void main(String[] args) {
        int sonuc = add(3, 5);
        System.out.println(sonuc);

        long carpmaSonucu = multiply(3, 6);
        System.out.println(carpmaSonucu);

        int islemSonucu = islem(5,3,9);
        System.out.println(islemSonucu);
        double kupSonucu = kup(6.9);
        System.out.println(kupSonucu);
    }

    public static int add(int a, int b) {
        return a + b;
        //sonucu almak icin returnu yazmamız gerek
    }

    protected static long multiply(int a, int b) {
        return a * b;
    }
    //örnek soru1: verilen 3 sayidan ilk ikisini carpan ve sonucu ücüncü ile toplayan bir method yaz ve kullan
    public static int islem(int a, int b, int c){
        return a*b+c;
    }
    //ornek soru2 :verilen bir ondalık syının kupunu hesaplayan methodu olusturup kullan
    // access modifier'ı default yapmak icin default yazılmaz, bos bırakmak yeterli (alt satıra bak)
    static double kup (double a){
        return a*a*a ;
    }

}
