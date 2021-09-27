package ejercicio2Ruleta;

/*Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de
Jugadores) y Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
jugadores y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JuegoService {

   RevolverService rService = new RevolverService();
    List<Jugador> jugadores = new ArrayList();

    public void llenarJuego() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int cantJugadores, jugador = 0;
        String rta;

        System.out.println("¿Desea ingresar la cantidad de jugadores? ");
        rta = leer.next();
        if (rta.equalsIgnoreCase("SI")) {
            System.out.println("Ingrese la cantidad de jugadores: ");
            cantJugadores = leer.nextInt();
        } else {
            cantJugadores = 6;
        }

        while (cantJugadores != 0) {
            Jugador j = new Jugador();
            jugador += 1;
            System.out.println("Ingrese el nombre del jugador Nº " + jugador);
            j.setNombre(leer.next());
            System.out.println("ID del jugador Nº " + j.getID());

            cantJugadores -= 1;
            jugadores.add(j);
        }

        rService.llenarRevolver();
        ronda();

    }

    /*• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.*/
    public void ronda() {
        //System.out.println("Jugador: " + jugadores.getNombre() + "\nMojado: " + rService.mojar());
        boolean bandera = false;
       
        for (Jugador jugador : jugadores) {
            rService.mostrarRevolver();
            if (rService.mojar() == true) {
                System.out.println("El jugador " + jugador.getNombre() + " ha sido mojado.");
                bandera=true;
                break;
            } else {
                System.out.println("El jugador " + jugador.getNombre() + " no se mojó.");
            }
            rService.siguienteChorro();
        }
        if (bandera==false) {
            ronda();
        }
       }
}
