package mritunjd.evaluator.lib;

import org.junit.Assert;
import org.junit.Test;

public class OperationsTest {
    @Test
    public void testGivesAdditionOfTwoNumbersWhenOperatorIsPlus() throws Exception {
        Operations operations = new Operations();
        double expected = 3;

        double actual = operations.performOperation("+", 1, 2);

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testGivesSubstractionOfTwoNumbersWhenOperatorIsMinus() throws Exception {
        Operations operations = new Operations();
        double expected = -10;

        double actual = operations.performOperation("-", 10, 20);

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testGivesMultiplicationOfTwoNumbersWhenOperatorIsInto() throws Exception {
        Operations operations = new Operations();
        double expected = 10;

        double actual = operations.performOperation("*", 5, 2);

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testGivesDivisionOfTwoNumbersWhenOperatorIsDivide() throws Exception {
        Operations operations = new Operations();
        double expected = 4;

        double actual = operations.performOperation("/", 20, 5);

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testGivesPowerOfTwoNumbersWhenOperatorIsCarrat() throws Exception {
        Operations operations = new Operations();
        double expected = 16;

        double actual = operations.performOperation("^", 4, 2);

        Assert.assertEquals(expected, actual, 1);
    }
}
