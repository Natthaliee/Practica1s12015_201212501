package plantsvszombies;

import java.awt.Dimension;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

/**
 *
 * @author Samsung
 */
public class Prueba extends JFrame{
        JFrame frmprincipal;
        JPanel panel;
        JLabel label;
        JScrollBar vertiSBar;
        int y=0;
        int x =0;
    
    public Prueba() {
        //frmprincipal = new JFrame();      
        setSize(300,300);                    
        panel = new JPanel(null);//no puede ser null
        
        JScrollPane scroll = new JScrollPane(panel);
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz(new JLabel(), "a");
                x+=50;
            }
            y+=50;
            x=0;
        }
        
        add(scroll);   
        setVisible(true);
    }
    
    public static void main(String[] args) {
            Prueba prueba = new Prueba();
    }

   /* private void crearLabel(JLabel jLabel, String a) {
        panel.add(jLabel, null);
        jLabel.setText(a);
        jLabel.setBounds(0,y,10,10);
    }*/
    
    private void matriz(JLabel label, String a) {
        panel.add(label);
        label.setText(a);
        label.setBounds(0+x, 0+y, 50, 50);
    }
}
