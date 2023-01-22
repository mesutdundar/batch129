package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Example 2: Integar array olusturunuz , icine 6 tane eleman yerlestiriniz , bu elemanlarin en kucugu ile
        // en buyugunun toplamini ekrana yazdiriniz
       int ages[]=new int[6]; // veya  Integer ages[] = new Integer[6]; (primitive daha az yer kaladigi icin onu kullanmayi tercih ettik wrapper yerine!
        ages[0]=20;
        ages[1]=23;
        ages[2]=19;
        ages[3]=44;
        ages[4]=15;
        ages[5]=32;
        System.out.println(Arrays.toString(ages));//[20, 23, 19, 44, 15, 32]

        //1.YOL
        //sort() methodu arraydaki elemanlari kucukten buyuge dizer!
        /*
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));//[15, 19, 20, 23, 32, 44]
        System.out.println(ages[0] + ages[ages.length-1]);//59

         */

        //2.YOL
        //Bir min kutusu olustur icine ilk sayiyi min kabul et koy
        //Kutuda ki sayiyi 2. ile karsilastir kücügünü bul kutuya koy
        //Kutuda ki sayiyi 3.sayi ile karsilastir min' i bul kutuya koy
        //Kutuda ki ile 4.sayiyi karsilastir min' i bul kutuya koy
        //Kutuda ki sayi ile 5.sayi yi karsilastir min' i bul kutuya koy
        //Kutuda ki sayi ile 6.sayi yi karsilastir min' i bul kutuya koy
        int minimum = ages[0];
        int maximum = ages[1];
        for (int w : ages) {
            minimum=Math.min(minimum,w);
            maximum=Math.max(maximum,w);
        }
        System.out.println(maximum+minimum);



    }
}
