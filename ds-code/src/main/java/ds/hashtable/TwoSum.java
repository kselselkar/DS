package ds.hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */

public class TwoSum {

    private static int[] findValues(int[] i,int target) {
        Map<Integer, Integer> abc = new HashMap<>();
        for (int a=0;a <i.length;a++) {
           // System.out.println("a "+a);
            //System.out.println("i "+i[a]);
            abc.put(i[a], a);
        }
        System.out.println(abc);
        for (int a=0;a <i.length;a++) {
            int compl=target-i[a];
            System.out.println(compl);
            if(abc.containsKey(compl) && abc.get(compl) != a ){
                return new int[]{a,abc.get(compl)};
            }
        }
        return null;
    }

    public static void main(String[] args) {

        int i[] = {1, 2, 3, 4, 9, 2, 1};
        int[] values = findValues(i, 11);
        if(values != null){
            System.out.println(values[0]+" "+values[1] +" sum " +(i[values[0]]+i[values[1]]));
        }
    }
}
