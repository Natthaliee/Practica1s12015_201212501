package plantsvszombies;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Samsung
 */
public class Juego extends javax.swing.JFrame {

    JPanel pPlantas;
    JPanel pZombies;
    JPanel pTablero;
    int y = 0;
    int x = 0;
    static int personaje;
    
    public Juego() {
       
        getContentPane().setBackground(Color.darkGray);
        initComponents();
        pPlantas = new JPanel();
        pZombies = new JPanel();
        pTablero = new JPanel(null);

        JScrollPane jspPlantas = new JScrollPane(pPlantas);
        jspPlantas.setBounds(20, 10, 600, 80);

        JScrollPane jspZombies = new JScrollPane(pZombies);
        jspZombies.setBounds(20, 430, 600, 80);

        JScrollPane jspTablero = new JScrollPane(pTablero);
        jspTablero.setBounds(20, 100, 600, 300);

        Cola cola = new Cola();
        Pila pila = new Pila();

        for (int i = 0; i < Planta.aNombre.size(); i++) {
            while (Cola.cola.peek() != null) {
                agregaPlantas(new JLabel(), Cola.cola.poll());
                //lPlanta.setIcon(Cola.cola.poll());
            }
        }

        for (int i = 0; i < Zombie.aZNombre.size(); i++) {
            while (Pila.pila.empty() == false) {
                agregaZombies(new JLabel(), Pila.pila.pop());
                //lZombie.setIcon(Pila.pila.pop());
            }
        }

        Icon grama = lGrama.getIcon();

        for (int i = 0; i < plantsvszombies.Dimension.varN; i++) {
            for (int j = 0; j < plantsvszombies.Dimension.varM; j++) {
                matriz(new JLabel(), grama);
                x += 50;
            }
            y += 50;
            x = 0;
        }

        add(jspPlantas);
        add(jspZombies);
        add(jspTablero);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lGrama = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lGrama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/otros/grama.png"))); // NOI18N
        lGrama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lGramaMouseClicked(evt);
            }
        });

        jLabel1.setText("P");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setText("Z");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lGrama, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(598, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lGrama, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Posicion irPosicion = new Posicion();
        irPosicion.setLocationRelativeTo(null);
        irPosicion.setVisible(true);
        personaje = 1;
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Posicion irPosicion = new Posicion();
        irPosicion.setLocationRelativeTo(null);
        irPosicion.setVisible(true);
        personaje = 2;
    }//GEN-LAST:event_jLabel2MouseClicked

    private void lGramaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lGramaMouseClicked
        Jugador irJugador = new Jugador();
        irJugador.setLocationRelativeTo(null);
        irJugador.setVisible(true);
    }//GEN-LAST:event_lGramaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lGrama;
    // End of variables declaration//GEN-END:variables

    private void agregaPlantas(JLabel label, Icon imagen) {
        pPlantas.add(label);
        label.setIcon(imagen);
    }

    private void agregaZombies(JLabel label, Icon imagen) {
        pZombies.add(label);
        label.setIcon(imagen);
    }

    private void matriz(JLabel label, Icon grama) {
        label.setBounds(0 + x, 0 + y, 50, 50);
        pTablero.add(label);
        label.setIcon(grama);
    }

}
