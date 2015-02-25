package plantsvszombies;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Samsung
 */

public class ListaZombies extends JFrame{

    public ListaZombies() {
        setSize(800,500);
        setResizable(false);
        getContentPane().setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 0, 790, 490);
        getContentPane().add(scrollPane);

        JPanel panelBorde = new JPanel();
        scrollPane.setViewportView(panelBorde);
        panelBorde.setLayout(new BorderLayout(0, 0));

        JPanel panelColumna = new JPanel();
        panelBorde.add(panelColumna, BorderLayout.NORTH);
        panelColumna.setLayout(new GridLayout(0, 1, 0, 0));
        panelColumna.setBackground(Color.gray);
        
        for (int i = 0; i < Zombie.aZNombre.size(); i++) {
            JPanel panelFilas = new JPanel();
            panelFilas.setPreferredSize(new Dimension(10, 100));
            panelColumna.add(panelFilas);
            panelFilas.setLayout(null);
            
            crearLabel(panelFilas,  new JLabel(), Zombie.aZImagen.get(i));
            crearLabel(panelFilas,new JLabel(), Zombie.aZNombre.get(i));
            crearLabel(panelFilas,new JLabel(), Zombie.aZAtaque.get(i));
            crearLabel2(panelFilas,new JLabel(), Zombie.asZAtaque.get(i));
        }
    }
    
    private void crearLabel(JPanel panelFilas, JLabel label, Icon imagen) {
        label.setBounds(50, 5, 60, 100);
        panelFilas.add(label);
        label.setIcon(imagen);
    }

    private void crearLabel(JPanel panelFilas, JLabel label, String nombre) {
        label.setBounds(250, 0, 60, 100);
        panelFilas.add(label);
        label.setText(nombre);
    }

    private void crearLabel(JPanel panelFilas, JLabel label, int ataque) {
        label.setBounds(450, 0, 60, 100);
        panelFilas.add(label);
        label.setText(String.valueOf(ataque));
    }
    
    private void crearLabel2(JPanel panelFilas, JLabel label, int sataque) {
        label.setBounds(650, 0, 60, 100);
        panelFilas.add(label);
        label.setText(String.valueOf(sataque));
    }
}