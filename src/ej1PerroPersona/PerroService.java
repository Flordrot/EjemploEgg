/*
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package ej1PerroPersona;

import java.util.Scanner;

public class PerroService {
    Perro perro = new Perro(); 
    public Perro crearPerro() {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el nombre del perro: ");
        perro.setNombre(leer.next());
        System.out.println("Ingrese la raza del perro: ");
        perro.setRaza(leer.next());
        System.out.println("Ingrese la edad del perro: ");
        perro.setEdad(leer.nextInt());
        System.out.println("Ingrese el tamaño del perro: ");
        perro.setTamanio(leer.next());
        
        return perro;
    }
    
    public void mostrarPerro() {
        System.out.println(perro.toString());
    }
}
