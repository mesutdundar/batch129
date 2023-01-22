package advanced_practice.practice05;

import java.util.Scanner;

public class Q02_Switch_AyGunleri {
    public static void main(String[] args) {
        /*
       Girilen yıl ve ay numarasına göre ayın kaç gün olduğunu yazdıran bir kod yazınız.
       Girdi yıl: 2000 ay: 2
       Çıktı: 29
      */
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the num of month");
        int month=input.nextInt();
        System.out.println("enter the year");
        int year =input.nextInt();
        String days ="Number of Days =  ";

        switch (month){
            case 1: case 3: case 5 : case 7 : case 8 : case 10 : case 12:
                System.out.println(days+31);
                break;
            case 4: case 6: case 9 : case 11 :
                System.out.println(days+30);
                break;
            case 2 :
                if (year%4==0 && !(year%100==0) || year%400==0){
                    System.out.println(days+29);
                }else System.out.println(days+28);
                break;
            default:
                System.out.println("invalid month number!");
        }

    }
}
