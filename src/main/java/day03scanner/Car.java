package day03scanner;

public class Car {

    //variables olusturalım
    public String model  = "Corolla";
    public int fiyat = 20000;

    //methodlar olusturalım
    //Note: returm type void oldugunda method icinde "return" kelimesi kullanılmaz!.
    public void hareket (){
        System.out.println("Corolla hizli hareket eder...");
    }
    public void dur (){
        System.out.println("Corolla guvenli bir sekilde durur...");
    }
    public void hız (){
        System.out.println("corolla cok da hızlı degildir");
    }
}
