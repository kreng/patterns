package behavioral.strategy;

public class ListContainer {
    private int[] list;
    SortStrategy strategy;

    public void setList(int[] list) {
        this.list = list;
    }

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(){
        strategy.sort(list);
    }

    public void soutList() {
        for(int i: list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
