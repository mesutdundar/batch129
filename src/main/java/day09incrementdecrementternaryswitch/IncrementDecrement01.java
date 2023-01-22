package day09incrementdecrementternaryswitch;

public class IncrementDecrement01 {
    public static void main(String[] args) {
        int a = 5;
        a=a+5;
        a+=5;
        a++;
        System.out.println(a);
        a=a-2;
        a-=2;
        a--;
        System.out.println(a);

        //"post-increment" ve "pre-increment"
        int i = 10;
        int k= i++; //post-increment cunku increment, variable'in isminden sonra yazıldı(i==variable , ++ ==increment)
        System.out.println(k);//10 ==> "i" arttirilmadan "k"ya konuldugu icin "k" nin degeri 10 olur
        System.out.println(i);//11 ==> "i" satir sonunda artırıldıgı ıcın "i"nin degeri 11 olur
        int m=15;
        int n=++m;//pre-increment cunku increment, variable'in isminden önce yazıldı!
        System.out.println(m);//16 ==> "m" satır sonunda arttırıldıgı ıcın "m" nın degeri 16 olur.
        System.out.println(n);//16 ==> "m" arttirildiktan sonra "n" ye konuldugu icin "n"nin degri 16 olur.

        int p = 17;
        int r = p--;
        System.out.println(p);//16
        System.out.println(r);//17

        int s = 20;
        int t = --s;
        System.out.println(s);//19
        System.out.println(t);//19

    }
}
