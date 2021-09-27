/*
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no
haya más o se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese
número de cartas. En caso de que haya menos cartas que las pedidas, no
devolveremos nada, pero debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido
ninguna indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una
carta y luego se llama al método, este no mostrara esa primera carta.
 */
package ejercicio4;

public class BarajaService {

    Baraja baraja = new Baraja();
    int num;
    String palo;

    public void crearMazo() {
        Baraja[][] aux = new Baraja[12][4];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 4; j++) {
                num = (i + 1);
                switch (j) {
                    case 0:
                        palo = ("ORO");
                        break;
                    case 1:
                        palo = ("ESPADA");
                        break;
                    case 2:
                        palo = ("BASTO");
                        break;
                    case 3:
                        palo = ("COPA");
                        break;
                       // aux[i][j] = new Baraja(num, palo);
                }
            }
        }
       // baraja.setMazo(aux);
    }

    public void mostrarMazo() {

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 4; j++) {
              //  System.out.print(String.valueOf(baraja.getMazo()[i][j].getNum()) + baraja.getMazo()[i][j].getPalo());
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}
