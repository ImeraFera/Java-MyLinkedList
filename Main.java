/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.addLast("a");
        list.addLast("b");
        list.addLast("c");
        list.addLast("d");
        list.addLast("f");
        list.addLast("g");
        list.addLast("h");
        System.out.println(list.size());
        list.removeLast();
        System.out.println(list.size());
        list.addLast("b");
        System.out.println(list.getData(-1));

        list.addIndexOf(0, "e");
        list.print();

    }
}