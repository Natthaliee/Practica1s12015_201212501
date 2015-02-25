package plantsvszombies;

public class PlantsVsZombies {

    public static void main(String[] args) {
        
        Inicio irInicio = new Inicio ();
        Jugador irJugador = new Jugador();
        
        for (int i = 0; i < 7000; i++) {
            
            irInicio.setLocationRelativeTo(null);
            irInicio.setVisible(true);
        }
        
        irInicio.setVisible(false);
        irJugador.setLocationRelativeTo(null);
        irJugador.setVisible(true);
        
    }
    
}
