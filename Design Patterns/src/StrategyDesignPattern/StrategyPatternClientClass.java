package StrategyDesignPattern;

import java.util.Scanner;

public class StrategyPatternClientClass {

    private static Context context;
    private static int a = 5;
    private static int b = 10;

    public static void call() {
        
        String strategy = "";
        System.out.println("Strategy Pattern Example");
        System.out.println("Please provide the arithmetic operation to perform e.g '*', '/', '+', '-'");
        Scanner sc = new Scanner(System.in);
        String readOperation = sc.nextLine();

        if( readOperation.equalsIgnoreCase("+")) {
            context = new Context(new ConcreteStrategyAdd());
            strategy = "Addition";
        } else if(readOperation.equalsIgnoreCase("-")) {
            context = new Context(new ConcreteStrategySubtract());
            strategy = "Subtraction";
        } else if(readOperation.equalsIgnoreCase("*")) {
            context = new Context(new ConcreteStrategyMultiply());
            strategy = "Multiplication";
        } else if(readOperation.equalsIgnoreCase("/")) {
            context = new Context(new ConcreteStrategyDivide());
            strategy = "Division";
        }
        System.out.println( strategy + " Operation of two number is a : " + a + " b: " + b + " is = " + context.execute(a, b) );
    }
}
