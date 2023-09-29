package r.lista;


public class Cliente {
    public static void main(String[] args) {
        
        /*LinkedList<Integer> obj = new LinkedList();
        obj.add(5);
        obj.add(3);
        obj.add(4);
        obj.add(5);
        obj.add(6);
        System.out.println("Llenando la lista\n");
        //System.out.println("\n");
        obj.print();
        obj.addAfter(8);
        obj.addBefore(0);
        System.out.println("---------------------------");
        System.out.println("Añadiendo nodo al inicio y final de la lista\n");
        obj.print();
        obj.eliminarNodoInicio();
        obj.eliminarNodoFinal();
        System.out.println("---------------------------");
        System.out.println("Eliminando nodo al inicio y final de la lista\n");
        obj.print();
        obj.eliminarNodoMitad();
        System.out.println("---------------------------");
        System.out.println("Eliminando el nodo de la mitad de la lista\n");
        obj.print();*/
        
        LinkedList<Perro> lista1 = new LinkedList();
        Perro p1 = new Perro("Toby", 3);
        Perro p2 = new Perro("Juan", 5);
        Perro p3 = new Perro("Cachirulo", 8);
        Perro p4 = new Perro("Giovani Vasquéz", 10);
        Perro p5 = new Perro("Percho", 1);
        
        lista1.add(p1);
        lista1.add(p2);
        lista1.add(p3);
        lista1.add(p4);
        lista1.addOrdered(p5);
        lista1.addOrdered(new Perro("Triki", 2));
        System.out.println("La primera lista es: ");
        lista1.print();
        
        LinkedList<String> lista2 = new LinkedList();
        lista2.add("Pepe");
        lista2.add("Juan");
        lista2.add("Tokito");
        lista2.addBefore("Pipe");
        lista2.addAfter("Trinidad");
        System.out.println("");
        System.out.println("\nLa segunda lista es: ");
        lista2.print();
        
        LinkedList<Celular> lista3 = new LinkedList();
        System.out.println("");
        System.out.println("\nLa tercera lista es: ");
        lista3.addOrdered(new Celular(64,"Gris"));
        lista3.add(new Celular(32,"Rojo"));
        lista3.add(new Celular(256,"Verde"));
        lista3.addBefore(new Celular(128,"Azul"));
        lista3.addAfter(new Celular(512,"Amarillo"));
        lista3.print();
    }
}
