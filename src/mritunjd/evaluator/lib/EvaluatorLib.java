package mritunjd.evaluator.lib;

import java.util.ArrayList;
import java.util.List;

public class EvaluatorLib {
    private String expression;

    public EvaluatorLib(String expression) {
        this.expression = expression;
    }

    private double evaluateExpression(String expression) {
        String[] expressionParts = expression.trim().split(" ");
        List<String> operators = new ArrayList<String>();
        List<Double> operands = new ArrayList<Double>();
        filterOperandsAndOperator(expressionParts, operators, operands);
        return calculateAll(operators, operands);
    }

    private double calculateAll(List<String> operators, List<Double> operands) {
        Operations operationsMap = new Operations();
        double operand1 = operands.get(0);
        for (int i = 0; i < operators.size(); i++) {
            String operator = operators.get(i);
            double operand2 = operands.get(i + 1);
            operand1 = operationsMap.performOperation(operator, operand1, operand2);
        }
        return operand1;
    }

    public double evaluateExpression() {
        return evaluateExpression(this.expression);
    }

    private void filterOperandsAndOperator(String[] expressionParts, List<String> operators, List<Double> operands) {
        for (String part : expressionParts) {
            try {
                operands.add(Double.parseDouble(part));
            } catch (Exception ex) {
                operators.add(part);
            }
        }
    }

    private double startEvaluation(String inputExpression) {
        StringBuilder expression = new StringBuilder(inputExpression);
        if (expression.indexOf("(") > -1) {
            solveBrackets(expression);
            return startEvaluation(expression.toString());
        }
        return evaluateExpression(expression.toString());
    }

    public double startEvaluation() {
        return startEvaluation(this.expression);
    }

    private void solveBrackets(StringBuilder expression) {
        int openingBracketIndex = -1;
        int closingBracketIndex = -1;
        for (int index = 0; index < expression.length(); index++) {
            if ('(' == expression.charAt(index))
                openingBracketIndex = index;
            if (')' == expression.charAt(index)) {
                closingBracketIndex = index;
                break;
            }
        }
        String expressionWithinBracket = expression.substring(openingBracketIndex + 1, closingBracketIndex);
        double result = evaluateExpression(expressionWithinBracket);
        expression.replace(openingBracketIndex, closingBracketIndex + 1, Double.toString(result));
    }
}
