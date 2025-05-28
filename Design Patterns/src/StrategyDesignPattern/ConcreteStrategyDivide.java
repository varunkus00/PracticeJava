package StrategyDesignPattern;

public class ConcreteStrategyDivide implements Strategy {

    @Override
    public int executeStrategy(int a, int b) {
        return a / b;
    }

}
