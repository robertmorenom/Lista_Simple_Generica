package r.lista;

public class Perro implements Comparable<Perro> {

    private String nombre;
    private int edad;

    public Perro(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "[" + "nombre = " + nombre + ", edad = " + edad + ']';
    }

    @Override
    public int compareTo(Perro o) {
        if (this.getEdad() > o.getEdad()) {
            return 1;
        } else if (this.getEdad() < o.getEdad()) {
            return -1;
        }

        return 0;

    }
}
