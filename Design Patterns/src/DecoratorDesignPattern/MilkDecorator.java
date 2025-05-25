package DecoratorDesignPattern;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getCoffeeName() {
        return coffee.getCoffeeName() + " Milk ";
    }

    @Override
    public double getPrice() {
        return coffee.getPrice() + 1;
    }

}
