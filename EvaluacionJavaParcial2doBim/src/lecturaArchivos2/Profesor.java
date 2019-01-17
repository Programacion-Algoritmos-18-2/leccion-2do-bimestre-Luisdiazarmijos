/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaArchivos2;

   
public class Profesor {
    private String cedula;
    String nombres;
    private String zona;
    private String provincia;
    String canton;
    private String personalidad;
    private String razonamiento;
    private String dictamenIdoniedad;
    public Profesor(){
        
    }

    public Profesor(String cedula, String nombres, String zona, String provincia, String canton, String personalidad, String razonamiento, String dictamenIdoniedad) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.zona = zona;
        this.provincia = provincia;
        this.canton = canton;
        this.personalidad = personalidad;
        this.razonamiento = razonamiento;
        this.dictamenIdoniedad = dictamenIdoniedad;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public void setPersonalidad(String personalidad) {
        this.personalidad = personalidad;
    }

    public void setRazonamiento(String razonamiento) {
        this.razonamiento = razonamiento;
    }

    public void setDictamenIdoniedad(String dictamenIdoniedad) {
        this.dictamenIdoniedad = dictamenIdoniedad;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public String getZona() {
        return zona;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getCanton() {
        return canton;
    }

    public String getPersonalidad() {
        return personalidad;
    }

    public String getRazonamiento() {
        return razonamiento;
    }

    public String getDictamenIdoniedad() {
        return dictamenIdoniedad;
    }
    
    
    public String toString(){
        return String.format("%s - %s - %s - %s - %s - %s - %s - %s \n", getCedula(),getNombres(), getZona(), getProvincia(),getCanton(),getPersonalidad(),
                getRazonamiento(),getDictamenIdoniedad());
        
    }
}






