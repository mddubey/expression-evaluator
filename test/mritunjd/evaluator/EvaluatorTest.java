package mritunjd.evaluator;

import mritunjd.evaluator.lib.EvaluatorLib;
import org.junit.Assert;
import org.junit.Test;

public class EvaluatorTest {
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
    public void testRaisesFirstNumberToPowerOfSecondNumber() throws Exception {
        String input = "12 ^ 2";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        int expected = 144;

        int actual = evaluator.evaluateExpression();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGivesAdditionOfMultipleOperands() {
        String input = "1 + 2 + 5 + 10";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        int expected = 18;

        int actual = evaluator.evaluateExpression();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGivesTheOperandAsResultWhenOnlyOneOperandIsGivenWithoutAOperator() {
        String input = "1";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        int expected = 1;

        int actual = evaluator.evaluateExpression();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGivesResultOfExpressionWhichHaveMultipleOperandAndDifferentOperators() {
        String input = "1 * 2 + 5 ^ 2";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        int expected = 49;

        int actual = evaluator.evaluateExpression();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEvaluateTheExpressionLeftToRightWithoutAnyPreference() {
        String input = "1 - 2 * 5 + 2";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        int expected = -3;

        int actual = evaluator.evaluateExpression();

        Assert.assertEquals(expected, actual);
    }

}
