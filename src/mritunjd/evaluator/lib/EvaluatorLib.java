package mritunjd.evaluator.lib;

public class EvaluatorLib {
    private String expression;

    public EvaluatorLib(String expression) {
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }

    public int evaluate() {
        String[] expressionParts = getExpression().split(" ");
        String operator = expressionParts[1];
        int operand1 = Integer.parseInt(expressionParts[0]);
        int operand2 = Integer.parseInt(expressionParts[2]);
        Operations operationsMap = new Operations();
        return operationsMap.performOperation(operator, operand1, operand2);
    }
}
