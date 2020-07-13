package creational.abstractFactory;



public interface DinnerFactory {
    static DinnerFactory getDinnerFactory(String code){
        if("USA".equals(code)){
            return new AmericanDinnerFactory();
        } else if("JAP".equals(code)) {
            return new JapaneseDinnerFactory();
        } else if ("UKR".equals(code)) {
            return new UkrainianDinnerFactory();
        } else
            throw new RuntimeException("Invalid code");
    }

    Client.FirstDish makeFirstDish();
    Client.HotDish makeHotDish();
    Client.Salad makeSalad();
}
