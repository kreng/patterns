package structural.composite;

public class TreeBuilder {

    public static void main(String... args) {
        Element.Leaf leaf1 = new Element.Leaf(3);
        Element.Leaf leaf2 = new Element.Leaf(1);
        Element.Leaf leaf3 = new Element.Leaf(5);

        Element.Leaf leaf4 = new Element.Leaf(4);

        Element.Node node1 = new Element.Node();
        node1.addElement(leaf1);
        node1.addElement(leaf2);

        Element.Node node2 = new Element.Node();
        node2.addElement(leaf3);
        node2.addElement(node1);

        Element.Node peek = new Element.Node();
        peek.addElement(leaf4);
        peek.addElement(node2);

        peek.increment();
    }
}
