package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists01 {
    public static void main(String[] args) {
        //Example 1: Verilen bir List'teki elemanlari tekrarsiz olarak yazdiriniz
        //           [2,3,2,2,3,5] ==> [2,3,5]
        List<Integer> myList= new ArrayList<>();
        myList.add(2);
        myList.add(3);
        myList.add(2);
        myList.add(2);
        myList.add(3);
        myList.add(5);
        System.out.println(myList);//[2, 3, 2, 2, 3, 5]
        List<Integer> newList= new ArrayList<>();
        for (Integer w:myList) {
            if (!newList.contains(w)){
                newList.add(w);
            }
        }
        System.out.println(newList);//[2, 3, 5]

        //Example 2: Musteriden urun ismini aliniz sonra musterinin ismini verdigi urun listede varsa urunun ismini yaziriniz
        //           Musterinin ismini verdigi urun listede yok' out of stock' yazdiriniz
        Scanner input = new Scanner(System.in);
        System.out.println("urun arama sistemimize hosgeldiniz");
        List<String> products= new ArrayList<>();
        products.add("TV");
        products.add("Radio");
        products.add("Ipad");
        products.add("PC");
        products.add("Notebook");
        products.add("Headphone");
        products.add("Mobile Phone");
        /*
        "for loop" kurunuz ,  prroducts listindeki her bir emanin tum characterilerini "set method" kullanarak kucuk harfe ceviriniz
        Kullanicidan gelen urun ismini de kucuk harfe cevirin
         */

        do {
            System.out.println("Aradiginiz urunun ismini giriniz");
            System.out.println("Urun aramayi sonlandirmak icin Q'ya basiniz!");
            String p = input.nextLine();
            if (p.equalsIgnoreCase("Q")){
                break;
            }
            if (products.contains(p)){
                System.out.println(p+ " is in stock");
            } else if (!products.contains(p)) {
                System.out.println("out of stock!");
            }

        }while (true);
        System.out.println("sitemizi kullandiginiz icin tesekkur eder, yine bekleriz");


    }
}
