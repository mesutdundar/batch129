package day04asciiwrapperclassoperatorsmemoryused;

public class AsciiValues {
    //Java'da her karekterin sayisal bir degeri vardir.
    //Bu degerler ASCII Values olarak adlandirilir.
    //bu degerlerin tamimin bulundugu tabloya ASCII table denir.

    public static void main(String[] args) {
        //herhangi bir characterin ASCII degerini bulmak icin o karakteri "int" data type'inda bir variable'in icine koyunuz.
        int ch = 'A';
        System.out.println(ch);

        int unlem = '!';
        System.out.println(unlem);

        char c1 ='K';
        char c2 = '?';
        //java'da char'lari matematiksel işlemlerde kullanirsaniz, java o charlarin ASCII degerlerini kullanir.
        System.out.println(c1+c2);//138



    }
}
