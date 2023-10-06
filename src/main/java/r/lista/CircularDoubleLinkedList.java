package r.lista;

public class CircularDoubleLinkedList<T> {

    private Node head;
    private int size;

    public void add(T valor) {
        Node p = head;
        if (head == null) {
            head = new Node(valor);
            head.setNext(head);
            head.setPrev(head);
        } else {
            while (p.getNext() != head) {
                p = p.getNext();
            }
            Node newNode = new Node(valor);
            p.setNext(newNode);
            newNode.setPrev(p);
            newNode.setNext(head);
            head.setPrev(newNode);
        }
        size++;
    }

    public void deleteEnd() {
        if (size == 0) {
            System.out.println("No se puede eliminar");
        } else {
            Node p = head;
            while (p.getNext() != head) {
                p = p.getNext();
            }
            p.getPrev().setNext(head);
            head.setPrev(p.getPrev());
            p.setPrev(null);
            p.setNext(null);
            size--;
        }

    }

    public void print() {
        if (size == 0) {
            System.out.println("La lista está vacía");
        } else {
            Node p = head;
            boolean indicador = false;
            while (p != head || indicador == false) {
                indicador = true;
                System.out.print(p.getData() + "<--->");
                p = p.getNext();
            }
            System.out.print("head");
        }

    }
}
