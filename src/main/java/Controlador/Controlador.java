/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Implementacion.Implementacion;
import Interfaz.IComisiones;
import Modelo.Comision;
import Vista.Vista;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KamiVela
 */
public class Controlador {

    private Vista vista = new Vista();

    public Controlador() {
    }

    //llama al DAO para guardar un cliente
    public void registrar(Comision comision) {
        IComisiones dao = new Implementacion();
        dao.registrar(comision);
    }

    //llama al DAO para actualizar un cliente
    public void actualizar(Comision cliente) {
        IComisiones dao = new Implementacion();
        dao.actualizar(cliente);
    }

    //llama al DAO para eliminar un cliente
    public void eliminar(Comision comision) {
        IComisiones dao = new Implementacion();
        dao.eliminar(comision);
    }

    //llama al DAO para obtener todos los clientes y luego los muestra en la vista
    public void verComisiones() {
        List<Comision> comision = new ArrayList<Comision>();
        IComisiones dao = new Implementacion();
        comision = dao.obtener();
        System.out.println("Nombre \t|| Enero \t|| Febrero \t|| Marzo \t|| Promedio \t|| Total");
        vista.verComisiones(comision);
    }

}
