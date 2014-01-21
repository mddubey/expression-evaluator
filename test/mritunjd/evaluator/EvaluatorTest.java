package mritunjd.evaluator;

import mritunjd.evaluator.lib.EvaluatorLib;
import org.junit.Assert;
import org.junit.Test;

public class EvaluatorTest {
    @Test
    public void testGetExpression() throws Exception {
        String input = "12 + 3";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        String expected = "12 + 3";

        String actual = evaluator.getExpression();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGivesAdditionOfTwoNumbers() throws Exception {
        String input = "12 + 3";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        int expected = 15;

        int actual = evaluator.evaluateExpression();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGivesSubstractionOfTwoNumbers() throws Exception {
        String input = "12 - 3";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        int expected = 9;

        int actual = evaluator.evaluateExpression();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGivesMultiplicationOfTwoNumbers() throws Exception {
        String input = "12 * 3";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        int expected = 36;

        int actual = evaluator.evaluateExpression();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGivesDivisionOfTwoNumbers() throws Exception {
        String input = "12 / 3";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        int expected = 4;

        int actual = evaluator.evaluateExpression();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGivesPowerOfTwoNumbers() throws Exception {
        String input = "12 ^ 2";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        int expected = 144;

        int actual = evaluator.evaluateExpression();

        Assert.assertEquals(expected, actual);
    }

}
