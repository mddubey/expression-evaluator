package mritunjd.evaluator.lib;

import java.util.ArrayList;
import java.util.List;

public class EvaluatorLib {
    private String expression;

    public EvaluatorLib(String expression) {
        this.expression = expression;
    }

    public int evaluateExpression() {
        String[] expressionParts = this.expression.split(" ");
        List<String> operators = new ArrayList<String>();
        List<Integer> operands = new ArrayList<Integer>();
        filterOperandsAndOperator(expressionParts, operators, operands);
        Operations operationsMap = new Operations();
        int operand1 = operands.get(0);
        for (int i = 0; i < operators.size(); i++) {
            String operator = operators.get(i);
            int operand2 = operands.get(i+1);
            operand1 = operationsMap.performOperation(operator,operand1,operand2);
        }
        return operand1;
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
}
