/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author KamiVela
 */
public class Comision {

    
    
    int id;
    String nombre;
    double enero;
    double febrero;
    double marzo;
    double promedio;
    double total;

    public Comision( String nombre, double enero, double febrero, double marzo) {
        this.id = id;
        this.nombre = nombre;
        this.enero = enero;
        this.febrero = febrero;
        this.marzo = marzo;
        this.promedio = (this.enero + this.febrero + this.marzo) / 3;
        this.total = (this.enero + this.febrero + this.marzo);
    }

    public Comision() {
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEnero() {
        return enero;
    }

    public void setEnero(double enero) {
        this.enero = enero;
    }

    public double getFebrero() {
        return febrero;
    }

    public void setFebrero(double febrero) {
        this.febrero = febrero;
    }

    public double getMarzo() {
        return marzo;
    }

    public void setMarzo(double marzo) {
        this.marzo = marzo;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }


    @Override
    public String toString() {

        return this.nombre + " | " + String.valueOf(this.enero) + " | " + String.valueOf(this.febrero) + " | " + String.valueOf(this.marzo) + " | " + String.valueOf(this.promedio) + " | " + String.valueOf(this.total);
    }
}
