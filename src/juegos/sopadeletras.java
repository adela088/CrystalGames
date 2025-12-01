/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package juegos;

import java.awt.Color;
import static java.awt.Color.red;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class sopadeletras extends javax.swing.JFrame {

    /**
     * Creates new form sopadeletras
     */
    public sopadeletras() {
        initComponents();
        this.setLocationRelativeTo(null);
        llenar();
        iniciar();
        String palabra1[] = {"V", "E", "N", "U", "S"};
        String palabra2[] = {"J", "U", "P", "I", "T", "E", "R"};
        String palabra3[] = {"U", "R", "A", "N", "O"};
        String palabra4[] = {"M", "A", "R", "T", "E"};
        String palabra5[] = {"M", "E", "R", "C", "U", "R", "I", "O"};
        String palabra6[] = {"T", "I", "E", "R", "R", "A"};
        String palabra7[] = {"N", "E", "P", "T", "U", "N", "O"};
        m.setVisible(false);
        ma.setVisible(false);
        j.setVisible(false);
        n.setVisible(false);
        t.setVisible(false);
        ve.setVisible(false);
        setIcon();
    }
    private void setIcon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("log.png")));
    }
    
    public int c = 1;
    public Icon icon = new ImageIcon(getClass().getResource("sopaimg\\cat.gif"));
    public Icon win = new ImageIcon(getClass().getResource("sopaimg\\happy_cat.gif"));

    public void llenar() {
        int r = random.nextInt(26);
        jButton1.setText("" + v[r]);
        r = random.nextInt(26);
        jButton2.setText("" + v[r]);
        r = random.nextInt(26);
        jButton11.setText("" + v[r]);
        r = random.nextInt(26);
        jButton13.setText("" + v[r]);
        r = random.nextInt(26);
        jButton14.setText("" + v[r]);
        r = random.nextInt(26);
        jButton15.setText("" + v[r]);
        r = random.nextInt(26);
        jButton16.setText("" + v[r]);
        r = random.nextInt(26);
        jButton17.setText("" + v[r]);
        r = random.nextInt(26);
        jButton19.setText("" + v[r]);
        r = random.nextInt(26);
        jButton20.setText("" + v[r]);
        r = random.nextInt(26);
        jButton21.setText("" + v[r]);
        r = random.nextInt(26);
        jButton23.setText("" + v[r]);
        r = random.nextInt(26);
        jButton24.setText("" + v[r]);
        r = random.nextInt(26);
        jButton25.setText("" + v[r]);
        r = random.nextInt(26);
        jButton26.setText("" + v[r]);
//        r = random.nextInt(26);
//        jButton27.setText("" + v[r]);
        r = random.nextInt(26);
        jButton28.setText("" + v[r]);
        r = random.nextInt(26);
        jButton29.setText("" + v[r]);
        r = random.nextInt(26);
        jButton30.setText("" + v[r]);
        r = random.nextInt(26);
        jButton31.setText("" + v[r]);
//        r = random.nextInt(26);
//        jButton32.setText("" + v[r]);
        r = random.nextInt(26);
        jButton33.setText("" + v[r]);
        r = random.nextInt(26);
        jButton34.setText("" + v[r]);
        r = random.nextInt(26);
        jButton35.setText("" + v[r]);
//        r = random.nextInt(26);
//        jButton36.setText("" + v[r]);
        r = random.nextInt(26);
        jButton37.setText("" + v[r]);
        r = random.nextInt(26);
        jButton38.setText("" + v[r]);
        r = random.nextInt(26);
        jButton39.setText("" + v[r]);
        r = random.nextInt(26);
        jButton40.setText("" + v[r]);
        r = random.nextInt(26);
        jButton41.setText("" + v[r]);
//        r = random.nextInt(26);
//        jButton42.setText("" + v[r]);
        r = random.nextInt(26);
        jButton43.setText("" + v[r]);
        r = random.nextInt(26);
        jButton44.setText("" + v[r]);
//        r = random.nextInt(26);
//        jButton45.setText("" + v[r]);
        r = random.nextInt(26);
        jButton46.setText("" + v[r]);
        r = random.nextInt(26);
        jButton47.setText("" + v[r]);
        r = random.nextInt(26);
        jButton48.setText("" + v[r]);
        r = random.nextInt(26);
        jButton49.setText("" + v[r]);
        r = random.nextInt(26);
        jButton50.setText("" + v[r]);
        r = random.nextInt(26);
        jButton51.setText("" + v[r]);
//        r = random.nextInt(26);
//        jButton52.setText("" + v[r]);
        r = random.nextInt(26);
        jButton53.setText("" + v[r]);
//        r = random.nextInt(26);
//        jButton54.setText("" + v[r]);
//        r = random.nextInt(26);
//        jButton55.setText("" + v[r]);
//        r = random.nextInt(26);
//        jButton56.setText("" + v[r]);
//        r = random.nextInt(26);
//        jButton57.setText("" + v[r]);
//        r = random.nextInt(26);
//        U.setText("" + v[r]);
//        r = random.nextInt(26);
//        jButton59.setText("" + v[r]);
        r = random.nextInt(26);
        jButton60.setText("" + v[r]);
//        r = random.nextInt(26);
//        jButton61.setText("" + v[r]);
//        r = random.nextInt(26);
//        jButton62.setText("" + v[r]);
//        r = random.nextInt(26);
//        jButton63.setText("" + v[r]);
//        r = random.nextInt(26);
//        jButton64.setText("" + v[r]);
//        r = random.nextInt(26);
//        jButton65.setText("" + v[r]);
//        r = random.nextInt(26);
//        jButton66.setText("" + v[r]);
//        r = random.nextInt(26);
//        jButton67.setText("" + v[r]);
        r = random.nextInt(26);
        jButton68.setText("" + v[r]);
        r = random.nextInt(26);
        jButton69.setText("" + v[r]);
        r = random.nextInt(26);
        jButton70.setText("" + v[r]);
        r = random.nextInt(26);
        jButton71.setText("" + v[r]);
//        r = random.nextInt(26);
//        jButton72.setText("" + v[r]);
        r = random.nextInt(26);
        jButton73.setText("" + v[r]);
        r = random.nextInt(26);
        jButton74.setText("" + v[r]);
        r = random.nextInt(26);
        jButton75.setText("" + v[r]);
        r = random.nextInt(26);
        jButton76.setText("" + v[r]);
        r = random.nextInt(26);
        jButton77.setText("" + v[r]);
        r = random.nextInt(26);
        jButton78.setText("" + v[r]);
        r = random.nextInt(26);
        jButton79.setText("" + v[r]);
        r = random.nextInt(26);
        jButton80.setText("" + v[r]);
        r = random.nextInt(26);
        jButton81.setText("" + v[r]);
        r = random.nextInt(26);
        jButton82.setText("" + v[r]);
        r = random.nextInt(26);
        jButton83.setText("" + v[r]);
//        r = random.nextInt(26);
//        jButton84.setText("" + v[r]);
//        r = random.nextInt(26);
//        jButton85.setText("" + v[r]);
//        r = random.nextInt(26);
//        jButton86.setText("" + v[r]);
//        r = random.nextInt(26);
//        jButton87.setText("" + v[r]);
//        r = random.nextInt(26);
//        jButton88.setText("" + v[r]);
//        r = random.nextInt(26);
//        jButton89.setText("" + v[r]);
        r = random.nextInt(26);
        jButton90.setText("" + v[r]);
        r = random.nextInt(26);
        jButton91.setText("" + v[r]);
        r = random.nextInt(26);
        jButton92.setText("" + v[r]);
        r = random.nextInt(26);
        jButton93.setText("" + v[r]);
        r = random.nextInt(26);
        jButton94.setText("" + v[r]);
        r = random.nextInt(26);
        jButton95.setText("" + v[r]);
        r = random.nextInt(26);
        jButton96.setText("" + v[r]);
        r = random.nextInt(26);
        jButton97.setText("" + v[r]);
        r = random.nextInt(26);
        jButton98.setText("" + v[r]);
        r = random.nextInt(26);
        jButton99.setText("" + v[r]);
        r = random.nextInt(26);
        jButton100.setText("" + v[r]);
    }

    public static Random random = new Random();
    public String[] v = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    public boolean mercurio = false, jupiter = false, marte = false, tierra = false, venus = false, neptuno = false;
    public boolean b1 = false;
    public boolean b2 = false;
    public boolean b3 = false;
    public boolean b4 = false;
    public boolean b5 = false;
    public boolean b6 = false;
    public boolean b7 = false;
    public boolean b8 = false;
    public boolean b9 = false;
    public boolean b10 = false;
    public boolean b11 = false;
    public boolean b12 = false;
    public boolean b13 = false;
    public boolean b14 = false;
    public boolean b15 = false;
    public boolean b16 = false;
    public boolean b17 = false;
    public boolean b18 = false;
    public boolean b19 = false;
    public boolean b20 = false;
    public boolean b21 = false;
    public boolean b22 = false;
    public boolean b23 = false;
    public boolean b24 = false;
    public boolean b25 = false;
    public boolean b26 = false;
    public boolean b27 = false;
    public boolean b28 = false;
    public boolean b29 = false;
    public boolean b30 = false;
    public boolean b31 = false;
    public boolean b32 = false;
    public boolean b33 = false;
    public boolean b34 = false;
    public boolean b35 = false;
    public boolean b36 = false;
    public boolean b37 = false;
    public boolean b38 = false;
    public boolean b39 = false;
    public boolean b40 = false;
    public boolean b41 = false;
    public boolean b42 = false;
    public boolean b43 = false;
    public boolean b44 = false;
    public boolean b45 = false;
    public boolean b46 = false;
    public boolean b47 = false;
    public boolean b48 = false;
    public boolean b49 = false;
    public boolean b50 = false;
    public boolean b51 = false;
    public boolean b52 = false;
    public boolean b53 = false;
    public boolean b54 = false;
    public boolean b55 = false;
    public boolean b56 = false;
    public boolean b57 = false;
    public boolean b58 = false;
    public boolean b59 = false;
    public boolean b60 = false;
    public boolean b61 = false;
    public boolean b62 = false;
    public boolean b63 = false;
    public boolean b64 = false;
    public boolean b65 = false;
    public boolean b66 = false;
    public boolean b67 = false;
    public boolean b68 = false;
    public boolean b69 = false;
    public boolean b70 = false;
    public boolean b71 = false;
    public boolean b72 = false;
    public boolean b73 = false;
    public boolean b74 = false;
    public boolean b75 = false;
    public boolean b76 = false;
    public boolean b77 = false;
    public boolean b78 = false;
    public boolean b79 = false;
    public boolean b80 = false;
    public boolean b81 = false;
    public boolean b82 = false;
    public boolean b83 = false;
    public boolean b84 = false;
    public boolean b85 = false;
    public boolean b86 = false;
    public boolean b87 = false;
    public boolean b88 = false;
    public boolean b89 = false;
    public boolean b90 = false;
    public boolean b91 = false;
    public boolean b92 = false;
    public boolean b93 = false;
    public boolean b94 = false;
    public boolean b95 = false;
    public boolean b96 = false;
    public boolean b97 = false;
    public boolean b98 = false;
    public boolean b99 = false;
    public boolean b100 = false;
    public boolean t1 = false;

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
        comprobar = new javax.swing.JButton();
        pista = new javax.swing.JButton();
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
        jButton3.setText("O");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton3);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setText("I");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton4);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setText("R");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton5);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setText("U");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton6);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setText("C");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton7);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);

        jButton8.setBackground(new java.awt.Color(204, 204, 204));
        jButton8.setText("R");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton8);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);

        jButton9.setBackground(new java.awt.Color(204, 204, 204));
        jButton9.setText("E");
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton9);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9);

        jButton10.setBackground(new java.awt.Color(204, 204, 204));
        jButton10.setText("M");
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
        jButton12.setText("J");
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
        jButton18.setText("M");
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
        jButton22.setText("U");
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
        jButton27.setText("A");
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
        jButton32.setText("P");
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
        jButton36.setText("R");
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
        jButton42.setText("I");
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
        jButton45.setText("T");
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
        jButton52.setText("T");
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
        jButton54.setText("E");
        jButton54.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton54);
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton54);

        jButton55.setBackground(new java.awt.Color(204, 204, 204));
        jButton55.setText("V");
        jButton55.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton55);
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton55);

        jButton56.setBackground(new java.awt.Color(204, 204, 204));
        jButton56.setText("E");
        jButton56.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton56);
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton56);

        jButton57.setBackground(new java.awt.Color(204, 204, 204));
        jButton57.setText("N");
        jButton57.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton57);
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton57);

        jButton58.setBackground(new java.awt.Color(204, 204, 204));
        jButton58.setText("U");
        jButton58.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton58);
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton58);

        jButton59.setBackground(new java.awt.Color(204, 204, 204));
        jButton59.setText("S");
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
        jButton61.setText("N");
        jButton61.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton61);
        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton61ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton61);

        jButton62.setBackground(new java.awt.Color(204, 204, 204));
        jButton62.setText("E");
        jButton62.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton62);
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton62);

        jButton63.setBackground(new java.awt.Color(204, 204, 204));
        jButton63.setText("P");
        jButton63.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton63);
        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton63ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton63);

        jButton64.setBackground(new java.awt.Color(204, 204, 204));
        jButton64.setText("T");
        jButton64.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton64);
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton64);

        jButton65.setBackground(new java.awt.Color(204, 204, 204));
        jButton65.setText("U");
        jButton65.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton65);
        jButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton65ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton65);

        jButton66.setBackground(new java.awt.Color(204, 204, 204));
        jButton66.setText("N");
        jButton66.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton66);
        jButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton66ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton66);

        jButton67.setBackground(new java.awt.Color(204, 204, 204));
        jButton67.setText("O");
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
        jButton72.setText("R");
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
        jButton84.setText("A");
        jButton84.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton84);
        jButton84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton84ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton84);

        jButton85.setBackground(new java.awt.Color(204, 204, 204));
        jButton85.setText("R");
        jButton85.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton85);
        jButton85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton85ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton85);

        jButton86.setBackground(new java.awt.Color(204, 204, 204));
        jButton86.setText("R");
        jButton86.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton86);
        jButton86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton86ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton86);

        jButton87.setBackground(new java.awt.Color(204, 204, 204));
        jButton87.setText("E");
        jButton87.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton87);
        jButton87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton87ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton87);

        jButton88.setBackground(new java.awt.Color(204, 204, 204));
        jButton88.setText("I");
        jButton88.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonGroup1.add(jButton88);
        jButton88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton88ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton88);

        jButton89.setBackground(new java.awt.Color(204, 204, 204));
        jButton89.setText("T");
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

        comprobar.setBackground(new java.awt.Color(204, 204, 255));
        comprobar.setText("Comprobar");
        comprobar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        comprobar.setOpaque(true);
        comprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprobarActionPerformed(evt);
            }
        });
        jPanel1.add(comprobar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, 180, 40));

        pista.setBackground(new java.awt.Color(204, 204, 255));
        pista.setText("Pista");
        pista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pista.setOpaque(true);
        pista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pistaActionPerformed(evt);
            }
        });
        jPanel1.add(pista, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 510, 180, 40));

        completar.setBackground(new java.awt.Color(204, 204, 255));
        completar.setText("Completar");
        completar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        completar.setOpaque(true);
        completar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completarActionPerformed(evt);
            }
        });
        jPanel1.add(completar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 570, 120, 40));

        reiniciar.setBackground(new java.awt.Color(204, 204, 255));
        reiniciar.setText("Reiniciar");
        reiniciar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reiniciar.setOpaque(true);
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarActionPerformed(evt);
            }
        });
        jPanel1.add(reiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, 120, 40));

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

        volver.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        volver.setForeground(new java.awt.Color(255, 255, 255));
        volver.setText("Volver");
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
        jPanel1.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 610, 60, -1));

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
        jButton19.setBackground(Color.pink);
        b19 = true;
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        jButton20.setBackground(Color.pink);
        b20 = true;
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        jButton28.setBackground(Color.pink);
        b28 = true;
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        jButton29.setBackground(Color.pink);
        b29 = true;
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        jButton30.setBackground(Color.pink);
        b30 = true;
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
        jButton55.setBackground(Color.pink);
        b55 = true;
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
        jButton59.setBackground(Color.pink);
        b59 = true;
    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        jButton42.setBackground(Color.pink);
        b42 = true;
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed
        jButton62.setBackground(Color.pink);
        b62 = true;
    }//GEN-LAST:event_jButton62ActionPerformed

    private void jButton88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton88ActionPerformed
        jButton88.setBackground(Color.pink);
        b88 = true;
    }//GEN-LAST:event_jButton88ActionPerformed

    private void jButton100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton100ActionPerformed
        jButton100.setBackground(Color.pink);
        b100 = true;
    }//GEN-LAST:event_jButton100ActionPerformed

    private void jButton99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton99ActionPerformed
        jButton99.setBackground(Color.pink);
        b99 = true;
    }//GEN-LAST:event_jButton99ActionPerformed

    private void jButton98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton98ActionPerformed
        jButton98.setBackground(Color.pink);
        b98 = true;
    }//GEN-LAST:event_jButton98ActionPerformed

    private void jButton96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton96ActionPerformed
        jButton96.setBackground(Color.pink);
        b96 = true;
    }//GEN-LAST:event_jButton96ActionPerformed

    private void jButton97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton97ActionPerformed
        jButton97.setBackground(Color.pink);
        b97 = true;
    }//GEN-LAST:event_jButton97ActionPerformed

    private void jButton95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton95ActionPerformed
        jButton95.setBackground(Color.pink);
        b95 = true;
    }//GEN-LAST:event_jButton95ActionPerformed

    private void jButton94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton94ActionPerformed
        jButton94.setBackground(Color.pink);
        b94 = true;
    }//GEN-LAST:event_jButton94ActionPerformed

    private void jButton93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton93ActionPerformed
        jButton93.setBackground(Color.pink);
        b93 = true;
    }//GEN-LAST:event_jButton93ActionPerformed

    private void jButton92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton92ActionPerformed
        jButton92.setBackground(Color.pink);
        b92 = true;
    }//GEN-LAST:event_jButton92ActionPerformed

    private void jButton91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton91ActionPerformed
        jButton91.setBackground(Color.pink);
        b91 = true;
    }//GEN-LAST:event_jButton91ActionPerformed

    private void jButton81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton81ActionPerformed
        jButton81.setBackground(Color.pink);
        b81 = true;
    }//GEN-LAST:event_jButton81ActionPerformed

    private void jButton82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton82ActionPerformed
        jButton82.setBackground(Color.pink);
        b82 = true;
    }//GEN-LAST:event_jButton82ActionPerformed

    private void jButton83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton83ActionPerformed
        jButton83.setBackground(Color.pink);
        b83 = true;
    }//GEN-LAST:event_jButton83ActionPerformed

    private void jButton84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton84ActionPerformed

        b84 = true;
        jButton84.setBackground(Color.pink);    }//GEN-LAST:event_jButton84ActionPerformed

    private void jButton85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton85ActionPerformed
        jButton85.setBackground(Color.pink);
        b85 = true;
    }//GEN-LAST:event_jButton85ActionPerformed

    private void jButton86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton86ActionPerformed
        jButton86.setBackground(Color.pink);
        b86 = true;
    }//GEN-LAST:event_jButton86ActionPerformed

    private void jButton87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton87ActionPerformed

        b87 = true;

        jButton87.setBackground(Color.pink);    }//GEN-LAST:event_jButton87ActionPerformed

    private void jButton89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton89ActionPerformed
        jButton89.setBackground(Color.pink);
        b89 = true;
    }//GEN-LAST:event_jButton89ActionPerformed

    private void jButton90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton90ActionPerformed
        jButton90.setBackground(Color.pink);
        b90 = true;
    }//GEN-LAST:event_jButton90ActionPerformed

    private void jButton80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton80ActionPerformed
        jButton80.setBackground(Color.pink);
        b80 = true;
    }//GEN-LAST:event_jButton80ActionPerformed

    private void jButton79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton79ActionPerformed
        jButton79.setBackground(Color.pink);
        b79 = true;
    }//GEN-LAST:event_jButton79ActionPerformed

    private void jButton78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton78ActionPerformed
        jButton78.setBackground(Color.pink);
        b78 = true;
    }//GEN-LAST:event_jButton78ActionPerformed

    private void jButton77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton77ActionPerformed
        jButton77.setBackground(Color.pink);
        b77 = true;
    }//GEN-LAST:event_jButton77ActionPerformed

    private void jButton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton76ActionPerformed
        jButton76.setBackground(Color.pink);
        b76 = true;
    }//GEN-LAST:event_jButton76ActionPerformed

    private void jButton75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton75ActionPerformed
        jButton75.setBackground(Color.pink);
        b75 = true;
    }//GEN-LAST:event_jButton75ActionPerformed

    private void jButton74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton74ActionPerformed
        jButton74.setBackground(Color.pink);
        b74 = true;
    }//GEN-LAST:event_jButton74ActionPerformed

    private void jButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton73ActionPerformed
        jButton73.setBackground(Color.pink);
        b73 = true;
    }//GEN-LAST:event_jButton73ActionPerformed

    private void jButton72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton72ActionPerformed
        jButton72.setBackground(Color.pink);
        b72 = true;
    }//GEN-LAST:event_jButton72ActionPerformed

    private void jButton71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton71ActionPerformed
        jButton71.setBackground(Color.pink);
        b71 = true;
    }//GEN-LAST:event_jButton71ActionPerformed

    private void jButton70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton70ActionPerformed
        jButton70.setBackground(Color.pink);
    }//GEN-LAST:event_jButton70ActionPerformed

    private void jButton69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton69ActionPerformed
        jButton69.setBackground(Color.pink);
    }//GEN-LAST:event_jButton69ActionPerformed

    private void jButton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton68ActionPerformed
        jButton68.setBackground(Color.pink);
        b68 = true;
    }//GEN-LAST:event_jButton68ActionPerformed

    private void jButton67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton67ActionPerformed
        jButton67.setBackground(Color.pink);
        b67 = true;
    }//GEN-LAST:event_jButton67ActionPerformed

    private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton66ActionPerformed
        jButton66.setBackground(Color.pink);
        b66 = true;
    }//GEN-LAST:event_jButton66ActionPerformed

    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed
        jButton65.setBackground(Color.pink);
        b65 = true;
    }//GEN-LAST:event_jButton65ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
        jButton64.setBackground(Color.pink);
        b64 = true;
    }//GEN-LAST:event_jButton64ActionPerformed

    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton63ActionPerformed
        jButton63.setBackground(Color.pink);
        b63 = true;
    }//GEN-LAST:event_jButton63ActionPerformed

    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton61ActionPerformed
        jButton61.setBackground(Color.pink);
        b61 = true;
    }//GEN-LAST:event_jButton61ActionPerformed

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed
        jButton56.setBackground(Color.pink);
        b56 = true;
    }//GEN-LAST:event_jButton56ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
        jButton57.setBackground(Color.pink);
        b57 = true;
    }//GEN-LAST:event_jButton57ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
        jButton58.setBackground(Color.pink);
        b58 = true;
    }//GEN-LAST:event_jButton58ActionPerformed

    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton60ActionPerformed
        jButton60.setBackground(Color.pink);
        b60 = true;
    }//GEN-LAST:event_jButton60ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        jButton54.setBackground(Color.pink);
        b54 = true;
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        jButton53.setBackground(Color.pink);
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        jButton52.setBackground(Color.pink);
        b52 = true;
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        jButton51.setBackground(Color.pink);
        b51 = true;
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        jButton41.setBackground(Color.pink);
        b41 = true;
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        jButton31.setBackground(Color.pink);
        b31 = true;
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        jButton32.setBackground(Color.pink);
        b32 = true;
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        jButton33.setBackground(Color.pink);
        b33 = true;
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        jButton34.setBackground(Color.pink);
        b34 = true;
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        jButton35.setBackground(Color.pink);
        b35 = true;
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        jButton36.setBackground(Color.pink);
        b36 = true;
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        jButton37.setBackground(Color.pink);
        b37 = true;
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        jButton38.setBackground(Color.pink);
        b38 = true;
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        jButton39.setBackground(Color.pink);
        b39 = true;
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        jButton40.setBackground(Color.pink);
        b40 = true;
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        jButton50.setBackground(Color.pink);
        b50 = true;
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        jButton49.setBackground(Color.pink);
        b49 = true;
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        jButton48.setBackground(Color.pink);
        b48 = true;
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        jButton47.setBackground(Color.pink);
        b47 = true;
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        jButton46.setBackground(Color.pink);
        b46 = true;
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        jButton45.setBackground(Color.pink);
        b45 = true;
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        jButton44.setBackground(Color.pink);
        b46 = true;
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        jButton43.setBackground(Color.pink);
        b43 = true;
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        jButton27.setBackground(Color.pink);
        b27 = true;
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        jButton26.setBackground(Color.pink);
        b26 = true;
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        jButton25.setBackground(Color.pink);
        b25 = true;
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        jButton24.setBackground(Color.pink);
        b24 = true;
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        jButton23.setBackground(Color.pink);
        b23 = true;
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        jButton22.setBackground(Color.pink);
        b22 = true;
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        jButton21.setBackground(Color.pink);
        b21 = true;
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        jButton11.setBackground(Color.pink);
        b11 = true;
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jButton12.setBackground(Color.pink);
        b12 = true;
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jButton13.setBackground(Color.pink);
        b13 = true;
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        jButton14.setBackground(Color.pink);
        b14 = true;
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        jButton15.setBackground(Color.pink);
        b15 = true;
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        jButton16.setBackground(Color.pink);
        b16 = true;
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        jButton17.setBackground(Color.pink);
        b17 = true;
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        jButton18.setBackground(Color.pink);
        b18 = true;
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setBackground(Color.pink);
        b1 = true;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setBackground(Color.pink);
        b2 = true;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setBackground(Color.pink);
        b3 = true;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setBackground(Color.pink);
        b4 = true;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setBackground(Color.pink);
        b5 = true;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setBackground(Color.pink);
        b6 = true;
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setBackground(Color.pink);
        b7 = true;
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setBackground(Color.pink);
        b8 = true;
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setBackground(Color.pink);
        b9 = true;
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jButton10.setBackground(Color.pink);
        b10 = true;
    }//GEN-LAST:event_jButton10ActionPerformed

    private void pistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pistaActionPerformed
        int p = random.nextInt(36);
        if (p == 0) {
            jButton3.setBackground(Color.pink);
        } else if (p == 1) {
            jButton9.setBackground(Color.pink);
        } else if (p == 2) {
            jButton10.setBackground(Color.pink);
        } else if (p == 3) {
            jButton8.setBackground(Color.pink);
        } else if (p == 4) {
            jButton7.setBackground(Color.pink);
        } else if (p == 5) {
            jButton6.setBackground(Color.pink);
        } else if (p == 6) {
            jButton5.setBackground(Color.pink);
        } else if (p == 7) {
            jButton4.setBackground(Color.pink);
        } else if (p == 8) {
            jButton12.setBackground(Color.pink);
        } else if (p == 9) {
            jButton22.setBackground(Color.pink);
        } else if (p == 10) {
            jButton32.setBackground(Color.pink);
        } else if (p == 11) {
            jButton42.setBackground(Color.pink);
        } else if (p == 12) {
            jButton52.setBackground(Color.pink);
        } else if (p == 13) {
            jButton62.setBackground(Color.pink);
        } else if (p == 14) {
            jButton72.setBackground(Color.pink);
        } else if (p == 15) {
            jButton61.setBackground(Color.pink);
        } else if (p == 16) {
            jButton63.setBackground(Color.pink);
        } else if (p == 17) {
            jButton64.setBackground(Color.pink);
        } else if (p == 18) {
            jButton65.setBackground(Color.pink);
        } else if (p == 19) {
            jButton66.setBackground(Color.pink);
        } else if (p == 20) {
            jButton67.setBackground(Color.pink);
        } else if (p == 21) {
            jButton54.setBackground(Color.pink);
        } else if (p == 22) {
            jButton55.setBackground(Color.pink);
        } else if (p == 23) {
            jButton56.setBackground(Color.pink);
        } else if (p == 24) {
            jButton57.setBackground(Color.pink);
        } else if (p == 25) {
            jButton58.setBackground(Color.pink);
        } else if (p == 26) {
            jButton59.setBackground(Color.pink);
        } else if (p == 27) {
            jButton18.setBackground(Color.pink);
        } else if (p == 28) {
            jButton27.setBackground(Color.pink);
        } else if (p == 29) {
            jButton36.setBackground(Color.pink);
        } else if (p == 30) {
            jButton45.setBackground(Color.pink);
        } else if (p == 31) {
            jButton89.setBackground(Color.pink);
        } else if (p == 32) {
            jButton88.setBackground(Color.pink);
        } else if (p == 33) {
            jButton87.setBackground(Color.pink);
        } else if (p == 34) {
            jButton86.setBackground(Color.pink);
        } else if (p == 35) {
            jButton85.setBackground(Color.pink);
        } else if (p == 36) {
            jButton84.setBackground(Color.pink);
        }
    }//GEN-LAST:event_pistaActionPerformed

    private void completarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completarActionPerformed
        mercurio = true;
        jupiter = true;
        marte = true;
        tierra = true;
        venus = true;
        neptuno = true;

        m.setVisible(true);
        ma.setVisible(true);
        j.setVisible(true);
        ve.setVisible(true);
        t.setVisible(true);
        n.setVisible(true);

        jButton3.setBackground(Color.pink);

        jButton9.setBackground(Color.pink);

        jButton10.setBackground(Color.pink);

        jButton8.setBackground(Color.pink);

        jButton7.setBackground(Color.pink);

        jButton6.setBackground(Color.pink);

        jButton5.setBackground(Color.pink);

        jButton4.setBackground(Color.pink);

        jButton12.setBackground(Color.pink);

        jButton22.setBackground(Color.pink);

        jButton32.setBackground(Color.pink);

        jButton42.setBackground(Color.pink);

        jButton52.setBackground(Color.pink);

        jButton62.setBackground(Color.pink);

        jButton72.setBackground(Color.pink);

        jButton61.setBackground(Color.pink);

        jButton63.setBackground(Color.pink);

        jButton64.setBackground(Color.pink);

        jButton65.setBackground(Color.pink);

        jButton66.setBackground(Color.pink);

        jButton67.setBackground(Color.pink);

        jButton54.setBackground(Color.pink);

        jButton55.setBackground(Color.pink);

        jButton56.setBackground(Color.pink);

        jButton57.setBackground(Color.pink);

        jButton58.setBackground(Color.pink);

        jButton59.setBackground(Color.pink);

        jButton18.setBackground(Color.pink);

        jButton27.setBackground(Color.pink);

        jButton36.setBackground(Color.pink);

        jButton45.setBackground(Color.pink);

        jButton89.setBackground(Color.pink);

        jButton88.setBackground(Color.pink);

        jButton87.setBackground(Color.pink);

        jButton86.setBackground(Color.pink);

        jButton85.setBackground(Color.pink);

        jButton84.setBackground(Color.pink);

    }//GEN-LAST:event_completarActionPerformed

    private void comprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprobarActionPerformed
        confir();
        if (mercurio == true && venus == true && jupiter == true && neptuno == true && tierra == true && marte == true) {
            JOptionPane.showMessageDialog(null, "Felicidades, has completado el juego!", "Sopa de letras", JOptionPane.INFORMATION_MESSAGE, win);
            jButton3.setEnabled(true);
            jButton4.setEnabled(true);
            jButton5.setEnabled(true);
            jButton6.setEnabled(true);
            jButton7.setEnabled(true);
            jButton8.setEnabled(true);
            jButton9.setEnabled(true);
            jButton10.setEnabled(true);
            jButton12.setEnabled(true);
            jButton22.setEnabled(true);
            jButton32.setEnabled(true);
            jButton42.setEnabled(true);
            jButton52.setEnabled(true);
            jButton62.setEnabled(true);
            jButton72.setEnabled(true);
            jButton18.setEnabled(true);
            jButton27.setEnabled(true);
            jButton36.setEnabled(true);
            jButton45.setEnabled(true);
            jButton54.setEnabled(true);
            jButton55.setEnabled(true);
            jButton56.setEnabled(true);
            jButton57.setEnabled(true);
            jButton58.setEnabled(true);
            jButton59.setEnabled(true);
            jButton84.setEnabled(true);
            jButton85.setEnabled(true);
            jButton86.setEnabled(true);
            jButton87.setEnabled(true);
            jButton88.setEnabled(true);
            jButton89.setEnabled(true);
            jButton12.setEnabled(true);
            jButton22.setEnabled(true);
            jButton32.setEnabled(true);
            jButton42.setEnabled(true);
            jButton52.setEnabled(true);
            jButton62.setEnabled(true);
            jButton72.setEnabled(true);
            jButton61.setEnabled(true);
            jButton62.setEnabled(true);
            jButton63.setEnabled(true);
            jButton64.setEnabled(true);
            jButton65.setEnabled(true);
            jButton66.setEnabled(true);
            jButton67.setEnabled(true);
            jButton3.setBackground(Color.pink);

            jButton9.setBackground(Color.pink);

            jButton10.setBackground(Color.pink);

            jButton8.setBackground(Color.pink);

            jButton7.setBackground(Color.pink);

            jButton6.setBackground(Color.pink);

            jButton5.setBackground(Color.pink);

            jButton4.setBackground(Color.pink);

            jButton12.setBackground(Color.pink);

            jButton22.setBackground(Color.pink);

            jButton32.setBackground(Color.pink);

            jButton42.setBackground(Color.pink);

            jButton52.setBackground(Color.pink);

            jButton62.setBackground(Color.pink);

            jButton72.setBackground(Color.pink);

            jButton61.setBackground(Color.pink);

            jButton63.setBackground(Color.pink);

            jButton64.setBackground(Color.pink);

            jButton65.setBackground(Color.pink);

            jButton66.setBackground(Color.pink);

            jButton67.setBackground(Color.pink);

            jButton54.setBackground(Color.pink);

            jButton55.setBackground(Color.pink);

            jButton56.setBackground(Color.pink);

            jButton57.setBackground(Color.pink);

            jButton58.setBackground(Color.pink);

            jButton59.setBackground(Color.pink);

            jButton18.setBackground(Color.pink);

            jButton27.setBackground(Color.pink);

            jButton36.setBackground(Color.pink);

            jButton45.setBackground(Color.pink);

            jButton89.setBackground(Color.pink);

            jButton88.setBackground(Color.pink);

            jButton87.setBackground(Color.pink);

            jButton86.setBackground(Color.pink);

            jButton85.setBackground(Color.pink);

            jButton84.setBackground(Color.pink);
        }
    }//GEN-LAST:event_comprobarActionPerformed

    public void confir() {

        if (b3 == true && b4 == true && b5 == true && b6 == true && b7 == true && b8 == true && b9 == true && b10 == true) {
            if (b1 == false && b2 == false && b11 == false && b12 == false && b13 == false && b14 == false && b15 == false && b16 == false && b17 == false && b18 == false && b19 == false
                    && b20 == false
                    && b21 == false
                    && b22 == false
                    && b23 == false
                    && b24 == false
                    && b25 == false
                    && b26 == false
                    && b27 == false
                    && b28 == false
                    && b29 == false
                    && b30 == false
                    && b31 == false
                    && b32 == false
                    && b33 == false
                    && b34 == false
                    && b35 == false
                    && b36 == false
                    && b37 == false
                    && b38 == false
                    && b39 == false
                    && b40 == false
                    && b41 == false
                    && b42 == false
                    && b43 == false
                    && b44 == false
                    && b45 == false
                    && b46 == false
                    && b47 == false
                    && b48 == false
                    && b49 == false
                    && b50 == false
                    && b51 == false
                    && b52 == false
                    && b53 == false
                    && b54 == false
                    && b55 == false
                    && b56 == false
                    && b57 == false
                    && b58 == false
                    && b59 == false
                    && b60 == false
                    && b61 == false
                    && b62 == false
                    && b63 == false
                    && b64 == false
                    && b65 == false
                    && b66 == false
                    && b67 == false
                    && b68 == false
                    && b69 == false
                    && b70 == false
                    && b71 == false
                    && b72 == false
                    && b73 == false
                    && b74 == false
                    && b75 == false
                    && b76 == false
                    && b77 == false
                    && b78 == false
                    && b79 == false
                    && b80 == false
                    && b81 == false
                    && b82 == false
                    && b83 == false
                    && b84 == false
                    && b85 == false
                    && b86 == false
                    && b87 == false
                    && b88 == false
                    && b89 == false
                    && b90 == false
                    && b91 == false
                    && b92 == false
                    && b93 == false
                    && b94 == false
                    && b95 == false
                    && b96 == false
                    && b97 == false
                    && b98 == false
                    && b99 == false
                    && b100 == false) {
                
                JOptionPane.showMessageDialog(null, "( x ) Mercurio", "Sopa de letras", JOptionPane.INFORMATION_MESSAGE, icon);
                mercurio = true;
                jButton3.setEnabled(false);
                jButton4.setEnabled(false);
                jButton5.setEnabled(false);
                jButton6.setEnabled(false);
                jButton7.setEnabled(false);
                jButton8.setEnabled(false);
                jButton9.setEnabled(false);
                jButton10.setEnabled(false);
                b3 = false;
                b4 = false;
                b5 = false;
                b6 = false;
                b7 = false;
                b8 = false;
                b9 = false;
                b10 = false;
                m.setVisible(true);

            } else {
                iniciar();
                if (mercurio == true) {
                    jButton3.setEnabled(false);
                    jButton4.setEnabled(false);
                    jButton5.setEnabled(false);
                    jButton6.setEnabled(false);
                    jButton7.setEnabled(false);
                    jButton8.setEnabled(false);
                    jButton9.setEnabled(false);
                    jButton10.setEnabled(false);
                    jButton3.setBackground(Color.PINK);
                    jButton4.setBackground(Color.PINK);
                    jButton5.setBackground(Color.PINK);
                    jButton6.setBackground(Color.PINK);
                    jButton7.setBackground(Color.PINK);
                    jButton8.setBackground(Color.PINK);
                    jButton9.setBackground(Color.PINK);
                    jButton10.setBackground(Color.PINK);
                }
            }
        } else if (b12 == true && b22 == true && b32 == true && b42 == true && b52 == true && b62 == true || t1 == true && b72 == true) {
            if (b1 == false && b2 == false && b11 == false && b3 == false && b13 == false && b14 == false && b15 == false && b16 == false && b17 == false && b18 == false && b19 == false
                    && b20 == false
                    && b21 == false
                    && b4 == false
                    && b23 == false
                    && b24 == false
                    && b25 == false
                    && b26 == false
                    && b27 == false
                    && b28 == false
                    && b29 == false
                    && b30 == false
                    && b31 == false
                    && b5 == false
                    && b33 == false
                    && b34 == false
                    && b35 == false
                    && b36 == false
                    && b37 == false
                    && b38 == false
                    && b39 == false
                    && b40 == false
                    && b41 == false
                    && b6 == false
                    && b43 == false
                    && b44 == false
                    && b45 == false
                    && b46 == false
                    && b47 == false
                    && b48 == false
                    && b49 == false
                    && b50 == false
                    && b51 == false
                    && b7 == false
                    && b53 == false
                    && b54 == false
                    && b55 == false
                    && b56 == false
                    && b57 == false
                    && b58 == false
                    && b59 == false
                    && b60 == false
                    && b61 == false
                    && b8 == false
                    && b63 == false
                    && b64 == false
                    && b65 == false
                    && b66 == false
                    && b67 == false
                    && b68 == false
                    && b69 == false
                    && b70 == false
                    && b71 == false
                    && b9 == false
                    && b10 == false
                    && b73 == false
                    && b74 == false
                    && b75 == false
                    && b76 == false
                    && b77 == false
                    && b78 == false
                    && b79 == false
                    && b80 == false
                    && b81 == false
                    && b82 == false
                    && b83 == false
                    && b84 == false
                    && b85 == false
                    && b86 == false
                    && b87 == false
                    && b88 == false
                    && b89 == false
                    && b90 == false
                    && b91 == false
                    && b92 == false
                    && b93 == false
                    && b94 == false
                    && b95 == false
                    && b96 == false
                    && b97 == false
                    && b98 == false
                    && b99 == false
                    && b100 == false) {
                
                JOptionPane.showMessageDialog(null, "( x ) Jupiter", "Juego:", JOptionPane.INFORMATION_MESSAGE, icon);
                jupiter = true;
                jButton12.setEnabled(false);
                jButton22.setEnabled(false);
                jButton32.setEnabled(false);
                jButton42.setEnabled(false);
                jButton52.setEnabled(false);
                jButton62.setEnabled(false);
                jButton72.setEnabled(false);
                b12 = false;
                b22 = false;
                b32 = false;
                b42 = false;
                b52 = false;
                b62 = false;
                b72 = false;
                t1 = true;
                j.setVisible(true);
            } else {
                iniciar();
                if (jupiter == true) {
                    jButton12.setEnabled(false);
                    jButton22.setEnabled(false);
                    jButton32.setEnabled(false);
                    jButton42.setEnabled(false);
                    jButton52.setEnabled(false);
                    jButton62.setEnabled(false);
                    jButton72.setEnabled(false);
                    jButton12.setBackground(Color.PINK);
                    jButton22.setBackground(Color.PINK);
                    jButton32.setBackground(Color.PINK);
                    jButton42.setBackground(Color.PINK);
                    jButton52.setBackground(Color.PINK);
                    jButton62.setBackground(Color.PINK);
                    jButton72.setBackground(Color.PINK);
                    b62 = true;
                }
            }

        } else if (b18 == true && b27 == true && b36 == true && b45 == true && b54 == true) {
            if (b1 == false && b2 == false && b11 == false && b12 == false && b13 == false && b14 == false && b15 == false && b16 == false && b17 == false && b3 == false && b19 == false
                    && b20 == false
                    && b21 == false
                    && b22 == false
                    && b23 == false
                    && b24 == false
                    && b25 == false
                    && b26 == false
                    && b4 == false
                    && b28 == false
                    && b29 == false
                    && b30 == false
                    && b31 == false
                    && b32 == false
                    && b33 == false
                    && b34 == false
                    && b35 == false
                    && b5 == false
                    && b37 == false
                    && b38 == false
                    && b39 == false
                    && b40 == false
                    && b41 == false
                    && b42 == false
                    && b43 == false
                    && b44 == false
                    && b6 == false
                    && b46 == false
                    && b47 == false
                    && b48 == false
                    && b49 == false
                    && b50 == false
                    && b51 == false
                    && b52 == false
                    && b53 == false
                    && b7 == false
                    && b8 == false
                    && b9 == false
                    && b10 == false
                    && b55 == false
                    && b56 == false
                    && b57 == false
                    && b58 == false
                    && b59 == false
                    && b60 == false
                    && b61 == false
                    && b62 == false
                    && b63 == false
                    && b64 == false
                    && b65 == false
                    && b66 == false
                    && b67 == false
                    && b68 == false
                    && b69 == false
                    && b70 == false
                    && b71 == false
                    && b72 == false
                    && b73 == false
                    && b74 == false
                    && b75 == false
                    && b76 == false
                    && b77 == false
                    && b78 == false
                    && b79 == false
                    && b80 == false
                    && b81 == false
                    && b82 == false
                    && b83 == false
                    && b84 == false
                    && b85 == false
                    && b86 == false
                    && b87 == false
                    && b88 == false
                    && b89 == false
                    && b90 == false
                    && b91 == false
                    && b92 == false
                    && b93 == false
                    && b94 == false
                    && b95 == false
                    && b96 == false
                    && b97 == false
                    && b98 == false
                    && b99 == false
                    && b100 == false) {
               
                JOptionPane.showMessageDialog(null, "( x ) Marte", "Sopa de letras", JOptionPane.INFORMATION_MESSAGE, icon);
                marte = true;
                jButton18.setEnabled(false);
                jButton27.setEnabled(false);
                jButton36.setEnabled(false);
                jButton45.setEnabled(false);
                jButton54.setEnabled(false);
                b18 = false;
                b27 = false;
                b36 = false;
                b45 = false;
                b54 = false;
                ma.setVisible(true);
            } else {
                iniciar();
                if (marte == true) {
                    jButton18.setEnabled(false);
                    jButton27.setEnabled(false);
                    jButton36.setEnabled(false);
                    jButton45.setEnabled(false);
                    jButton54.setEnabled(false);
                    jButton18.setBackground(Color.PINK);
                    jButton27.setBackground(Color.PINK);
                    jButton36.setBackground(Color.PINK);
                    jButton45.setBackground(Color.PINK);
                    jButton54.setBackground(Color.PINK);
                }
            }

        } else if (b55 == true && b56 == true && b57 == true && b58 == true && b59 == true) {
            if (b1 == false && b2 == false && b11 == false && b12 == false && b13 == false && b14 == false && b15 == false && b16 == false && b17 == false && b18 == false && b19 == false
                    && b20 == false
                    && b21 == false
                    && b22 == false
                    && b23 == false
                    && b24 == false
                    && b25 == false
                    && b26 == false
                    && b27 == false
                    && b28 == false
                    && b29 == false
                    && b30 == false
                    && b31 == false
                    && b32 == false
                    && b33 == false
                    && b34 == false
                    && b35 == false
                    && b36 == false
                    && b37 == false
                    && b38 == false
                    && b39 == false
                    && b40 == false
                    && b41 == false
                    && b42 == false
                    && b43 == false
                    && b44 == false
                    && b45 == false
                    && b46 == false
                    && b47 == false
                    && b48 == false
                    && b49 == false
                    && b50 == false
                    && b51 == false
                    && b52 == false
                    && b53 == false
                    && b54 == false
                    && b3 == false
                    && b4 == false
                    && b5 == false
                    && b6 == false
                    && b7 == false
                    && b8 == false
                    && b9 == false
                    && b10 == false
                    && b60 == false
                    && b61 == false
                    && b62 == false
                    && b63 == false
                    && b64 == false
                    && b65 == false
                    && b66 == false
                    && b67 == false
                    && b68 == false
                    && b69 == false
                    && b70 == false
                    && b71 == false
                    && b72 == false
                    && b73 == false
                    && b74 == false
                    && b75 == false
                    && b76 == false
                    && b77 == false
                    && b78 == false
                    && b79 == false
                    && b80 == false
                    && b81 == false
                    && b82 == false
                    && b83 == false
                    && b84 == false
                    && b85 == false
                    && b86 == false
                    && b87 == false
                    && b88 == false
                    && b89 == false
                    && b90 == false
                    && b91 == false
                    && b92 == false
                    && b93 == false
                    && b94 == false
                    && b95 == false
                    && b96 == false
                    && b97 == false
                    && b98 == false
                    && b99 == false
                    && b100 == false) {
                
                JOptionPane.showMessageDialog(null, "( x ) Venus", "Sopa de letras", JOptionPane.INFORMATION_MESSAGE, icon);
                venus = true;
                jButton55.setEnabled(false);
                jButton56.setEnabled(false);
                jButton57.setEnabled(false);
                jButton58.setEnabled(false);
                jButton59.setEnabled(false);
                b55 = false;
                b56 = false;
                b57 = false;
                b58 = false;
                b59 = false;
                ve.setVisible(true);
            } else {
                iniciar();
                if (venus == true) {
                    jButton55.setEnabled(false);
                    jButton56.setEnabled(false);
                    jButton57.setEnabled(false);
                    jButton58.setEnabled(false);
                    jButton59.setEnabled(false);
                    jButton55.setBackground(Color.PINK);
                    jButton56.setBackground(Color.PINK);
                    jButton57.setBackground(Color.PINK);
                    jButton58.setBackground(Color.PINK);
                    jButton59.setBackground(Color.PINK);
                }

            }
        } else if (b84 == true && b85 == true && b86 == true && b87 == true && b88 == true && b89 == true) {
            if (b1 == false && b2 == false && b11 == false && b12 == false && b13 == false && b14 == false && b15 == false && b16 == false && b17 == false && b18 == false && b19 == false
                    && b20 == false
                    && b21 == false
                    && b22 == false
                    && b23 == false
                    && b24 == false
                    && b25 == false
                    && b26 == false
                    && b27 == false
                    && b28 == false
                    && b29 == false
                    && b30 == false
                    && b31 == false
                    && b32 == false
                    && b33 == false
                    && b34 == false
                    && b35 == false
                    && b36 == false
                    && b37 == false
                    && b38 == false
                    && b39 == false
                    && b40 == false
                    && b41 == false
                    && b42 == false
                    && b43 == false
                    && b44 == false
                    && b45 == false
                    && b46 == false
                    && b47 == false
                    && b48 == false
                    && b49 == false
                    && b50 == false
                    && b51 == false
                    && b52 == false
                    && b53 == false
                    && b54 == false
                    && b55 == false
                    && b56 == false
                    && b57 == false
                    && b58 == false
                    && b59 == false
                    && b60 == false
                    && b61 == false
                    && b62 == false
                    && b63 == false
                    && b64 == false
                    && b65 == false
                    && b66 == false
                    && b67 == false
                    && b68 == false
                    && b69 == false
                    && b70 == false
                    && b71 == false
                    && b72 == false
                    && b73 == false
                    && b74 == false
                    && b75 == false
                    && b76 == false
                    && b77 == false
                    && b78 == false
                    && b79 == false
                    && b80 == false
                    && b81 == false
                    && b82 == false
                    && b83 == false
                    && b3 == false
                    && b4 == false
                    && b5 == false
                    && b6 == false
                    && b7 == false
                    && b8 == false
                    && b9 == false
                    && b10 == false
                    && b90 == false
                    && b91 == false
                    && b92 == false
                    && b93 == false
                    && b94 == false
                    && b95 == false
                    && b96 == false
                    && b97 == false
                    && b98 == false
                    && b99 == false
                    && b100 == false) {
               
                JOptionPane.showMessageDialog(null, "( x ) Tierra", "Sopa de letras", JOptionPane.INFORMATION_MESSAGE, icon);
                tierra = true;
                jButton84.setEnabled(false);
                jButton85.setEnabled(false);
                jButton86.setEnabled(false);
                jButton87.setEnabled(false);
                jButton88.setEnabled(false);
                jButton89.setEnabled(false);
                b84 = false;
                b85 = false;
                b86 = false;
                b87 = false;
                b88 = false;
                b89 = false;
                jButton84.setBackground(Color.PINK);
                jButton85.setBackground(Color.PINK);
                jButton86.setBackground(Color.PINK);
                jButton87.setBackground(Color.PINK);
                jButton88.setBackground(Color.PINK);
                jButton89.setBackground(Color.PINK);
                t.setVisible(true);
            } else {
                iniciar();
                if (tierra == true) {
                    jButton84.setEnabled(false);
                    jButton85.setEnabled(false);
                    jButton86.setEnabled(false);
                    jButton87.setEnabled(false);
                    jButton88.setEnabled(false);
                    jButton89.setEnabled(false);
                    jButton84.setBackground(Color.PINK);
                    jButton85.setBackground(Color.PINK);
                    jButton86.setBackground(Color.PINK);
                    jButton87.setBackground(Color.PINK);
                    jButton88.setBackground(Color.PINK);
                    jButton89.setBackground(Color.PINK);
                }
            }
        } else if (b61 == true && b62 == true || t1 == true && b63 == true && b64 == true && b65 == true && b66 == true && b67 == true) {
            if (b1 == false && b2 == false && b11 == false && b12 == false && b13 == false && b14 == false && b15 == false && b16 == false && b17 == false && b18 == false && b19 == false
                    && b20 == false
                    && b21 == false
                    && b22 == false
                    && b23 == false
                    && b24 == false
                    && b25 == false
                    && b26 == false
                    && b27 == false
                    && b28 == false
                    && b29 == false
                    && b30 == false
                    && b31 == false
                    && b32 == false
                    && b33 == false
                    && b34 == false
                    && b35 == false
                    && b36 == false
                    && b37 == false
                    && b38 == false
                    && b39 == false
                    && b40 == false
                    && b41 == false
                    && b42 == false
                    && b43 == false
                    && b44 == false
                    && b45 == false
                    && b46 == false
                    && b47 == false
                    && b48 == false
                    && b49 == false
                    && b50 == false
                    && b51 == false
                    && b52 == false
                    && b53 == false
                    && b54 == false
                    && b55 == false
                    && b56 == false
                    && b57 == false
                    && b58 == false
                    && b59 == false
                    && b60 == false
                    && b3 == false
                    && b4 == false
                    && b5 == false
                    && b6 == false
                    && b7 == false
                    && b8 == false
                    && b9 == false
                    && b10 == false
                    && b68 == false
                    && b69 == false
                    && b70 == false
                    && b71 == false
                    && b72 == false
                    && b73 == false
                    && b74 == false
                    && b75 == false
                    && b76 == false
                    && b77 == false
                    && b78 == false
                    && b79 == false
                    && b80 == false
                    && b81 == false
                    && b82 == false
                    && b83 == false
                    && b84 == false
                    && b85 == false
                    && b86 == false
                    && b87 == false
                    && b88 == false
                    && b89 == false
                    && b90 == false
                    && b91 == false
                    && b92 == false
                    && b93 == false
                    && b94 == false
                    && b95 == false
                    && b96 == false
                    && b97 == false
                    && b98 == false
                    && b99 == false
                    && b100 == false) {
                
                JOptionPane.showMessageDialog(null, "( x ) Neptuno", "Sopa de letras", JOptionPane.INFORMATION_MESSAGE, icon);
                neptuno = true;
                jButton61.setEnabled(false);
                jButton62.setEnabled(false);
                jButton63.setEnabled(false);
                jButton64.setEnabled(false);
                jButton65.setEnabled(false);
                jButton66.setEnabled(false);
                jButton67.setEnabled(false);
                b61 = false;
                b62 = false;
                b63 = false;
                b64 = false;
                b65 = false;
                b66 = false;
                b67 = false;
                t1 = true;
                n.setVisible(true);

            } else {
                iniciar();
                if (neptuno == true) {
                    jButton61.setEnabled(false);
                    jButton62.setEnabled(false);
                    jButton63.setEnabled(false);
                    jButton64.setEnabled(false);
                    jButton65.setEnabled(false);
                    jButton66.setEnabled(false);
                    jButton67.setEnabled(false);
                    jButton61.setBackground(Color.PINK);
                    jButton62.setBackground(Color.PINK);
                    jButton63.setBackground(Color.PINK);
                    jButton64.setBackground(Color.PINK);
                    jButton65.setBackground(Color.PINK);
                    jButton66.setBackground(Color.PINK);
                    jButton67.setBackground(Color.PINK);
                    b62 = true;
                }
            }
        } else {
            iniciar();
            if (mercurio == true) {
                jButton3.setEnabled(false);
                jButton4.setEnabled(false);
                jButton5.setEnabled(false);
                jButton6.setEnabled(false);
                jButton7.setEnabled(false);
                jButton8.setEnabled(false);
                jButton9.setEnabled(false);
                jButton10.setEnabled(false);
                jButton3.setBackground(Color.PINK);
                jButton4.setBackground(Color.PINK);
                jButton5.setBackground(Color.PINK);
                jButton6.setBackground(Color.PINK);
                jButton7.setBackground(Color.PINK);
                jButton8.setBackground(Color.PINK);
                jButton9.setBackground(Color.PINK);
                jButton10.setBackground(Color.PINK);
            }

            if (jupiter == true) {
                jButton12.setEnabled(false);
                jButton22.setEnabled(false);
                jButton32.setEnabled(false);
                jButton42.setEnabled(false);
                jButton52.setEnabled(false);
                jButton62.setEnabled(false);
                jButton72.setEnabled(false);
                jButton12.setBackground(Color.PINK);
                jButton22.setBackground(Color.PINK);
                jButton32.setBackground(Color.PINK);
                jButton42.setBackground(Color.PINK);
                jButton52.setBackground(Color.PINK);
                jButton62.setBackground(Color.PINK);
                jButton72.setBackground(Color.PINK);
                b62 = true;
            }

            if (marte == true) {
                jButton18.setEnabled(false);
                jButton27.setEnabled(false);
                jButton36.setEnabled(false);
                jButton45.setEnabled(false);
                jButton54.setEnabled(false);
                jButton18.setBackground(Color.PINK);
                jButton27.setBackground(Color.PINK);
                jButton36.setBackground(Color.PINK);
                jButton45.setBackground(Color.PINK);
                jButton54.setBackground(Color.PINK);
            }

            if (venus == true) {
                jButton55.setEnabled(false);
                jButton56.setEnabled(false);
                jButton57.setEnabled(false);
                jButton58.setEnabled(false);
                jButton59.setEnabled(false);
                jButton55.setBackground(Color.PINK);
                jButton56.setBackground(Color.PINK);
                jButton57.setBackground(Color.PINK);
                jButton58.setBackground(Color.PINK);
                jButton59.setBackground(Color.PINK);
            }

            if (tierra == true) {
                jButton84.setEnabled(false);
                jButton85.setEnabled(false);
                jButton86.setEnabled(false);
                jButton87.setEnabled(false);
                jButton88.setEnabled(false);
                jButton89.setEnabled(false);
                jButton84.setBackground(Color.PINK);
                jButton85.setBackground(Color.PINK);
                jButton86.setBackground(Color.PINK);
                jButton87.setBackground(Color.PINK);
                jButton88.setBackground(Color.PINK);
                jButton89.setBackground(Color.PINK);
            }

            if (neptuno == true) {
                jButton61.setEnabled(false);
                jButton62.setEnabled(false);
                jButton63.setEnabled(false);
                jButton64.setEnabled(false);
                jButton65.setEnabled(false);
                jButton66.setEnabled(false);
                jButton67.setEnabled(false);
                jButton61.setBackground(Color.PINK);
                jButton62.setBackground(Color.PINK);
                jButton63.setBackground(Color.PINK);
                jButton64.setBackground(Color.PINK);
                jButton65.setBackground(Color.PINK);
                jButton66.setBackground(Color.PINK);
                jButton67.setBackground(Color.PINK);
                b62 = true;
            }
        }

        if (neptuno == true && jupiter == true) {
            b62 = false;
        }
    }

    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed
        llenar();
        iniciar();
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        jButton10.setEnabled(true);
        jButton12.setEnabled(true);
        jButton22.setEnabled(true);
        jButton32.setEnabled(true);
        jButton42.setEnabled(true);
        jButton52.setEnabled(true);
        jButton62.setEnabled(true);
        jButton72.setEnabled(true);
        jButton18.setEnabled(true);
        jButton27.setEnabled(true);
        jButton36.setEnabled(true);
        jButton45.setEnabled(true);
        jButton54.setEnabled(true);
        jButton55.setEnabled(true);
        jButton56.setEnabled(true);
        jButton57.setEnabled(true);
        jButton58.setEnabled(true);
        jButton59.setEnabled(true);
        jButton84.setEnabled(true);
        jButton85.setEnabled(true);
        jButton86.setEnabled(true);
        jButton87.setEnabled(true);
        jButton88.setEnabled(true);
        jButton89.setEnabled(true);
        jButton12.setEnabled(true);
        jButton22.setEnabled(true);
        jButton32.setEnabled(true);
        jButton42.setEnabled(true);
        jButton52.setEnabled(true);
        jButton62.setEnabled(true);
        jButton72.setEnabled(true);
        jButton61.setEnabled(true);
        jButton62.setEnabled(true);
        jButton63.setEnabled(true);
        jButton64.setEnabled(true);
        jButton65.setEnabled(true);
        jButton66.setEnabled(true);
        jButton67.setEnabled(true);
        tierra = false;
        venus = false;
        mercurio = false;
        marte = false;
        jupiter = false;
        neptuno = false;
    }//GEN-LAST:event_reiniciarActionPerformed

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked

        main.Menu menu = new main.Menu();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_volverMouseClicked

    private void volverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseEntered
        flechas.setVisible(true);
    }//GEN-LAST:event_volverMouseEntered

    private void volverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseExited
        flechas.setVisible(false);
    }//GEN-LAST:event_volverMouseExited

    public void iniciar() {
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton11.setBackground(Color.LIGHT_GRAY);
        jButton12.setBackground(Color.LIGHT_GRAY);
        jButton13.setBackground(Color.LIGHT_GRAY);
        jButton14.setBackground(Color.LIGHT_GRAY);
        jButton15.setBackground(Color.LIGHT_GRAY);
        jButton16.setBackground(Color.LIGHT_GRAY);
        jButton17.setBackground(Color.LIGHT_GRAY);
        jButton18.setBackground(Color.LIGHT_GRAY);
        jButton19.setBackground(Color.LIGHT_GRAY);
        jButton20.setBackground(Color.LIGHT_GRAY);
        jButton21.setBackground(Color.LIGHT_GRAY);
        jButton22.setBackground(Color.LIGHT_GRAY);
        jButton23.setBackground(Color.LIGHT_GRAY);
        jButton24.setBackground(Color.LIGHT_GRAY);
        jButton25.setBackground(Color.LIGHT_GRAY);
        jButton26.setBackground(Color.LIGHT_GRAY);
        jButton27.setBackground(Color.LIGHT_GRAY);
        jButton28.setBackground(Color.LIGHT_GRAY);
        jButton29.setBackground(Color.LIGHT_GRAY);
        jButton30.setBackground(Color.LIGHT_GRAY);
        jButton31.setBackground(Color.LIGHT_GRAY);
        jButton32.setBackground(Color.LIGHT_GRAY);
        jButton33.setBackground(Color.LIGHT_GRAY);
        jButton34.setBackground(Color.LIGHT_GRAY);
        jButton35.setBackground(Color.LIGHT_GRAY);
        jButton36.setBackground(Color.LIGHT_GRAY);
        jButton37.setBackground(Color.LIGHT_GRAY);
        jButton38.setBackground(Color.LIGHT_GRAY);
        jButton39.setBackground(Color.LIGHT_GRAY);
        jButton40.setBackground(Color.LIGHT_GRAY);
        jButton41.setBackground(Color.LIGHT_GRAY);
        jButton42.setBackground(Color.LIGHT_GRAY);
        jButton43.setBackground(Color.LIGHT_GRAY);
        jButton44.setBackground(Color.LIGHT_GRAY);
        jButton45.setBackground(Color.LIGHT_GRAY);
        jButton46.setBackground(Color.LIGHT_GRAY);
        jButton47.setBackground(Color.LIGHT_GRAY);
        jButton48.setBackground(Color.LIGHT_GRAY);
        jButton49.setBackground(Color.LIGHT_GRAY);
        jButton50.setBackground(Color.LIGHT_GRAY);
        jButton51.setBackground(Color.LIGHT_GRAY);
        jButton52.setBackground(Color.LIGHT_GRAY);
        jButton53.setBackground(Color.LIGHT_GRAY);
        jButton54.setBackground(Color.LIGHT_GRAY);
        jButton55.setBackground(Color.LIGHT_GRAY);
        jButton56.setBackground(Color.LIGHT_GRAY);
        jButton57.setBackground(Color.LIGHT_GRAY);
        jButton58.setBackground(Color.LIGHT_GRAY);
        jButton59.setBackground(Color.LIGHT_GRAY);
        jButton60.setBackground(Color.LIGHT_GRAY);
        jButton61.setBackground(Color.LIGHT_GRAY);
        jButton62.setBackground(Color.LIGHT_GRAY);
        jButton63.setBackground(Color.LIGHT_GRAY);
        jButton64.setBackground(Color.LIGHT_GRAY);
        jButton65.setBackground(Color.LIGHT_GRAY);
        jButton66.setBackground(Color.LIGHT_GRAY);
        jButton67.setBackground(Color.LIGHT_GRAY);
        jButton68.setBackground(Color.LIGHT_GRAY);
        jButton69.setBackground(Color.LIGHT_GRAY);
        jButton71.setBackground(Color.LIGHT_GRAY);
        jButton72.setBackground(Color.LIGHT_GRAY);
        jButton73.setBackground(Color.LIGHT_GRAY);
        jButton74.setBackground(Color.LIGHT_GRAY);
        jButton75.setBackground(Color.LIGHT_GRAY);
        jButton76.setBackground(Color.LIGHT_GRAY);
        jButton77.setBackground(Color.LIGHT_GRAY);
        jButton78.setBackground(Color.LIGHT_GRAY);
        jButton79.setBackground(Color.LIGHT_GRAY);
        jButton80.setBackground(Color.LIGHT_GRAY);
        jButton81.setBackground(Color.LIGHT_GRAY);
        jButton82.setBackground(Color.LIGHT_GRAY);
        jButton83.setBackground(Color.LIGHT_GRAY);
        jButton84.setBackground(Color.LIGHT_GRAY);
        jButton85.setBackground(Color.LIGHT_GRAY);
        jButton86.setBackground(Color.LIGHT_GRAY);
        jButton87.setBackground(Color.LIGHT_GRAY);
        jButton88.setBackground(Color.LIGHT_GRAY);
        jButton89.setBackground(Color.LIGHT_GRAY);
        jButton90.setBackground(Color.LIGHT_GRAY);
        jButton91.setBackground(Color.LIGHT_GRAY);
        jButton92.setBackground(Color.LIGHT_GRAY);
        jButton93.setBackground(Color.LIGHT_GRAY);
        jButton94.setBackground(Color.LIGHT_GRAY);
        jButton95.setBackground(Color.LIGHT_GRAY);
        jButton96.setBackground(Color.LIGHT_GRAY);
        jButton97.setBackground(Color.LIGHT_GRAY);
        jButton98.setBackground(Color.LIGHT_GRAY);
        jButton99.setBackground(Color.LIGHT_GRAY);
        jButton100.setBackground(Color.LIGHT_GRAY);

        b1 = false;
        b2 = false;
        b3 = false;
        b4 = false;
        b5 = false;
        b6 = false;
        b7 = false;
        b8 = false;
        b9 = false;
        b10 = false;
        b11 = false;
        b12 = false;
        b13 = false;
        b14 = false;
        b15 = false;
        b16 = false;
        b17 = false;
        b18 = false;
        b19 = false;
        b20 = false;
        b21 = false;
        b22 = false;
        b23 = false;
        b24 = false;
        b25 = false;
        b26 = false;
        b27 = false;
        b28 = false;
        b29 = false;
        b30 = false;
        b31 = false;
        b32 = false;
        b33 = false;
        b34 = false;
        b35 = false;
        b36 = false;
        b37 = false;
        b38 = false;
        b39 = false;
        b40 = false;
        b41 = false;
        b42 = false;
        b43 = false;
        b44 = false;
        b45 = false;
        b46 = false;
        b47 = false;
        b48 = false;
        b49 = false;
        b50 = false;
        b51 = false;
        b52 = false;
        b53 = false;
        b54 = false;
        b55 = false;
        b56 = false;
        b57 = false;
        b58 = false;
        b59 = false;
        b60 = false;
        b61 = false;
        b62 = false;
        b63 = false;
        b64 = false;
        b65 = false;
        b66 = false;
        b67 = false;
        b68 = false;
        b69 = false;
        b70 = false;
        b71 = false;
        b72 = false;
        b73 = false;
        b74 = false;
        b75 = false;
        b76 = false;
        b77 = false;
        b78 = false;
        b79 = false;
        b80 = false;
        b81 = false;
        b82 = false;
        b83 = false;
        b84 = false;
        b85 = false;
        b86 = false;
        b87 = false;
        b88 = false;
        b89 = false;
        b90 = false;
        b91 = false;
        b92 = false;
        b93 = false;
        b94 = false;
        b95 = false;
        b96 = false;
        b97 = false;
        b98 = false;
        b99 = false;
        b100 = false;

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
    private javax.swing.JButton comprobar;
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
    private javax.swing.JLabel m;
    private javax.swing.JLabel ma;
    private javax.swing.JLabel marco;
    private javax.swing.JLabel martelbl;
    private javax.swing.JLabel mercuriolbl;
    private javax.swing.JLabel n;
    private javax.swing.JLabel neptunolbl;
    private javax.swing.JLabel palabras1;
    private javax.swing.JButton pista;
    private javax.swing.JButton reiniciar;
    private javax.swing.JLabel t;
    private javax.swing.JLabel tierralbl;
    private javax.swing.JLabel ve;
    private javax.swing.JLabel venuslbl;
    private javax.swing.JLabel volver;
    // End of variables declaration//GEN-END:variables
}
