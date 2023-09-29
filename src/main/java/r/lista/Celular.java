/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package r.lista;

public class Celular {

    private int almacenamiento;
    private String color;

    public Celular(int almacenamiento, String color) {
        this.almacenamiento = almacenamiento;
        this.color = color;
    }

    public int getNumero() {
        return almacenamiento;
    }

    public void setNumero(int almacenamiento) {
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

}
