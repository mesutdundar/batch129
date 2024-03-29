package day08nestedifternary;

import java.util.Scanner;

public class NestedIf02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Üçgenin kenarları için 3 tane uzunluk giriniz...");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        boolean ucgenMi = (a + b > c && c > Math.abs(a - b)) && (a + c > b && b > Math.abs(a - c)) && (b + c > a && a > Math.abs(b - c));

        if (a<=0 || b<=0 || c<=0){
            System.out.println("Negatif veya 0 kenar uzunlugu olamaz");
        }else if(ucgenMi){
            if (a==b && a==c && b==c){
                System.out.println("Eşkenar üçgen");
            }else if (a==b || b==c || a==c){
                System.out.println("İkizkenar üçgen");
            }else {
                System.out.println("Çeşitkenar üçgen");
            }
        }else {
            System.out.println("üçgen değil...");
        }
    }
}
