package pl.sda.strategy;

import java.util.EnumMap;
import java.util.Map;

public class Context {

    private final Map<OperationType, Operation> operations = new EnumMap<>(OperationType.class);

    public Context() {
        this.operations.put(OperationType.ADDITION, new AdditionOperation());
        this.operations.put(OperationType.SUBTRACTION, new SubtractionOperation());
        this.operations.put(OperationType.MULTIPLICATION, new MultiplicationOperation());
    }

    public int executeStrategy(OperationType operationType, int arg1, int arg2) {
        return operations.get(operationType).calculate(arg1, arg2);
    }
}
