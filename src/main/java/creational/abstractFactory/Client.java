package creational.abstractFactory;

public class Client {
    public static void main(String... args) {
        DinnerFactory factory = DinnerFactory.getDinnerFactory("USA");

        // Типы блюд(первое, горячее и салат) должны быть одинаковыми для всех стран
        // иначе абстрактная фабрика будет антипаттерном?
        ComplexDinner complexDinner = new ComplexDinner();
        complexDinner.setFirst(factory.makeFirstDish());
        complexDinner.setHot(factory.makeHotDish());
        complexDinner.setSalad(factory.makeSalad());
    }

    interface FirstDish {
    }

    interface HotDish {
    }

    interface Salad{
    }


    static class AmericanFirstDish implements FirstDish { }
    static class JapaneseFirstDish  implements FirstDish { }
    static class UkrainianFirstDish  implements FirstDish { }

    static class AmericanHotDish  implements HotDish { }
    static class JapaneseHotDish  implements HotDish { }
    static class UkrainianHotDish  implements HotDish { }

    static class AmericanSaladDish  implements Salad { }
    static class JapaneseSaladDish  implements Salad { }
    static class UkrainianSaladDish  implements Salad { }
}