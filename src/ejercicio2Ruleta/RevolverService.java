package ejercicio2Ruleta;

/*Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual
(posición del tambor que se dispara, puede que esté el agua o no) y posición agua (la
posición del tambor donde se encuentra el agua). Estas dos posiciones, se generarán
aleatoriamente. */

public class RevolverService {
    Revolver revolver = new Revolver(); 
    
    /* • llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
valores deben ser aleatorios.*/ 
    public void llenarRevolver() {
    revolver.setPosicionActual((int) (Math.random()*6));
    revolver.setPosicionAgua((int) (Math.random()*6));
    }
    
/*• mojar(): devuelve true si la posición del agua coincide con la posición actual*/
    public boolean mojar() {
        boolean mojado=false;
        
        if (revolver.getPosicionActual()==revolver.getPosicionAgua()) {
            mojado=true;
        }
        return mojado;
    }
/*• siguienteChorro(): cambia a la siguiente posición del tambor*/
    public void siguienteChorro() {
       
        revolver.setPosicionActual((revolver.getPosicionActual()+1)%6);
        
//        if (revolver.getPosicionActual()== 5) {
//            revolver.setPosicionActual(0);
//        } else {
//            revolver.setPosicionActual(revolver.getPosicionActual()+1);
//        }
    }

    /*• toString(): muestra información del revolver (posición actual y donde está el agua)*/
    public void mostrarRevolver() {
        System.out.println(revolver.toString());
    }
    
   }
