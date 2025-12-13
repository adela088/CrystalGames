/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package juegos;

import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Color.pink;
import static java.awt.Color.white;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.Random;
import java.util.Stack;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.util.prefs.Preferences;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.KeyStroke;

/**
 *
 * @author andre
 */
public class rompecabezas extends javax.swing.JFrame {

    int aleatorios[] = new int[9];
    private JButton[][] grid;
    private Icon emptyIcon;
    private float hue = 0f;
    private Timer timer;
    private int segundos = 0;
    private boolean juegoIniciado = false;
    private JPanel capaAnimacion;
    private Icon[] iconos = new Icon[9];
    private boolean animando = false;
    private Timer arcoirisTimer = null;
    private Preferences prefs = Preferences.userNodeForPackage(rompecabezas.class);
    private boolean usoCompletar = false;

    private int mejorTiempo;
    private int mejorMovs;

    /**
     * Creates new form rompecabezas
     */
    public rompecabezas() {
        this.setResizable(false);
        initComponents();
        mejorTiempo = prefs.getInt("mejorTiempo", Integer.MAX_VALUE);
        mejorMovs = prefs.getInt("mejorMovs", Integer.MAX_VALUE);

        this.setLocationRelativeTo(null);
        grid = new JButton[][]{
            {uno, dos, tres},
            {cuatro, cinco, seis},
            {siete, ocho, nueve}
        };
        emptyIcon = crearIconoVacio(uno.getWidth(), uno.getHeight());

        iconos[0] = uno1;
        iconos[1] = dos2;
        iconos[2] = tres3;
        iconos[3] = cuatro4;
        iconos[4] = cinco5;
        iconos[5] = seis6;
        iconos[6] = siete7;
        iconos[7] = ocho8;
        iconos[8] = emptyIcon;

        capaAnimacion = new JPanel(null);
        capaAnimacion.setOpaque(false);

        jPanel1.add(capaAnimacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(
                jPanel2.getX(),
                jPanel2.getY(),
                jPanel2.getWidth(),
                jPanel2.getHeight()
        ));

        jPanel1.setComponentZOrder(capaAnimacion, 0);

        timer = new Timer(1000, e -> {
            segundos++;
            tiempo.setText("Tiempo: " + segundos + "s");
        });

        mov.setText("" + c);
        flechas.setVisible(false);
        setIcon();
        mezclar();
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("log.png")));
    }

    public Icon uno1 = new ImageIcon(getClass().getResource("/juegos/puzzleimg/1.png"));
    public Icon dos2 = new ImageIcon(getClass().getResource("/juegos/puzzleimg/2.png"));
    public Icon tres3 = new ImageIcon(getClass().getResource("/juegos/puzzleimg/3.png"));
    public Icon cuatro4 = new ImageIcon(getClass().getResource("/juegos/puzzleimg/4.png"));
    public Icon cinco5 = new ImageIcon(getClass().getResource("/juegos/puzzleimg/5.png"));
    public Icon seis6 = new ImageIcon(getClass().getResource("/juegos/puzzleimg/6.png"));
    public Icon siete7 = new ImageIcon(getClass().getResource("/juegos/puzzleimg/7.png"));
    public Icon ocho8 = new ImageIcon(getClass().getResource("/juegos/puzzleimg/8.png"));
    public Icon nueve9 = new ImageIcon(getClass().getResource("/juegos/puzzleimg/9.png"));
    public Icon icon = new ImageIcon(getClass().getResource("/juegos/sopaimg/cat.gif"));
    public Icon record = new ImageIcon(getClass().getResource("/juegos/sopaimg/happy_cat.gif"));

    public static int c = 0;

    public void numeros() {
        Random r = new Random();

        do {
            Stack<Integer> usados = new Stack<>();
            for (int i = 0; i < 9; i++) {
                int num;
                do {
                    num = r.nextInt(9) + 1;
                } while (usados.contains(num));
                usados.push(num);
                aleatorios[i] = num;
            }

        } while (!esSoluble(aleatorios)); // repetir si no es soluble
    }

    public boolean esSoluble(int[] arr) {
        int inv = 0;

        for (int i = 0; i < 9; i++) {
            if (arr[i] == 9) {
                continue;
            }
            for (int j = i + 1; j < 9; j++) {
                if (arr[j] == 9) {
                    continue;
                }

                if (arr[i] > arr[j]) {
                    inv++;
                }
            }
        }

        return inv % 2 == 0; // soluble si las inversiones son pares
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        completar = new javax.swing.JButton();
        reiniciar = new javax.swing.JButton();
        tiempo = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 1000), new java.awt.Dimension(0, 1000), new java.awt.Dimension(32767, 1000));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(1000, 0), new java.awt.Dimension(1000, 0), new java.awt.Dimension(1000, 32767));
        heart = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        marco1 = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
        movimientos = new javax.swing.JLabel();
        movs = new javax.swing.JLabel();
        mov = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        uno = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        nueve = new javax.swing.JButton();
        volver = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        flechas = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        RE = new javax.swing.JLabel();
        marco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(46, 44, 48));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/corgif.gif"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/yellowstars.gif"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 510, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/corgif.gif"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/yellowstars.gif"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 510, -1, -1));

        completar.setBackground(new java.awt.Color(190, 190, 252));
        completar.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        completar.setText("Completar");
        completar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        completar.setOpaque(true);
        completar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                completarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                completarMouseExited(evt);
            }
        });
        completar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completarActionPerformed(evt);
            }
        });
        jPanel1.add(completar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 140, 50));

        reiniciar.setBackground(new java.awt.Color(190, 190, 252));
        reiniciar.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        reiniciar.setText("Reiniciar");
        reiniciar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reiniciar.setOpaque(true);
        reiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reiniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reiniciarMouseExited(evt);
            }
        });
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarActionPerformed(evt);
            }
        });
        jPanel1.add(reiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 140, 50));

        tiempo.setBackground(new java.awt.Color(190, 190, 252));
        tiempo.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        tiempo.setText("Tiempo: 0s ");
        tiempo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tiempo.setOpaque(true);
        tiempo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tiempoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tiempoMouseExited(evt);
            }
        });
        tiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiempoActionPerformed(evt);
            }
        });
        jPanel1.add(tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 140, 50));
        jPanel1.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, -240, 30, 880));
        jPanel1.add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 1130, 30));

        heart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/wings.gif"))); // NOI18N
        heart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                heartMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                heartMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                heartMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                heartMousePressed(evt);
            }
        });
        jPanel1.add(heart, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, -1, -1));

        jPanel3.setBackground(new java.awt.Color(46, 44, 48));
        jPanel3.setForeground(new java.awt.Color(242, 242, 242));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        marco1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(141, 237, 230), new java.awt.Color(236, 203, 237), new java.awt.Color(204, 51, 255), new java.awt.Color(208, 229, 253)));
        jPanel3.add(marco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 200));

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/im.png"))); // NOI18N
        jPanel3.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 240, 193));

        movimientos.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        movimientos.setForeground(new java.awt.Color(51, 51, 51));
        movimientos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        movimientos.setText("Movimientos: ");
        jPanel3.add(movimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 190, 68));

        movs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/pearlwings.png"))); // NOI18N
        movs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(movs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 260, 110));

        mov.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        mov.setForeground(new java.awt.Color(255, 255, 255));
        mov.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mov.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(mov, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 260, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 260, 370));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new java.awt.GridLayout(3, 3));

        uno.setBackground(new java.awt.Color(255, 204, 255));
        uno.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        uno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/1.png"))); // NOI18N
        uno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(242, 242, 242), java.awt.Color.lightGray, new java.awt.Color(242, 242, 242), new java.awt.Color(242, 242, 242)));
        uno.setFocusCycleRoot(true);
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });
        jPanel2.add(uno);

        dos.setBackground(new java.awt.Color(255, 204, 255));
        dos.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        dos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/2.png"))); // NOI18N
        dos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(242, 242, 242), java.awt.Color.lightGray, new java.awt.Color(242, 242, 242), new java.awt.Color(242, 242, 242)));
        dos.setFocusCycleRoot(true);
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });
        jPanel2.add(dos);

        tres.setBackground(new java.awt.Color(255, 204, 255));
        tres.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        tres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/3.png"))); // NOI18N
        tres.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(242, 242, 242), java.awt.Color.lightGray, new java.awt.Color(242, 242, 242), new java.awt.Color(242, 242, 242)));
        tres.setFocusCycleRoot(true);
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });
        jPanel2.add(tres);

        cuatro.setBackground(new java.awt.Color(255, 204, 255));
        cuatro.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        cuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/4.png"))); // NOI18N
        cuatro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(242, 242, 242), java.awt.Color.lightGray, new java.awt.Color(242, 242, 242), new java.awt.Color(242, 242, 242)));
        cuatro.setFocusCycleRoot(true);
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });
        jPanel2.add(cuatro);

        cinco.setBackground(new java.awt.Color(255, 204, 255));
        cinco.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        cinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/5.png"))); // NOI18N
        cinco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(242, 242, 242), java.awt.Color.lightGray, new java.awt.Color(242, 242, 242), new java.awt.Color(242, 242, 242)));
        cinco.setFocusCycleRoot(true);
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });
        jPanel2.add(cinco);

        seis.setBackground(new java.awt.Color(255, 204, 255));
        seis.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        seis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/6.png"))); // NOI18N
        seis.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(242, 242, 242), java.awt.Color.lightGray, new java.awt.Color(242, 242, 242), new java.awt.Color(242, 242, 242)));
        seis.setFocusCycleRoot(true);
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });
        jPanel2.add(seis);

        siete.setBackground(new java.awt.Color(255, 204, 255));
        siete.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        siete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/7.png"))); // NOI18N
        siete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(242, 242, 242), java.awt.Color.lightGray, new java.awt.Color(242, 242, 242), new java.awt.Color(242, 242, 242)));
        siete.setFocusCycleRoot(true);
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });
        jPanel2.add(siete);

        ocho.setBackground(new java.awt.Color(255, 204, 255));
        ocho.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        ocho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/8.png"))); // NOI18N
        ocho.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(242, 242, 242), java.awt.Color.lightGray, new java.awt.Color(242, 242, 242), new java.awt.Color(242, 242, 242)));
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });
        jPanel2.add(ocho);

        nueve.setBackground(new java.awt.Color(255, 204, 255));
        nueve.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        nueve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/9.png"))); // NOI18N
        nueve.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(242, 242, 242), java.awt.Color.lightGray, new java.awt.Color(242, 242, 242), new java.awt.Color(242, 242, 242)));
        nueve.setFocusCycleRoot(true);
        nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveActionPerformed(evt);
            }
        });
        jPanel2.add(nueve);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 130, 460, 380));

        volver.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        volver.setForeground(new java.awt.Color(255, 255, 255));
        volver.setText("VOLVER");
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                volverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volverMouseExited(evt);
            }
        });
        jPanel1.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1038, 610, 60, -1));

        jLabel14.setFont(new java.awt.Font("SimSun", 0, 43)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("REFERENCIA");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(765, 80, 230, -1));

        flechas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        flechas.setForeground(new java.awt.Color(255, 255, 255));
        flechas.setText("<<--------");
        jPanel1.add(flechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 630, 80, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/blackjackimg/pinkyc.gif"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1018, 608, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/yellowstars.gif"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/corgif.gif"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 520, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/yellowstars.gif"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/corgif.gif"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 520, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/yellowstars.gif"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 510, -1, -1));

        jLabel15.setFont(new java.awt.Font("SimSun", 0, 45)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("ROMPECABEZAS");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 70, 290, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/yellowstars.gif"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/corgif.gif"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/yellowstars.gif"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 510, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/corgif.gif"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 520, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/yellowstars.gif"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(947, 510, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/separador.gif"))); // NOI18N
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 95, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/separador.gif"))); // NOI18N
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 95, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/pinkspark.gif"))); // NOI18N
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/dreamy_night_by_kittea_paws_ddkw4s9.gif"))); // NOI18N
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 110, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/blue_sparkles_by_gasara_d6ny98z.gif"))); // NOI18N
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 490, -1, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/blue_sparkles_by_gasara_d6ny98z.gif"))); // NOI18N
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 240, -1, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/blue_sparkles_by_gasara_d6ny98z.gif"))); // NOI18N
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 210, -1, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/blue_sparkles_by_gasara_d6ny98z.gif"))); // NOI18N
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 290, -1, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/blue_sparkles_by_gasara_d6ny98z.gif"))); // NOI18N
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 320, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/blue_sparkles_by_gasara_d6ny98z.gif"))); // NOI18N
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 360, -1, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/blue_sparkles_by_gasara_d6ny98z.gif"))); // NOI18N
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 410, -1, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/puzzleimg/blue_sparkles_by_gasara_d6ny98z.gif"))); // NOI18N
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 450, -1, -1));

        RE.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        RE.setForeground(new java.awt.Color(255, 255, 255));
        RE.setText("RÉCORD:");
        RE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                REMouseEntered(evt);
            }
        });
        jPanel1.add(RE, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, -1, -1));

        marco.setBackground(new java.awt.Color(255, 204, 255));
        marco.setFont(new java.awt.Font("SimSun", 0, 36)); // NOI18N
        marco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(141, 237, 230), new java.awt.Color(236, 203, 237), new java.awt.Color(204, 51, 255), new java.awt.Color(208, 229, 253)));
        jPanel1.add(marco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, 1100, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        moverPieza(uno);
    }//GEN-LAST:event_unoActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed

        moverPieza(dos);
    }//GEN-LAST:event_dosActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        moverPieza(tres);
    }//GEN-LAST:event_tresActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        moverPieza(cuatro);
    }//GEN-LAST:event_cuatroActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        moverPieza(cinco);
    }//GEN-LAST:event_cincoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        moverPieza(seis);
    }//GEN-LAST:event_seisActionPerformed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
        moverPieza(siete);
    }//GEN-LAST:event_sieteActionPerformed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
        moverPieza(ocho);
    }//GEN-LAST:event_ochoActionPerformed

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveActionPerformed
        moverPieza(nueve);
    }//GEN-LAST:event_nueveActionPerformed

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked

        main.Menu menu = new main.Menu();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_volverMouseClicked

    private void volverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseEntered
        flechas.setVisible(true);
        volver.setForeground(pink);
        flechas.setForeground(pink);
    }//GEN-LAST:event_volverMouseEntered

    private void volverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseExited
        flechas.setVisible(false);
        volver.setForeground(white);
        flechas.setForeground(white);
    }//GEN-LAST:event_volverMouseExited

    private void completarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completarActionPerformed
        //si se usa completar no cuenta para el récord
        usoCompletar = true;
        for (int i = 0; i < 8; i++) {
            grid[i / 3][i % 3].setIcon(
                    new ImageIcon(getClass().getResource("/juegos/puzzleimg/" + (i + 1) + ".png"))
            );
        }
        grid[2][2].setIcon(emptyIcon);

        animacionArcoirisPanel();
        mostrarVictoria();
        if (arcoirisTimer != null) {
            arcoirisTimer.stop();
        }


    }//GEN-LAST:event_completarActionPerformed

    private void tiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiempoActionPerformed

    }//GEN-LAST:event_tiempoActionPerformed

    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed
        mezclar();
        tiempo.setText("Tiempo: 0s");
    }//GEN-LAST:event_reiniciarActionPerformed

    private void reiniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reiniciarMouseEntered
        reiniciar.setBackground(new Color(153, 153, 255));
    }//GEN-LAST:event_reiniciarMouseEntered

    private void completarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completarMouseEntered
        completar.setBackground(new Color(153, 153, 255));
    }//GEN-LAST:event_completarMouseEntered

    private void reiniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reiniciarMouseExited
        reiniciar.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_reiniciarMouseExited

    private void completarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completarMouseExited
        completar.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_completarMouseExited

    private void tiempoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tiempoMouseExited
        tiempo.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_tiempoMouseExited

    private void tiempoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tiempoMouseEntered
        tiempo.setBackground(new Color(153, 153, 255));
    }//GEN-LAST:event_tiempoMouseEntered

    private void heartMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_heartMousePressed

    }//GEN-LAST:event_heartMousePressed

    private void heartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_heartMouseExited
        heart.setLocation(570, 420);
        RE.setLocation(610, 400);
    }//GEN-LAST:event_heartMouseExited

    private void heartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_heartMouseEntered
        heart.setLocation(570, 415);
        RE.setLocation(610, 395);
    }//GEN-LAST:event_heartMouseEntered

    private void heartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_heartMouseClicked
        mostrarRecord();
    }//GEN-LAST:event_heartMouseClicked

    private void REMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REMouseEntered

    }//GEN-LAST:event_REMouseEntered

    private void moverPieza(JButton btn) {

        if (animando) {
            return;
        }
        int bx = -1, by = -1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == btn) {
                    bx = i;
                    by = j;
                }
            }
        }

        int ex = -1, ey = -1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j].getIcon() == emptyIcon) {
                    ex = i;
                    ey = j;
                }
            }
        }

        if ((Math.abs(bx - ex) + Math.abs(by - ey)) == 1) {

            animando = true;

            animarMovimiento(btn, grid[ex][ey]);

            c++;
            mov.setText("" + c);

            if (!juegoIniciado) {
                juegoIniciado = true;
                timer.start();
            }
        }
    }

    private boolean estaCompleto() {
        for (int i = 0; i < 8; i++) {
            Icon actual = grid[i / 3][i % 3].getIcon();
            Icon esperado = iconos[i];

            if (actual != esperado) {
                return false;
            }
        }
        return true;
    }

    private void mostrarVictoria() {
        mostrarDialogoBonito(
                "¡Felicidades! Has completado el rompecabezas\n"
                + "Tiempo: " + segundos + " segundos\n"
                + "Movimientos: " + c,
                "Victoria",
                icon
        );

        timer.stop();

    }

    public void mostrarDialogoBonito(String mensaje, String titulo, Icon icono) {

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(new Color(245, 245, 255));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));

        final float[] hue = {0f};
        Timer bordeTimer = new Timer(40, e -> {
            hue[0] += 0.01f;
            if (hue[0] > 1) {
                hue[0] = 0;
            }

            Color rainbow = Color.getHSBColor(hue[0], 1f, 1f);
            panel.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(rainbow, 4, true),
                    BorderFactory.createEmptyBorder(20, 30, 20, 30)
            ));
            panel.repaint();
        });
        bordeTimer.start();

        JLabel texto = new JLabel(
                "<html><div style='width:260px; text-align:center;'>"
                + mensaje.replace("\n", "<br>")
                + "</div></html>",
                icono,
                JLabel.CENTER
        );
        texto.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        texto.setForeground(new Color(60, 60, 60));
        texto.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        panel.add(texto);
        panel.add(Box.createVerticalStrut(15));

        JButton ok = new JButton("OK");
        ok.setFont(new Font("Segoe UI", Font.BOLD, 13));
        ok.setPreferredSize(new Dimension(80, 36));
        ok.setMaximumSize(new Dimension(80, 36));
        ok.setFocusPainted(false);
        ok.setBackground(new Color(210, 200, 255));
        ok.setAlignmentX(JButton.CENTER_ALIGNMENT);

        ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent e) {
                ok.setBackground(new Color(225, 215, 255));
            }

            public void mouseExited(java.awt.event.MouseEvent e) {
                ok.setBackground(new Color(210, 200, 255));
            }
        });

        panel.add(ok);

        JDialog dialog = new JDialog(this, titulo, true);
        dialog.setUndecorated(true);
        dialog.setContentPane(panel);
        dialog.pack();
        dialog.setLocationRelativeTo(this);

        dialog.getRootPane()
                .getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke("ESCAPE"), "none");

        dialog.getRootPane().setDefaultButton(ok);

        ok.addActionListener(e -> {
            bordeTimer.stop();
            dialog.dispose();
        });

        dialog.setVisible(true);
    }

    private void iniciarTemporizador() {
        timer = new Timer(1000, (ActionEvent e) -> {
            segundos++;
            tiempo.setText("Tiempo: " + segundos + "s");
        });
        timer.start();
    }

    private void mezclar() {

        usoCompletar = false;

        if (arcoirisTimer != null) {
            arcoirisTimer.stop();
        }

        numeros();

        for (int i = 0; i < 9; i++) {
            int n = aleatorios[i];

            if (n == 9) {
                grid[i / 3][i % 3].setIcon(emptyIcon);
            } else {
                grid[i / 3][i % 3].setIcon(iconos[n - 1]);
            }
        }

        c = 0;
        segundos = 0;
        juegoIniciado = false;
        timer.stop();

        mov.setText("0");
    }

    private void animarMovimiento(JButton origen, JButton destino) {

        Icon iconOrigen = origen.getIcon();

        JButton copia = new JButton(iconOrigen);
        copia.setBorder(null);
        copia.setContentAreaFilled(false);

        java.awt.Point origenLocal = origen.getLocation();
        java.awt.Point destinoLocal = destino.getLocation();

        copia.setBounds(origenLocal.x, origenLocal.y, origen.getWidth(), origen.getHeight());
        capaAnimacion.add(copia);
        capaAnimacion.repaint();

        origen.setIcon(emptyIcon);

        int pasos = 40;
        int duracion = 250;
        int delay = duracion / pasos;

        int dx = destinoLocal.x - origenLocal.x;
        int dy = destinoLocal.y - origenLocal.y;

        Timer mover = new Timer(delay, null);

        final int[] step = {0};

        mover.addActionListener(e -> {

            if (step[0] >= pasos) {
                mover.stop();

                capaAnimacion.remove(copia);
                capaAnimacion.repaint();

                destino.setIcon(iconOrigen);

                animando = false;
                if (estaCompleto()) {
                    timer.stop();
                    animacionArcoirisPanel();
                    mostrarVictoria();
                    guardarRecordSiEsMejor();
                }

                return;
            }

            double t = (double) step[0] / pasos;
            double ease = 1 - Math.pow(1 - t, 3);

            copia.setLocation(
                    origenLocal.x + (int) (dx * ease),
                    origenLocal.y + (int) (dy * ease)
            );

            step[0]++;
        });

        mover.start();
    }

    private void animacionArcoirisPanel() {

        if (arcoirisTimer != null && arcoirisTimer.isRunning()) {
            arcoirisTimer.stop();
        }

        arcoirisTimer = new Timer(40, e -> {
            hue += 0.01f;
            if (hue > 1) {
                hue = 0;
            }

            Color rainbow = Color.getHSBColor(hue, 1f, 1f);

            jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(rainbow, 5));
            jPanel2.setBackground(new Color(
                    rainbow.getRed(),
                    rainbow.getGreen(),
                    rainbow.getBlue(),
                    40
            ));

            jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(rainbow, 5));
            jPanel3.setForeground(new Color(
                    rainbow.getRed(),
                    rainbow.getGreen(),
                    rainbow.getBlue(),
                    40
            ));

            jPanel2.repaint();
            jPanel3.repaint();
        });

        arcoirisTimer.start();
    }

    private void mostrarRecord() {

        // Si no hay récord aún
        if (mejorTiempo == Integer.MAX_VALUE) {
            mostrarDialogoBonito(
                    "Aún no hay récord guardado\n¡Completa el rompecabezas!",
                    "Récord",
                    icon
            );
            return;
        }

        // Mostrar récord guardado
        mostrarDialogoBonito(
                "RÉCORD ACTUAL\n\n"
                + "Tiempo: " + mejorTiempo + " segundos\n"
                + "Movimientos: " + mejorMovs,
                "Récord",
                icon
        );
    }

    private void guardarRecordSiEsMejor() {

        if (usoCompletar) {
            return;
        }

        boolean nuevoRecord = false;

        if (segundos < mejorTiempo) {
            mejorTiempo = segundos;
            mejorMovs = c;
            nuevoRecord = true;
        } else if (segundos == mejorTiempo && c < mejorMovs) {
            mejorMovs = c;
            nuevoRecord = true;
        }

        if (nuevoRecord) {
            prefs.putInt("mejorTiempo", mejorTiempo);
            prefs.putInt("mejorMovs", mejorMovs);

            JOptionPane.showMessageDialog(
                    this,
                    "¡NUEVO RÉCORD! \n\n"
                    + "Tiempo: " + mejorTiempo + " segundos\n"
                    + "Movimientos: " + mejorMovs,
                    "Nuevo récord",
                    JOptionPane.INFORMATION_MESSAGE,
                    record
            );
        }
    }

    private Icon crearIconoVacio(int w, int h) {
        java.awt.image.BufferedImage img = new java.awt.image.BufferedImage(
                w, h, java.awt.image.BufferedImage.TYPE_INT_ARGB);
        return new ImageIcon(img);
    }

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
            java.util.logging.Logger.getLogger(rompecabezas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rompecabezas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rompecabezas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rompecabezas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rompecabezas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RE;
    private javax.swing.JButton cinco;
    private javax.swing.JButton completar;
    private javax.swing.JButton cuatro;
    private javax.swing.JButton dos;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel flechas;
    private javax.swing.JLabel heart;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel marco;
    private javax.swing.JLabel marco1;
    private javax.swing.JLabel mov;
    private javax.swing.JLabel movimientos;
    private javax.swing.JLabel movs;
    private javax.swing.JButton nueve;
    private javax.swing.JButton ocho;
    private javax.swing.JButton reiniciar;
    private javax.swing.JButton seis;
    private javax.swing.JButton siete;
    private javax.swing.JButton tiempo;
    private javax.swing.JButton tres;
    private javax.swing.JButton uno;
    private javax.swing.JLabel volver;
    // End of variables declaration//GEN-END:variables
}
