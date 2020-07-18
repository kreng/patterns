package structural.proxy;

public class Client {
    public static void main(String[] args){
        Calculator calc = Calculator.calculatorFactory.getCalculatorService();

        calc.add(2, 3);
        calc.add(2, 5);
        calc.add(2, 3);
    }
}
