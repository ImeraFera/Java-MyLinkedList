public class MyLinkedList {

    private Node head;

    public MyLinkedList() {
        head = null;
    }

    public int size() {
        Node temp = head;
        int counter = 0;
        while (temp != null) {
            counter++;
            temp = temp.getNext();
        }
        return counter;
    }

    public void addLast(Object data) {

        Node node = new Node(data);

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);

        }
    }

    public void addIndexOf(int index, Object data) {

        if (index + 1 > size() || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node newNode = new Node(data);
        Node current = head;
        if (index == 0) {

            newNode.setNext(current);
            head = newNode;

        } else {
            for (int i = 0; i < size(); i++) {

                if (i + 1 != index) {
                    current = current.getNext();
                    continue;
                } else {
                    newNode.setNext(current.getNext());
                    current.setNext(newNode);
                    break;
                }

            }
        }

    }

    public Object getData(int index) {
        if (index < size() && index >= 0) {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.getNext();
            }
            return temp.getData();
        } else {
            return null;
        }

    }

    public void removeFirst() {
        if (head == null)
            System.out.println("Linkedlist is already empty");
        else
            head = head.getNext();
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public void removeLast() {

        if (head == null) {
            System.out.println("Linkedlist is already empty");
        } else {
            Node temp = head;
            if (temp.getNext() == null) {
                head = null;
            } else {
                while (temp.getNext().getNext() != null) {
                    temp = temp.getNext();
                }
                temp.setNext(null);
            }
        }

    }

}
