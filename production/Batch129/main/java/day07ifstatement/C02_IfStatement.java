package day07ifstatement;

import java.util.Scanner;

public class C02_IfStatement {
    //Kullanıcı gun numarasını girsin kod gün ismini yazsın
    //1==>pazar, 2== pazartesi , 5 ==>>persembe


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen hangi gün derse katılmak istediğinizi giriniz" +
                "(1 ile 7 arasında bir rakam giriniz)");
        byte day = input.nextByte();
        if(day==1){
            System.out.println("Pazar");
        }
        if(day==2){
            System.out.println("Pazartesi");
        }
        if(day==3){
            System.out.println("Salı");
        }
        if(day==4){
            System.out.println("Çarşamba");
        }
        if(day==5){
            System.out.println("Perşembe");
        }
        if(day==6){
            System.out.println("Cuma");
        }
        if(day==7){
            System.out.println("Cumartesi");
        }




    }



}
