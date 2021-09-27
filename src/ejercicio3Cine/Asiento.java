/*
 */
package ejercicio3Cine;

public class Asiento {

    private int num;
    private char letra;
    private boolean ocuapado;

    public Asiento() {
    }

    public Asiento(int num, char letra, boolean ocuapado) {
        this.num = num;
        this.letra = letra;
        this.ocuapado = ocuapado;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public boolean isOcuapado() {
        return ocuapado;
    }

    public void setOcuapado(boolean ocuapado) {
        this.ocuapado = ocuapado;
    }

    @Override
    public String toString() {
        return " " + num + letra + ocuapado + " ";
    }
}
