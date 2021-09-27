/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número
entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta
clase debe contener un método toString() que retorne el número de carta y el palo. La
baraja estará compuesta por un conjunto de cartas, 40 exactamente.
*/
package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Baraja {
    private int num;
    private String palo;
    private List <String> mazo = new ArrayList();

    public Baraja() {
    }

    public Baraja(int num, String palo) {
        this.num = num;
        this.palo = palo;
    }

    public Baraja(int num, String palo, List<String> mazo) {
        this.num = num;
        this.palo = palo;
        this.mazo = mazo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public List<String> getMazo() {
        return mazo;
    }

    public void setMazo(List<String> mazo) {
        this.mazo = mazo;
    }

    @Override
    public String toString() {
        return "Baraja: " + num + " " + palo + ", mazo=" + mazo;
    }
    
}
