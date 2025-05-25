package DecoratorDesignPattern;

public class SugarDecorator extends CoffeeDecorator{

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getCoffeeName() {
        return coffee.getCoffeeName() + " Sugar ";
    }

    @Override
    public double getPrice() {
        return coffee.getPrice() + 1;
    }
}
