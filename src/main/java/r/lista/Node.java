package r.lista;

public class Node<T> implements Comparable<Node<T>> {

    private T data;
    private Node next;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public int compareTo(Node<T> o) {
        return 0;
    }
    
    @Override
    public String toString() {
        return "Node{" + "data=" + data.toString() + '}';
    }

    
    
}
