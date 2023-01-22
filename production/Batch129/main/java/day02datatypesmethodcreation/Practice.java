package day02datatypesmethodcreation;

public class Practice {
    /*
     1) dikdörtgenin alanını hesaplayan methodu olustur kullan
     2)dikdörtgenin cevresini hesaplayam methodu olusturunuz ve kullınız
     3) dairenin cevresini hesapplayan methodu olusturunuz ve kullanınız
     4)dairenin alanını hesaplayan methodu olusutup kullan
     bunaları yeni bir class acıp orda yap
     */
    public static void main(String[] args) {
        int sonuc1 = dikdortgeninAlani(12,24);
        System.out.println(sonuc1);
        int sonuc2=dikdortgeninCevresi(56,74);
        System.out.println(sonuc2);
        int sonuc3 =daireninCevresi(8);
        System.out.println(sonuc3);
        int sonuc4= daireninAlani(7);
        System.out.println(sonuc4);


    }

    private static int dikdortgeninAlani (int a, int b){
        return a*b ;
        }

        protected static int dikdortgeninCevresi (int a, int b){
        return (a+b)*2 ;
        }
        static int daireninCevresi(int r) {
            return (int) (2 * Math.PI* r);
        }
        public static int daireninAlani(int r ){
        return (int) (Math.PI*Math.pow(r,2));
        }
    }

