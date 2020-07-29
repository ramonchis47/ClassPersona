package persona;
public class Menu {
    public static void main(String[]args){
        Persona g = new Persona(65, "Pepe");//Hacemos un nuevo objeto de persona en la clase principal
        g.correr();
        Persona h = new Persona("19846655");//otro nuevo objeto con la sobrecarga de constructores
        h.correr(12);//aqui llamamos con el nuevo objeto con la sobrecargas de metodos
    }
}