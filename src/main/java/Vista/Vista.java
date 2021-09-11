/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Comision;
import java.util.List;

/**
 *
 * @author KamiVela
 */
public class Vista {

    public void verComision(Comision comision) {
        System.out.println(comision);
    }

    public void verComisiones(List<Comision> comisiones) {
        for (Comision comision : comisiones) {
            System.out.println(comision);
        }
    }
}
