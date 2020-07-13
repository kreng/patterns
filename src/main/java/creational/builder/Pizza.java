package creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private List<Nubble> pieces;

    public Pizza(PizzaBuilder builder) {
        this.pieces = builder.pieces;
    }

    public static class PizzaBuilder {
        private List<Nubble> pieces = new ArrayList<>();

        public PizzaBuilder addNubble(Nubble nubble){
            pieces.add(nubble);
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
