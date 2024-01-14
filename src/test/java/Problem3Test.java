/*
 * DO NOT MAKE ANY CHANGES UNLESS SPECIFIED OTHERWISE
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
/**
 * Vincent Pham
 * problem 1
 *
 * CSS 143
 * - Assigned: 1/03/2024
 * - Due: Saturday January 13 23:59:00 PST 2024
 */

public class Problem3Test {

    // Okay to change the content of this function
    // DO NOT REMOVE OR CHANGE the signature
    @Test
    /**
     * worked with aleph on the testSumOfNonUnique method
     */
    public void testSumOfNonUnique() {
        // Test case 1: single element array
        int[] test1 = {3};
        assertEquals(0, Problem3.sumOfNonUnique(test1));

        // Test case 2: array with unique elements
        int[] test2 = {3, 2};
        assertEquals(0, Problem3.sumOfNonUnique(test2));

        // Test case 3: array with non-unique elements
        int[] test3 = {2, 3, 2};
        assertEquals(4, Problem3.sumOfNonUnique(test3));

        // Test case 4: array with negative elements
        int[] test4 = {2, 4, 2, 1, 4, -5, 4};
        assertEquals(16, Problem3.sumOfNonUnique(test4));

        // Test case 5: array with all non-unique elements
        int[] test5 = {1, 1, 1, 2, 2, 3, 3, 4, 4};
        assertEquals(20, Problem3.sumOfNonUnique(test5));
    }

    @Test
    public void largeArrayTest() {
        final int aLargeNumber = 100000;
        int[] input = new int[aLargeNumber];

        for (int i = 0; i < input.length; i++) {
            input[i] = i - aLargeNumber / 2;    // does this array have any non-unique number in it?
        }

        final int expect = 0;   // why 0?

        long startTime = System.nanoTime();

        long actual = Problem3.sumOfNonUnique(input);

        long endTime = System.nanoTime();
        long durationInNano = endTime - startTime;

        assertEquals(expect, actual);

        System.out.printf("time: %f seconds", (double) durationInNano / 1e9);

        // this test takes a bit of time to finish, ain't it?
        // try a better design in your code so this test finishes faster
        // TODO: how many seconds did your code improve between the first version and last version of your code?
    }
}