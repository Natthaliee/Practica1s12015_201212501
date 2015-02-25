package plantsvszombies;

import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Samsung
 */
public class Reporte {

    String dir = System.getProperty("user.dir");
    String fichero;
    String texto;

    public void generaTxt() {
        try {
            fichero = dir + "\\src\\doc\\texto1.txt";
            File outFile = new File(fichero);

            vaciarFichero(fichero);
            texto = "";

            BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));

            texto += "digraph g{ graph[rankdir=LR];node[fontsize = 16 shape = ellipse];edge[];node0[label=Jugadores shape = record];";

            if (JugadorPlanta.aJugadorPlanta.size() > 0) {
                texto += "node1[ label = \"Planta|" + JugadorPlanta.aJugadorPlanta.get(0) + "|" + JugadorPlanta.aJugadorPlanta.get(1) + "\"shape=record];";
                texto += "node0 -> node1;  ";
            }

            if (JugadorZombie.aJugadorZombie.size() > 0) {
                texto += "node2[label = \"Zombie|" + JugadorZombie.aJugadorZombie.get(0) + "|" + JugadorZombie.aJugadorZombie.get(1) + "\"shape=record];";
                texto += "node0 -> node2; ";
            }
            if (JugadorPlanta.aJugadorPlanta.size() >= 2) {
                texto += "node3[label = \"Otros Campos";
                for (int i = 2; i < JugadorPlanta.aJugadorPlanta.size(); i++) {
                    texto += "|" + JugadorPlanta.aJugadorPlanta.get(i);
                }
                texto += "\"shape=record];";
                texto += "node1 -> node3; ";
            }

            if (JugadorZombie.aJugadorZombie.size() >= 2) {
                texto += "node4[label = \"Otros Campos";
                for (int i = 2; i < JugadorZombie.aJugadorZombie.size(); i++) {
                    texto += "|" + JugadorZombie.aJugadorZombie.get(i);
                }
                texto += "\"shape=record];";
                texto += "node2 -> node4;";
            }

            texto += "}";

            writer.write(texto);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        }

    }

    public void generaGrafica() {
        try {
            String dotPath = "c:\\Program Files\\Graphviz2.38\\bin\\dot.exe";
            String fileInputPath = dir + "\\src\\doc\\texto1.txt";
            String fileOutputPath = dir + "\\src\\doc\\grafica1.png";
            String tParam = "-Tpng";
            String tOParam = "-o";

            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;

            Runtime rt = Runtime.getRuntime();

            rt.exec(cmd);
            
            Runtime.getRuntime().exec("cmd /c start " + dir + "\\src\\doc\\grafica1.png");
            
            //ClassLoader classLoader = Reporte.class.getClassLoader();
            //URL url= classLoader.getResource ("doc/grafica1.png");
            //ImageIcon imagen = new ImageIcon (url);
            //URL urlImagen = this.getClass().getResource("doc/grafica1.png");
            //File miDocu = new File (getClass().getResource("doc/grafica1.png").toString());
            //----Desktop.getDesktop().open(url);  
            //Runtime.getRuntime().exec("cmd /c start " + dir + "\\src\\doc\\grafica1.png");
            
            //URL urlImagen = this.getClass().getResource("doc/grafica1.png");
            //Image grafica = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("doc/grafica1.png"));
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
        }
    }

    private void vaciarFichero(String fichero) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fichero));
            bw.flush();
            bw.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
