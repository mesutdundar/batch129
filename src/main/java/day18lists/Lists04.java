package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists04 {
    public static void main(String[] args) {
        //Example 1:
        List<String> names = new ArrayList<>();
        names.add("Ajda");
        names.add("Cuneyt");
        names.add("Mahsun");
        names.add("Muslum");
        names.add("Orhan");
        List<String> females = new ArrayList<>();
        females.add("Ajda");
        females.add("Emel");
       boolean r= names.containsAll(females); // names'in icinde females'in hepsi var mi ?
        System.out.println(r);//false
        //subList Stringteki substring() methoduyla ayni isi yapar!
        List<String> subList= names.subList(1,3);
        System.out.println(subList);//[Cuneyt, Mahsun]
        //retainAll methodu ayni elemanlari tutar , ayni olmayan elemanlari siler! ** iki list arasinda ortak elemanlari gormek isterseniz kullaniriz
        names.retainAll(females);
        System.out.println(names);//[Ajda]
        System.out.println(females);//[Ajda, Emel]

        //Example 1 : Elektronik aletler ve ev aletleri listleriniz var
        //            Elektronik ev aletlerini listeleyiniz
        List<String> electronics = new ArrayList<>();
        electronics.add("TV");
        electronics.add("Radio");
        electronics.add("Refrigerator");
        electronics.add("Mobile Phone");
        electronics.add("Notebook");

        List<String> homeGoods = new ArrayList<>();
        homeGoods.add("Carpet");
        homeGoods.add("Fork");
        homeGoods.add("Radio");
        homeGoods.add("Chair");
        homeGoods.add("TV");
        //homeGoods.retainAll(electronics) homeGoods ile electronics list'lerinin ortak elemanlarini homeGoods listi icide verir.
        // baskar bir deyisle homeGoods list'indeki ortak olmayan elemalari siler
        homeGoods.retainAll(electronics);
        System.out.println(homeGoods);//[Radio, TV]

        //isEmpty(); list'te hic eleman yoksa size 'true' verir, 1veya daha fazla eleman varsa size false verir
         boolean bosMu=names.isEmpty();
        System.out.println(bosMu);//false
        // names.isEmpty()==> bu method list'te hic eleman yoksa "true" verir
        // bir veya daha fazla eleman varsa size "false" verir
        //isEmpty()==> esasinda "names.size()==0" demektir
        // ikisi ayni isi yapiyor ama java da bir sey icin ozel method varsa onu kullan
        // cunku burda "names.size()==0" java yi iki kere yoruyor, hem esitligi olcuyor
        // hem size'i olcuyor
        System.out.println(names.hashCode());



    }
}
