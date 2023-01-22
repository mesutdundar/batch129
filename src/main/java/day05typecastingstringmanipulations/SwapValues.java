package day05typecastingstringmanipulations;

public class SwapValues {

    //Swap: yer degistirmek. 1.kap:patates 2.kap: domates ==> Swap ==> 1.kap:domates 2.kap:patates

    public static void main(String[] args) {


        int a =12;
        int b =5; //Swap'ten sonra ==> a=5 ve b=12 (interview sorusu olabilir.2,yöntemi sorarlar.)
        System.out.println("a:"+a);//12
        System.out.println("b:"+b);//5

        //I.YOL ==> BOS TABAK KULLANMA YONTEMI (BOS TABAK : temp )
        int temp =0; //temp : temporary demek.bu gecici birdeger atamak ıcın kullanılan sık bır yol!

        //I.adım
        temp=a;
        //II.adım
        a=b;
        //III.adım
        b=temp;

        System.out.println("a:"+a);//5
        System.out.println("b:"+b);//12

        //II.YOL : a= a+b , b=a-b, a=a-b
        int x =12 ;
        int y =5;
        x= x+y;
        y=x-y;
        x=x-y;
        System.out.println(x);//5
        System.out.println(y);//12
    }
}
