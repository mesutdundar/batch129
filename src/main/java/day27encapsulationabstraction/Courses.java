package day27encapsulationabstraction;

public abstract class Courses {
    /*
     1) Bazen method body'sini yazmak gerekmez, bu durumlarda body'siz method olusturmak gerekir.
    Body'si olmayan method'lara "abstract method"lar denir.

    2)"abstract method"'lar child class'lar tarafindan "override" edilmek zorundadırlar.
    Bu yuzden eger bir fonksiyonun child class'lar tarafindan kullanilmasini mecbur kilmak isterseni
     o method'u  abstract yapmak gerekir.

     3) Bir method'un body'sini silmek o method'un abstract olmasi icin yeterli degildir.
     "access modifier" ile "return type" arasina "abstract" keyword koymak gerekir.

     4)"abstract method" lar siradan class'larin(concrete) icine yazilamazlar."abstract method"larin icine yazildiklari
     class'lar da abstract olmak zorundadirlar.

     5)"abstract class' larda hem "abstract method'lar hem de "concrete method"lar kullailabilir.

     6)'concrete class'lar 'abstract class'larin childi olabilirler.


    */
    public  abstract void math();

    public void art(){
        System.out.println("Painting...");
    }



    //final methodlar "override edilemezler ,halbuki "abstract methodlar" override edilmek icin olusturulurlar.
    //bu celiskilidir, bu yuzden Java abstract method'larin final olmasina musaade etmez!
    //  public final abstract void science();

    //Concrete class'lar final oldugunda child class'a sahip olamazlar.
    //ama abstract class'lar icin child class olmalidir, cunku child classlar abstract parent class'daki abstract method'lari kullanirlar.
    //bu yuzden ; java "abstract classlarin' final olmasina musaade etmez.

    //"abstract method'lar "private" olamazlar, cunku child classlar abstract methodlari kullanirlar,private yapinca kullanima kapali olur.
    //bu celiskidir, bu yuzden Java abstract metholarin "private" olmasina musaade etmez.

    //"abstract method"lar "static" olamazlar, cunku static method'lar override edilemezler, halbuki abstract methodlar override edilmek icin olusturulmustur.

}
