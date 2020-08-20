package behavioral.strategy;

public class Client {

    public static void main(String... args) {
        ListContainer con = new ListContainer();
        con.setList(new int[]{3,2,7,1,3});
        con.setStrategy(new SortStrategy.QuickSort());
        con.sort();

        con.soutList();
    }
}
