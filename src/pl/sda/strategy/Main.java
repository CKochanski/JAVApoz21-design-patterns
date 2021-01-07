package pl.sda.strategy;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();

        System.out.println(context.executeStrategy(OperationType.ADDITION, 2, 3));
        System.out.println(context.executeStrategy(OperationType.SUBTRACTION, 2, 3));
        System.out.println(context.executeStrategy(OperationType.MULTIPLICATION, 2, 3));
    }
}
