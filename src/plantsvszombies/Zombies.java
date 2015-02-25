package plantsvszombies;

import javax.swing.Icon;
import static plantsvszombies.AgregarZombie.empiezaJuego;

/**
 *
 * @author Samsung
 */
public class Zombies extends javax.swing.JFrame {

    static Icon zombieUno;
    static Icon zombieDos;
    static Icon zombieTres;
    static Icon zombieCuatro;
    static Icon zombieCinco;
    static Icon zombieSeis;

    public Zombies() {
        initComponents();

        if (empiezaJuego == 1) {
            Jugador irJugador = new Jugador();
            irJugador.setLocationRelativeTo(null);
            irJugador.setVisible(true);
            this.setVisible(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        zombie1 = new javax.swing.JLabel();
        zombie6 = new javax.swing.JLabel();
        zombie4 = new javax.swing.JLabel();
        zombie2 = new javax.swing.JLabel();
        zombie5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        zombie3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        zombie1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Zombies/1.png"))); // NOI18N
        zombie1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zombie1MouseClicked(evt);
            }
        });

        zombie6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Zombies/6.png"))); // NOI18N
        zombie6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zombie6MouseClicked(evt);
            }
        });

        zombie4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Zombies/4.png"))); // NOI18N
        zombie4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zombie4MouseClicked(evt);
            }
        });

        zombie2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Zombies/2.png"))); // NOI18N
        zombie2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zombie2MouseClicked(evt);
            }
        });

        zombie5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Zombies/5.png"))); // NOI18N
        zombie5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zombie5MouseClicked(evt);
            }
        });

        jButton1.setText("Inicio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        zombie3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Zombies/3.png"))); // NOI18N
        zombie3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zombie3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(zombie4)
                    .addComponent(zombie1))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zombie2)
                    .addComponent(zombie5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zombie3)
                    .addComponent(zombie6))
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zombie2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(zombie1)
                            .addComponent(zombie3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(zombie4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zombie5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zombie6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zombie1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zombie1MouseClicked
        zombieUno = zombie1.getIcon();
        AgregarZombie agr = new AgregarZombie();
        agr.setLocationRelativeTo(null);
        agr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_zombie1MouseClicked

    private void zombie6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zombie6MouseClicked
        zombieSeis = zombie6.getIcon();
        AgregarZombie agr = new AgregarZombie();
        agr.setLocationRelativeTo(null);
        agr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_zombie6MouseClicked

    private void zombie4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zombie4MouseClicked
        zombieCuatro = zombie4.getIcon();
        AgregarZombie agr = new AgregarZombie();
        agr.setLocationRelativeTo(null);
        agr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_zombie4MouseClicked

    private void zombie2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zombie2MouseClicked
        zombieDos = zombie2.getIcon();
        AgregarZombie agr = new AgregarZombie();
        agr.setLocationRelativeTo(null);
        agr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_zombie2MouseClicked

    private void zombie5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zombie5MouseClicked
        zombieCinco = zombie5.getIcon();
        AgregarZombie agr = new AgregarZombie();
        agr.setLocationRelativeTo(null);
        agr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_zombie5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Jugador jug = new Jugador();
        jug.setLocationRelativeTo(null);
        jug.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void zombie3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zombie3MouseClicked
        zombieTres = zombie3.getIcon();
        AgregarZombie agr = new AgregarZombie();
        agr.setLocationRelativeTo(null);
        agr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_zombie3MouseClicked

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
            java.util.logging.Logger.getLogger(Zombies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Zombies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Zombies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Zombies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Zombies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel zombie1;
    private javax.swing.JLabel zombie2;
    private javax.swing.JLabel zombie3;
    private javax.swing.JLabel zombie4;
    private javax.swing.JLabel zombie5;
    private javax.swing.JLabel zombie6;
    // End of variables declaration//GEN-END:variables
}
