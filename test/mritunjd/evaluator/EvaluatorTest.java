package mritunjd.evaluator;

import mritunjd.evaluator.lib.EvaluatorLib;
import org.junit.Assert;
import org.junit.Test;

public class EvaluatorTest {
    @Test
    public void testGivesAdditionOfTwoNumbers() throws Exception {
        String input = "12 + 3";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        double expected = 15;

        double actual = evaluator.evaluateExpression();

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testGivesSubstractionOfTwoNumbers() throws Exception {
        String input = "12 - 3";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        double expected = 9;

        double actual = evaluator.evaluateExpression();

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testGivesMultiplicationOfTwoNumbers() throws Exception {
        String input = "12 * 3";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        double expected = 36;

        double actual = evaluator.evaluateExpression();

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testGivesDivisionOfTwoNumbers() throws Exception {
        String input = "12 / 3";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        double expected = 4;

        double actual = evaluator.evaluateExpression();

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testRaisesFirstNumberToPowerOfSecondNumber() throws Exception {
        String input = "12 ^ 2";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        double expected = 144;

        double actual = evaluator.evaluateExpression();

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testGivesAdditionOfMultipleOperands() {
        String input = "1 + 2 + 5 + 10";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        double expected = 18;

        double actual = evaluator.evaluateExpression();

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testGivesTheOperandAsResultWhenOnlyOneOperandIsGivenWithoutAOperator() {
        String input = "1";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        double expected = 1;

        double actual = evaluator.evaluateExpression();

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testGivesResultOfExpressionWhichHaveMultipleOperandAndDifferentOperators() {
        String input = "1 * 2 + 5 ^ 2";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        double expected = 49;

        double actual = evaluator.evaluateExpression();

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testEvaluateTheExpressionLeftToRightWithoutAnyPreference() {
        String input = "1 - 2 * 5 + 2  ";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        double expected = -3;

        double actual = evaluator.evaluateExpression();

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testEvaluatesTheExpressionWithBrackets() {
        String input = "1 + 2 * ( 12 / 4 ) - 4";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        double expected = 5;

        double actual = evaluator.startEvaluation();

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testWhenNoBracketsAreGivenInExpression() {
        String input = "1 + 2 * 12 - 4 - 4";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        double expected = 28;

        double actual = evaluator.startEvaluation();

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testEvaluatesAExpressionWhereEverythingIsInBrackets() {
        String input = "( 1 + 2 * 12 - 4 - 4 )";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        double expected = 28;

        double actual = evaluator.startEvaluation();

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testWithDifferentOperatorsInExpression() {
        String input = "1 + ( 2 * 12 - 4 ) ^ 2";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        double expected = 441;

        double actual = evaluator.startEvaluation();

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testSolvesTheExpressionHavingMultipleBrackets() {
        String input = "1 + ( 2 * 12 ) - ( 4 ^ 2 )";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        double expected = 9;

        double actual = evaluator.startEvaluation();

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testSolvesMultipleBracketsInOneExpression() {
        String input = "3 + ( 5 + 2 ) * ( 2 ^ 2 )";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        double expected = 40;

        double actual = evaluator.startEvaluation();

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testForDifferentOperatorsWithMultipleBrackets() {
        String input = "1 + ( 34 + 12 - 10 ) * ( 12 / 4 - 2) + 100";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        double expected = 137;

        double actual = evaluator.startEvaluation();

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testSolvesExpressionWhichHaveNestedBrackets() {
        String input = "( 1 + ( 3 + 4 ) )";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        double expected = 8;

        double actual = evaluator.startEvaluation();

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testSolvesNestedBracketExpressions() {
        String input = "( 2 * ( 4 / 2 + 5 ) - ( 2 ^ 2 ) + ( 12 + ( 12 / 3 ) ) )";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        double expected = 26;

        double actual = evaluator.startEvaluation();

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testForNestedBrackets() {
        String input = "1 + 5 * ( 3 + 9 - ( 12 - 10 ) + 9 )";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        double expected = 114;

        double actual = evaluator.startEvaluation();

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testEvaluatesExpressionHavingDecimalNumbers() {
        String input = "1.4 + 2.3";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        double expected = 3.7;

        double actual = evaluator.startEvaluation();

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testEvaluatesExpressionHavingDecimalNumbersWithBrackets() {
        String input = "1.5 + 5.5 * ( 3.5 + 9.5 - ( 12.5 - 10.5 ) + 9 )";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        double expected = 140;

        double actual = evaluator.startEvaluation();

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testEvaluatesExpressionHavingNegativeNumbers() {
        String input = "1.4 - -2.6";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        double expected = 4.0;

        double actual = evaluator.startEvaluation();

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testEvaluatesExpressionHavingNegativeNumbersWithBrackets() {
        String input = "1.5 - -5.5 * ( 3.5 - -9.5 - ( 12.5 + -10.5 ) - -9 )";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        double expected = 140;

        double actual = evaluator.startEvaluation();

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testInsertsSpacesInExpression() {
        String input = "1.5+2.4-4";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        String expected = "1.5 + 2.4 - 4";

        String actual = evaluator.getExpressionWithSpace();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInsertsSpacesInExpressionWhenCarretIsGiven() {
        String input = "1.5/2.4-4^4^4";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        String expected = "1.5 / 2.4 - 4 ^ 4 ^ 4";

        String actual = evaluator.getExpressionWithSpace();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInsertsSpacesInExpressionWhenBracketsAreGiven() {
        String input = "(1.5+(2.4-4)^4^4)";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        String expected = "( 1.5 + ( 2.4 - 4 ) ^ 4 ^ 4 )";

        String actual = evaluator.getExpressionWithSpace();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInsertsSpacesInExpressionWhenNumbersAreNegative() {
        String input = "(1.5+(2.4--4)^4^4+-2)";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        String expected = "( 1.5 + ( 2.4 - -4 ) ^ 4 ^ 4 + -2 )";

        String actual = evaluator.getExpressionWithSpace();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInsertsSpacesInExpressionIfSpeacesAreNotGiven() {
        String input = "( 1.5+ (2.4--4 )^4 ^4+ -2)";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        String expected = "( 1.5 + ( 2.4 - -4 ) ^ 4 ^ 4 + -2 )";

        String actual = evaluator.getExpressionWithSpace();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEvaluateAnExpressionWhichHaveNoSpace() {
        String input = "(2*(4/2+5)-(2^2)+(12+(12/3)))";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        double expected = 26;

        double actual = evaluator.startEvaluation();

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testEvaluatesExpressionHavingNegativeNumbersWithBracketsWithoutSpace() {
        String input = "1.5--5.5*(3.5--9.5-(12.5+-10.5)--9)";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        double expected = 140;

        double actual = evaluator.startEvaluation();

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testEvaluatesExpressionEitherItHasSpacesOrNot() {
        String input = "1.5--5.5 *(3.5--9.5-(12.5 +-10.5) --9)";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        double expected = 140;

        double actual = evaluator.startEvaluation();

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testEvaluatesExpressionStartWithNegativeNumber() {
        String input = "-15.5--5.5";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        double expected = -10;

        double actual = evaluator.startEvaluation();

        Assert.assertEquals(expected, actual, 1);
    }

}
