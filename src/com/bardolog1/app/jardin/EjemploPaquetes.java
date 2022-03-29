package com.bardolog1.app.jardin;

import com.bardolog1.app.hogar.*; // con el * podemos importar todos los objetos del paquete o clase
import static com.bardolog1.app.hogar.Persona.saludar; // importar clase estatica, para las estaticas siempre se debe importar
import static com.bardolog1.app.hogar.Persona.GENERO_MASCULINO; // importamos una constante de otra clase
import static  com.bardolog1.app.hogar.colorPelo.*;
public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Gato gato = new Gato();
        Perro perro = new Perro();

        persona.setNombre("Andres");
        persona.setColorp(CASTANIO);
        gato.nombreo="Michi";
        perro.raza="Bulldog";  //puedo acceder al atributo default porque es del mismo paquete


        System.out.println(persona.getNombre());
        System.out.println(gato.nombreo);

        String jugando = perro.jugar(persona);
        System.out.println(jugando);
        String saludo = saludar();
        String generoP =GENERO_MASCULINO;
    }
}
