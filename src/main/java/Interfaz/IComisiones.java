/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Modelo.Comision;
import java.util.List;

/**
 *
 * @author KamiVela
 */
public interface IComisiones {

    public boolean registrar(Comision comision);

    public List<Comision> obtener();

    public boolean actualizar(Comision comision);

    public boolean eliminar(Comision comision);
}
