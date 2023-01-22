package day11forloop;

public class ForLoop03 {
    public static void main(String[] args) {
        //interview question
        //Example1:size verilen bir Stringi tersten yazdiriniz.
        //util class'i en sik kullandiginiz kodari yazdigimiz package'dir.
        // "Germany" ==> ynamreG
        String s ="Germany";
        String t="";

        for (int i=s.length()-1;i>=0;i--){
            t=t+s.charAt(i);
        }
        System.out.println(t);

        //interview question
        //size verilen bir String'in "Palindrome" olup olmadigini kontrol eden kodu yaziniz.
        //   civic , nalan , ey edip adanada pide ye , 11211 ==> Palindorme " sagdan soldan ikiside ayni demek "

        //Logic : Stringi ters cevir sonra da duz hali ile ters halini karsilastir , ayni ise "palindrome" de.
        String duz  = "nalan";
        String ters = "";
        for (int i = duz.length()-1;i>=0; i--){
            ters=ters+duz.charAt(i);
        }
       if (duz.equalsIgnoreCase(ters)){
           System.out.println(duz + ": palindromdur!");
       }else System.out.println(duz + ": palindrome degildir!");







    }
}
