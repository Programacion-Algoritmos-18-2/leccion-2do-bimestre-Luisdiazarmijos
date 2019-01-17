package lecturaArchivos2;

// Fig. 14.12: PruebaLeerArchivoTexto.java
import java.util.ArrayList;

public class PruebaLeerArchivoTexto {

    public static void main(String args[]) {
        LeerArchivoTexto aplicacion = new LeerArchivoTexto();
        LeerArchivoTexto2 aplicacion2 = new LeerArchivoTexto2();
        CrearArchivoTexto a = new CrearArchivoTexto();
        OperacionData operacion = new OperacionData();
         
        aplicacion.abrirArchivo();
        aplicacion2.abrirArchivo();
        a.abrirArchivo();
        ArrayList<Profesor> lista = aplicacion.leerRegistros();
        ArrayList<Profesor> lista_2 = aplicacion2.leerRegistros2();
        for (int i = 0; i < lista_2.size(); i++) {
            lista.add(lista_2.get(i));
        }

        operacion.agregarInformacion(lista);
        a.agregarRegistros(lista);
        // operacion.lecturaData();

        operacion.ordenarPorCanton();
        ArrayList<Profesor> lista2 = operacion.ordenarPorNombres();
        System.out.println(lista2);operacion.caracteristicaP(lista);
        System.out.println(operacion.caracteristicaP(lista));
        operacion.obtener_paticipantes(lista);

        System.out.println(operacion.obtener_paticipantes(lista));
        // System.out.println("-------");
        // operacion.lecturaData();
        aplicacion.cerrarArchivo();
        aplicacion2.cerrarArchivo();
        a.cerrarArchivo();

    } // fin de main
} // fin de la clase PruebaLeerArchivoTexto

