import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
/**
 * Vincent Pham
 * problem 2
 *
 * CSS 143
 * - Assigned: 1/03/2024
 * - Due: Saturday January 13 23:59:00 PST 2024
 */

public class Problem2Test {

    @Test
    public void testBubbleSort() {
        int[][] inputs = {
                {3, 2, 1},
                {5, 1, 9, 3, 7},
                {8, 4, 2, 6, 10},
                {1, 2, 3, 4, 5},
                {5, 4, 3, 2, 1}
                // TODO: add more test case inputs
        };
        int[][] expects = {
                {1, 2, 3},
                {1, 3, 5, 7, 9},
                {2, 4, 6, 8, 10},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}
                // TODO: add more test case expected sorted results
        };

        // TODO: add a check to verify inputs and expects have the same amount of arrays
        if (inputs.length != expects.length) {
            throw new AssertionError("Test cases count mismatch");
        }

        for (int i = 0; i < inputs.length; i++) {
            Problem2.bubbleSort(inputs[i]);
            // TODO: add a call to your bubble sort function here

            for (int j = 0; j < inputs[i].length; j++) {

                // this checks whether the actual result matches the expects result
                // note the use of assertArrayEquals instead of assertEquals here
                // less code == less chance of mistake
                assertArrayEquals(expects[i], inputs[i]);
            }
        }
    }
}
