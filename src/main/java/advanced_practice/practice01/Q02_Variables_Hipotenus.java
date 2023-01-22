package advanced_practice.practice01;

import java.util.Scanner;

public class Q02_Variables_Hipotenus {
    //Hipotenus hesaplayan bir kod yaziniz
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. dik kenar uzunlugunu giriniz");
        double a = input.nextDouble();
        System.out.println("2. dik kenar uzunlugunu giriniz");
        double b = input.nextDouble();

        double c = Math.sqrt(a*a+b*b);
        System.out.println("Hipotenus: "+c);
        System.out.println("c = " + c);
        System.out.printf("%.3f",c);
    }
}
