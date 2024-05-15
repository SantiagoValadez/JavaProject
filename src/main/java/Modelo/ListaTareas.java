package Modelo;

import java.util.Date;

public class ListaTareas {
    private String nombre;
    private int fechaCreacion;



    public ListaTareas(String nombre, int fechaCreacion) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(int fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public static void main(String[] args) {


    }


}
