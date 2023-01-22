package day17arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists01 {
    /*
 1) ArrayList(List)'ler coklu data depolamak icin kullanilir.
 2) ArrayList(List)'ler non-primitive data type'inda ki coklu datalari depolamak icin kullanilir.
    List'ler "non-primitive" data kabul ederler, "Array" ler ise "primitive" data veya reference kabul eder.
 3) ArrayList(List)'leri olustururken icine koyacaginiz eleman sayisini basta soylemeye gerek yoktur.
    List'ler eleman sayisinda "flexible" dirlar ama "Array"ler "flexible" degildirler.
 4) Madem "Array" ler eleman sayisinda flexible degil nicin Java "Array" leri iptal etmedi?
   i) Eleman sayisi belli olan data'lari depolamak icin Array'ler tercih edilir.
      ii) Array'ler cok hizli calisir.
      iii) Array'ler memory'de cok az yer kaplar.
*/
    public static void main(String[] args) {
        //list nasil olusturulur?
        ArrayList<Integer> ages = new ArrayList<>();
        System.out.println(ages);//[]

        //List'lere eleman nasil eklenir
        //List'e eleman eklemek icin add() methodunu kullaniriz.
        //add() methodu elemanlari sizin verdiginiz sirada "list" 'e ekler.(Insertion Order)
        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(1, 656);
        ages.add(3, 777);
        ages.add(888);
        System.out.println(ages);//[9, 656, 12, 777, 10, 888]
        //List'e coklu eleman nasil eklenir? veya baska bir List nasil eklenir?
        //bir List'e coklu eleman eklemek icin o elemanlari once bir List icine koymalisiniz.
        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);
        ages.addAll(2, newAges);
        System.out.println(ages);//[9, 656, 12, 777, 10, 888, 8, 9, 10]
        System.out.println(ages);//[9, 656, 8, 9, 10, 12, 777, 10, 888, 8, 9, 10]

        //toArray() metodu: eleman sayisini degitirmeyecegimizden eminsek array' ye cevirip memory kullnimini azaltabiliriz
        //toClear() medodu: Bir List'teki tum elemanlari siler.
       /* ages.clear();
        System.out.println(ages);//[] */

        //cantains() methodu bir elemanin Listte var olup olmadigini nasil kontrol ederiz?
       boolean r = ages.contains(656);
        System.out.println(r);//true

        //bir Listtin baska bir List ileayni olup olmadigini nasil kontrol ederiz?
        // iki List'im esit olabilmesi icin ayni index'de ayni elemanlar olmalidir.
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Tom"); names1.add("Jim");names1.add("Kim");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Tom"); names2.add("Kim");names2.add("Jim");

        boolean s = names1.equals(names2);
        System.out.println(s);//false ( cunku elemanlar ayni olmali ama indexlerine kadar ayni olmalilar.

        //Example 1: Verilen iki Integer List'te tamamiyla ayni elemanlarin olup olmadigini
        //           kontrol eden kodu yaziniz.
        ArrayList<Integer>nums1 = new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer>nums2 = new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);
        Collections.sort(nums1); // once arrayListi siraladik ! sonra esit olup olmadigini kontrol ettik.
        Collections.sort(nums2);
        boolean t = nums1.equals(nums2);
        System.out.println(t);//true





    }
}

