package plantsvszombies;

import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JFrame;

/**
 *
 * @author Samsung
 */
public class Zombie extends JFrame{
    private String nombre;
    private int ataque;
    private Icon imagen;
    
    static ArrayList<Icon> aZImagen = new ArrayList<>();
    static ArrayList<String> aZNombre = new ArrayList<>();
    static ArrayList<Integer> aZAtaque = new ArrayList<>();
    
    int pos= 0 ;
    int y=0;
   
    public Zombie(Icon imagen, String nombre, int ataque) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.ataque = ataque; 
        
        aZImagen.add(imagen);
        aZNombre.add(nombre);
        aZAtaque.add(ataque);
    }
    
    @Override
    public String toString() {
        return "Planta: " + nombre + ", ataque: "+ ataque;
    }
    
    
}
