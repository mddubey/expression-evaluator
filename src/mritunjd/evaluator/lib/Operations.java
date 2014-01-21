package mritunjd.evaluator.lib;

import java.util.Map;
import java.util.HashMap;

interface Operatable {
    int evaluate(int operand1, int operand2);
}

public class Operations {
    Map<String, Operatable> operationMap;

    public Operations() {
        Map<String, Operatable> operationMap = new HashMap<String, Operatable>();

        operationMap.put("+", new Operatable() {
            @Override
            public int evaluate(int operand1, int operand2) {
                return operand1 + operand2;
            }
        });

        operationMap.put("-", new Operatable() {
            @Override
            public int evaluate(int operand1, int operand2) {
                return operand1 - operand2;
            }
        });

        operationMap.put("*", new Operatable() {
            @Override
            public int evaluate(int operand1, int operand2) {
                return operand1 * operand2;
            }
        });

        operationMap.put("/", new Operatable() {
            @Override
            public int evaluate(int operand1, int operand2) {
                return operand1 / operand2;
            }
        });

        operationMap.put("^", new Operatable() {
            @Override
            public int evaluate(int operand1, int operand2) {
                return (int) Math.pow(operand1, operand2);
            }
        });

        this.operationMap = operationMap;
    }

    public int performOperation(String operator, int operand1, int operand2) {
        return operationMap.get(operator).evaluate(operand1, operand2);
    }
}
