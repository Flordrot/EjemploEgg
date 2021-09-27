package ej1PerroPersona;

public class Persona {

    private String nombre;

    private String Apellido;

    private Integer edad;

    private Long DNI;

    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String Apellido, Integer edad, Long DNI, Perro perro) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.edad = edad;
        this.DNI = DNI;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Long getDNI() {
        return DNI;
    }

    public void setDNI(Long DNI) {
        this.DNI = DNI;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona: \n" + "Nombre: " + nombre + ", Apellido= " + Apellido + ", Edad: " + edad + ", DNI: " + DNI + ", Perro: " + perro + "\n";
    }
    
    
}
