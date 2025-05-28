import AdapterDesignPattern.AdapterPatternClient;
import AdapterDesignPattern.PenAdapter;
import BuilderDesignPattern.User;
import DecoratorDesignPattern.Coffee;
import DecoratorDesignPattern.MilkDecorator;
import DecoratorDesignPattern.SimpleCoffee;
import DecoratorDesignPattern.SugarDecorator;
import FacadeDesignPattern.FacadePatternClient;
import FactoryDesignPattern.FactoryPatternSupportive;
import FlyWeightDesignPattern.FlyWeightPatternClient;
import ObserverDesignPattern.ObserverPatternClient;
import PrototypeDesignPattern.PrototypePatternSupportive;
import SingletonDesignPattern.SingletonPatternSupportive;
import StrategyDesignPattern.StrategyPatternClientClass;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class DesignPatternCLI {

    public static void startCLI() {
        while (true) {

            try {
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            DesignPatternsMenu.showMenu();

            Scanner readInput = new Scanner(System.in);
            Integer input = readInput.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Singleton Design Pattern Example");
                    //Singleton Design Pattern
                    {
                        SingletonPatternSupportive.call();
                    }
                    break;
                case 2:
                    System.out.println("Builder Design Pattern Example");
                    //Builder Design Pattern
                    {
                        User userBuilder = User.builder().setUsername("Varun").setPassword("abcd1234").build();
                        System.out.println(userBuilder.toString());
                    }
                    break;
                case 3:
                    System.out.println("Prototype Design Pattern Example");
                    //Prototype Design Pattern
                    {
                        PrototypePatternSupportive.call();
                    }
                    break;
                case 4:
                    System.out.println("Fourth is Factory Design Pattern");
                    //FactoryDesignPattern
                    {
                        FactoryPatternSupportive.call();
                    }
                    break;
                case 5:
                    System.out.println("Fifth is Adapter Design Pattern");
                    //AbstractDesignPattern
                    {
                        PenAdapter penAdapter = new PenAdapter("RED");
                        AdapterPatternClient adapterPatternClient = new AdapterPatternClient(penAdapter);
                        adapterPatternClient.doHomework();
                    }
                    break;
                case 6:
                    System.out.println("Sixth is Adapter Design Pattern");
                    //DecoratorDesignPattern
                    {
                        Coffee coffee = new SimpleCoffee();
                        coffee = new MilkDecorator(coffee);
                        coffee = new SugarDecorator(coffee);

                        System.out.println(coffee.getCoffeeName());
                        System.out.println(coffee.getPrice());
                    }
                    break;
                case 7:
                    System.out.println("Eighth is Facade Design Pattern");
                    //Facade Design Pattern
                    {
                        FacadePatternClient.call();
                    }
                    break;
                case 8:
                    System.out.println("Flyweight Design Pattern");
                    //FlyWeight Design Pattern
                    {
                        FlyWeightPatternClient.call();
                    }
                    break;
                case 9:
                    System.out.println("Strategy Design Pattern");
                    //FlyWeight Design Pattern
                    {
                        StrategyPatternClientClass.call();
                    }
                    break;
                case 10:
                    System.out.println("Observer Design Pattern");
                    //FlyWeight Design Pattern
                    {
                        ObserverPatternClient.call();
                    }
                    break;
                default:
                    System.out.println("Exit");
                    return;
            }
        }
    }

}
