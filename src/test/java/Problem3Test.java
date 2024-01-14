/*
 * DO NOT MAKE ANY CHANGES UNLESS SPECIFIED OTHERWISE
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Problem3Test {

    // Okay to change the content of this function
    // DO NOT REMOVE OR CHANGE the signature
    @Test
    public void testSumOfNonUnique() {
        assertTrue(false); // TODO: Place-holder. Replace with your tests.
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