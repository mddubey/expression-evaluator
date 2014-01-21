package mritunjd.evaluator.lib;

import org.junit.Assert;
import org.junit.Test;

public class OperationsTest {
    @Test
    public void testGivesAdditionOfTwoNumbersWhenOperatorIsPlus() throws Exception {
        Operations operations = new Operations();
        int expected = 3;

        int actual = operations.performOperation("+",1,2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGivesSubstractionOfTwoNumbersWhenOperatorIsMinus() throws Exception {
        Operations operations = new Operations();
        int expected = -10;

        int actual = operations.performOperation("-",10,20);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGivesMultiplicationOfTwoNumbersWhenOperatorIsInto() throws Exception {
        Operations operations = new Operations();
        int expected = 10;

        int actual = operations.performOperation("*",5,2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGivesDivisionOfTwoNumbersWhenOperatorIsDivide() throws Exception {
        Operations operations = new Operations();
        int expected = 4;

        int actual = operations.performOperation("/",20,5);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGivesPowerOfTwoNumbersWhenOperatorIsCarrat() throws Exception {
        Operations operations = new Operations();
        int expected = 16;

        int actual = operations.performOperation("^",4,2);

        Assert.assertEquals(expected, actual);
    }
}
