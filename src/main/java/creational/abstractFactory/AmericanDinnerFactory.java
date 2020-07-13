package creational.abstractFactory;

public class AmericanDinnerFactory implements DinnerFactory {
    @Override
    public Client.FirstDish makeFirstDish() {
        return new Client.AmericanFirstDish();
    }

    @Override
    public Client.HotDish makeHotDish() {
        return new Client.AmericanHotDish();
    }

    @Override
    public Client.Salad makeSalad() {
        return new Client.AmericanSaladDish();
    }
}
