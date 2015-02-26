package plantsvszombies;

import java.util.ArrayList;

/**
 *
 * @author Samsung
 */

public class Lista <T>{
    private Nodo inicio;
    //public static ArrayList<Planta> aPlanta = new ArrayList<>();

    public Lista() {
        inicio = null;
    }

    public Lista(T objeto) {
        inicio = new Nodo(objeto);
    }

    public void agregar(T objeto){
        Nodo elemento = new Nodo(objeto);
        
        if (inicio==null) {
            this.inicio = elemento;
        } else {
            Nodo aux;
            for (aux=inicio; aux.obtenerSig()!=null; aux=aux.obtenerSig()) {
                aux.agregarSig(elemento);
            }
        }
    }
    
    public void imprimir(){
        for(Nodo aux = inicio; aux!=null; aux = aux.obtenerSig()){
            //aPlanta.add((Planta) aux.obtenerObjeto());
            
            /*Iterator<Planta> it = aPlanta.iterator();
                while (it.hasNext()) {
                    System.out.println("jeje"+it.next());
                }*/
            System.out.println(aux.obtenerObjeto().toString());    
        }
    }
    
}
