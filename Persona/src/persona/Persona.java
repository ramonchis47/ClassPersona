package persona;//Demostracion de sobrecargas de metodos y constructores
public class Persona{
    int edad;
    String nombre;
    String dni;

    public Persona(int edad, String nombre) { //Sobrecargas de constructores
        this.edad = edad;
        this.nombre = nombre;
    }
    public Persona(String dni){//Sobrecarga de constructores se puede hacer siempre que los argumentos se han distintos
        this.dni = dni;
    }
    public void correr(){//Metodo de lo que puede hacer una persona 
        System.out.println("Me llamo: "+ nombre + " Tengo: " + edad + " años, y estoy corriendo por el bus");
    }
    public void correr(int km){//Metodo sobrecargado cambiando su argumento
        System.out.println("He corrido: " + km + " Kilometos");
    }
}

