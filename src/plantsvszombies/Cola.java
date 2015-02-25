package plantsvszombies;

import java.util.LinkedList;
import java.util.Stack;
import javax.swing.Icon;

/**
 *
 * @author Samsung
 */
public class Cola {

    int pos;
    int nPlantas = Planta.aImagen.size();
    Icon imagen = Planta.aImagen.get(0);
    Stack< Integer> sPlantas = new Stack< Integer>();
    static LinkedList<Icon> cola = new LinkedList();

    public Cola() {

        for (int i = 0; i < nPlantas; i++) {
            pos = (int) Math.floor(Math.random() * nPlantas);
            while (sPlantas.contains(pos)) {
                pos = (int) Math.floor(Math.random() * nPlantas);
            }
            sPlantas.push(pos);
            cola.offer(Planta.aImagen.get(pos));//agrega a cola
        }
       /* while(cola.peek() != null){
            System.out.println(cola.poll());
        }*/
        
        //System.out.println(sPlantas.toString());
    }
    
    
}

