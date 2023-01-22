package day27encapsulationabstraction;

public class Student {
    /*
    OOP Principals:
i)Inheritance +
ii)Polymorphism: Method Overloading + Method Overriding +
iii)Encapsulation +
iv)Abstraction+
     */



    //getter ve setter'larin ikisine birden "java beans" denir
    //Encapsulation faydalarindan biri de tek bir obje olusturup set methodu ile istedigimiz objeye cevirebiliriz

    private String stdId="AC123";
    private double gpa =3.99;
    private boolean poor=true;

    //Encapsulation yaplmis data'yi okuyabilir misin?
    //get methodlar(getter) encapsulation(saklanmis) edilmis datayi okumamiza yarar
    //get methodlar(getter) her zaman public olur.
    //get methodlarin return type`i variable data type ile ayni olur
    //get methodlarin(getter) isimleri get+variable name seklinde olur.
    //get methodlarin(getter) isimleri boolean oldugunda is + variable name seklinde olur.
    //get methodlar parametre kullanmazlar.

    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isPoor() {
        return poor;
    }

     //Encapsulation yapilmis data'larin deegri degistirilebilir mi ?
     //Encapsulation yapilmis datalarin degeri degistirilebilir mi?
     //set method'lar (setter) encapsule edilmis datalarin degerlerini update etmemize ( degistirmemize) yarar.
    //set method'lar (setter) her zaman "public" olur.
    //set method'larin (setter) return type'i her zaman void olur.
    //set method'larin (setter) isimleri "set + variable name" seklinde olur.
    //set method'lar (setter) variable ile ayni data type' inda parametre kullanir
    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setPoor(boolean poor) {
        this.poor = poor;
    }
}