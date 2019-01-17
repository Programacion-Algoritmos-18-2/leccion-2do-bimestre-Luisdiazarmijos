/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaArchivos2;

/**
 *
 * @author USUARIO
 */

// Fig. 14.11: LeerArchivoTexto.java
// Este programa lee un archivo de texto y muestra cada registro.

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class LeerArchivoTexto2 {

    private Scanner entrada;

    // Es para abrir el archivo 
    public void abrirArchivo() {
        try {
            entrada = new Scanner(new File("data/data1.csv"));
        } // fin de try
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del metodo abrirArchivo

    // lee registro del archivo
    
    public ArrayList<Profesor> leerRegistros2() {

        OperacionData operacion = new OperacionData();
        ArrayList<Profesor> lista = new ArrayList<>();

        try // lee registros del archivo, usando el objeto Scanner
        {
            entrada.nextLine();
            while (entrada.hasNext()) {
                // se crea el objeto para leer Json
                //Gson g = new Gson();
                String linea = entrada.nextLine();
                ArrayList<String> registro = new ArrayList<>(Arrays.asList(linea.split(",")));
                Profesor p = new Profesor();
                p.setCedula(registro.get(0));
                p.setNombres(registro.get(1));
                p.setZona(registro.get(2));
                p.setProvincia(registro.get(3));
                p.setCanton(registro.get(4));
                p.setPersonalidad(registro.get(5));
                p.setRazonamiento(registro.get(6));
                p.setDictamenIdoniedad(registro.get(7));
                lista.add(p);
                /*
{"cedula":"1803742806","nombres":"MULLO ROMERO ESTHER DEL CARMEN", 
"zona":"ZONA 3","provincia":"TUNGURAHUA", 
"canton":"AMBATO", "personalidad": "POR CONVOCAR", 
"razonamiento":"POR CONVOCAR", 
"dictamenIdoniedad":"NO IDONEO"}
*/
                // se hace el proceso de transformaciÃ³n
                //Profesor p = g.fromJson(linea, Profesor.class);
                //lista.add(p);
                //System.out.println(p);
            } // fin de while
        } // fin de try
        
        catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
        return lista;
    } // fin del mï¿½todo leerRegistros
    // cierra el archivo y termina la aplicaciï¿½n

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close(); // cierra el archivo
        }
    } // fin del mï¿½todo cerrarArchivo
} // fin de la clase LeerArchivoTexto

/**************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 *                                                                        *
 * RENUNCIA: Los autores y el editor de este libro han realizado su mejor *
 * esfuerzo para preparar este libro. Esto incluye el desarrollo, la      *
 * investigaciï¿½n y prueba de las teorï¿½as y programas para determinar su   *
 * efectividad. Los autores y el editor no hacen ninguna garantï¿½a de      *
 * ningï¿½n tipo, expresa o implï¿½cita, en relaciï¿½n con estos programas o    *
 * con la documentaciï¿½n contenida en estos libros. Los autores y el       *
 * editor no serï¿½n responsables en ningï¿½n caso por los daï¿½os consecuentes *
 * en conexiï¿½n con, o que surjan de, el suministro, desempeï¿½o o uso de    *
 * estos programas.                                                       *
 *************************************************************************/


