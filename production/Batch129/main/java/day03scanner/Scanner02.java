package day03scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        //kullanicidan ilk ismi ve soy ismini alip ikisini ayni satirda ekrana yazdiriniz
        //1.adım scanner objecti olustur
        Scanner input = new Scanner(System.in);
        //2.adım kullanıcıya mesaj veriyoruz
        System.out.println("İlk isminizi giriniz...");
        //3.adım: next() methodu kullanarak kullanicinin verdigi datayi memorye yerlestiriyoruz
        String firstName = input.next();
        System.out.println("Soy isminizi giriniz...");
        String lastName = input.next();
        System.out.println(firstName+" "+lastName);
        //arada boşuk bırakmak için " " yaptık
        // Önemli uyarı : "next" methodunu tek kelimelik stringleri kullanmak için kullaniriz.


    }
}
