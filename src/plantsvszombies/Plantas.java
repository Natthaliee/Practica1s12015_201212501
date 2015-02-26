package plantsvszombies;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.JOptionPane;

/**
 *
 * @author Samsung
 */
public class Plantas extends javax.swing.JFrame {

    static Icon plantaUno;
    static Icon plantaDos;
    static Icon plantaTres;
    static Icon plantaCuatro;
    static Icon plantaCinco;

    public Plantas() {
        getContentPane().setBackground(Color.darkGray);
        initComponents();
        
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        planta2 = new javax.swing.JLabel();
        planta1 = new javax.swing.JLabel();
        planta3 = new javax.swing.JLabel();
        planta4 = new javax.swing.JLabel();
        planta5 = new javax.swing.JLabel();
        bZombies = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        planta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Plantas/2.png"))); // NOI18N
        planta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                planta2MouseClicked(evt);
            }
        });

        planta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Plantas/1.png"))); // NOI18N
        planta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                planta1MouseClicked(evt);
            }
        });

        planta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Plantas/3.png"))); // NOI18N
        planta3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                planta3MouseClicked(evt);
            }
        });

        planta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Plantas/4.png"))); // NOI18N
        planta4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                planta4MouseClicked(evt);
            }
        });

        planta5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Plantas/5.png"))); // NOI18N
        planta5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                planta5MouseClicked(evt);
            }
        });

        bZombies.setText("Zombies");
        bZombies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bZombiesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(planta3)
                    .addComponent(planta2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(planta4)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(planta1)
                    .addComponent(planta5))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bZombies)
                .addGap(110, 110, 110))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(planta2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(planta1)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(planta3)
                    .addComponent(planta5))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(planta4)
                .addGap(42, 42, 42)
                .addComponent(bZombies))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void planta2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_planta2MouseClicked
        plantaDos = planta2.getIcon();
        AgregarPlanta agr = new AgregarPlanta();
        agr.setLocationRelativeTo(null);
        agr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_planta2MouseClicked

    private void planta3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_planta3MouseClicked
        plantaTres = planta3.getIcon();
        AgregarPlanta agr = new AgregarPlanta();
        agr.setLocationRelativeTo(null);
        agr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_planta3MouseClicked

    private void planta4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_planta4MouseClicked
        plantaCuatro = planta4.getIcon();
        AgregarPlanta agr = new AgregarPlanta();
        agr.setLocationRelativeTo(null);
        agr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_planta4MouseClicked

    private void planta5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_planta5MouseClicked
        plantaCinco = planta5.getIcon();
        AgregarPlanta agr = new AgregarPlanta();
        agr.setLocationRelativeTo(null);
        agr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_planta5MouseClicked

    private void planta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_planta1MouseClicked
        plantaUno = planta1.getIcon();
        AgregarPlanta agr = new AgregarPlanta();
        agr.setLocationRelativeTo(null);
        agr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_planta1MouseClicked

    private void bZombiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bZombiesActionPerformed
        if (AgregarPlanta.empiezaJuegoPlantas == 1) {
            Zombies irZombies = new Zombies();
            irZombies.setLocationRelativeTo(null);
            irZombies.setVisible(true);
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Agregar todas las plantas");
        }
    }//GEN-LAST:event_bZombiesActionPerformed

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
            java.util.logging.Logger.getLogger(Plantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Plantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Plantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Plantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Plantas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bZombies;
    private javax.swing.JLabel planta1;
    private javax.swing.JLabel planta2;
    private javax.swing.JLabel planta3;
    private javax.swing.JLabel planta4;
    private javax.swing.JLabel planta5;
    // End of variables declaration//GEN-END:variables
}
