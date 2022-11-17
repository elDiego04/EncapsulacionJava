public class Main {
    public static void main(String[] args) {
        Persona edad = new Persona();
        edad.setTipo(18);

        Persona nombre = new Persona();
        nombre.setTipo("Diego");

        Persona telefono = new Persona();
        telefono.setTipo(12345678);

        System.out.println(edad.getEdad());
        System.out.println(nombre.getNombre());
        System.out.println(telefono.getTelefono());
    }
}

class Persona {
    private long telefono;
    private int edad;
    private String nombre;

    public void setTipo(int edad){
        this.edad = edad;
    }
    public void setTipo(long telefono){
        this.telefono = telefono;
    }
    public void setTipo(String nombre){
        this.nombre = nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getNombre (){
        return this.nombre;
    }
    public long getTelefono(){
        return this.telefono;
    }
}