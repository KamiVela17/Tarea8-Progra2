/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kamivela.tarea8;

import Controlador.Controlador;
import Modelo.Comision;
import java.util.Scanner;

/**
 *
 * @author KamiVela
 */
public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Controlador controller = new Controlador();
        Comision comision = null;
        int id;
        String nombre = null;
        double enero = 0.0;
        double febrero = 0.0;

        double marzo = 0.0;

        double promedio = 0.0;

        double total = 0.0;
        boolean salir = false;
        String opcion = "";

        while (!salir) {
            try {
                System.out.println("Elige opcion:\n"
                        + "1.- Insertar comision\n"
                        + "2.- Listar comisiones\n"
                        + "3.- Actualizar comisiones\n"
                        + "4.- Borrar comisiones\n"
                        + "0.- Salir");

                opcion = scanner.nextLine();

                switch (opcion) {
                    case "1":

                        System.out.println("Ingrese datos de la comision:");

                        System.out.println("Ingrese nombre: ");
                        nombre = scanner.nextLine();
                        System.out.println("Ingrese informacion de enero");
                        enero = scanner.nextDouble();
                        System.out.println("Ingrese informacion de febrero");
                        febrero = scanner.nextDouble();
                        System.out.println("Ingrese informacion de marzo");
                        marzo = scanner.nextDouble();

                        comision = new Comision(nombre, enero, febrero, marzo);

                        controller.registrar(comision);

                        break;
                    case "2":

                        comision = new Comision();

                        controller.verComisiones();

                        break;
                    case "3":
                        comision = new Comision();

                        System.out.println("Ingrese datos de la comision que desea actualizar:");
                        System.out.println("Ingrese nombre: ");
                        nombre = scanner.nextLine();
                        System.out.println("Ingrese identificador");
                        id = scanner.nextInt();
                        System.out.println("Ingrese informacion de enero");
                        enero = scanner.nextDouble();
                        System.out.println("Ingrese informacion de febrero");
                        febrero = scanner.nextDouble();
                        System.out.println("Ingrese informacion de marzo");
                        marzo = scanner.nextDouble();

                        comision.setId(id);
                        comision.setNombre(nombre);
                        comision.setEnero(enero);
                        comision.setFebrero(febrero);
                        comision.setMarzo(marzo);
                        comision.setPromedio((enero + febrero + marzo) / 3);
                        comision.setTotal(enero + febrero + marzo);
                        controller.actualizar(comision);
                        break;
                    case "4":
                        comision = new Comision();
                        System.out.println("Ingrese el identificador de la comision que desea eliminar:");
                        id = scanner.nextInt();
                        comision.setId(id);
                        controller.eliminar(comision);
                        break;
                    case "0":
                        System.out.println("!Hasta pronto!");
                        break;
                    default:
                        System.out.println("Opcion no reconocida");
                        break;
                }
                System.out.println("\n");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
