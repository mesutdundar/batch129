package day25inheritance;

public class Vehicle {
    /*

        1) Child Class'dan bir object olusturdugunuzda Constructor'lar en ustteki parent
           class'dan baslatilarak alt dogru calistirilir.
        2)Child Class'da ki constructor'dan Parent Class'da ki constructor'a gidebilmek icin "super()" kullanilir.
        3)Parent Class'da birden fazla constructor varsa istenilen constructor,super() ifadesinin icine yazilan
           parametreler yardimi ile secilebilir.
        4)Ayni class icindeki constructor'lari secmek icin "this()" kullanilir.
           Ayni Class'da birden fazla constructor varsa istenilen constructor,"this()" ifadesinin icine yazilan
           parametreler yardimi ile secilebilir.
        5)"super()" ifadesini yazmak istege baglidir, yazmasaniz da Java sanki "super()" varmis gibi davranir.
           Ama kodunuzu daha okunur kilmak icin yazmaniz tavsiye edilir.
        6)"super()" ve "this()" ifadeleri constructor icinde her zaman ilk satirda olmalidir.
        7)Bir constructor'in icinde "super()" ve "this()" ifadeleri sadece bir kere kullanilabilir. Bakiniz 6.kural..
        8)Inheritance'da variableri ve methodlari cagirmak icin "this" veya "super" kullanilir.(this.price),(super.price)
          "this" ayni class icindeki variableri ve methodlari cagirmak icin kullanilir.
          "super" parent class icindeki variableri ve methodlari cagirmak  icin kullanilir.
        9) Inheritance'da object kullanarak variable cagirirsaniz , obeject'in data type'ini temsil eden class'dan
           variabe'i aramaya baslayiniz. O class'da yoksa parent'lara bakiniz.
        10)Inheritance'da object kullanarak method cagirirsaniz , obeject'in constructor'ini  temsil eden class'dan
           method'u aramaya baslayiniz. O class'da yoksa parent'lara bakiniz.

           OOP Primcials:
           i) Inheritance +
           ii) Polymorphism -: Method Overloading + Method Overriding
           iii)Encapsulation -
           iv)Abstraction -


     */
    public int price =10000;

    public void engine(){
        System.out.println("Vehicle engine");
    }

    public Vehicle(){
        System.out.println("Vehicle 1");
    }public Vehicle(int price){
        System.out.println("Vehicle 2: "+price);
    }
}
