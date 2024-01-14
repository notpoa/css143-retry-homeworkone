/**
 * Vincent Pham
 * problem 3
 *
 * CSS 143
 * - Assigned: 1/03/2024
 * - Due: Saturday January 13 23:59:00 PST 2024
 */

public class Problem3 {

    public static int sumOfNonUnique(int[] arr) {
        int sum = 0;

        // find the range of integers in the array
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            //finds the max and min values with in the array
            min = Math.min(min, num);
            max = Math.max(max, num);
        }


        // creates an array to count the occurrences of each element
        int[] count = new int[max - min + 1];


        // updates the count array based on the occurrences of each element in the input array
        for (int num : arr) {
            count[num - min]++;
        }


        // calculates the sum of non-unique elements
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) {
                sum += (i + min) * count[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        // test cases
        int[] test1 = {3};
        int[] test2 = {3, 2};
        int[] test3 = {2, 3, 2};
        int[] test4 = {2, 4, 2, 1, 4, -5, 4};
        int[] test5 = {1, 1, 1, 2, 2, 3, 3, 4, 4};

        System.out.println("Test 1: " + sumOfNonUnique(test1)); // Output: 0
        System.out.println("Test 2: " + sumOfNonUnique(test2)); // Output: 0
        System.out.println("Test 3: " + sumOfNonUnique(test3)); // Output: 4
        System.out.println("Test 4: " + sumOfNonUnique(test4)); // Output: 16
        System.out.println("Test 5: " + sumOfNonUnique(test5)); // Output: 20
    }

}
