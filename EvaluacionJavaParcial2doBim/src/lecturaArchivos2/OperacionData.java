/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaArchivos2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author reroes
 */
public class OperacionData {

    ArrayList<Profesor> a = new ArrayList<>();

    public void agregarInformacion(ArrayList<Profesor> informacion) {
       a = informacion;
    }

    public ArrayList<Profesor> obtenerInformacion() {
        return a;
    }

    public double obtenerPromedioCapacidad() {
        double suma = 0;
        return suma;
    }
    // Ordenamiento por canton
    public void ordenarPorCanton(){
        ArrayList<Profesor> dataPorCantones = new ArrayList<>();
        dataPorCantones.addAll(a);
        Collections.sort(dataPorCantones,(d1, d2) -> d1.canton.compareTo(d2.canton));
        for (int i = 0; i < dataPorCantones.size(); i++) {
            System.out.println(dataPorCantones.get(i));
        }
    }
    
    public ArrayList<Profesor> ordenarPorNombres(){
        ArrayList<Profesor> dataPorNombres = new ArrayList<>();
        dataPorNombres.addAll(a);
        Collections.sort(dataPorNombres,(d1, d2) -> d1.nombres.compareTo(d2.nombres));
        return dataPorNombres;
        
    }
    

    public String caracteristicaP(ArrayList<Profesor> listado ) {
        int adecuador = 0;
        int porConvocar = 0;
        String cadena = "";
        for (int i = 0; i < listado.size(); i++) {
            if (listado.get(i).getPersonalidad().equals("ADECUADO")) 
                adecuador = adecuador + 1;                
            if (listado.get(i).getPersonalidad().equals("POR CONVOCAR")) 
                porConvocar = porConvocar + 1;
        
        cadena = String.format("------------------Resultados-------------------\n"
                + "Numero de participantes Adecuados: %d \n"
                +"Numero de participantes Cor convocar: %d\n", adecuador, porConvocar);
        }return cadena;
    }
    public String obtener_paticipantes(ArrayList<Profesor> listado ) {
        int idoneo = 0;
        int noIdoneo = 0;
        String cadena = "";
        for (int i = 0; i < listado.size(); i++) {
            if (listado.get(i).getDictamenIdoniedad().equals("IDONEO")) 
                idoneo = idoneo + 1;                
            if (listado.get(i).getDictamenIdoniedad().equals("NO IDONEO")) 
                noIdoneo = noIdoneo + 1;
        
        cadena = String.format("Numero de participantes Idoneo: %d \n"
                +"Numero de participantes No Idoneo: %d\n", idoneo, noIdoneo);
        }return cadena;
    }

    public void lecturaData() {
        for (int i = 0; i<obtenerInformacion().size(); i++) {
            System.out.println(obtenerInformacion().get(i));
            
        }
        
    }

}
