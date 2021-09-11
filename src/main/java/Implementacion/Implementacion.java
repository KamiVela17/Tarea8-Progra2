/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementacion;

import Conexion.Conexion;
import Interfaz.IComisiones;
import Modelo.Comision;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KamiVela
 */
public class Implementacion implements IComisiones {

    @Override
    public boolean registrar(Comision comision) {
        boolean registrar = false;

        Statement stm = null;
        Connection con = null;

        String sql = "INSERT INTO comisiones values (NULL,'" + comision.getNombre() + "','" + comision.getEnero() + "','" + comision.getFebrero() + "','" + comision.getMarzo() + "','" + comision.getPromedio() + "','" + comision.getTotal() + "')";

        try {
            con = Conexion.conectar();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase IComisiones, método registrar");
            e.printStackTrace();
        }
        return registrar;
    }

    @Override
    public List<Comision> obtener() {

        Connection co = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM COMISIONES ORDER BY ID";

        List<Comision> listaComision = new ArrayList<Comision>();

        try {
            co = Conexion.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Comision c = new Comision();
                c.setId(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setEnero(rs.getDouble(3));
                c.setFebrero(rs.getDouble(4));
                c.setMarzo(rs.getDouble(5));
                c.setPromedio(rs.getDouble(6));
                c.setTotal(rs.getDouble(7));

                listaComision.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase IComisiones, método obtener");
            e.printStackTrace();
        }

        return listaComision;
    }

    @Override
    public boolean actualizar(Comision comision) {
        Connection connect = null;
        Statement stm = null;

        boolean actualizar = false;

        String sql = "UPDATE COMISIONES SET nombre='" + comision.getNombre() + "', enero='" + comision.getEnero() + "', febrero='" + comision.getFebrero() + "', marzo='" + comision.getMarzo() + "', promedio='" + comision.getPromedio() + "', total='" + comision.getTotal() + "'" + " WHERE ID=" + comision.getId();
        try {
            connect = Conexion.conectar();
            stm = connect.createStatement();
            stm.execute(sql);
            actualizar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase IComisiones, método actualizar");
            e.printStackTrace();
        }
        return actualizar;
    }

    @Override
    public boolean eliminar(Comision comision) {
        Connection connect = null;
        Statement stm = null;

        boolean eliminar = false;

        String sql = "DELETE FROM COMISIONES WHERE ID=" + comision.getId();
        try {
            connect = Conexion.conectar();
            stm = connect.createStatement();
            stm.execute(sql);
            eliminar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase IComisiones, método eliminar");
            e.printStackTrace();
        }
        return eliminar;
    }
}
