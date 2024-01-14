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
                // TODO: add more test case inputs
        };
        int[][] expects = {
                {1, 2, 3},
                // TODO: add more test case expected sorted results
        };

        // TODO: add a check to verify inputs and expects have the same amount of arrays

        for (int i = 0; i < inputs.length; i++) {
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
