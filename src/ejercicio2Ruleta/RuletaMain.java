package ejercicio2Ruleta;

/* Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se
trata de un número de jugadores, que, con un revolver de agua, el cual posee una sola
carga de agua, se dispara y se moja. 
Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */

public class RuletaMain {

    public static void main(String[] args) {
        JuegoService juego = new JuegoService();
        
        juego.llenarJuego();
        
    }
    
}
