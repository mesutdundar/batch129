package advanced_practice.practice03;

import java.util.Scanner;

public class Q03_DoWhile_TahminOyunu {
    //0 ile 100 arasında rastgele numara tahmini yapan bir kod yazın.
    //İpucu: Girdiğiniz numara rastgeleNumara'dan küçükse ==> Daha büyük bir numara giriniz.
    //       Girdiğiniz numara rastgeleNumara'dan büyükse ==> Daha küçük bir numara giriniz.
    //       Girdiğiniz numara rastgeleNumara'ya eşitse ==> Tebrikler!!! ? tahminde sayiyi buldunuz. Puaniniz: ?
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomNum = (int)(Math.random()*101);
        int num ;
        int counter =0;
        System.out.println("0-100 arasi(dahil) bir tam sayi giriniz");
        do {
            counter++;
            num = input.nextInt();
            if (num<101 && num >-1) {
                if (num < randomNum) {
                    System.out.println(10 - counter + " hakkiniz kaldi");
                    System.out.println("Daha buyuk bir sayi giriniz");
                } else if (num > randomNum) {
                    System.out.println(10 - counter + " hakkiniz kaldi");
                    System.out.println("Daha kucuk bir sayi giriniz");
                } else {
                    System.out.println("tebrikler!" + counter + " tahminde buldunuz");
                    System.out.println("puaniniz: "+ ((10-counter))*10+ "'dir!");
                }
            }else System.out.println("Gecerli aralikta sayi giriniz");
            if (counter==0){
                System.out.println("Hakkiniz bitti");
                break;
                //odev yeniden oynama hakki
            }


        }while (num!=randomNum);


    }
}
