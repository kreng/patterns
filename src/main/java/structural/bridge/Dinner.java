package structural.bridge;


public abstract class Dinner {
    String country;
    Dish dish;

    abstract void makeDish();

    static class AmericanDinner extends Dinner{

        public AmericanDinner(Dish dish) {
            this.dish = dish;
            country = "American";
        }

        @Override
        void makeDish() {
            dish.make(country);
        }
    }

    static class JapaneseDinner extends Dinner{

        public JapaneseDinner(Dish dish) {
            this.dish = dish;
            country = "Japanese";
        }

        @Override
        void makeDish() {
            dish.make(country);
        }
    }

    static class UkrainianDinner extends Dinner{

        public UkrainianDinner(Dish dish) {
            this.dish = dish;
            country = "Ukraninian";
        }

        @Override
        void makeDish() {
            dish.make(country);
        }
    }
}
