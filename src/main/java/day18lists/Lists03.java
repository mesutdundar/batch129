package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists03 {
    public static void main(String[] args) {
        // Example: bbir Integer Listteki 7 haric tum elemanlarin degerini 3 arttiriniz
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(7);
        nums.add(12);
        nums.add(11);
        for (Integer w :nums) {
            if (w==7){
                continue;
            }
            nums.set(nums.indexOf(w), w+3);
        }
        System.out.println(nums);//[15, 26, 7, 15, 14]
        //2.yol
        for (int i =0 ; i<nums.size();i++){
            int element = nums.get(i);
            if (element!=7){
                nums.set(i, element+3);
            }
        }
        System.out.println(nums);//[18, 29, 7, 18, 17]
        /*
        nums.indexOf(w) ilk gorunumun indexini verir. List tekrarli elemana sahip ise
        nums.indexOf(w) kullanimi risk olusturabilir .Bu yuzden bu soruda en guvenli yol " for-loop"tur.
         */
    }
}
