package advanced_practice.practice02;

public class Q04_RandomMethod_RastgeleHarf {
    /*
        Rastgele bir harf veren bir method oluşturun ve ardından methodu kullanarak aşağıdakileri yazdırınız.
        ‘A’ ve ‘a’ için “İlk Karakter” yazdırınız.
        ‘B’ ve ‘b’ için “İkinci Karakter” yazdırınız.
        ‘C’ ve ‘c’ için “Üçüncü Karakter” yazdırınız.
        ‘D’ ve ‘d’ için “Dördüncü Karakter” yazdırınız.
        Diğerleri için “Diğer Karakterleri” yazdırınız.
        */
    public static void main(String[] args) {
       // System.out.println((int) (Math.random()*100));  "rastgele sayi alma 0-100 arasi"
      /*  String x;
        do {
            x = rastgeleHarf();
            System.out.println(x);
        }while (!x.equals("z"));

       */
        String rastgeleHarf = rastgeleHarf().toLowerCase();

        switch (rastgeleHarf){
            case "a":
                System.out.println("Ilk karakter");
                break;
            case "b":
                System.out.println("ikinci karakter");
                break;
            case "c":
                System.out.println("ucuncu karakter");
                break;
            case "d":
                System.out.println("dorduncu karakter");
                break;
            default:
                System.out.println("diger karakterler");
        }


    }
    public static String rastgeleHarf(){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int maxIndex =alphabet.length() ;
        int rastgeleIndex = (int) (Math.random()*maxIndex);
         return alphabet.substring(rastgeleIndex,rastgeleIndex+1); // substring (0,1) gibi dusun ilk harfi almak gibi!

    }
}
