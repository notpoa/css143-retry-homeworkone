/**
 * Vincent Pham
 * Problem 3
 *
 * CSS 143
 * - Assigned: 1/03/2024
 * - Due: Saturday January 13 23:59:00 PST 2024
 *
 // this test takes a bit of time to finish, ain't it?
 // try a better design in your code so this test finishes faster
// TODO: how many seconds did your code improve between the first version and last version of your code?
 my first code ran at 667 ms and the new one ran at 194 ms but its like changing everytime when i run it
 so i think im looking at the wrong this but here are some of the other things that i could do to maximize the time it runs

 1. Time Complexity:
 *    - The current implementation iterates through the array twice. Once to count occurrences and once to calculate the sum.
 *    - A smarter way to calculate the sum without a second iteration can help the time
 *    - optimizing the algorithm to reduce unnecessary iterations for large arrays.
 *
 * 2. Maintainability:
 *    - Reduce the need for changes when adding new test cases. Adding a better design.
 *    - Consider using a helper method for repetitive tasks
 *
 */

public class Problem3 {

    public static int sumOfNonUnique(int[] arr) {
        int sum = 0;

        // Count occurrences of each element using an array
        int[] count = new int[101]; // Assuming the range of integers is [-50, 50]

        // Count occurrences
        for (int num : arr) {
            count[num + 50]++;
        }

        // Calculate the sum of non-unique elements
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) {
                sum += (i - 50) * count[i]; // Corrected the sum calculation
            }
        }

        return sum;
    }

    /**
     * worked on main method with Aleph
     * @param args
     */
    public static void main(String[] args) {
        // Test cases
        int[] test1 = {3};
        int[] test2 = {3, 2};
        int[] test3 = {2, 3, 2};
        int[] test4 = {2, 4, 2, 1, 4, -5, 4};
        int[] test5 = {1, 1, 1, 2, 2, 3, 3, 4, 4};

        // Display results
        System.out.println("Test 1: " + sumOfNonUnique(test1)); // Output: 0
        System.out.println("Test 2: " + sumOfNonUnique(test2)); // Output: 0
        System.out.println("Test 3: " + sumOfNonUnique(test3)); // Output: 4
        System.out.println("Test 4: " + sumOfNonUnique(test4)); // Output: 16
        System.out.println("Test 5: " + sumOfNonUnique(test5)); // Output: 20

    }
}


