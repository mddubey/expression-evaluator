package mritunjd.evaluator;

import org.junit.Assert;
import org.junit.Test;

public class EvaluatorTest {
    @Test
    public void testGetExpression() throws Exception {
        String input = "12 + 3";
        EvaluatorLib evaluator = new EvaluatorLib(input);
        String expected = "12 + 3";

        String actual = evaluator.getExpression();

        Assert.assertEquals(expected,actual);
    }
}
