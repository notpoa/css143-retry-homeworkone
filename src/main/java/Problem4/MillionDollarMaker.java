/*
 * DO NOT MAKE ANY CHANGES UNLESS SPECIFIED OTHERWISE
 */

package Problem4;

public class MillionDollarMaker {
    static final int MONTHS_PER_YEAR = 12;   // what does "static" and "final" do?

    // Do not change signature (function name, parameter variable type, and return type)
    // OK to change parameter variable names. In fact, are the parameter names bad and why?
    /**
     * the varible name float a b c and d are poor because you provide no clarity in what you're doing
     * not only will it confuse the peers that you are working with but it will also be hard for you to
     * keep track of what you're doing
     */
    public static CompoundingResult calculate(float initDeposit, float monthlyContribution, int lengthInYear, float interestRate) {
        CompoundingResult result = new CompoundingResult();

        if (interestRate < -100 || interestRate > 100) {
            // Handle invalid interest rate
            return result;
        }

        float monthlyInterestRate = interestRate / 100 / MONTHS_PER_YEAR;
        float totalMonths = lengthInYear * MONTHS_PER_YEAR;

        float accumulated = initDeposit;
        for (int month = 0; month < totalMonths; month++) {
            accumulated += monthlyContribution;
            accumulated *= (1 + monthlyInterestRate);
        }

        result.setInvested(initDeposit + monthlyContribution * totalMonths);
        result.setAccumulated(accumulated);

        return result;
    }

}