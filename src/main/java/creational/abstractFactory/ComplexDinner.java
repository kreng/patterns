package creational.abstractFactory;

public class ComplexDinner {
    Client.FirstDish first;
    Client.HotDish hot;
    Client.Salad salad;

    public Client.FirstDish getFirst() {
        return first;
    }

    public void setFirst(Client.FirstDish first) {
        this.first = first;
    }

    public Client.HotDish getHot() {
        return hot;
    }

    public void setHot(Client.HotDish hot) {
        this.hot = hot;
    }

    public Client.Salad getSalad() {
        return salad;
    }

    public void setSalad(Client.Salad salad) {
        this.salad = salad;
    }
}
