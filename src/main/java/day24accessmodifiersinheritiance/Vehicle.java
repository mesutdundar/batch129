package day24accessmodifiersinheritiance;

public class Vehicle {
    /*
        1) Child Class'dan bir object olusturdugunuzda Constructor'lar en ustteki parent
           class'dan baslatilarak alt dogru calistirilir.
     */
    public Vehicle(){
        System.out.println("Vehicle 1");
    }
}
