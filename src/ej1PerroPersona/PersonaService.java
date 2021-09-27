/*
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package ej1PerroPersona;

import java.util.Scanner;

public class PersonaService {
    Persona persona = new Persona(); 
    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PerroService pServ = new PerroService();
        Perro perro = new Perro();
        
        System.out.println("Ingrese el nombre de la persona: ");
        persona.setNombre(leer.next());
        System.out.println("Ingrese el apellido de la persona: ");
        persona.setApellido(leer.next());
        System.out.println("Ingrese la edad de la persona: ");
        persona.setEdad(leer.nextInt());
        System.out.println("Ingrese el DNI de la persona: ");
        persona.setDNI(leer.nextLong());
        System.out.println("Ingrese el Perro de la persona: ");
        persona.setPerro(pServ.crearPerro());
        
        return persona;
    }
    
    public void mostrarPersona(Persona persona) {
        System.out.println(persona.toString());
    }
}
