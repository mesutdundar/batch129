package day03scanner;


import java.util.Scanner;

public class Scanner01 {
    //Kullanicidam data alip kodlarimizda kullanacagiz
    // Object ismini "input" yaptım cunku bu object kullanicidan alinan datayi benim kodlarimin icine koyacak!
    // System.in sistemin içine sok demek. sistem dısı datayı sistem icine sok emri vermek icin yazdik.
    public static void main(String[] args) {
        //1.adım : Scanner class'dan object olusturdum
        Scanner input = new Scanner(System.in);
        //2.adım: Kullaniciya ne istedigimize dair mesaj veriyoruz
        System.out.println("Lütfen yasınızı giriniz...");
        //3.adım:Uygun methodu kullanarak kullanicinin verdigi datayi memorye yerlestiriyoruz(nextByte())
        byte age = input.nextByte();
        System.out.println(age);


    }




}
