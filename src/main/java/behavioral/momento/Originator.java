package behavioral.momento;

//хранит состояние для использования клиентом
class Originator {
    private String state;

    public Originator(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }
    public void restore(Memento m) {
        state = m.getState();
    }



    public static class Memento {
        private String state;

        public Memento(String state){
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }

}
