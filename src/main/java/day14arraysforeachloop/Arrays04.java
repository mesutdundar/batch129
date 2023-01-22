package day14arraysforeachloop;

public class Arrays04 {
    public static void main(String[] args) {
        //Examle1 : String bir array olusturunuz , 6 eleman ekleyiniz , yellow'dan onceki elemanlari yazdiriniz.
        String[] colors = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";
        for (String w : colors) {
            if (w.equals("Yellow")) {
                break;
            }
            System.out.println(w);
        }
        System.out.println();


        //Example 2:String bir array olusturunuz,6 eleman ekleyiniz, Yellow'dan sonraki elemanlari yazdiriniz
        String[] color = new String[6];
        color[0] = "Red";
        color[1] = "Orange";
        color[2] = "Blue";
        color[3] = "Yellow";
        color[4] = "Green";
        color[5] = "Brown";

        // Bazen kitleniriz ve  for- each-loop kullanamayiz.Bu soruda tersten baslamaliyiz
        // halbu ki  for- each-loop her zaman bastan baslar.O yüzden burda for-loop
        // kullanmak zorundayiz.

         //1.YOL (kolay olan)
        for (int i = color.length - 1; i >= 0; i--) {
            if (color[i].equals("Yellow")) {
                break;
            }
            System.out.println(color[i]);
        }
        System.out.println();
        //2.YOL
        // yellow elemaninin indexini bul ve indexten buyuk olanlari yazdir!
        int counter = 0;
                // red, orange, blue , yellow, green , brown
        for (String w:color){
            if (w.equals("Yellow")){
                break;
            }
            counter++;
        }
        for (int i = counter+1; i<color.length;i++){
            System.out.println(color[i]);
        }



    }
}
