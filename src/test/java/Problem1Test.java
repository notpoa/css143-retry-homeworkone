/*
 * DO NOT MAKE ANY CHANGES
 */

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class Problem1Test {

    @Test
    public void testBinarySearch() {
        int[][] inputs = {
                {},
                {3},
                {3},
                {1, 3},
                {1, 3},
                {4, 6, 8},
                {4, 6, 8},
                {4, 6, 8},
                {3, 5, 7, 9, 20},
                {3, 5, 7, 9, 20},
        };
        int[] targets = {9, 1, 3, 1, 3, 4, 6, 8, 3, 9};
        int[] answer = {-1, -1, 0, 0, 1, 0, 1, 2, 0, 3};

        assertEquals(inputs.length, targets.length);
        assertEquals(inputs.length, answer.length);

        for (int i = 0; i < inputs.length; i++) {

            // this is what the correct result SHOULD be
            int expected = answer[i];

            // this is the actual result produced by the function we write
            int actual = Problem1.binarySearch(inputs[i], targets[i]);

            // Assert ("verify") the actual result matches the expected correct result.
            // Test passes if they match. Test fails otherwise.
            // Food for thoughts: if the test fails, what does it mean to us to do?
            // Note that in assertEquals statement like this, the expected value should appear BEFORE the actual value
            assertEquals("case " + i, expected, actual);
        }
    }
}
