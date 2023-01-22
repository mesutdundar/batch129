package day13whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {
        //Example 1 : kullanicinin verdigi sayi icin carpim tablosu alusturup concele'a yazdiriniz
        // 3==> 3x1=3 .....3x9=27..3x10=30
        Scanner input = new Scanner(System.in);
        System.out.println("Carpim tablosunu gormek  icin bir sayi yaziniz...");
        double num = input.nextDouble();

        int i =1;
        while (i<11){
            System.out.println(num+"x"+i +"="+(num*i));
            i++;
        }

        //Example : Verilen bir String'de her harfin sonrasina  " * " sembolu ekleyiniz.
        //          Java==> J*a*v*a
        System.out.println("lutfen bir kelime giriniz...");
        String word =input.next();
        String newWord="";
        int k = 0;
        while (k<word.length()){
            newWord+=word.charAt(k) + "*"; // newWord = newWord + word.charAt(k) + "*"
            k++;
        }
        System.out.println(newWord);

    }
}
