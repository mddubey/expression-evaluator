expression-evaluator
====================
Expression evaluator will take a expression as input from command line. It will evaluate the expression and gives result.

##Release0.2
This release supports multiple operands with different operators
###Input Specification:-
        * Only integer and positive operands are possible.
        * There must be a space between each operator and operand.
        * On negative operands the result is unpredicted.
        * It supports values between -2147483648 and 2147483647.
        * If result is having decimal part it round down the value.

##Release0.1
###Input Specification:-
        * Only integer and positive operands are possible.
        * Only two operands and one operator can be given.
        * There must be a space between each operand and operator.
        * Operators possible are :-
            +,-,*,/,^

##How to Run:-
        * Extract the .zip file.
        * For extracting give a folder name where to extract.
        * Create a environment variable as path of this folder in your system named EVALUATOR_HOME.
        * set the EVALUATOR_HOME/bin in path.
        * Run the evaluator.sh with it's argument.



