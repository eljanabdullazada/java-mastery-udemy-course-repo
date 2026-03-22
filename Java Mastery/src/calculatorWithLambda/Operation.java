package calculatorWithLambda;

@FunctionalInterface
public interface Operation {
    void performOperation(double x, double y);
}
