package day16multidimensionalarrays;

import java.util.Arrays;

public class Md04 {
    public static void main(String[] args) {
        //Example 1: birmultidimensionalarray olusturunuz ve bir dimensionalli array donusturunuz.
        //           [ [2, 5], [3] , [4,7,11] ] ==> [2, 5, 3, 4, 7, 11]
        int a[][] = {{2, 5}, {3}, {4, 7, 11}};

        //'a' arrayindeki toplam eleman sayisini bulunuz
        int sum = 0;
        for (int[] w : a) {
            sum += w.length;
        }


        //'b' isimli bir tek dimesnsionalli bir array olusturunuz
        int b[] = new int[sum];
        System.out.println(Arrays.toString(b)); //[0, 0, 0, 0, 0, 0]\

        // 'a' arrayindeki elemanlari 'b'arrayine transfer ediniz
        int idx = 0;
        for (int[] w : a) {
            for (int k : w) {
                b[idx] = k;
                idx++;
            }
        }System.out.println(Arrays.toString(b));//[2, 5, 3, 4, 7, 11]
    }
}
