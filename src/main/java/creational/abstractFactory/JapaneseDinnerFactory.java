package creational.abstractFactory;

public class JapaneseDinnerFactory implements DinnerFactory {
    @Override
    public Client.FirstDish makeFirstDish() {
        return new Client.JapaneseFirstDish();
    }

    @Override
    public Client.HotDish makeHotDish() {
        return new Client.JapaneseHotDish();
    }

    @Override
    public Client.Salad makeSalad() {
        return new Client.JapaneseSaladDish();
    }
}
