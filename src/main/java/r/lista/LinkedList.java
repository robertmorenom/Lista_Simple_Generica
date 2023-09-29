package r.lista;

public class LinkedList<T>{

    private Node head;
    private int size;

    public void add(T valor) {
        Node p = head;
        if (head == null) {
            head = new Node();
            head.setData(valor);
        } else {
            while (p.getNext() != null) {
                p = p.getNext();
            }
            Node n = new Node();
            n.setData(valor);
            p.setNext(n);
        }

    }

    public void print() {
        Node p = head;
        while (p != null) {
            System.out.print(p.getData().toString() + " --> ");
            p = p.getNext();
        }

    }

    public void addBefore(T data) {
        if (head == null) {
            head = new Node();
            head.setData(data);
        } else {
            Node temp = head;
            Node newNode = new Node();
            newNode.setData(data);
            newNode.setNext(temp);
            head = newNode;
        }
        size++;
    }

    public void addAfter(T data) {
        if (head == null) {
            head = new Node();
            head.setData(data);
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            Node newNode = new Node();
            newNode.setData(data);
            temp.setNext(newNode);
        }
        size++;
    }

    public void eliminarNodoInicio() {
        if (head != null) {
            if (head.getNext() != null) {
                head = head.getNext();
            } else {
                head = null;
            }
        }
        size--;
    }

    public void eliminarNodoFinal() {
        Node aux = head.getNext();
        Node anterior = head;
        if (aux == null) {
            head = null;
        } else {
            while (aux != null) {
                if (aux.getNext() == null) {
                    anterior.setNext(null);
                } 
                aux = aux.getNext();
                anterior = anterior.getNext();
              
            }
        }
        size--;
    }

    public void eliminarNodoMitad() {
        if (head.getNext() != null) {
            int i = 0;
            Node anterior = head;
            while (anterior.getNext() != null) {
                Node nodoBuscado = anterior.getNext();
                if (i == (this.size / 2)) {
                    anterior = nodoBuscado;
                } else {
                    Node actual = nodoBuscado.getNext();
                    anterior.setNext(actual);
                    size--;
                    return;
                }
                i++;
            }

        }

    }
    public void addOrdered(T val) {
        Node nuevo = new Node();
        nuevo.setData(val);
        if (head == null) {
            //si se cumple esto, es porque mi lista esta vacia, por logica debo agregar el nuevo y settearlo como cabeza
            head = nuevo;
            size++;
        } else {
            Node p = head;
            //1 si yo soy mayor
            //0 si somos iguales
            //-1 si yo soy menor
            if (((Comparable)p.getData()).compareTo(val) > 0) {
                //si esto se cumple, es porque mi cabeza es mayor que el nuevo dato, por logica debo agregarlo al inicio
                nuevo.setNext(p);
                head = nuevo;
            } else {
                if (p.getNext() == null) {
                    //si esto se cumple, es porque solo tengo un elemento en la lista y mi cabeza es menor que el valor nuevo
                    //por logica, debo ingresarlo despues mi cabeza
                    p.setNext(nuevo);
                } else {
                    while (p!= null && ((Comparable)p.getData()).compareTo(val) < 0) {
                        p = p.getNext();
                    }
                    Node q = head;
                    while (q.getNext() != p) {
                        q = q.getNext();
                    }
                    q.setNext(nuevo);
                    nuevo.setNext(p);
                }
            }
        }
    }

    @Override
    public String toString() {
        String lista = "";
        for(Node a = head; a != null; a = a.getNext()){
            lista += " " + a.toString();
        }
        return lista;
    }
}
