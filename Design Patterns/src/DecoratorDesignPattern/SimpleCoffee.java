package DecoratorDesignPattern;

public class SimpleCoffee implements Coffee {
    @Override
    public String getCoffeeName() {
        return "This is a simple coffee";
    }

    @Override
    public double getPrice() {
        return 5.5;
    }
}
