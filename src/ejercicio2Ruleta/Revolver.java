package ejercicio2Ruleta;

public class Revolver {

    private int PosicionActual;

    private int PosicionAgua;

    public Revolver() {
    }

    public Revolver(int PosicionActual, int PosicionAgua) {
        this.PosicionActual = PosicionActual;
        this.PosicionAgua = PosicionAgua;
    }

    public int getPosicionActual() {
        return PosicionActual;
    }

    public void setPosicionActual(int PosicionActual) {
        this.PosicionActual = PosicionActual;
    }

    public int getPosicionAgua() {
        return PosicionAgua;
    }

    public void setPosicionAgua(int PosicionAgua) {
        this.PosicionAgua = PosicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver: \n" + "Posicion Actual del jugador: " + PosicionActual + ", Posicion del Agua: " + PosicionAgua + "\n";
    }
    
}
