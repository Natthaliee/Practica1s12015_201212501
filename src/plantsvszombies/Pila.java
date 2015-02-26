package plantsvszombies;

import java.util.LinkedList;
import java.util.Stack;
import javax.swing.Icon;

/**
 *
 * @author Samsung
 */
public class Pila {
    
    int pos;
    int nZombies = Zombie.aZImagen.size();
    Stack< Integer> sZombies = new Stack< Integer>();
    static Stack< Icon> pila = new Stack< Icon>();

    public Pila() {

        for (int i = 0; i < nZombies; i++) {
            pos = (int) Math.floor(Math.random() * nZombies);
            while (sZombies.contains(pos)) {
                pos = (int) Math.floor(Math.random() * nZombies);
            }
            sZombies.push(pos);
            pila.push(Zombie.aZImagen.get(pos));//agrega a cola
        }
    }
}
