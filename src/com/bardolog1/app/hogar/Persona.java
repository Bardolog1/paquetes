package com.bardolog1.app.hogar;

public class Persona {
    private String nombre;
    private String apellido;
    private colorPelo colorp;

    public static final String GENERO_MASCULINO="Masculino";
    public static final String GENERO_FEMENINO="Femenino";


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public colorPelo getColorp() {
        return colorp;
    }

    public void setColorp(colorPelo colorp) {
        this.colorp = colorp;
    }

    public String lanzarPelota(){
        return "lanzar pelota al perro";
    }
    public static String saludar(){

        return "Hola, que hace?";
    }

}
