package ds.hashtable;
/*
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

        Note:

        Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

        Example 1:

        Input: [2,2,1]
        Output: 1
        Example 2:

        Input: [4,1,2,1,2]
        Output: 4*/

import java.util.HashSet;

public class SingleNumber {

    static int singleNumber(int[] nums) {
        int result=0;
        for(int num : nums) {
            result=result^num;
            System.out.println("result "+result + " num "+num+" result^num "+(result^num));
            //System.out.println(" num "+num+" result "+result);
        }
        return result;
    }

    static int findNumber(int[] nums){
        HashSet<Integer> hashSet=new HashSet<>();
        for (int num : nums) {
            if(!hashSet.add(num)){
                hashSet.remove(num);
            }
        }
        return hashSet.iterator().next();
    }
    public static void main(String[] args) {
        int i[] = {1, 1, 3,2,3};
        //System.out.println(singleNumber(i));
        System.out.println(findNumber(i));
    }
}
