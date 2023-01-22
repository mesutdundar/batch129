package day19listsvarargs;

public class Varargs01 {
    /*
         Varargs'lar method olustururken "parametre" sayisinda bize esneklik saglar
         Method'un parantezleri icine yazilanlara "parametre" denir
         Method'u cagirirken kullanilan sayilara da "argument" denir.

         Note 1: Bir method'da 1den fazla Varargs Parametre kullanilamaz cunku ikincisi "unreachable code" olur!
         Note 2: "Varargs", Varargas disindaki parametrelerle kullanilabilir ama "Varargs" her zaman "son parametre" olmalidir
 */
    public static void main(String[] args) {
        addTwoNumbers(3,5);
        addThreeNumbers(4,7,2);
        add(4,5,6,7,8,9,1);
    }

    //istediginiz sayida sayiyi toplamak icin bir method olusturunuz
    public static void add (int...a ) { // ikinci bir parametre eklersek icine " (int a... , int b...)gibi unused veya unreacable code olur. yani yanlis!
        int sum = 0;
        for (int w : a) {
            sum += w;
        }
        System.out.println(sum);
    }

        //iki sayiyi olusturan method olusturunuz
        public static void addTwoNumbers(int a, int b){
            System.out.println(a+b);
        }
        public static void addThreeNumbers(int a,int b,int c){
            System.out.println(a+b+c);
        }

}
