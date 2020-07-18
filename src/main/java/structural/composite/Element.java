package structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Element {
    protected int i;
    public void printNumber() {
        System.out.println(i);
    }

    public abstract void increment();

    public static class Leaf extends Element {

        public Leaf(int number) {
            this.i = number;
        }

        @Override
        public void increment() {
            i++;
            printNumber();
        }
    }

    public static class Node extends Element{
        List<Element> children = new ArrayList<>();

        @Override
        public void increment() {
            for (Element element: children) {
                element.increment();
            }
        }

        public void addElement (Element element){
            children.add(element);
        }
    }
}
