package plantsvszombies;

import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JFrame;

/**
 *
 * @author Samsung
 */

public class Planta extends JFrame{
    private String nombre;
    private int ataque;
    private Icon imagen;
    
    static ArrayList<Icon> aImagen = new ArrayList<>();
    static ArrayList<String> aNombre = new ArrayList<>();
    static ArrayList<Integer> aAtaque = new ArrayList<>();
    
    int pos= 0 ;
    int y=0;
   
    public Planta(Icon imagen, String nombre, int ataque) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.ataque = ataque; 
        
        aImagen.add(imagen);
        aNombre.add(nombre);
        aAtaque.add(ataque);
    }
    
    @Override
    public String toString() {
        return "Planta: " + nombre + ", ataque: "+ ataque;
    }
    
    
}
