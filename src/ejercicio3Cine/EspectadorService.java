package ejercicio3Cine;

import java.util.Scanner;

public class EspectadorService {
   
    public Espectador crearEspectador(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Espectador espectador = new Espectador();
        
        
        System.out.println("Ingrese el nombre del espectador: ");
        espectador.setNombre(leer.next());
        System.out.println("Ingrese la edad de " + espectador.getNombre());
        espectador.setEdad(leer.nextInt());
        System.out.println("Ingrese la cantidad de dinero disponible que posee " + espectador.getNombre());
        espectador.setDinero(leer.nextDouble());

        return espectador;
    }
}
