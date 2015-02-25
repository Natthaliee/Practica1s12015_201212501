package plantsvszombies;

/**
 *
 * @author Samsung
 */
public class Nodo<T> {
    private T objeto;
    private Nodo sigNodo;

    public Nodo(T objeto) {
        this.objeto = objeto;
        this.sigNodo = null;
    }
    
    public void agregarSig(Nodo n){
        this.sigNodo = n;
    }    
    public Nodo obtenerSig(){
        return this.sigNodo;
    }
    public T obtenerObjeto(){
        return objeto;
    }    
    
}
