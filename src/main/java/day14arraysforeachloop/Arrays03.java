package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //Example1 : String bir array olusturunuz ve 6 tane eleman yerlestiriniz. sonra da char sayisi 5ten cok olan elemanlari siliniz.
        String colors[]=new String[6];
        colors[0]="Red";
        colors[1]="Orange";
        colors[2]="Blue";
        colors[3]="Yellow";
        colors[4]="Green";
        colors[5]="Brown";
        System.out.println(Arrays.toString(colors));//[Red, Orange, Blue, Yellow, Green, Brown]
        // Logic : yeni bir array olusturup, char sayisi 5 ve 5ten kucuk olan
        //         elemanlari yeni array'e transfer edecegiz. boylelikle yeni array'de
        //         char sayisi 5'ten buyuk olan hicbir eleman olmayacak

        //soru : hocam, array olusturmak icin iki sey beirlenmelidir
        //       1)elemanlarin data type'i
        //       2) yeni array'de kac tane eleman olacak

        // verilen array'de eleman sayisi 5 ve 5'den kucuk olankac eleman vardir

        int counter =0;
        for (String w: colors){
           if (w.length()<=5){              // bunu yeni olusturdugumuz arrayin eleman sayisi icin yaptik !
               counter++;
           }
        }
            //yeni array olustur
            String newColors[]=new String[counter];
        //character sayiaai 5 ve 5ten kucuk olanlari yeni array'e transfer et
        int idx =0;
        for (String w : colors){
            if (w.length()<=5){
                newColors[idx]=w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newColors));//[Red, Blue, Green, Brown]

        //arrayler collectionlara gore ilkel yapidadir, collectionlarda biz istedigimiz elemani silebiliyoruz
       //fakat arraylerde elemanlari silmemiz icin yeni array olusturmamiz gerekiyor

    }
}
