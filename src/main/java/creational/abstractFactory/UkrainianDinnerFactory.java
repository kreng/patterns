package creational.abstractFactory;

public class UkrainianDinnerFactory implements DinnerFactory {
    @Override
    public Client.FirstDish makeFirstDish() {
        return new Client.UkrainianFirstDish();
    }

    @Override
    public Client.HotDish makeHotDish() {
        return new Client.UkrainianHotDish();
    }

    @Override
    public Client.Salad makeSalad() {
        return new Client.UkrainianSaladDish();
    }
}
