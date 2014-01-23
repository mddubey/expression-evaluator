package mritunjd.evaluator.lib;

import java.util.ArrayList;
import java.util.List;

public class EvaluatorLib {
    private String expression;

    public EvaluatorLib(String expression) {
        this.expression = expression;
    }

    private int evaluateExpression(String expression) {
        String[] expressionParts = expression.trim().split(" ");
        List<String> operators = new ArrayList<String>();
        List<Integer> operands = new ArrayList<Integer>();
        filterOperandsAndOperator(expressionParts, operators, operands);
        return calculateAll(operators, operands);
    }

    private int calculateAll(List<String> operators, List<Integer> operands) {
        Operations operationsMap = new Operations();
        int operand1 = operands.get(0);
        for (int i = 0; i < operators.size(); i++) {
            String operator = operators.get(i);
            int operand2 = operands.get(i + 1);
            operand1 = operationsMap.performOperation(operator, operand1, operand2);
        }
        return operand1;
    }

    public int evaluateExpression() {
        return evaluateExpression(this.expression);
    }

    private void filterOperandsAndOperator(String[] expressionParts, List<String> operators, List<Integer> operands) {
        for (String part : expressionParts) {
            try {
                operands.add(Integer.parseInt(part));
            } catch (Exception ex) {
                operators.add(part);
            }
        }
    }

    private int startEvaluation(String inputExpression) {
        StringBuilder expression = new StringBuilder(inputExpression);
        if (expression.indexOf("(") > -1) {
            solveBrackets(expression);
            return startEvaluation(expression.toString());
        }
        return evaluateExpression(expression.toString());
    }

    public int startEvaluation() {
        return startEvaluation(this.expression);
    }

    private void solveBrackets(StringBuilder expression) {
        int openingBracketIndex = -1;
        int closingBracketIndex = -1;
        for (int index = 0; index < expression.length(); index++) {
            if('(' == expression.charAt(index))
                openingBracketIndex = index;
            if(')' == expression.charAt(index))
                closingBracketIndex = index;
        }
        String expressionWithinBracket = expression.substring(openingBracketIndex + 1, closingBracketIndex);
        int result = evaluateExpression(expressionWithinBracket);
        expression.replace(openingBracketIndex, closingBracketIndex + 1, Integer.toString(result));
    }
}
