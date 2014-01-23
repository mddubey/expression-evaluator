package mritunjd.evaluator.cli;

import mritunjd.evaluator.lib.EvaluatorLib;

public class EvaluatorClient {
    public static void main(String[] args) {
        EvaluatorLib evaluator = new EvaluatorLib(args[0]);
        System.out.println(evaluator.startEvaluation());
    }
}
