package ejercicio3Cine;

public class PeliculaService {
    public Pelicula cartelera(){
       
        Pelicula peli1 = new Pelicula();
//        Pelicula peli2 = new Pelicula();
//        Pelicula peli3 = new Pelicula();
        
        peli1.setTitulo("Titanic");
        peli1.setDirector("James Cameron");
        peli1.setDuracion(3.5);
        peli1.setEdadMin(12);
        
        /*peli2.setTitulo("Jurassic Park");
        peli2.setDirector("Joe Johnston, Colin Trevorrow, Juan Antonio Bayona, Steven Spielberg");
        peli2.setDuracion(2.08);
        peli2.setEdadMin(13);
        
        peli3.setTitulo("Liberen a Willy");
        peli3.setDirector("Simon Wincer");
        peli3.setDuracion(1.52);
        peli3.setEdadMin(0);*/
        
        return peli1;
        }
}
