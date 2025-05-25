package DecoratorDesignPattern;

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    /*@Override
    public String getCoffeeName() {
        return "";
    }

    @Override
    public double getPrice() {
        return 0;
    }*/
}
