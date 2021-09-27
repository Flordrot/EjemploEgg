/*De Cine nos interesa conocer la película que se está
reproduciendo, la sala con los espectadores y el precio de la entrada. */
package ejercicio3Cine;

import java.util.Scanner;

public class CineService {

    /*Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de
asientos (8 filas por 6 columnas).*/
 /*Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos
son etiquetados por una letra y un número la fila A1 empieza al final del mapa como se
muestra en la tabla. También debemos saber si el asiento está ocupado por un
espectador o no, si esta ocupado se muestra una X, sino un espacio vacío.
8 A X | 8 B X | 8 C X | 8 D | 8 E X | 8 F X
7 A X | 7 B X | 7 C X | 7 D X | 7 E | 7 F X
6 A | 6 B X | 6 C | 6 D X | 6 E X | 6 F
5 A X | 5 B | 5 C X | 5 D X | 5 E X | 5 F X
4 A X | 4 B X | 4 C X | 4 D X | 4 E X | 4 F X
3 A | 3 B X | 3 C X | 3 D | 3 E X | 3 F X
2 A X | 2 B | 2 C X | 2 D X | 2 E X | 2 F
1 A X | 1 B X | 1 C X | 1 D X | 1 E X | 1 F X*/
    Espectador espectador = new Espectador();
    EspectadorService eService = new EspectadorService();
    Asiento asiento = new Asiento();
    Pelicula peli = new Pelicula();
    Cine cine = new Cine();
    PeliculaService pService = new PeliculaService();

    public void crearSala() {
        int num;
        char letra=' ';
        
        Asiento[][] aux = new Asiento[8][6];
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {
               num=(i + 1);
                switch (j) {
                    case 0:
                        letra=('A');
                        break;
                    case 1:
                        letra=('B');
                        break;
                    case 2:
                        letra=('C');
                        break;
                    case 3:
                        letra=('D');
                        break;
                    case 4:
                        letra=('E');
                        break;
                    case 5:
                        letra=('F');
                        break;
                }
                asiento.setOcuapado(false);
                aux[i][j] = new Asiento(num, letra, false);
            }
        }
        cine.setAsientos(aux);
        for (int i = aux.length - 1; i >= 0; i--) {
            
            for (int j = 0; j < aux[0].length; j++) {
                System.out.print(String.valueOf(aux[i][j].getNum()) + aux[i][j].getLetra() + (aux[i][j].isOcuapado() ? " X " : " - ") + "  ");
            }
            System.out.println("");
        }
        System.out.println(" ");

    }

    public void mostrarSala() {
        for (int i = cine.getAsientos().length - 1; i >= 0; i--) {
            for (int j = 0; j < cine.getAsientos()[0].length; j++) {
                System.out.print(String.valueOf(cine.getAsientos()[i][j].getNum()) + cine.getAsientos()[i][j].getLetra() + (cine.getAsientos()[i][j].isOcuapado() ? " X " : " - ") + "  ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    public void llenarSala() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        EspectadorService eService = new EspectadorService();
//        Iterator <Espectador> it = cine.getEspectadores().iterator();
//        List <Espectador> espectadoresAux = new ArrayList();
        boolean espectadorOk = false;
        int num;
        char let;
        pService.cartelera();
        String salir = "NO";
        int i = 0;

        do {
//           espectadoresAux.add(eService.crearEspectador());
            espectador = eService.crearEspectador();
            System.out.println("Edad mínima: " + pService.cartelera().getEdadMin());
            System.out.println("Precio de la entrada segun edad: " + precioEntrada(espectador));
            if (espectador.getEdad() >= pService.cartelera().getEdadMin() && espectador.getDinero() >= precioEntrada(espectador)) {
                
                System.out.println("Elija el número de asiento que desea elegir: ");
                num = leer.nextInt();
                System.out.println("Elija la letra del asiento que desea elegir: ");
                let = leer.next().charAt(0);

//                System.out.println(asiento.getNum());

                Asiento[][] aux2 = cine.getAsientos();

                for (int k = aux2.length - 1; k >= 0; k--) {
                    for (int j = 0; j < aux2[0].length; j++) {
                        if (aux2[k][j].getNum() == num && aux2[k][j].getLetra() == let && !aux2[k][j].isOcuapado()) {
                            aux2[k][j].setOcuapado(true);
                            mostrarSala();

                        }
                    }
                }

            }

            System.out.println("¿Quiere ingresar otro espectador? ");
            salir = leer.next();
            i++;
        } while (salir.equalsIgnoreCase("SI"));
    }

    public double precioEntrada(Espectador espectador) {
        System.out.println("Edad del espectador: " + espectador.getEdad());

        if (espectador.getEdad() <= 16 || espectador.getEdad() >= 60) {
            cine.setPrecio(200);
            System.out.println("El valor de la entrada para " + espectador.getNombre() + cine.getPrecio());
            return 200;
        }
//        else {
//            cine.setPrecio(400);
//            System.out.println("El valor de la entrada para " + eService.crearEspectador().getNombre() + " $400.");
//        }
        
        return 400;
    }

    /*Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y
se los ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde
ya este ocupado el asiento).
Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que
sólo se podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada,
si hay espacio libre en la sala y si tiene la edad requerida para ver la película. En caso de
que el asiento este ocupado se le debe buscar uno libre.
Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y
numero de cada asiento o solo las X y espacios vacíos.*/
    public void simulacro() {
        crearSala();

    }
}
