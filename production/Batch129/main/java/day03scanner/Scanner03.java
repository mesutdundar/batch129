package day03scanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        //kullanıcıdan adresini aliniz ve ekrana yazdiriniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen adresinizi yaziniz...");
        // kullanicin girdigi 'tüm satiri, cok kelimeli, cumleleri' vermek için "nextLine() methodu kullanilir.
        String adress = input.nextLine();
        System.out.println(adress);
    }
}
