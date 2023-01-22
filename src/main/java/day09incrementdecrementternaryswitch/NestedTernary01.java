package day09incrementdecrementternaryswitch;

public class NestedTernary01 {
    public static void main(String[] args) {
        //find the output for y=8 and y=12 and y=4 and y=5
        //(y>5) ? (y<10?2*y:3*y) : (y>10 ? 2+y : 3+y); bunu çöz !

        /*
        Example 1(ınterview question) : verilen yılı "artık yıl"(leap year) olup olmadıgını kontrol eden kod yazınız.
                  1)yıl 100e bölünürse 400e de bölünmelidir. 1600==> Leap 1800==> Leap degil
                  2)yıl 100e bölünüyorsa 4'e bolunmelidir. 2004==> leap 2005==>leap degil
         */
        int year =2005;
        String result = year%100==0 ? (year%400==0 ? "leap" : "not leap") :(year%4==0 ? "leap" : "not leap");
        System.out.println(result);



    }
}
