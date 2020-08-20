package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza implements Element {

    protected List<Topping> toppings = new ArrayList<>();
    abstract String getType();

    void addTopping(Topping t){
        toppings.add(t);
    }

    public void make(){
        System.out.println(getType());
        toppings.stream().forEach(t -> {
            System.out.print(t.getProduct() + " ");
        });
        System.out.println();
    }

    public static class SimplePizza extends Pizza{

        @Override
        public void accept(Visitor v) {
            v.visit(this);
        }

        @Override
        String getType() {
            return "Обычная пицца";
        }
    }

    public static class SpecialPizza extends Pizza{

        @Override
        public void accept(Visitor v) {
            v.visit(this);
        }

        @Override
        String getType() {
            return "Специальная пицца";
        }
    }
}
