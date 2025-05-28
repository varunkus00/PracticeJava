package StrategyDesignPattern;

public class ConcreteStrategySubtract implements Strategy {

    @Override
    public int executeStrategy(int a, int b) {
        return a - b;
    }

}
