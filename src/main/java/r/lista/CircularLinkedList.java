package r.lista;

public class CircularLinkedList<T> {

    private Node head;
    private int size;

    public void add(T valor) {
        Node p = head;
        if (head == null) {
            head = new Node(valor);
            head.setNext(head);
        } else {
            while (p.getNext() != head) {
                p = p.getNext();
            }
            Node newNode = new Node(valor);
            p.setNext(newNode);
            newNode.setNext(head);
        }
      size++;  
    }
    
    public void deleteEnd(){
     Node act = head;
     Node ant = act;
     
        while (act.getNext() != head) {            
          ant = act;
          act = act.getNext();
        }
        ant.setNext(head);
        act = null;
    }
    
    
    
    public void print() {
        Node p = head;
        while (p.getNext() != head) {
            System.out.print(p.getData().toString()+"-->");
            p = p.getNext();
        }
        System.out.print(p.getData().toString()+"--> head");
    }
}
