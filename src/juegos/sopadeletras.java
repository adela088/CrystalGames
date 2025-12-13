/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package juegos;

import java.awt.Color;
import java.awt.Color.*;
import static java.awt.Color.blue;
import static java.awt.Color.pink;
import static java.awt.Color.red;
import static java.awt.Color.white;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.Timer;

/**
 *
 * @author andre
 */
public class sopadeletras extends javax.swing.JFrame {

    private final Color colorNormal = new Color(225, 225, 225);
    private final Color colorSeleccionado = new Color(255, 192, 203);
    private final Color colorEncontrado = new Color(160, 255, 160);

    private Timer timer;
    private int segundos = 0;
    private Timer arcoirisTimer = null;
    private float hue = 0f;

    private final int MAX_LONGITUD_PALABRA = 8;

    private JButton[] botones;

    private ArrayList<Integer> seleccionActual = new ArrayList<>();
    private ArrayList<String> palabrasEncontradas = new ArrayList<>();
    private boolean[] casillaEncontrada = new boolean[100];
    private Palabra[] listaPalabras;

    class Palabra {

        String texto;
        int[] posiciones;
        JLabel etiqueta;

        Palabra(String txt, JLabel lbl) {
            texto = txt;
            etiqueta = lbl;
            posiciones = new int[txt.length()];
        }
    }

    private void iniciarTemporizador() {
        timer = new Timer(1000, (ActionEvent e) -> {
            segundos++;
            lblTiempo.setText("Tiempo: " + segundos + "s");
        });
        timer.start();
    }

    /**
     * Creates new form sopadeletras
     */
    public sopadeletras() {
        this.setResizable(false);
        initComponents();
        setIcon();
        setLocationRelativeTo(null);

        m.setVisible(false);
        j.setVisible(false);
        ma.setVisible(false);
        ve.setVisible(false);
        t.setVisible(false);
        n.setVisible(false);

        inicializarBotones();

        listaPalabras = new Palabra[]{
            new Palabra("MERCURIO", mercuriolbl),
            new Palabra("JUPITER", jupiterlbl),
            new Palabra("MARTE", martelbl),
            new Palabra("VENUS", venuslbl),
            new Palabra("TIERRA", tierralbl),
            new Palabra("NEPTUNO", neptunolbl)
        };

        generarTablero();
        iniciarTemporizador();

        for (JButton b : botones) {
            aplicarColor(b);
        }

    }

    private void inicializarBotones() {
        botones = new JButton[]{
            jButton1, jButton2, jButton3, jButton4, jButton5,
            jButton6, jButton7, jButton8, jButton9, jButton10,
            jButton11, jButton12, jButton13, jButton14, jButton15,
            jButton16, jButton17, jButton18, jButton19, jButton20,
            jButton21, jButton22, jButton23, jButton24, jButton25,
            jButton26, jButton27, jButton28, jButton29, jButton30,
            jButton31, jButton32, jButton33, jButton34, jButton35,
            jButton36, jButton37, jButton38, jButton39, jButton40,
            jButton41, jButton42, jButton43, jButton44, jButton45,
            jButton46, jButton47, jButton48, jButton49, jButton50,
            jButton51, jButton52, jButton53, jButton54, jButton55,
            jButton56, jButton57, jButton58, jButton59, jButton60,
            jButton61, jButton62, jButton63, jButton64, jButton65,
            jButton66, jButton67, jButton68, jButton69, jButton70,
            jButton71, jButton72, jButton73, jButton74, jButton75,
            jButton76, jButton77, jButton78, jButton79, jButton80,
            jButton81, jButton82, jButton83, jButton84, jButton85,
            jButton86, jButton87, jButton88, jButton89, jButton90,
            jButton91, jButton92, jButton93, jButton94, jButton95,
            jButton96, jButton97, jButton98, jButton99, jButton100
        };

        for (int i = 0; i < botones.length; i++) {
            final int idx = i;
            botones[i].addActionListener(e -> seleccionarBoton(idx));
        }
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("log.png")));
    }

    public int c = 1;
    public Icon icon = new ImageIcon(getClass().getResource("sopaimg\\cat.gif"));
    public Icon win = new ImageIcon(getClass().getResource("sopaimg\\happy_cat.gif"));

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jButton67 = new javax.swing.JButton();
        jButton68 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jButton70 = new javax.swing.JButton();
        jButton71 = new javax.swing.JButton();
        jButton72 = new javax.swing.JButton();
        jButton73 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jButton76 = new javax.swing.JButton();
        jButton77 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jButton79 = new javax.swing.JButton();
        jButton80 = new javax.swing.JButton();
        jButton81 = new javax.swing.JButton();
        jButton82 = new javax.swing.JButton();
        jButton83 = new javax.swing.JButton();
        jButton84 = new javax.swing.JButton();
        jButton85 = new javax.swing.JButton();
        jButton86 = new javax.swing.JButton();
        jButton87 = new javax.swing.JButton();
        jButton88 = new javax.swing.JButton();
        jButton89 = new javax.swing.JButton();
        jButton90 = new javax.swing.JButton();
        jButton91 = new javax.swing.JButton();
        jButton92 = new javax.swing.JButton();
        jButton93 = new javax.swing.JButton();
        jButton94 = new javax.swing.JButton();
        jButton95 = new javax.swing.JButton();
        jButton96 = new javax.swing.JButton();
        jButton97 = new javax.swing.JButton();
        jButton98 = new javax.swing.JButton();
        jButton99 = new javax.swing.JButton();
        jButton100 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JButton();
        pista1 = new javax.swing.JButton();
        completar = new javax.swing.JButton();
        reiniciar = new javax.swing.JButton();
        neptunolbl = new javax.swing.JLabel();
        palabras1 = new javax.swing.JLabel();
        mercuriolbl = new javax.swing.JLabel();
        jupiterlbl = new javax.swing.JLabel();
        martelbl = new javax.swing.JLabel();
        venuslbl = new javax.swing.JLabel();
        tierralbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        n = new javax.swing.JLabel();
        m = new javax.swing.JLabel();
        j = new javax.swing.JLabel();
        ma = new javax.swing.JLabel();
        ve = new javax.swing.JLabel();
        t = new javax.swing.JLabel();
        volver = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        flechas = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        marco = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sopa de Letras");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(46, 44, 48));
        jPanel1.setMinimumSize(new java.awt.Dimension(1130, 690));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new java.awt.GridLayout(10, 10));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton1);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton2);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton3);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton4);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton5);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton6);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton7);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);

        jButton8.setBackground(new java.awt.Color(204, 204, 204));
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton8);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);

        jButton9.setBackground(new java.awt.Color(204, 204, 204));
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton9);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9);

        jButton10.setBackground(new java.awt.Color(204, 204, 204));
        jButton10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton10);
        jButton10.setPreferredSize(new java.awt.Dimension(75, 23));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10);

        jButton11.setBackground(new java.awt.Color(204, 204, 204));
        jButton11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton11);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11);

        jButton12.setBackground(new java.awt.Color(204, 204, 204));
        jButton12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton12);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12);

        jButton13.setBackground(new java.awt.Color(204, 204, 204));
        jButton13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton13);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton13);

        jButton14.setBackground(new java.awt.Color(204, 204, 204));
        jButton14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton14);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton14);

        jButton15.setBackground(new java.awt.Color(204, 204, 204));
        jButton15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton15);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton15);

        jButton16.setBackground(new java.awt.Color(204, 204, 204));
        jButton16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton16);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton16);

        jButton17.setBackground(new java.awt.Color(204, 204, 204));
        jButton17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton17);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton17);

        jButton18.setBackground(new java.awt.Color(204, 204, 204));
        jButton18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton18);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton18);

        jButton19.setBackground(new java.awt.Color(204, 204, 204));
        jButton19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton19);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton19);

        jButton20.setBackground(new java.awt.Color(204, 204, 204));
        jButton20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton20);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton20);

        jButton21.setBackground(new java.awt.Color(204, 204, 204));
        jButton21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton21);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton21);

        jButton22.setBackground(new java.awt.Color(204, 204, 204));
        jButton22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton22);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton22);

        jButton23.setBackground(new java.awt.Color(204, 204, 204));
        jButton23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton23);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton23);

        jButton24.setBackground(new java.awt.Color(204, 204, 204));
        jButton24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton24);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton24);

        jButton25.setBackground(new java.awt.Color(204, 204, 204));
        jButton25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton25);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton25);

        jButton26.setBackground(new java.awt.Color(204, 204, 204));
        jButton26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton26);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton26);

        jButton27.setBackground(new java.awt.Color(204, 204, 204));
        jButton27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton27);
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton27);

        jButton28.setBackground(new java.awt.Color(204, 204, 204));
        jButton28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton28);
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton28);

        jButton29.setBackground(new java.awt.Color(204, 204, 204));
        jButton29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton29);
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton29);

        jButton30.setBackground(new java.awt.Color(204, 204, 204));
        jButton30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton30);
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton30);

        jButton31.setBackground(new java.awt.Color(204, 204, 204));
        jButton31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton31);
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton31);

        jButton32.setBackground(new java.awt.Color(204, 204, 204));
        jButton32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton32);
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton32);

        jButton33.setBackground(new java.awt.Color(204, 204, 204));
        jButton33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton33);
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton33);

        jButton34.setBackground(new java.awt.Color(204, 204, 204));
        jButton34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton34);
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton34);

        jButton35.setBackground(new java.awt.Color(204, 204, 204));
        jButton35.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton35);
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton35);

        jButton36.setBackground(new java.awt.Color(204, 204, 204));
        jButton36.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton36);
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton36);

        jButton37.setBackground(new java.awt.Color(204, 204, 204));
        jButton37.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton37);
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton37);

        jButton38.setBackground(new java.awt.Color(204, 204, 204));
        jButton38.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton38);
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton38);

        jButton39.setBackground(new java.awt.Color(204, 204, 204));
        jButton39.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton39);
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton39);

        jButton40.setBackground(new java.awt.Color(204, 204, 204));
        jButton40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton40);
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton40);

        jButton41.setBackground(new java.awt.Color(204, 204, 204));
        jButton41.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton41);
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton41);

        jButton42.setBackground(new java.awt.Color(204, 204, 204));
        jButton42.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton42);
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton42);

        jButton43.setBackground(new java.awt.Color(204, 204, 204));
        jButton43.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton43);
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton43);

        jButton44.setBackground(new java.awt.Color(204, 204, 204));
        jButton44.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton44);
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton44);

        jButton45.setBackground(new java.awt.Color(204, 204, 204));
        jButton45.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton45);
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton45);

        jButton46.setBackground(new java.awt.Color(204, 204, 204));
        jButton46.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton46);
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton46);

        jButton47.setBackground(new java.awt.Color(204, 204, 204));
        jButton47.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton47);
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton47);

        jButton48.setBackground(new java.awt.Color(204, 204, 204));
        jButton48.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton48);
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton48);

        jButton49.setBackground(new java.awt.Color(204, 204, 204));
        jButton49.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton49);
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton49);

        jButton50.setBackground(new java.awt.Color(204, 204, 204));
        jButton50.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton50);
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton50);

        jButton51.setBackground(new java.awt.Color(204, 204, 204));
        jButton51.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton51);
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton51);

        jButton52.setBackground(new java.awt.Color(204, 204, 204));
        jButton52.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton52);
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton52);

        jButton53.setBackground(new java.awt.Color(204, 204, 204));
        jButton53.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton53);
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton53);

        jButton54.setBackground(new java.awt.Color(204, 204, 204));
        jButton54.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton54);
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton54);

        jButton55.setBackground(new java.awt.Color(204, 204, 204));
        jButton55.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton55);
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton55);

        jButton56.setBackground(new java.awt.Color(204, 204, 204));
        jButton56.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton56);
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton56);

        jButton57.setBackground(new java.awt.Color(204, 204, 204));
        jButton57.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton57);
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton57);

        jButton58.setBackground(new java.awt.Color(204, 204, 204));
        jButton58.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton58);
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton58);

        jButton59.setBackground(new java.awt.Color(204, 204, 204));
        jButton59.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton59);
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton59);

        jButton60.setBackground(new java.awt.Color(204, 204, 204));
        jButton60.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton60);
        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton60);

        jButton61.setBackground(new java.awt.Color(204, 204, 204));
        jButton61.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton61);
        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton61ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton61);

        jButton62.setBackground(new java.awt.Color(204, 204, 204));
        jButton62.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton62);
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton62);

        jButton63.setBackground(new java.awt.Color(204, 204, 204));
        jButton63.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton63);
        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton63ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton63);

        jButton64.setBackground(new java.awt.Color(204, 204, 204));
        jButton64.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton64);
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton64);

        jButton65.setBackground(new java.awt.Color(204, 204, 204));
        jButton65.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton65);
        jButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton65ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton65);

        jButton66.setBackground(new java.awt.Color(204, 204, 204));
        jButton66.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton66);
        jButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton66ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton66);

        jButton67.setBackground(new java.awt.Color(204, 204, 204));
        jButton67.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton67);
        jButton67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton67ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton67);

        jButton68.setBackground(new java.awt.Color(204, 204, 204));
        jButton68.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton68);
        jButton68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton68ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton68);

        jButton69.setBackground(new java.awt.Color(204, 204, 204));
        jButton69.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton69);
        jButton69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton69ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton69);

        jButton70.setBackground(new java.awt.Color(204, 204, 204));
        jButton70.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton70);
        jButton70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton70ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton70);

        jButton71.setBackground(new java.awt.Color(204, 204, 204));
        jButton71.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton71);
        jButton71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton71ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton71);

        jButton72.setBackground(new java.awt.Color(204, 204, 204));
        jButton72.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton72);
        jButton72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton72ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton72);

        jButton73.setBackground(new java.awt.Color(204, 204, 204));
        jButton73.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton73);
        jButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton73ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton73);

        jButton74.setBackground(new java.awt.Color(204, 204, 204));
        jButton74.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton74);
        jButton74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton74ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton74);

        jButton75.setBackground(new java.awt.Color(204, 204, 204));
        jButton75.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton75);
        jButton75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton75ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton75);

        jButton76.setBackground(new java.awt.Color(204, 204, 204));
        jButton76.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton76);
        jButton76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton76ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton76);

        jButton77.setBackground(new java.awt.Color(204, 204, 204));
        jButton77.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton77);
        jButton77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton77ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton77);

        jButton78.setBackground(new java.awt.Color(204, 204, 204));
        jButton78.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton78);
        jButton78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton78ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton78);

        jButton79.setBackground(new java.awt.Color(204, 204, 204));
        jButton79.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton79);
        jButton79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton79ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton79);

        jButton80.setBackground(new java.awt.Color(204, 204, 204));
        jButton80.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton80);
        jButton80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton80ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton80);

        jButton81.setBackground(new java.awt.Color(204, 204, 204));
        jButton81.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton81);
        jButton81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton81ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton81);

        jButton82.setBackground(new java.awt.Color(204, 204, 204));
        jButton82.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton82);
        jButton82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton82ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton82);

        jButton83.setBackground(new java.awt.Color(204, 204, 204));
        jButton83.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton83);
        jButton83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton83ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton83);

        jButton84.setBackground(new java.awt.Color(204, 204, 204));
        jButton84.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton84);
        jButton84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton84ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton84);

        jButton85.setBackground(new java.awt.Color(204, 204, 204));
        jButton85.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton85);
        jButton85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton85ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton85);

        jButton86.setBackground(new java.awt.Color(204, 204, 204));
        jButton86.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton86);
        jButton86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton86ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton86);

        jButton87.setBackground(new java.awt.Color(204, 204, 204));
        jButton87.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton87);
        jButton87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton87ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton87);

        jButton88.setBackground(new java.awt.Color(204, 204, 204));
        jButton88.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton88);
        jButton88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton88ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton88);

        jButton89.setBackground(new java.awt.Color(204, 204, 204));
        jButton89.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton89);
        jButton89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton89ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton89);

        jButton90.setBackground(new java.awt.Color(204, 204, 204));
        jButton90.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton90);
        jButton90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton90ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton90);

        jButton91.setBackground(new java.awt.Color(204, 204, 204));
        jButton91.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton91);
        jButton91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton91ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton91);

        jButton92.setBackground(new java.awt.Color(204, 204, 204));
        jButton92.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton92);
        jButton92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton92ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton92);

        jButton93.setBackground(new java.awt.Color(204, 204, 204));
        jButton93.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton93);
        jButton93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton93ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton93);

        jButton94.setBackground(new java.awt.Color(204, 204, 204));
        jButton94.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton94);
        jButton94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton94ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton94);

        jButton95.setBackground(new java.awt.Color(204, 204, 204));
        jButton95.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton95);
        jButton95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton95ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton95);

        jButton96.setBackground(new java.awt.Color(204, 204, 204));
        jButton96.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton96);
        jButton96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton96ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton96);

        jButton97.setBackground(new java.awt.Color(204, 204, 204));
        jButton97.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton97);
        jButton97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton97ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton97);

        jButton98.setBackground(new java.awt.Color(204, 204, 204));
        jButton98.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton98);
        jButton98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton98ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton98);

        jButton99.setBackground(new java.awt.Color(204, 204, 204));
        jButton99.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton99);
        jButton99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton99ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton99);

        jButton100.setBackground(new java.awt.Color(204, 204, 204));
        jButton100.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton100);
        jButton100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton100ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton100);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 550, 450));

        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, 180, 330));

        lblTiempo.setBackground(new java.awt.Color(204, 204, 255));
        lblTiempo.setText("Tiempo:");
        lblTiempo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblTiempo.setOpaque(true);
        lblTiempo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTiempoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTiempoMouseExited(evt);
            }
        });
        lblTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblTiempoActionPerformed(evt);
            }
        });
        jPanel1.add(lblTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 520, 180, 40));

        pista1.setBackground(new java.awt.Color(204, 204, 255));
        pista1.setText("Pista");
        pista1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pista1.setOpaque(true);
        pista1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pista1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pista1MouseExited(evt);
            }
        });
        pista1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pista1ActionPerformed(evt);
            }
        });
        jPanel1.add(pista1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, 180, 40));

        completar.setBackground(new java.awt.Color(204, 204, 255));
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
        jPanel1.add(completar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 580, 120, 40));

        reiniciar.setBackground(new java.awt.Color(204, 204, 255));
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
        jPanel1.add(reiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 120, 40));

        neptunolbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        neptunolbl.setForeground(new java.awt.Color(255, 255, 255));
        neptunolbl.setText("NEPTUNO");
        jPanel1.add(neptunolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 380, -1, -1));

        palabras1.setFont(new java.awt.Font("Segoe UI Historic", 0, 25)); // NOI18N
        palabras1.setForeground(new java.awt.Color(255, 255, 255));
        palabras1.setText("PALABRAS");
        jPanel1.add(palabras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, 170, -1));

        mercuriolbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        mercuriolbl.setForeground(new java.awt.Color(255, 255, 255));
        mercuriolbl.setText("MERCURIO");
        jPanel1.add(mercuriolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 120, -1, -1));

        jupiterlbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jupiterlbl.setForeground(new java.awt.Color(255, 255, 255));
        jupiterlbl.setText("JUPITER");
        jPanel1.add(jupiterlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, -1, -1));

        martelbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        martelbl.setForeground(new java.awt.Color(255, 255, 255));
        martelbl.setText("MARTE");
        jPanel1.add(martelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, -1, -1));

        venuslbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        venuslbl.setForeground(new java.awt.Color(255, 255, 255));
        venuslbl.setText("VENUS");
        jPanel1.add(venuslbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 280, -1, -1));

        tierralbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tierralbl.setForeground(new java.awt.Color(255, 255, 255));
        tierralbl.setText("TIERRA");
        jPanel1.add(tierralbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 330, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SOPA DE LETRAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        n.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        n.setForeground(new java.awt.Color(255, 255, 255));
        n.setText("X");
        jPanel1.add(n, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 380, -1, -1));

        m.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        m.setForeground(new java.awt.Color(255, 255, 255));
        m.setText("X");
        jPanel1.add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 120, 20, -1));

        j.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        j.setForeground(new java.awt.Color(255, 255, 255));
        j.setText("X");
        jPanel1.add(j, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 170, -1, -1));

        ma.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ma.setForeground(new java.awt.Color(255, 255, 255));
        ma.setText("X");
        jPanel1.add(ma, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, -1, -1));

        ve.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ve.setForeground(new java.awt.Color(255, 255, 255));
        ve.setText("X");
        jPanel1.add(ve, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, -1, -1));

        t.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        t.setForeground(new java.awt.Color(255, 255, 255));
        t.setText("X");
        jPanel1.add(t, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 330, -1, -1));

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
        jPanel1.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1038, 610, 60, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/blackjackimg/pinkyc.gif"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 605, -1, -1));

        flechas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        flechas.setForeground(new java.awt.Color(255, 255, 255));
        flechas.setText("<<--------");
        jPanel1.add(flechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1012, 630, 80, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/sopaimg/planet.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 100, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/sopaimg/clouds (2).gif"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, -1, -1));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/sopaimg/cookiecat.gif"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/sopaimg/her.gif"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 60, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/sopaimg/clouds (2).gif"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 360, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/sopaimg/her.gif"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/sopaimg/her.gif"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 550, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/sopaimg/her.gif"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 550, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/sopaimg/her.gif"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 550, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/sopaimg/her.gif"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/sopaimg/her.gif"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/sopaimg/her.gif"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/sopaimg/pixelb.gif"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 90, 60));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/sopaimg/pinkspark.gif"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 55, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/sopaimg/fleetingstar.gif"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 55, -1, -1));

        marco.setBackground(new java.awt.Color(255, 204, 255));
        marco.setFont(new java.awt.Font("SimSun", 0, 36)); // NOI18N
        marco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        marco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                marcoMouseEntered(evt);
            }
        });
        jPanel1.add(marco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, 1100, 660));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/sopaimg/cookiecat.gif"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegos/sopaimg/pixelb.gif"))); // NOI18N
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 530, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed
    }//GEN-LAST:event_jButton62ActionPerformed

    private void jButton86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton86ActionPerformed
    }//GEN-LAST:event_jButton86ActionPerformed

    private void jButton98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton98ActionPerformed
    }//GEN-LAST:event_jButton98ActionPerformed

    private void jButton97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton97ActionPerformed
    }//GEN-LAST:event_jButton97ActionPerformed

    private void jButton96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton96ActionPerformed

    }//GEN-LAST:event_jButton96ActionPerformed

    private void jButton94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton94ActionPerformed

    }//GEN-LAST:event_jButton94ActionPerformed

    private void jButton95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton95ActionPerformed

    }//GEN-LAST:event_jButton95ActionPerformed

    private void jButton93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton93ActionPerformed

    }//GEN-LAST:event_jButton93ActionPerformed

    private void jButton92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton92ActionPerformed

    }//GEN-LAST:event_jButton92ActionPerformed

    private void jButton91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton91ActionPerformed

    }//GEN-LAST:event_jButton91ActionPerformed

    private void jButton90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton90ActionPerformed

    }//GEN-LAST:event_jButton90ActionPerformed

    private void jButton89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton89ActionPerformed

    }//GEN-LAST:event_jButton89ActionPerformed

    private void jButton81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton81ActionPerformed

    }//GEN-LAST:event_jButton81ActionPerformed

    private void jButton82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton82ActionPerformed

    }//GEN-LAST:event_jButton82ActionPerformed

    private void jButton83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton83ActionPerformed

    }//GEN-LAST:event_jButton83ActionPerformed

    private void jButton84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton84ActionPerformed

    }//GEN-LAST:event_jButton84ActionPerformed

    private void jButton85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton85ActionPerformed

    }//GEN-LAST:event_jButton85ActionPerformed

    private void jButton87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton87ActionPerformed

    }//GEN-LAST:event_jButton87ActionPerformed

    private void jButton88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton88ActionPerformed

    }//GEN-LAST:event_jButton88ActionPerformed

    private void jButton80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton80ActionPerformed

    }//GEN-LAST:event_jButton80ActionPerformed

    private void jButton79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton79ActionPerformed

    }//GEN-LAST:event_jButton79ActionPerformed

    private void jButton78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton78ActionPerformed

    }//GEN-LAST:event_jButton78ActionPerformed

    private void jButton77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton77ActionPerformed

    }//GEN-LAST:event_jButton77ActionPerformed

    private void jButton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton76ActionPerformed

    }//GEN-LAST:event_jButton76ActionPerformed

    private void jButton75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton75ActionPerformed

    }//GEN-LAST:event_jButton75ActionPerformed

    private void jButton74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton74ActionPerformed

    }//GEN-LAST:event_jButton74ActionPerformed

    private void jButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton73ActionPerformed

    }//GEN-LAST:event_jButton73ActionPerformed

    private void jButton72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton72ActionPerformed

    }//GEN-LAST:event_jButton72ActionPerformed

    private void jButton71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton71ActionPerformed

    }//GEN-LAST:event_jButton71ActionPerformed

    private void jButton70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton70ActionPerformed

    }//GEN-LAST:event_jButton70ActionPerformed

    private void jButton69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton69ActionPerformed

    }//GEN-LAST:event_jButton69ActionPerformed

    private void jButton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton68ActionPerformed

    }//GEN-LAST:event_jButton68ActionPerformed

    private void jButton67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton67ActionPerformed

    }//GEN-LAST:event_jButton67ActionPerformed

    private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton66ActionPerformed

    }//GEN-LAST:event_jButton66ActionPerformed

    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed

    }//GEN-LAST:event_jButton65ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed

    }//GEN-LAST:event_jButton64ActionPerformed

    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton63ActionPerformed

    }//GEN-LAST:event_jButton63ActionPerformed

    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton61ActionPerformed

    }//GEN-LAST:event_jButton61ActionPerformed

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed

    }//GEN-LAST:event_jButton56ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed

    }//GEN-LAST:event_jButton57ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed

    }//GEN-LAST:event_jButton58ActionPerformed

    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton60ActionPerformed

    }//GEN-LAST:event_jButton60ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed

    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed

    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed

    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed

    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed

    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed

    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed

    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed

    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed

    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed

    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed

    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed

    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed

    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed

    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed

    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed

    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed

    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed

    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed

    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed

    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed

    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed

    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed

    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed

    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed

    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed

    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed

    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed

    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed

    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed

    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed

    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed

    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed

    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed

    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed

    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

    }//GEN-LAST:event_jButton10ActionPerformed

    private void lblTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblTiempoActionPerformed

    }//GEN-LAST:event_lblTiempoActionPerformed

    private void completarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completarActionPerformed
        for (Palabra p : listaPalabras) {
            if (!palabrasEncontradas.contains(p.texto)) {
                palabrasEncontradas.add(p.texto);
                colorearPalabra(p);
            }
        }
    }//GEN-LAST:event_completarActionPerformed


    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed
        reiniciarJuego();
    }//GEN-LAST:event_reiniciarActionPerformed

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
    }//GEN-LAST:event_volverMouseExited

    private void jButton99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton99ActionPerformed

    }//GEN-LAST:event_jButton99ActionPerformed

    private void jButton100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton100ActionPerformed

    }//GEN-LAST:event_jButton100ActionPerformed

    private void pista1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pista1ActionPerformed
        for (Palabra p : listaPalabras) {
            if (!palabrasEncontradas.contains(p.texto) && p.posiciones.length > 0) {
                botones[p.posiciones[0]].setBackground(Color.YELLOW);
                break;
            }
        }
    }//GEN-LAST:event_pista1ActionPerformed

    private void reiniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reiniciarMouseEntered
        reiniciar.setBackground(new Color(153, 153, 255));
    }//GEN-LAST:event_reiniciarMouseEntered

    private void reiniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reiniciarMouseExited
        reiniciar.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_reiniciarMouseExited

    private void completarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completarMouseEntered
        completar.setBackground(new Color(153, 153, 255));
    }//GEN-LAST:event_completarMouseEntered

    private void marcoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marcoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_marcoMouseEntered

    private void pista1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pista1MouseEntered
        pista1.setBackground(new Color(153, 153, 255));
    }//GEN-LAST:event_pista1MouseEntered

    private void lblTiempoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTiempoMouseEntered
        lblTiempo.setBackground(new Color(153, 153, 255));
    }//GEN-LAST:event_lblTiempoMouseEntered

    private void completarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completarMouseExited
        completar.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_completarMouseExited

    private void pista1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pista1MouseExited
        pista1.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_pista1MouseExited

    private void lblTiempoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTiempoMouseExited
        lblTiempo.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_lblTiempoMouseExited

    private void generarTablero() {
        seleccionActual.clear();
        palabrasEncontradas.clear();

        for (Palabra p : listaPalabras) {
            p.etiqueta.setForeground(Color.WHITE);
        }

        m.setVisible(false);
        j.setVisible(false);
        ma.setVisible(false);
        ve.setVisible(false);
        t.setVisible(false);
        n.setVisible(false);

        for (int i = 0; i < botones.length; i++) {
            botones[i].setText("");
            botones[i].setBackground(colorNormal);
            botones[i].setEnabled(true);
        }

        for (Palabra p : listaPalabras) {
            colocarPalabraAleatoria(p);
        }

        Random r = new Random();
        for (int i = 0; i < botones.length; i++) {
            if (botones[i].getText().isEmpty()) {
                botones[i].setText(String.valueOf((char) ('A' + r.nextInt(26))));
            }
        }
    }

    private void reiniciarJuego() {
        segundos = 0;
        lblTiempo.setText("Tiempo: 0s");
        timer.restart();
        generarTablero();
    }

    private void colocarPalabraAleatoria(Palabra p) {

        Random rnd = new Random();
        boolean colocada = false;

        while (!colocada) {

            int fila = rnd.nextInt(10);
            int col = rnd.nextInt(10);

            int orientacion = rnd.nextInt(4);

            int dFila = 0, dCol = 0;

            switch (orientacion) {
                case 0 ->
                    dCol = 1;
                case 1 ->
                    dCol = -1;
                case 2 ->
                    dFila = 1;
                case 3 ->
                    dFila = -1;
            }

            int f = fila;
            int c = col;
            boolean valido = true;

            for (int i = 0; i < p.texto.length(); i++) {
                if (f < 0 || f > 9 || c < 0 || c > 9) {
                    valido = false;
                    break;
                }

                int index = f * 10 + c;
                String letraActual = botones[index].getText();

                if (!letraActual.isEmpty()
                        && letraActual.charAt(0) != p.texto.charAt(i)) {
                    valido = false;
                    break;
                }

                f += dFila;
                c += dCol;
            }

            if (!valido) {
                continue;
            }

            f = fila;
            c = col;
            p.posiciones = new int[p.texto.length()];

            for (int i = 0; i < p.texto.length(); i++) {
                int index = f * 10 + c;
                botones[index].setText(String.valueOf(p.texto.charAt(i)));
                p.posiciones[i] = index;

                f += dFila;
                c += dCol;
            }

            colocada = true;
        }
    }

    private boolean puedeColocar(Palabra p, int fila, int col, int dir) {

        int len = p.texto.length();

        if (dir == 0) {
            if (col + len > 10) {
                return false;
            }

            for (int i = 0; i < len; i++) {
                int index = fila * 10 + (col + i) + 1;
                String letra = botones[index].getText();

                if (!letra.equals("") && letra.charAt(0) != p.texto.charAt(i)) {
                    return false;
                }
            }

        } else {
            if (fila + len > 10) {
                return false;
            }

            for (int i = 0; i < len; i++) {
                int index = (fila + i) * 10 + col + 1;
                String letra = botones[index].getText();

                if (!letra.equals("") && letra.charAt(0) != p.texto.charAt(i)) {
                    return false;
                }
            }
        }

        return true;
    }

    public void aplicarColor(JButton boton) {

        Color normal = new Color(204, 204, 204);
        Color sobre = new Color(255, 180, 203);

        boton.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {

                if (!boton.getBackground().equals(colorSeleccionado)
                        && !boton.getBackground().equals(colorEncontrado)) {
                    boton.setBackground(sobre);
                }
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {

                if (!boton.getBackground().equals(colorSeleccionado)
                        && !boton.getBackground().equals(colorEncontrado)) {
                    boton.setBackground(normal);
                }
            }
        });
    }

    private void seleccionarBoton(int index) {

        JButton b = botones[index];

        if (b.getBackground().equals(colorSeleccionado)) {
            b.setBackground(colorNormal);
            seleccionActual.remove(Integer.valueOf(index));
            return;
        }

        if (!b.getBackground().equals(colorEncontrado)) {
            b.setBackground(colorSeleccionado);
        }

        if (!seleccionActual.contains(index)) {
            seleccionActual.add(index);
        }

        verificarSeleccion();
    }

    private void verificarSeleccion() {

        if (seleccionActual.isEmpty()) {
            return;
        }

        for (Palabra p : listaPalabras) {

            if (palabrasEncontradas.contains(p.texto)) {
                continue;
            }

            boolean haySeleccion = false;
            boolean completa = true;

            for (int pos : p.posiciones) {
                boolean estaSeleccionado = seleccionActual.contains(pos);
                boolean yaEncontrado = botones[pos].getBackground().equals(colorEncontrado);

                if (estaSeleccionado) {
                    haySeleccion = true;
                }

                if (!estaSeleccionado && !yaEncontrado) {
                    completa = false;
                    break;
                }
            }

            if (completa && haySeleccion) {
                palabrasEncontradas.add(p.texto);
                colorearPalabra(p);

                // mostrarDialogoBonito("¡Encontraste: " + p.texto + "!", "", icon);
                seleccionActual.clear();
                return;
            }
        }

        if (seleccionActual.size() > MAX_LONGITUD_PALABRA) {
            resetSeleccion();
        }
    }

    private void colorearPalabra(Palabra p) {

        for (int idx : p.posiciones) {
            botones[idx].setBackground(colorEncontrado);
            //botones[idx].setEnabled(false);
            casillaEncontrada[idx] = true;

        }

        p.etiqueta.setForeground(Color.GREEN);

        switch (p.texto) {
            case "MERCURIO" ->
                m.setVisible(true);
            case "JUPITER" ->
                j.setVisible(true);
            case "MARTE" ->
                ma.setVisible(true);
            case "VENUS" ->
                ve.setVisible(true);
            case "TIERRA" ->
                t.setVisible(true);
            case "NEPTUNO" ->
                n.setVisible(true);
        }

        if (palabrasEncontradas.size() == listaPalabras.length) {

            timer.stop();

            efectoVictoria();

            Icon winIcon = new ImageIcon(
                    getClass().getResource("sopaimg/happy_cat.gif")
            );

            mostrarDialogoBonito("¡FELICIDADES!\n¡Completaste la sopa de letras!\nCon un tiempo de: " + segundos + " segundos", "", winIcon);

        }

    }

    private void efectoVictoria() {
        animacionArcoirisPanel();
        new Thread(() -> {
            try {
                for (int k = 0; k < 3; k++) {
                    for (int i = 0; i < 100; i++) {
                        botones[i].setBackground(Color.GREEN);
                    }
                    Thread.sleep(250);

                    for (int i = 0; i < 100; i++) {
                        if (botones[i].isEnabled()) {
                            botones[i].setBackground(colorNormal);
                        } else {
                            botones[i].setBackground(colorEncontrado);
                        }
                    }
                    Thread.sleep(250);
                }
            } catch (Exception ignored) {
            }
        }).start();
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

            jPanel2.repaint();

        });

        arcoirisTimer.start();
    }

    private void resetSeleccion() {
        for (int idx : seleccionActual) {

            if (botones[idx].isEnabled()
                    && !botones[idx].getBackground().equals(colorEncontrado)) {
                botones[idx].setBackground(colorNormal);
            }
        }
        seleccionActual.clear();
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
        ok.setPreferredSize(new Dimension(50, 36));
        ok.setMaximumSize(new Dimension(50, 36));
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

        ok.addActionListener(e -> {
            if (palabrasEncontradas.size() == listaPalabras.length) {
                arcoirisTimer.stop();
                bordeTimer.stop();
                dialog.dispose();
            } else {
                bordeTimer.stop();
                dialog.dispose();
            }

        });

        dialog.setVisible(true);
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
            java.util.logging.Logger.getLogger(sopadeletras.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sopadeletras.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sopadeletras.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sopadeletras.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sopadeletras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton completar;
    private javax.swing.JLabel flechas;
    private javax.swing.JLabel j;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton100;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton70;
    private javax.swing.JButton jButton71;
    private javax.swing.JButton jButton72;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton76;
    private javax.swing.JButton jButton77;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton79;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton80;
    private javax.swing.JButton jButton81;
    private javax.swing.JButton jButton82;
    private javax.swing.JButton jButton83;
    private javax.swing.JButton jButton84;
    private javax.swing.JButton jButton85;
    private javax.swing.JButton jButton86;
    private javax.swing.JButton jButton87;
    private javax.swing.JButton jButton88;
    private javax.swing.JButton jButton89;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton90;
    private javax.swing.JButton jButton91;
    private javax.swing.JButton jButton92;
    private javax.swing.JButton jButton93;
    private javax.swing.JButton jButton94;
    private javax.swing.JButton jButton95;
    private javax.swing.JButton jButton96;
    private javax.swing.JButton jButton97;
    private javax.swing.JButton jButton98;
    private javax.swing.JButton jButton99;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jupiterlbl;
    private javax.swing.JButton lblTiempo;
    private javax.swing.JLabel m;
    private javax.swing.JLabel ma;
    private javax.swing.JLabel marco;
    private javax.swing.JLabel martelbl;
    private javax.swing.JLabel mercuriolbl;
    private javax.swing.JLabel n;
    private javax.swing.JLabel neptunolbl;
    private javax.swing.JLabel palabras1;
    private javax.swing.JButton pista1;
    private javax.swing.JButton reiniciar;
    private javax.swing.JLabel t;
    private javax.swing.JLabel tierralbl;
    private javax.swing.JLabel ve;
    private javax.swing.JLabel venuslbl;
    private javax.swing.JLabel volver;
    // End of variables declaration//GEN-END:variables
}
