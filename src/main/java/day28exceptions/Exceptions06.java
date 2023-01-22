package day28exceptions;

public class Exceptions06 {
    public static void main(String[] args) {
        String s="Java";
        getNumberOfChars(s);//4
        String t="";
        getNumberOfChars(t);//0
        String u =null;//hiclikte kac karakter var diye sorulmaz ki o yuzden :NullPointerException verir.
        getNumberOfChars(u);//hata veriyor (handling'den once )

    }
    //String'in degeri "null" oldugunda String Class'daki bazi methodlari kullanamayiz. Kullanirsaniz Java "NullPointerException" atar
    public static void getNumberOfChars(String s){
        try {
            int numOfChars = s.length();
            System.out.println(numOfChars);
        }catch(NullPointerException e){
            System.out.println("null degeri icin bazi method'lar kullanilamaz");
        }
    }
}
