package creational;

public class FactoryMethod {

    static String SHAWERMA_PARAMETER = "123";
    static String BELYASH_PARAMETER = "456";

    public static void main(String ...args) {
        Stove stove = new Stove();
        Dish dish = stove.makeDish(BELYASH_PARAMETER);
        System.out.println(dish.getClass() == Belyash.class);
    }

    /**
     * блюдо
     */
    public static  abstract class Dish{
        static Dish createDish(String parameter) {
            if(SHAWERMA_PARAMETER.equals(parameter)) {
                return new Shawerma();
            } else if (BELYASH_PARAMETER.equals(parameter)){
                return new Belyash();
            }
            else
                throw new RuntimeException("Недопустимыц аргумент");
        }
    }

    static class Shawerma extends Dish{}
    static class Belyash extends Dish {}

    public static class Stove{

        Dish makeDish(String paramater) {
            return Dish.createDish(paramater);
        }
    }
}
