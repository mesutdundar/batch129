package day03scanner;

public class Runner {
    public static void main(String[] args) {

        /*
        Object nasil olusturulur?
        Class ismi   Object ismi     assignment operator    "new" keyword     Constructor
        */
        Car            myCar              =                     new               Car();
        myCar.hareket();
        myCar.dur();
        System.out.println(myCar.fiyat);
        System.out.println(myCar.model);
        // yeni bir object olusturalim;
        Student tomHanks = new Student();
        System.out.println(tomHanks.adress);
        System.out.println(tomHanks.grade);
        System.out.println(tomHanks.name);
        tomHanks.feed();
        tomHanks.study();

    }
}
