
package POJO;


public class Persona {
 private String nombre, apellido , edad , numero;
         
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Persona() {
    }

    public Persona(String nombre, String apellido, String edad, String numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numero = numero;
    }

  
}
