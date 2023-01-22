package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //Example 1: String array olusturun, icine 5 tane eleman ekleyin, ilk eleman ile son elemanin
        //           icerdigi karakter sayilari toplamini ekrana yazdirin.
        String arr[] = new String[5];
        arr[0] = "Math";
        arr[1] = "Science";
        arr[2] = "Music";
        arr[3] = "English";
        arr[4] = "Art";
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0].length() + arr[arr.length - 1].length());

        //Example 2: String array olusturun , icine 5 tane eleman ekleyin, tum elemanlarin
        //          icerigi karakter sayikari toplamini ekrana yazdiriniz
        String brr[] = new String[5];
        brr[0] = "Miami";
        brr[1] = "Istanbul";
        brr[2] = "Frankfurt";
        brr[3] = "Dhaka";
        brr[4] = "Athena";
        //1.YOL
        //NOTE: arrayler ile çalışırken başlangıç değeri 0 alınır
        int totalChar = 0;
        for (int i = 0; i < brr.length; i++) {
            totalChar += brr[i].length();
        }
        System.out.println(totalChar);

        //2.Yol for-each loop(enhanced(zenginlestirilmis) loop)==> baslangic degeri loopun calisma sarti ve increment/decrement kismini kendisi halleder.
        //for each loop array'lerde ve collection'larda kullanilir.
        // Index kullanmaniz gerektiginde bazen for each loop caresiz kalir.,mecburen diger looplari kullaniriz.
        //iter yazinca (sout gibi ) for eachi hazirlar direkt Java
        int sum = 0;
        for (String w : brr) {
            sum += w.length();
        }
        System.out.println(sum);


    }
}

