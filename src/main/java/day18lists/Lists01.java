package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {
    public static void main(String[] args) {
        //Example 1: Integer bir List olusturunuz .
        //             List'e 5 tane eleman ekleyiniz
        //             Bu elemanlardan 12'yi siliniz.
        List<Integer> ages = new ArrayList<>();
        ages.add(10);
        ages.add(25);
        ages.add(12);
        ages.add(8);
        ages.add(12);
        //Siz Java'da tamsayi yazdiginizda , java o tamsayinin data tye'ini "primitive int" kabul eder!
        //Bu yuzden remove() methodunun icine yaazdigimiz tamsayi eleman olarak degil index olark kabul edilir.
        //Tam sayiyi eleman olarak gostermenin birkac yolu vardir
        //4 yolun 4u de ayni isi yapar ama en mantiklisi 1.yoldur!!!!!!!
        //1.yol
        //  ages.remove((Integer) 12);
        //  System.out.println(ages);
        //2.yol
        //  Integer nonPrimitive = 12;
        //   ages.remove(nonPrimitive);
        // System.out.println(ages);
        //3.yol
        //    ages.remove(Integer.valueOf(12));
        //   System.out.println(ages);
        //4.yol
        //   ages.remove(ages.indexOf(12));
        //   System.out.println(ages);

        //Example 2 :  Integer bir List olusturunuz .
        //             List'e 5 tane eleman ekleyiniz
        //             Bu elemanlardan tum  12 leri siliniz.
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(25);
        nums.add(12);
        nums.add(8);
        nums.add(12);
        //removeAll() kullanmak icin yeni bir array olusuturup silmeyi dusunduklerimizi onun icine koymamiz gerekiyor
        List<Integer> silinecekler =new ArrayList<>();
        silinecekler.add(12);
        nums.removeAll(silinecekler);
        System.out.println(nums);


    }
}
