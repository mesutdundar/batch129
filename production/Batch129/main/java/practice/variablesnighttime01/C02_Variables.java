package practice.variablesnighttime01;

import java.util.Scanner;

public class C02_Variables {
    /*
 TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy,
 salona devam edeceği ay süresi
 bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.
  */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen isim ve Soyisminizi giriniz.");
        String nameSurname = input.nextLine();
        System.out.println("Lüffen Yaşınızı Giriniz");
        byte age = input.nextByte();
        System.out.println("lütfen Kilonuzu Giriniz");
        short weight = input.nextShort();
        System.out.println("Lütfen Boyunuzu Giriniz(Cm)");
        short height = input.nextShort();
        System.out.println("Salonumuza Kaç ay üye olmak istiyorsunuz");
        byte membership = input.nextByte();
        System.out.println("Toplam ücret=$"+ membership * 20);





    }
}
