package plantsvszombies;

import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JOptionPane;

public class Jugador extends javax.swing.JFrame {

    public Jugador() {
        getContentPane().setBackground(Color.darkGray);
        initComponents();

        if (JugadorPlanta.contJugadorPlanta == 1) {
            lZombie.setEnabled(true);
        } else {
            lZombie.setEnabled(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jJuego = new javax.swing.JLabel();
        lPlanta = new javax.swing.JLabel();
        lZombie = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmSalir = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmZombies = new javax.swing.JMenuItem();
        jmPlantas = new javax.swing.JMenuItem();
        Reportes = new javax.swing.JMenu();
        jmUsuarios = new javax.swing.JMenuItem();
        jmRPlantas = new javax.swing.JMenuItem();
        jmRZombies = new javax.swing.JMenuItem();
        jmRTablero = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmManual_usuario = new javax.swing.JMenuItem();
        jmManual_tecnico = new javax.swing.JMenuItem();
        jmAcerca_de = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));

        jJuego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/otros/logo.png"))); // NOI18N
        jJuego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jJuegoMouseClicked(evt);
            }
        });

        lPlanta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Plantas/2.png"))); // NOI18N
        lPlanta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lPlantaMouseClicked(evt);
            }
        });

        lZombie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Zombies/1.png"))); // NOI18N
        lZombie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lZombieMouseClicked(evt);
            }
        });

        jMenu1.setText("Juego");

        jmSalir.setText("Salir");
        jMenu1.add(jmSalir);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Editar");

        jmZombies.setText("Zombies");
        jmZombies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmZombiesActionPerformed(evt);
            }
        });
        jMenu4.add(jmZombies);

        jmPlantas.setText("Plantas");
        jmPlantas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPlantasActionPerformed(evt);
            }
        });
        jMenu4.add(jmPlantas);

        jMenuBar1.add(jMenu4);

        Reportes.setText("Reportes");

        jmUsuarios.setText("Jugadores");
        jmUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmUsuariosActionPerformed(evt);
            }
        });
        Reportes.add(jmUsuarios);

        jmRPlantas.setText("Plantas");
        jmRPlantas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRPlantasActionPerformed(evt);
            }
        });
        Reportes.add(jmRPlantas);

        jmRZombies.setText("Zombies");
        jmRZombies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRZombiesActionPerformed(evt);
            }
        });
        Reportes.add(jmRZombies);

        jmRTablero.setText("Tablero");
        jmRTablero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRTableroActionPerformed(evt);
            }
        });
        Reportes.add(jmRTablero);

        jMenuBar1.add(Reportes);

        jMenu2.setText("Ayuda");

        jmManual_usuario.setText("Manual Usuario");
        jmManual_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmManual_usuarioActionPerformed(evt);
            }
        });
        jMenu2.add(jmManual_usuario);

        jmManual_tecnico.setText("Manual Técnico");
        jmManual_tecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmManual_tecnicoActionPerformed(evt);
            }
        });
        jMenu2.add(jmManual_tecnico);

        jmAcerca_de.setText("Acerca de");
        jmAcerca_de.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAcerca_deActionPerformed(evt);
            }
        });
        jMenu2.add(jmAcerca_de);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lPlanta)
                .addGap(29, 29, 29)
                .addComponent(jJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(lZombie)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lZombie)
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jJuego))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(lPlanta)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jJuegoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jJuegoMouseClicked
        if ((AgregarZombie.empiezaJuego == 1) && (AgregarPlanta.empiezaJuegoPlantas == 1)) {
            Juego irJuego = new Juego();
            irJuego.setLocationRelativeTo(null);
            irJuego.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Agregue las plantas y zombies");
        }

    }//GEN-LAST:event_jJuegoMouseClicked

    private void lPlantaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lPlantaMouseClicked
        JugadorPlanta pla = new JugadorPlanta();
        pla.setLocationRelativeTo(null);
        pla.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lPlantaMouseClicked

    private void lZombieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lZombieMouseClicked
        JugadorZombie irJugadorZombie = new JugadorZombie();
        irJugadorZombie.setLocationRelativeTo(null);
        irJugadorZombie.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lZombieMouseClicked

    private void jmManual_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmManual_usuarioActionPerformed
        /*String archivoManual = "src/doc/ManualUsuario.pdf";

         try {
         Runtime.getRuntime().exec("cmd /c start " + archivoManual);
         } catch (IOException e) {
         System.out.println(e);
         }*/
        
         /*try {
            File path = new File(getClass().getResource("/doc/ManualUsuario.pdf").getFile());
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
            System.out.println("Problema abriendo el pdf de erfc");
        }*/

        try {
            File directorio = new File("temp");
            directorio.mkdirs();
            directorio.setWritable(true);
            String dirArchivo = directorio.getCanonicalPath() + File.pathSeparator + "ManualUsuario.pdf";
            File temp = new File(dirArchivo);
            InputStream is = this.getClass().getResourceAsStream("/doc/ManualUsuario.pdf");
            FileOutputStream archivoDestino = new FileOutputStream(temp);
            FileWriter fw = new FileWriter(temp);
            byte[] buffer = new byte[512 * 1024];
            int nbLectura;
            while ((nbLectura = is.read(buffer)) != -1) {
                archivoDestino.write(buffer, 0, nbLectura);
            }
            fw.close();
            archivoDestino.close();
            is.close();
            Desktop.getDesktop().open(temp);
        } catch (IOException ex) {
            System.out.println("Error al abrir .pdf");
        }
    }//GEN-LAST:event_jmManual_usuarioActionPerformed

    private void jmAcerca_deActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAcerca_deActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Natthaliee María Molina Cruz\n" + "Carnet: 201212501");
    }//GEN-LAST:event_jmAcerca_deActionPerformed

    private void jmManual_tecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmManual_tecnicoActionPerformed
        /*String archivoManual = "src/doc/ManualTecnico.pdf";

         try {
         Runtime.getRuntime().exec("cmd /c start " + archivoManual);
         } catch (IOException e) {
         System.out.println(e);
         }*/

        try {
            File directorio = new File("temp");
            directorio.mkdirs();
            directorio.setWritable(true);
            String dirArchivo = directorio.getCanonicalPath() + File.pathSeparator + "ManualTecnico.pdf";
            File temp = new File(dirArchivo);
            InputStream is = this.getClass().getResourceAsStream("/doc/ManualTecnico.pdf");
            FileOutputStream archivoDestino = new FileOutputStream(temp);
            FileWriter fw = new FileWriter(temp);
            byte[] buffer = new byte[512 * 1024];
            int nbLectura;
            while ((nbLectura = is.read(buffer)) != -1) {
                archivoDestino.write(buffer, 0, nbLectura);
            }
            fw.close();
            archivoDestino.close();
            is.close();
            Desktop.getDesktop().open(temp);
        } catch (IOException ex) {
            System.out.println("Problema abriendo el pdf de erfc");
        }

    }//GEN-LAST:event_jmManual_tecnicoActionPerformed

    private void jmUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmUsuariosActionPerformed
        Reporte irReporte = new Reporte();
        irReporte.generaTxt();
        irReporte.generaGrafica("\\src\\doc\\texto1.txt","\\src\\doc\\grafica1.png");
    }//GEN-LAST:event_jmUsuariosActionPerformed

    private void jmPlantasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPlantasActionPerformed
        ListaPlantas irListaPlantas = new ListaPlantas();
        irListaPlantas.setLocationRelativeTo(null);
        irListaPlantas.setVisible(true);
    }//GEN-LAST:event_jmPlantasActionPerformed

    private void jmZombiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmZombiesActionPerformed
        ListaZombies irListaZombies = new ListaZombies();
        irListaZombies.setLocationRelativeTo(null);
        irListaZombies.setVisible(true);
    }//GEN-LAST:event_jmZombiesActionPerformed

    private void jmRPlantasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRPlantasActionPerformed
        Reporte irReporte = new Reporte();
        irReporte.generaTxt2();
        irReporte.generaGrafica("\\src\\doc\\texto2.txt","\\src\\doc\\grafica2.png");
    }//GEN-LAST:event_jmRPlantasActionPerformed

    private void jmRZombiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRZombiesActionPerformed
        Reporte irReporte = new Reporte();
        irReporte.generaTxt3();
        irReporte.generaGrafica("\\src\\doc\\texto3.txt","\\src\\doc\\grafica3.png");
    }//GEN-LAST:event_jmRZombiesActionPerformed

    private void jmRTableroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRTableroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmRTableroActionPerformed

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
            java.util.logging.Logger.getLogger(Jugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jugador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Reportes;
    private javax.swing.JLabel jJuego;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmAcerca_de;
    private javax.swing.JMenuItem jmManual_tecnico;
    private javax.swing.JMenuItem jmManual_usuario;
    private javax.swing.JMenuItem jmPlantas;
    private javax.swing.JMenuItem jmRPlantas;
    private javax.swing.JMenuItem jmRTablero;
    private javax.swing.JMenuItem jmRZombies;
    private javax.swing.JMenuItem jmSalir;
    private javax.swing.JMenuItem jmUsuarios;
    private javax.swing.JMenuItem jmZombies;
    private javax.swing.JLabel lPlanta;
    private javax.swing.JLabel lZombie;
    // End of variables declaration//GEN-END:variables
}
