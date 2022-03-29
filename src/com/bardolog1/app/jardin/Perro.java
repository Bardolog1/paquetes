package com.bardolog1.app.jardin;

import com.bardolog1.app.hogar.Persona;

class Perro {   // perro no puede entrar a la casa
    protected String nombre;
    protected String raza;


    String jugar(Persona persona){

       return persona.lanzarPelota();
    }


}
