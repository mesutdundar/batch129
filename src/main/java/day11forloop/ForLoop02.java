package day11forloop;

public class ForLoop02 {
    public static void main(String[] args) {
        //Example1 : Verilen bir String'de 'a' character'i haric tum character'leri yazdırınız.
        //"Madagaskar"==> Mdgskr
        String s ="Madagaskar";
        //1.yol
        String t =s.replace("a","");
        System.out.println(t);
        //2.yol
        for (int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if (ch!='a'){
                System.out.print(ch);
            }
        }
        System.out.println();
        //3.yol
        for (int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if (ch=='a'){
                continue; // continue keyword'u bazı sartlar ıcın loop'un adımlarını atlamamızı saglar!
            }
            System.out.print(ch);
        }
    }
}
