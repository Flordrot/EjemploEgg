package ejercicio2Ruleta;

public class Juego {

    private Jugador jugadores;

    private Revolver revolver;

    public Juego() {
    }

    public Juego(Jugador jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public Jugador getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego: \n" + "Jugadores: " + jugadores + ", revolver: " + revolver + "\n";
    }
    
}
