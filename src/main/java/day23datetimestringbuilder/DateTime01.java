package day23datetimestringbuilder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {

        //Example 1:Time'i formatlayiniz
        LocalTime myTime =LocalTime.now();
        System.out.println("myTime = " + myTime);//myTime = 19:56:23.657568300


        //hh==>12 lik saat sistemini kullanir   -  HH==>24 luk saat sistemini kullanir
        //hh kullandiginizda AM veya PM demelisiniz, bunu demek icin "a" yazmaniz yeterlidir. Yani; "hh:mm a"
        DateTimeFormatter dtp =DateTimeFormatter.ofPattern("hh-mm-ss a");
        System.out.println(dtp.format(myTime));//07-59-42

    }
}
