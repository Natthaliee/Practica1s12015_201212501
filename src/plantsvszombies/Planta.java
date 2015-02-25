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
    private String sAtaque;
    private Icon imagen;
    
    static ArrayList<Icon> aImagen = new ArrayList<>();
    static ArrayList<String> aNombre = new ArrayList<>();
    static ArrayList<Integer> aAtaque = new ArrayList<>();
    static ArrayList<String> asAtaque = new ArrayList<>();
    
    int pos= 0 ;
    int y=0;
   
    public Planta(Icon imagen, String nombre, int ataque, String sAtaque) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.ataque = ataque; 
        this.sAtaque = sAtaque; 
        
        aImagen.add(imagen);
        aNombre.add(nombre);
        aAtaque.add(ataque);
        asAtaque.add(sAtaque);
    }
    
    @Override
    public String toString() {
        return "Planta: " + nombre + ", puntos: "+ ataque+", ataque: "+sAtaque;
    }
    
    
}
