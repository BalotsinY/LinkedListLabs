import static java.lang.System.*;

public class ListFunHouse2Runner {
    public static void main(String[] args) {
        ListFunHouse2 funHouse = new ListFunHouse2();

        funHouse.add("go");
        funHouse.add("on");
        funHouse.add("at");
        funHouse.add("34");
        funHouse.add("2.1");
        funHouse.add("-a-2-1");
        funHouse.add("up");
        funHouse.add("over");

        out.println("Original list values: ");
        System.out.println(funHouse + "\n");

        out.println("num nodes: " + funHouse.nodeCount());

        out.println("\nList values after calling nodeCount: ");
        System.out.println(funHouse + "\n");

        funHouse.doubleLast();
        out.println("\nList values after calling doubleLast");
        System.out.println(funHouse + "\n");

        funHouse.doubleFirst();
        out.println("\nList values after calling doubleFirst");
        System.out.println(funHouse + "\n");

        funHouse.removeXthNode(2);
        out.println("\nList values after calling removeXthNode(2)");
        System.out.println(funHouse + "\n");

        funHouse.setXthNode(2, "one");
        out.println("\nList values after calling setXthNode(2,one)");
        System.out.println(funHouse + "\n");
    }
}