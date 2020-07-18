package structural.proxy;

public interface Calculator {
    int add(Integer n1, Integer n2);

    int devide(Integer n1, Integer n2);

    int multiply(Integer n1, Integer n2);

    int substract(Integer n1, Integer n2);

    public static class calculatorFactory{

        public static Calculator getCalculatorService(){
            return new CacheProxy(new RemoteSystemFacade());
        }
    }
}
