package advanced_practice.practice09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01_Arrays_TekrrlilariSil {
    //Bir array içerisindeki elementleri tekrarsız yazdıran bir kod yazınız.
    public static void main(String[] args) {

        int[] arr= {10, 20, 20, 30, 30, 40, 50, 50, 60, 20};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);

        int idx=0;
        for(int i=0; i<arr.length-1; i++){

            if(arr[i]!=arr[i+1]){
                arr[idx]=arr[i];
                idx++;
            }

        }
        arr[idx]=arr[arr.length-1];
        idx++;

        System.out.println(Arrays.toString(arr));

        int[] arrTekrarsiz=new int[idx];

        for(int i=0; i<idx; i++){
            arrTekrarsiz[i]=arr[i];
        }

        System.out.println(Arrays.toString(arrTekrarsiz));


        System.out.println("**************");
        int[] array = {10, 20, 20, 30, 30, 40, 50, 50, 60, 20};
        List<Integer> uniqueElements = new ArrayList<>();

        for (int element : array) {
            if (!uniqueElements.contains(element)) {
                uniqueElements.add(element);
            }
        }

        int[] uniqueArray = uniqueElements.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(uniqueArray));






    }
}
