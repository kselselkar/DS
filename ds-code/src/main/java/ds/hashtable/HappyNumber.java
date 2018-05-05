package ds.hashtable;

import java.util.HashSet;
import java.util.Set;

/**
 * Write an algorithm to determine if a number is "happy".
 * <p>
 * A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
 * <p>
 * Example:
 * <p>
 * Input: 19
 * Output: true
 * Explanation:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 */

public class HappyNumber {


    private static Set<Integer> ss = new HashSet<>();

    static int numSquareSum(int n) {
        //to split a number take mod of 10 will give right side of number and divide by 10 will give left side of number.
        //for example 89 take mod gives 9 and divide by 10 gives 8
        int sumSquares = 0;
        while (n != 0) {
            sumSquares += ((n % 10) * (n % 10));
            n /= 10;
        }
        return sumSquares;
    }

    /**
     * A number is called happy if it leads to 1 after a sequence of steps where in each step number
     * is replaced by sum of squares of its digit that is if we start with Happy Number and keep replacing it with digits square sum, we reach 1.
     */

    static boolean isHappyNumber(int n) {

        while (true) {

            n = numSquareSum(n);
            if (n == 1) {
                return true;
            }
            if (!ss.add(n)) {
                return false;
            }
        }
    }

    //can be solved without extra space..means the set..this can also be solved using finding the loop in linked list
    //have slow and fast..at some point of time fast will equal slow and if both of them are 1 then its happy number else not happy number

    static boolean isHappyNumberSolution2(int n) {

        int slow;
        int fast;
        slow = fast = n;
        while (true) {
            slow = numSquareSum(slow);
            fast = numSquareSum(numSquareSum(fast));
            if (slow == fast) {
                return (slow == 1);
            }
        }
    }


    //1, 7, 10, 13, 19, 23
    public static void main(String[] args) {
        /*System.out.println(isHappyNumber(1));
        System.out.println(isHappyNumber(19));
        System.out.println(isHappyNumber(23));
        System.out.println(isHappyNumber(93));
*/
        System.out.println(isHappyNumberSolution2(1));
        System.out.println(isHappyNumberSolution2(19));
        System.out.println(isHappyNumberSolution2(23));
        System.out.println(isHappyNumberSolution2(93));

    }

}
