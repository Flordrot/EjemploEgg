/*De Cine nos interesa conocer la película que se está
reproduciendo, la sala con los espectadores y el precio de la entrada. */

package ejercicio3Cine;

import java.util.ArrayList;

public class Cine {
    private String pelicula;
    private Asiento[][] asientos= new Asiento[8][6];
    private double precio;

    public Asiento[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }
    private ArrayList <Espectador> espectadores = new ArrayList();

    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(ArrayList<Espectador> espectadores) {
        this.espectadores = espectadores;
    }
    
    public Cine() {
    }

    public Cine(String pelicula, double precio) {
        this.pelicula = pelicula;
        this.precio = precio;
    }

    public Cine(String pelicula, Asiento[][] asientos, double precio) {
        this.pelicula = pelicula;
        this.asientos = asientos;
        this.precio = precio;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cine: \n" + "Película: " + pelicula  + "\nPrecio de entrada:" + precio;
    }
    
}
