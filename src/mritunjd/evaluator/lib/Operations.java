package mritunjd.evaluator.lib;

import java.util.HashMap;
import java.util.Map;

interface Operatable {
    double evaluate(double operand1, double operand2);
}

public class Operations {
    Map<String, Operatable> operationMap;

    public Operations() {
        Map<String, Operatable> operationMap = new HashMap<String, Operatable>();

        operationMap.put("+", new Operatable() {
            @Override
            public double evaluate(double operand1, double operand2) {
                return operand1 + operand2;
            }
        });

        operationMap.put("-", new Operatable() {
            @Override
            public double evaluate(double operand1, double operand2) {
                return operand1 - operand2;
            }
        });

        operationMap.put("*", new Operatable() {
            @Override
            public double evaluate(double operand1, double operand2) {
                return operand1 * operand2;
            }
        });

        operationMap.put("/", new Operatable() {
            @Override
            public double evaluate(double operand1, double operand2) {
                return operand1 / operand2;
            }
        });

        operationMap.put("^", new Operatable() {
            @Override
            public double evaluate(double operand1, double operand2) {
                return Math.pow(operand1, operand2);
            }
        });
        this.operationMap = operationMap;
    }

    public double performOperation(String operator, double operand1, double operand2) {
        return operationMap.get(operator).evaluate(operand1, operand2);
    }
}
