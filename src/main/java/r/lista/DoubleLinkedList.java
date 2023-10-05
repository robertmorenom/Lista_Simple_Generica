package r.lista;

public class DoubleLinkedList<T> {

    private Node head;
    private int size;

    public boolean esVacia() {
        return head == null;
    }

    //Hacer metodos add(T valor)(este agrega por defecto al final)
    //Hacer método addFirst(T valor)(este agrega por defecto al inicio)
    //Hacer método addAtPosition(T valor, int pos)(este agrega un nodo en una posición especifica)
    public void add(T valor) {
        Node p = head;
        Node newNode = new Node(valor);

        if (esVacia()) {
            head = newNode;
        } else {
            while (p.getNext() != null) {
                p = p.getNext();
            }
            p.setNext(newNode);
            newNode.setPrev(p);
        }
       
        
    }
    
    public void deleteEnd(){
        Node p = head;
        while (p.getNext() != null) {            
          p = p.getNext();
        }
        p.getPrev().setNext(null);
        p = null;
    }
    
    
    

    public void print() {
        Node p = head;
        while (p != null) {
            System.out.print(p.getData().toString() + " <--> ");
            p = p.getNext();
        }
        System.out.print("null");
    }

    @Override
    public String toString() {
        String lista = "";
        for (Node a = head; a != null; a = a.getNext()) {
            lista += " " + a.toString();
        }
        return lista;
    }
}
