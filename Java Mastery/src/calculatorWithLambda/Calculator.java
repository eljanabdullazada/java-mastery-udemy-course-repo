package calculatorWithLambda;

public class Calculator {
    void calculate(double x, double y, Operation operation){
        operation.performOperation(x, y);
    }
}
