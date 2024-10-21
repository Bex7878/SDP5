interface Strategy {
    int doOperation(int num1, int num2);
}

class OperationAdd implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}

class OperationSubtract implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}

class OperationMultiply implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}

class Context1 {
    private Strategy strategy;

    public Context1(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}

public class StrategyDemo {
    public static void main(String[] args) {
        Context1 context1 = new Context1(new OperationAdd());
        System.out.println("10 + 5 = " + context1.executeStrategy(10, 5));

        context1 = new Context1(new OperationSubtract());
        System.out.println("10 - 5 = " + context1.executeStrategy(10, 5));

        context1 = new Context1(new OperationMultiply());
        System.out.println("10 * 5 = " + context1.executeStrategy(10, 5));
    }
}
