package practice.practiceDTNT.practice01;

import java.util.Scanner;

public class C03_Ternary {
    /*
    Kullanıcıdan sıfırdan buyuk pozıtıf bır tam sayı girmesini isteyin
    girilen pozitif tamsayı 3 basamaklı ıse ekrana "3 basamaklı" yazdırın
    3 basamaklı degilse cıft olup olmadıgını kontrol edin
    cıft ıse "3 basamklı olmayan cıft sayı" yazdırın
    cift degilse "3 basamaklı olmayan tek sayı" yazdırın
     */
    public static void main(String[] args) {
        System.out.println("****IF ILE COZUMU****");
        //IF ILE COZUMU
        //uzun yol
       /* Scanner input = new Scanner(System.in);
        System.out.println("lütfen sıfırdan büyük bir tam sayı giriniz");
        int sayı = input.nextInt();


        if (sayı>0){
            if (sayı>99 && sayı<1000){
                System.out.println("Sayı 3 basamaklıdır");
            } else if (!(sayı>99 && sayı<1000) && sayı%2==0) {
                System.out.println("3 basamaklı olmayan cift sayı");
            }else if (!(sayı>99 && sayı<1000) && sayı%2==1){
                System.out.println("3 basamaklı olmayan tek sayı");
            }
        }else{
            System.out.println("Lütfen pozitif bir tamsayı giriniz");//negatif sayılar için burası çalışır
        }

        */
        // kısa yol
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen sıfırdan büyük bir tam sayı giriniz");
        int sayı = input.nextInt();
        boolean sıfırdanBuyukUcBas = sayı>99 && sayı<1000;
        boolean ucBasOlmayanCıftSayı = !(sayı>99 && sayı<1000) && sayı%2==0;
        boolean ucBasOlmayanTekSayı = !(sayı>99 && sayı<1000) && sayı%2==1;

        if (sayı>0){
            if (sıfırdanBuyukUcBas){
                System.out.println("Sayı 3 basamaklıdır");
            } else if (ucBasOlmayanCıftSayı) {
                System.out.println("3 basamaklı olmayan cift sayı");
            }else if (ucBasOlmayanTekSayı){
                System.out.println("3 basamaklı olmayan tek sayı");
            }
        }else{
            System.out.println("Lütfen pozitif bir tamsayı giriniz");//negatif sayılar için burası çalışır
        }

        System.out.println("****Ternary****");
        // sart  ?  true action   :   false action
        boolean pozitifseTernary=sayı>0;
        boolean sifirdanBuyukUcBasTernary = sayı > 99 && sayı < 1000;
        boolean sifirdanBuyukUcBasDegilCiftTernary = !(sayı > 99 && sayı < 1000) && sayı % 2 == 0;
 /*   ActionDataType variable=(şart)        ? trueAction                                        : falseAction;
        Data   variable=    sartim          ?  Dogruysa                                       :  Yanlissa;
        Type
*/
        String  sonuc  = (pozitifseTernary) ?(sifirdanBuyukUcBasTernary) ? ("3 basamaklı sayi") ://0'dan buyuk 3 basamakli ise incelendi
                (sifirdanBuyukUcBasDegilCiftTernary ? "3 basamaklı olmayan çift sayı" : "3 basamaklı olmayan tek sayı ") :     //0'dan buyuk 3 basamakli degilse incelendi
                ("Lutfen Sifirdan buyuk pozitif bir tamsayi giriniz");//0'dan kucuk olma durumu incelendi

        System.out.println(sonuc);

    }

}
