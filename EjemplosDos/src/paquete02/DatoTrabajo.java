/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class DatoTrabajo {

    public static String obtenerEmpresa() {
        Scanner entrada = new Scanner(System.in);
        String empresa;

        System.out.println("Ingrese el nombre de la empresa");
        empresa = entrada.nextLine();
        return empresa;

    }

    public static String obtenerDireccion() {
        Scanner entrada = new Scanner(System.in);
        String direccion;
        System.out.println("Ingrese la direccion de la empresa");
        direccion = entrada.nextLine();
        return direccion;
    }
}

