package plantsvszombies;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Samsung
 */
public class Reporte {

    String dir = System.getProperty("user.dir");
    String fichero, texto;
    

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

    public void generaTxt2() {
        try {
            fichero = dir + "\\src\\doc\\texto2.txt";
            File outFile = new File(fichero);

            vaciarFichero(fichero);
            texto = "";

            BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));

            texto += "digraph g{ graph[rankdir=LR];node[fontsize = 16 shape = ellipse];edge[];node0[label=Plantas shape = record];";
            if (Planta.aNombre.size() > 0 && Planta.aAtaque.size() > 0 && Planta.asAtaque.size() > 0) {
                for (int i = 0; i < Planta.aNombre.size(); i++) {
                    texto += "node" + (i + 1) + "[ label = \"Planta" + (i + 1) + "|" + Planta.aNombre.get(i) + "|" + Planta.aAtaque.get(i) + "|" + Planta.asAtaque.get(i) + "\"shape=record];";
                    texto += "node0 -> node" + (i + 1) + ";  ";
                }
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

    public void generaTxt3() {
        try {
            fichero = dir + "\\src\\doc\\texto3.txt";
            File outFile = new File(fichero);

            vaciarFichero(fichero);
            texto = "";

            BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));

            texto += "digraph g{ graph[rankdir=LR];node[fontsize = 16 shape = ellipse];edge[];node0[label=Zombies shape = record];";
            if (Zombie.aZNombre.size() > 0 && Zombie.aZAtaque.size() > 0 && Zombie.asZAtaque.size() > 0) {
                for (int i = 0; i < Zombie.aZNombre.size(); i++) {
                    texto += "node" + (i + 1) + "[ label = \"Zombie" + (i + 1) + "|" + Zombie.aZNombre.get(i) + "|" + Zombie.aZAtaque.get(i) + "|" + Zombie.asZAtaque.get(i) + "\"shape=record];";
                    texto += "node0 -> node" + (i + 1) + ";  ";
                }
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
    
     public void generaTxt4() {
        try {
            fichero = dir + "\\src\\doc\\texto4.txt";
            File outFile = new File(fichero);

            vaciarFichero(fichero);
            texto = "";
            BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));
            texto += "digraph estructura{ node[shape= record];b[label=\"{";
            
            
            for (int i = 0; i < Dimension.matriz.length; i++) {
                texto += "{" ;
                for (int j = 0; j < Dimension.matriz[i].length; j++) {
                    if (j==0) {
                        texto += Dimension.matriz[i][j];
                    } else {
                        texto += "|"+Dimension.matriz[i][j];
                    }
                }
                if (i <= Dimension.matriz.length) {
                    texto+="}";
                }else{
                    texto+="}|";
                }
                
            }
            
            texto +=  "}\"];}";
            
            writer.write(texto);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        }

    }

    public void generaGrafica(String txt, String nombre) {
        try {
            String dotPath = "c:\\Program Files\\Graphviz2.38\\bin\\dot.exe";
            String fileInputPath = dir + txt;
            String fileOutputPath = dir + nombre;
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

            Runtime.getRuntime().exec("cmd /c start " + dir + nombre);
           /* try {
                ClassLoader classLoader = Reporte.class.getClassLoader();
                URL url = classLoader.getResource("/doc/grafica1.png");
                ImageIcon imagen = new ImageIcon (url);
                File path = new File(url.getPath());
                Desktop.getDesktop().open(path);
            } catch (IOException ex) {
                System.out.println("Problema abriendo el pdf de erfc");
            }*/

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
