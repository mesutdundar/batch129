package day29exceptions;

public class Exceptions02 {
    /*
        "throw" ile "throws" keyword'leri arasindaki fark nedir?
        1)"throw" method body'si icinde, "throws" ise method paranetzinden hemen sonra kullanilir.
        2)"throw" method body'si icinde istenilen yerde istenildigi kadar kullanilir,
          "throws" ise method paranetzinden hemen sonra sadece bir kere kullanilabilir.
        3)"throw" dan sonra "new" keyword ve "constructor" kullanilarak object olusturulur.
          "throws" dan sonra sadece Exception Class ismi yazilir
        4)"throw" belli sartlar icin Exception atmada kullanilir, "throws" ise application'i Exception attiktan sonra durdurur.
     */
    public static void main(String[] args) throws IllegalArgumentException,ArithmeticException{
        try {
            printAge(-335);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
  //      try {
//            getMark(-90);
//        }catch(IllegalArgumentException e){
//            System.out.println(e.getMessage());
//        }
        getMark(-90);

    }
    //"throw" keyword bir method'un body'si icinde istedigimiz yerde, istedigimiz kosullar icin, istedigimiz kadar  Exception atmamizi saglar.
    //"throw" keyword yazildiktan sonra bir Exception Class object'i olusturulur.(new'le basladigimiz icin)
    //Exception Class constructor'inin parantezi icine istediginiz Exception Mesaj'ini yazabilirsiniz
    public static void printAge(int age){
        if (age<0 || age>300){
            throw new IllegalArgumentException("Age cannot be negative or cannot be greater than 300");
        }else System.out.println("age = " + age);
    }

    //Ogrenci notlari girisi yapan ve notu console'a yazdiran bir method olusturunuz
    public static void getMark(double d){
        if(d<0){
            throw new IllegalArgumentException("Marks cannot be less than zero");
        }else if(d>100){
            throw new IllegalArgumentException("Marks cannot be greater than hundred");
        }else {
            System.out.println(d);
        }
    }
}
