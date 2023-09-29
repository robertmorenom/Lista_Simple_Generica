package r.lista;

public class Celular implements Comparable<Celular> {

    private int almacenamiento;
    private String color;

    public Celular(int almacenamiento, String color) {
        this.almacenamiento = almacenamiento;
        this.color = color;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Celular{" + "almacenamiento=" + almacenamiento + ", color=" + color + '}';
    }

    @Override
    public int compareTo(Celular o) {
        if (this.getAlmacenamiento() > o.getAlmacenamiento()) {
            return 1;
        } else if (this.getAlmacenamiento() < o.getAlmacenamiento()) {
            return -1;
        }

        return 0;

    }
}
