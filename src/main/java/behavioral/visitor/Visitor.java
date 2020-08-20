package behavioral.visitor;

public interface Visitor {
    void visit(Pizza.SimplePizza pizza);
    void visit(Pizza.SpecialPizza pizza);



    class AddBaconVisitor implements Visitor{

        @Override
        public void visit(Pizza.SimplePizza pizza) {
            pizza.addTopping(new Topping("BACON"));
        }

        @Override
        public void visit(Pizza.SpecialPizza pizza) {
            pizza.addTopping(new Topping("BACON"));
        }
    }

    class AddCheeseVisitor implements Visitor{

        @Override
        public void visit(Pizza.SimplePizza pizza) {
            pizza.addTopping(new Topping("CHEESE"));
        }

        @Override
        public void visit(Pizza.SpecialPizza pizza) {
            pizza.addTopping(new Topping("CHEESE"));
        }
    }

    class AddPineappleVisitor implements Visitor{

        @Override
        public void visit(Pizza.SimplePizza pizza) {
            pizza.addTopping(new Topping("PINEAPPLE"));
        }

        @Override
        public void visit(Pizza.SpecialPizza pizza) {
            pizza.addTopping(new Topping("PINEAPPLE"));
        }
    }

    class AddSeafoodVisitor implements Visitor{

        @Override
        public void visit(Pizza.SimplePizza pizza) {
            pizza.addTopping(new Topping("SEAFOOD"));
        }

        @Override
        public void visit(Pizza.SpecialPizza pizza) {
            pizza.addTopping(new Topping("SEAFOOD"));
        }
    }
}
