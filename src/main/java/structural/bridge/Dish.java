package structural.bridge;

public interface Dish {
    void make(String country);

    class firstDish implements Dish{

        @Override
        public void make(String country) {
            System.out.println(country + " first");
        }
    }
    class secondDish implements Dish{

        @Override
        public void make(String country) {
            System.out.println(country + " second");
        }
    }
    class thirdDish implements Dish{

        @Override
        public void make(String country) {
            System.out.println(country + " third");
        }
    }
    class desertDish implements Dish{

        @Override
        public void make(String country) {
            System.out.println(country + " desert");
        }
    }
}
