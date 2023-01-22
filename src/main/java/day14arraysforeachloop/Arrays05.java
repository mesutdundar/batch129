package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {
        // Note 1: sort() methodu sayisal data type'lari kucukten buyuge siralar (ascending order)
        // Note 2: sort() methodu String data type'lari alphabetical olarak siralar (alphabtical order)
        // Note 3: ascending order + alphabetical order ==> Naturel order
        // Note 4: sort()methodu array elemanlarini " nature order " a gore siralar!


        //binarySeach() methodu bir elemanin bir arrayde olup olmadigini kontrol etmek icin kullanilir (Stringdeki contains() methoduna benzeer )
        // binarySearch() methodunu kullanmadan once "sort()" methodunu kullaniriz!
        String[] colors = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";
            Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));//[Blue, Brown, Green, Orange, Red, Yellow]
           int num = Arrays.binarySearch(colors,"Blue");
        System.out.println(num);//0
        int num1 = Arrays.binarySearch(colors,"Orange");
        System.out.println(num1);//3
        int num2 = Arrays.binarySearch(colors,"Grey");
        System.out.println(num2);//-4 (" - ") bu eleman yok demek. // "4" ise olsaydi 4.eleman olurdu demek





    }
}
