package day07ifstatement;

public class C01_IfStatement {
    public static void main(String[] args) {

        //if it rains , I will cancel the picnic
        //Example 1 :) Verilen character buyuk harf ise ekrana "Buyuk Harf" yazdırırız.
        char ch = 's';
        if(ch>='A' && ch<='Z'){
            System.out.println("Büyük Harf");
        }
        //example 2 : verilen bir sayi cıft sayı ıse ekrana cıft sayı yazdıran kodu olusturunuz.
        int number =15 ;
        if (number%2==0){
            System.out.println("Sayı çift Sayıdır");
        }
        // Example3 ) verilen bşr sayi 300 den kücük veya 1200den büyük ise ekrana "harika sayi" yazdıran kodu giriniz
        int sayı = 144;
        if (sayı<300 || sayı>1200){
            System.out.println("Harika Sayı");
        }

    }
}
