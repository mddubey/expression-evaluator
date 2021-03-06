expression-evaluator
====================
Expression evaluator will take a expression as input from command line. It will evaluate the expression and gives result.

##Release0.6
    * This release will supports expression which has no space.
    * Expression might have space or not.
    * Example
        "(1.5+-2.5)" wihtout space
        " ( 1.5 + - 2.5 ) " with space



##Release0.5
    * This release will support negative and decimal numbers in expression.
    * There should be no space between - and number in negative number.
        E.g:-   "1 - -2"
    * Example
        " ( 1.5 + -2.5 )"
        " ( 2.3 + ( -1.5 * 2 ) + 4 )"

##Release0.4
    * This release will support multiple nested brackets in expression.
    * Example:-
        " ( 1 + ( 2 + 5 ) )"
        " ( 1 + 2 * ( 4 ^ 2 ) + 5 )"
        " 1 + 5 * ( 3 + 9 - ( 12 - 10 ) + 9 )"

##Release0.3
    * This release supports one bracket in expression.
    * Example:-
        "1 + ( 2 ^ 3 - 2 ) - 1"
        "2 + ( 4 * 5 ) + 3"

##Release0.2
    * This release supports multiple operations in expression.
    * Example:-
        "1 + 2 ^ 3 - 2"
        "2 + 4 * 5 + 3"

    Known Bugs:-
    * On negative numbers the result is unpredictable.
    * It supports values between -2147483648 and 2147483647.
    * If result is having decimal part it rounds down the value.

##Release0.1
    * This Release takes expression which has one operator and two numbers.
    * There must be a space between each number and operator.
    * Numbers should be positive.
    * Operators allowed are +,-,*,/,^
    * Example:-
        "1 + 2"
        "5 ^ 2"

##How to Run:-
        * Extract the .zip file.
        * For extracting give a folder name where to extract.
        * Create a environment variable as path of this folder in your system named EVALUATOR_HOME.
        * set the EVALUATOR_HOME/bin in path.
        * Run the command
            evaluator.sh EXPRESSION



