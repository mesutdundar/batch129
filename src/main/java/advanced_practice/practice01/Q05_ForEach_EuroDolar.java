package advanced_practice.practice01;

import java.util.Arrays;

public class Q05_ForEach_EuroDolar {
      /*
   Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamlarını bulan bir kod yazınız.
   Örnek:
   String str ="$1 $12 €34 €56 $45 €78";
     dolarToplami: 58
     euroToplami: 168
    */
      public static void main(String[] args) {
          String str ="$1 $12 €34 €56 $45 €78";
          String arr[]=str.split(" ");
          System.out.println(Arrays.toString(arr));//[$1, $12, €34, €56, $45, €78]

          int dolarTotal =0;
          int euroTotal =0;
          for (String w : arr) {
              if (w.contains("$")){
                  dolarTotal+=Integer.parseInt(w.replaceAll("\\D","")); // parseInt ve valueOf ikisi  ayni isleve sahip. String degeri wrapper classla int gibi toplayabilir
              }else euroTotal+=Integer.parseInt(w.replaceAll("\\D",""));
          }
          System.out.println("euroTotal = " + euroTotal);//euroTotal = 168
          System.out.println("dolarTotal = " + dolarTotal);//dolarTotal = 58
      }
}
