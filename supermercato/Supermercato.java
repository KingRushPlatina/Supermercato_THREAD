/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercato;

import java.awt.Image;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import supermercato.Classi_Persona.Cliente;
import supermercato.Classi_Persona.Dipendente;

/**
 *
 * @author tomma
 */
public class Supermercato extends javax.swing.JFrame {

    /**
     * Creates new form Supermercato
     */
    multithread s = new multithread();
    ImageIcon green = new ImageIcon("green.PNG");
    ImageIcon red = new ImageIcon("red.PNG");
    static Lista[] Casse = new Lista[7];
    static Dipendente[] dip = new Dipendente[20];

    int velocita = 0;
    String Version = "Versione Definitiva"; //VERSIONE PROGRAMMA (Aggiorno quando finisco update, (ricordo anche update nome zip))
    int c1 = 1;
    int c2 = 1;
    int c3 = 1;     //VARIABILI  1=CASSA CHIUSA 
    int c4 = 1;
    int c5 = 1;
    int c6 = 1;

    //ARRAY CLIENTI
    static Cliente[] array = new Cliente[20];

    public Supermercato() {

        initComponents();
        c();  //CREA ARRAY CLIENTI
        CreaSituazioneIniziale(7);
        d();

        s.setL(this);
   
        
        logo("logo.png");
       
            
                
        
               
            

        

    }

    public static void CreaSituazioneIniziale(int Ncasse) {
        Casse[0] = new Lista(0, false);
        Casse[1] = new Lista(1, true);
        System.out.println(Casse[0].numeroIdentificazione);
        System.out.println(Casse[1].numeroIdentificazione);
        for (int i = 2; i < Ncasse; i++) {

            Casse[i] = new Lista(i, false);
            System.out.println(Casse[i].numeroIdentificazione);
        }
    }

    public static void c() {
        array[0] = new Cliente("anziano", "Toto", "uomo");
        array[1] = new Cliente("anziano", "Luigi", "uomo");
        array[2] = new Cliente("incinta", "Greta", "donna");
        array[3] = new Cliente("incinta", "Emma", "donna");
        array[4] = new Cliente("incinta", "Anna", "donna");
        array[5] = new Cliente("incinta", "Giada", "donna");
        array[6] = new Cliente("normale", "Lorenzo", "uomo");
        array[7] = new Cliente("normale", "Alberto", "uomo");
        array[8] = new Cliente("normale", "Gabriele", "uomo");
        array[9] = new Cliente("normale", "Riccardo", "uomo");
        array[10] = new Cliente("normale", "Giulia", "donna");
        array[11] = new Cliente("normale", "Isabella", "donna");
        array[12] = new Cliente("normale", "Monica", "donna");
        array[13] = new Cliente("normale", "Arturo", "uomo");
        array[14] = new Cliente("normale", "Ettore", "uomo");
        array[15] = new Cliente("anziana", "marco", "donna");
        array[16] = new Cliente("anziana", "Luisa", "donna");
        array[17] = new Cliente("normale", "Denise", "donna");
        array[18] = new Cliente("normale", "Serena", "donna");
        array[19] = new Cliente("normale", "Michele", "uomo");
    }

    public static void d() {
        dip[0] = new Dipendente("Maria", "donna");
        dip[1] = new Dipendente("Anna", "donna");
        dip[2] = new Dipendente("Rosa", "donna");
        dip[3] = new Dipendente("Giuseppina", "donna");
        dip[4] = new Dipendente("Sara", "donna");
        dip[5] = new Dipendente("Carla", "donna");
        dip[6] = new Dipendente("Carolina", "donna");
        dip[7] = new Dipendente("Tommaso", "uomo");
        dip[8] = new Dipendente("Aurora", "donna");
        dip[9] = new Dipendente("Emin", "uomo");
        dip[10] = new Dipendente("Mohamed", "uomo");
        dip[11] = new Dipendente("Andrea", "uomo");
        dip[12] = new Dipendente("Paolo", "uomo");
        dip[13] = new Dipendente("Sofia", "donna");
        dip[14] = new Dipendente("Roberto", "uomo");
        dip[15] = new Dipendente("Alessandro", "uomo");
        dip[16] = new Dipendente("Leonardo", "uomo");
        dip[17] = new Dipendente("Mattia", "uomo");
        dip[18] = new Dipendente("Alessia", "donna");
        dip[19] = new Dipendente("Maurizio", "uomo");
    }

    public void logo(String c) {
        ImageIcon icon = new ImageIcon(c);
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
        Image imgscaleSmall = img.getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgscale);
        ImageIcon scaledIconSmall = new ImageIcon(imgscaleSmall);
        jLabel1.setIcon(scaledIcon);
        jLabel5.setIcon(scaledIconSmall);
    }

    public void salva(String aaa, String bbb) {
        try ( FileWriter fw = new FileWriter(aaa + ".txt", true);  BufferedWriter bw = new BufferedWriter(fw);  PrintWriter out = new PrintWriter(bw)) {
            out.println(bbb);
        } catch (IOException e) {
        }
    }

    public void desk1(String c) {
        ImageIcon icon = new ImageIcon(c);
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance(desk1.getWidth(), desk1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgscale);
        desk1.setIcon(scaledIcon);
    }

    public void desk2(String c) {
        ImageIcon icon = new ImageIcon(c);
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance(desk1.getWidth(), desk1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgscale);
        desk2.setIcon(scaledIcon);
    }

    public void desk3(String c) {
        ImageIcon icon = new ImageIcon(c);
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance(desk1.getWidth(), desk1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgscale);
        desk3.setIcon(scaledIcon);
    }

    public void desk4(String c) {
        ImageIcon icon = new ImageIcon(c);
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance(desk1.getWidth(), desk1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgscale);
        desk4.setIcon(scaledIcon);
    }

    public void desk5(String c) {
        ImageIcon icon = new ImageIcon(c);
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance(desk1.getWidth(), desk1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgscale);
        desk5.setIcon(scaledIcon);
    }

    public void desk6(String c) {
        ImageIcon icon = new ImageIcon(c);
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance(desk1.getWidth(), desk1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgscale);
        desk6.setIcon(scaledIcon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel42 = new javax.swing.JLabel();
        jSlider3 = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        Sotto = new javax.swing.JTabbedPane();
        Start = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        Principale = new javax.swing.JPanel();
        desk2 = new javax.swing.JLabel();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        Dipendente1 = new javax.swing.JLabel();
        Dipendente2 = new javax.swing.JLabel();
        Dipendente3 = new javax.swing.JLabel();
        Dipendente4 = new javax.swing.JLabel();
        Dipendente5 = new javax.swing.JLabel();
        Dipendente6 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        coda6 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        coda2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        coda3 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        coda5 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        coda4 = new javax.swing.JTextArea();
        vel = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        button1 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jSlider2 = new javax.swing.JSlider();
        jLabel35 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jSlider5 = new javax.swing.JSlider();
        jLabel45 = new javax.swing.JLabel();
        jSlider4 = new javax.swing.JSlider();
        vel2 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        coda1 = new javax.swing.JTextArea();
        desk1 = new javax.swing.JLabel();
        desk3 = new javax.swing.JLabel();
        desk4 = new javax.swing.JLabel();
        desk5 = new javax.swing.JLabel();
        desk6 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        l2 = new javax.swing.JLabel();
        vel3 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        stat1 = new javax.swing.JTextArea();
        vel4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel42.setText("FREQUENZA CLIENTI:");

        jSlider3.setMaximum(10);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermercato/logo.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Start.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 255));
        jButton1.setText("Start");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 5, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermercato/logo.png"))); // NOI18N

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Amin El ouahidi - Tommaso Mercuri  ");

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("VERSIONE: "+Version);

        javax.swing.GroupLayout StartLayout = new javax.swing.GroupLayout(Start);
        Start.setLayout(StartLayout);
        StartLayout.setHorizontalGroup(
            StartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(StartLayout.createSequentialGroup()
                .addGroup(StartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StartLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(StartLayout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 332, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        StartLayout.setVerticalGroup(
            StartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StartLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );

        Sotto.addTab("Start", Start);

        Principale.setBackground(new java.awt.Color(255, 255, 255));

        desk2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermercato/green.PNG"))); // NOI18N
        button2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermercato/red.PNG"))); // NOI18N
        button3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermercato/red.PNG"))); // NOI18N
        button4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermercato/red.PNG"))); // NOI18N
        button5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermercato/red.PNG"))); // NOI18N
        button6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        Dipendente1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Dipendente1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Dipendente1.setText("Nome dipendente");

        Dipendente2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Dipendente2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Dipendente2.setText("Nome dipendente");

        Dipendente3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Dipendente3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Dipendente3.setText("Nome dipendente");

        Dipendente4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Dipendente4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Dipendente4.setText("Nome dipendente");

        Dipendente5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Dipendente5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Dipendente5.setText("Nome dipendente");

        Dipendente6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Dipendente6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Dipendente6.setText("Nome dipendente");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("CASSA 2");
        jLabel25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("CASSA 3");
        jLabel26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("CASSA 4");
        jLabel27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("CASSA 5");
        jLabel28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("CASSA 6");
        jLabel29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        l1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l1.setText("orologio");

        coda6.setBackground(new java.awt.Color(204, 204, 255));
        coda6.setColumns(20);
        coda6.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        coda6.setRows(5);
        coda6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        coda6.setFocusable(false);
        jScrollPane1.setViewportView(coda6);

        coda2.setBackground(new java.awt.Color(204, 204, 255));
        coda2.setColumns(20);
        coda2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        coda2.setRows(5);
        coda2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        coda2.setFocusable(false);
        jScrollPane3.setViewportView(coda2);

        coda3.setBackground(new java.awt.Color(204, 204, 255));
        coda3.setColumns(20);
        coda3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        coda3.setRows(5);
        coda3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        coda3.setFocusable(false);
        jScrollPane4.setViewportView(coda3);

        coda5.setBackground(new java.awt.Color(204, 204, 255));
        coda5.setColumns(20);
        coda5.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        coda5.setRows(5);
        coda5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        coda5.setFocusable(false);
        jScrollPane5.setViewportView(coda5);

        coda4.setBackground(new java.awt.Color(204, 204, 255));
        coda4.setColumns(20);
        coda4.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        coda4.setRows(5);
        coda4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        coda4.setFocusable(false);
        jScrollPane6.setViewportView(coda4);

        vel.setBackground(new java.awt.Color(255, 255, 102));
        vel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        vel.setText("TEMPO: Default");
        vel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                velActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setText("Market Manager ");

        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermercato/red.PNG"))); // NOI18N
        button1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jLabel32.setBackground(new java.awt.Color(255, 51, 51));
        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("*FREQUENZA ENTRATE:");
        jLabel32.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 0, true));

        jSlider2.setMaximum(20);
        jSlider2.setMinimum(1);
        jSlider2.setMinorTickSpacing(1);
        jSlider2.setValue(10);
        jSlider2.setInverted(true);
        jSlider2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider2StateChanged(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("CASSA 1");
        jLabel35.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel16.setText("DEV: Amin El ouahidi - Tommaso Mercuri  ");

        jLabel17.setText("VERSIONE: "+Version);

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 204));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("CASSA SPECIALE");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 204));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("CASSA NORMALE");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 204));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("CASSA NORMALE");

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel44.setText("*FREQUENZA USCITE:");

        jSlider5.setMinimum(1);
        jSlider5.setInverted(true);
        jSlider5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider5StateChanged(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel45.setText("CAMBIO DIPENDENTI:");

        jSlider4.setMaximum(40);
        jSlider4.setMinimum(1);
        jSlider4.setValue(20);
        jSlider4.setInverted(true);
        jSlider4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider4StateChanged(evt);
            }
        });

        vel2.setBackground(new java.awt.Color(102, 153, 255));
        vel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        vel2.setText("STATISTICHE");
        vel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vel2ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.setText("*RESET VALORI SLIDERS");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        coda1.setBackground(new java.awt.Color(204, 204, 255));
        coda1.setColumns(20);
        coda1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        coda1.setRows(5);
        coda1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        coda1.setFocusable(false);
        jScrollPane7.setViewportView(coda1);

        desk1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        desk3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        desk4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        desk5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        desk6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 204));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("CASSA NORMALE");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 204));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("CASSA NORMALE");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 204));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("CASSA NORMALE");

        javax.swing.GroupLayout PrincipaleLayout = new javax.swing.GroupLayout(Principale);
        Principale.setLayout(PrincipaleLayout);
        PrincipaleLayout.setHorizontalGroup(
            PrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipaleLayout.createSequentialGroup()
                .addGroup(PrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipaleLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSlider5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSlider4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(262, 262, 262))
                    .addGroup(PrincipaleLayout.createSequentialGroup()
                        .addGroup(PrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PrincipaleLayout.createSequentialGroup()
                                .addGroup(PrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PrincipaleLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(Dipendente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(PrincipaleLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(PrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(PrincipaleLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(PrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(PrincipaleLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(desk1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(PrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipaleLayout.createSequentialGroup()
                                .addGroup(PrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Dipendente2, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Dipendente3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PrincipaleLayout.createSequentialGroup()
                                        .addComponent(Dipendente4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(22, 22, 22)
                                        .addComponent(Dipendente5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Dipendente6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(PrincipaleLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(202, 202, 202))
                            .addGroup(PrincipaleLayout.createSequentialGroup()
                                .addGroup(PrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PrincipaleLayout.createSequentialGroup()
                                        .addGroup(PrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(2, 2, 2)
                                        .addGroup(PrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(PrincipaleLayout.createSequentialGroup()
                                                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(PrincipaleLayout.createSequentialGroup()
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(4, 4, 4)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(PrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(PrincipaleLayout.createSequentialGroup()
                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(PrincipaleLayout.createSequentialGroup()
                                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PrincipaleLayout.createSequentialGroup()
                                        .addGap(671, 671, 671)
                                        .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PrincipaleLayout.createSequentialGroup()
                                        .addComponent(desk2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(desk3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(desk4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(desk5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(desk6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(PrincipaleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PrincipaleLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel16))
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(PrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PrincipaleLayout.createSequentialGroup()
                                .addComponent(vel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101)
                        .addGroup(PrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(l1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
            .addGroup(PrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipaleLayout.createSequentialGroup()
                    .addContainerGap(1210, Short.MAX_VALUE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(540, 540, 540)))
        );
        PrincipaleLayout.setVerticalGroup(
            PrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipaleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PrincipaleLayout.createSequentialGroup()
                        .addGroup(PrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(jLabel37)
                            .addComponent(jLabel38)
                            .addComponent(jLabel43)
                            .addComponent(jLabel46)
                            .addComponent(jLabel47))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel27)
                                .addComponent(jLabel28)
                                .addComponent(jLabel29)
                                .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel26)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Dipendente1)
                            .addComponent(Dipendente2)
                            .addComponent(Dipendente3)
                            .addComponent(Dipendente4)
                            .addComponent(Dipendente5)
                            .addComponent(Dipendente6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(desk2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(desk1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(desk3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(desk4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(desk5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(desk6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button2)
                            .addComponent(button3)
                            .addComponent(button4)
                            .addComponent(button5)
                            .addComponent(button6)
                            .addComponent(button1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSlider2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                            .addGroup(PrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSlider5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSlider4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PrincipaleLayout.createSequentialGroup()
                                .addComponent(l1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17)
                                .addGap(31, 31, 31))
                            .addGroup(PrincipaleLayout.createSequentialGroup()
                                .addGroup(PrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(vel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PrincipaleLayout.createSequentialGroup()
                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(116, 116, 116))
            .addGroup(PrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PrincipaleLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
                    .addGap(90, 90, 90)))
        );

        Sotto.addTab("Principale", Principale);

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton8.setText("Indietro");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        l2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l2.setText("orologio");

        vel3.setBackground(new java.awt.Color(0, 255, 0));
        vel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        vel3.setText("SALVA FILE");
        vel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vel3ActionPerformed(evt);
            }
        });

        stat1.setColumns(20);
        stat1.setRows(5);
        jScrollPane10.setViewportView(stat1);

        vel4.setBackground(new java.awt.Color(51, 153, 255));
        vel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        vel4.setText("AGGIORNA");
        vel4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vel4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Statistiche dipendenti:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(473, 473, 473)
                                .addComponent(vel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(vel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 96, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(vel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                .addContainerGap())
        );

        Sotto.addTab("Statistiche", jPanel1);

        getContentPane().add(Sotto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1000, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
       
        c1++;                                         //CASSA SPECIALE 
        if (c1 == 2) {
            c1 = 0;
        }
        if (c1 == 0) {
            desk1("uomocassa.png");
            button1.setIcon(green);
            Casse[0].aperta = true;
            s.SetCasse();
        } else if (c1 == 1) {
            Dipendente1.setText("");
            button1.setIcon(red);
            desk1("empty.png");
            Casse[0].aperta = false;
        }

    }//GEN-LAST:event_button1ActionPerformed

    private void velActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_velActionPerformed
        velocita++;                                 //BOTTONE PER MODIFICARE LA VELOCITA DEL PROGRAMMA 
        if (velocita == 3) {
            velocita = 0;
        }
        if (velocita == 0) {
            vel.setText("TEMPO: Default");
            multithread.setVelocita(300);

        } else if (velocita == 1) {
            vel.setText("TEMPO: Veloce");
            multithread.setVelocita(100);
        } else if (velocita == 2) {
            vel.setText("TEMPO: Molto Veloce");
            multithread.setVelocita(20);
        }
    }//GEN-LAST:event_velActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        c6++;
        if (c6 == 2) {
            c6 = 0;
        }
        if (c6 == 0) {
            desk6("uomocassa.png");
            button6.setIcon(green);
            Casse[5].aperta = true;
            s.SetCasse();
        } else if (c6 == 1) {
            Dipendente6.setText("");
            button6.setIcon(red);
            desk6("empty.png");
            Casse[5].aperta = false;
        }
    }//GEN-LAST:event_button6ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        c5++;
        if (c5 == 2) {
            c5 = 0;
        }
        if (c5 == 0) {
            desk5("uomocassa.png");
            button5.setIcon(green);
            Casse[4].aperta = true;
            s.SetCasse();
        } else if (c5 == 1) {
            Dipendente5.setText("");
            button5.setIcon(red);
            desk5("empty.png");
            Casse[4].aperta = false;
        }
    }//GEN-LAST:event_button5ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        c4++;
        if (c4 == 2) {
            c4 = 0;
        }
        if (c4 == 0) {
            desk4("uomocassa.png");
            button4.setIcon(green);
            Casse[3].aperta = true;
            s.SetCasse();
        } else if (c4 == 1) {
            Dipendente4.setText("");
            button4.setIcon(red);
            desk4("empty.png");
            Casse[3].aperta = false;
        }
    }//GEN-LAST:event_button4ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        c3++;
        if (c3 == 2) {
            c3 = 0;
        }
        if (c3 == 0) {
            desk3("uomocassa.png");
            button3.setIcon(green);
            Casse[2].aperta = true;
            s.SetCasse();
        } else if (c3 == 1) {
            Dipendente3.setText("");
            button3.setIcon(red);
            desk3("empty.png");
            Casse[2].aperta = false;
        }
    }//GEN-LAST:event_button3ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        c2++;
        if (c2 == 2) {
            c2 = 0;
        }
        if (c2 == 0) {
            desk2("uomocassa.png");
            button2.setIcon(green);
            Casse[1].aperta = true;
            s.SetCasse();
        } else if (c2 == 1) {
            Dipendente2.setText("");
            button2.setIcon(red);
            desk2("empty.png");
            Casse[1].aperta = false;
        }
    }//GEN-LAST:event_button2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Sotto.setSelectedIndex(1);     
                                  //BOTTONE CHE FA IN MODO CHE IL PROGRAMMA INIZI AVVIO 
         s.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Sotto.setSelectedIndex(1);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void vel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vel2ActionPerformed

        Sotto.setSelectedIndex(2);
        String info = "";
        for (int i = 0; i < dip.length; i++) {
            info += "NOME: " + dip[i].nome + " SESSO :  " + dip[i].sesso + " NUMERO TURNI: " + dip[i].numC + " STIPENDIO: " + dip[i].Stipendio + "€ " + "\n";
        }
        stat1.setText(info);


    }//GEN-LAST:event_vel2ActionPerformed

    private void vel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vel3ActionPerformed
        String aggiorna = "";
        for (int i = 0; i < dip.length; i++) {
            aggiorna += "NOME: " + dip[i].nome + " SESSO :  " + dip[i].sesso + " NUMERO TURNI: " + dip[i].numC + " STIPENDIO: " + dip[i].Stipendio + "€ " + "\n";
        }
        stat1.setText(aggiorna);
        String salva = JOptionPane.showInputDialog(this, "Inserisci nome file:");
        String descrizione = stat1.getText();
        salva(salva, descrizione);
    }//GEN-LAST:event_vel3ActionPerformed

    private void jSlider2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider2StateChanged
        int valore = jSlider2.getValue();
        System.out.println(valore);
        multithread.setEntrate(valore);
    }//GEN-LAST:event_jSlider2StateChanged

    private void jSlider5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider5StateChanged
        int valore = jSlider5.getValue();
        System.out.println(valore);
        multithread.setUscite(valore);
    }//GEN-LAST:event_jSlider5StateChanged

    private void jSlider4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider4StateChanged
        int valore = jSlider4.getValue();
        System.out.println(valore);
        multithread.setCambio(valore);
    }//GEN-LAST:event_jSlider4StateChanged

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        int jsd = 10;                
        jSlider2.setValue(jsd);
        int jsc = 50;
        jSlider5.setValue(jsc);
        int jsq = 1;
        jSlider4.setValue(jsq);
        multithread.setEntrate(jsd);
        multithread.setUscite(jsc);
        multithread.setCambio(jsq);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void vel4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vel4ActionPerformed
       
        String s = "";
        for (int i = 0; i < dip.length; i++) {
           s+= "NOME: " + dip[i].nome + " SESSO :  " + dip[i].sesso + " NUMERO TURNI: " + dip[i].numC + " STIPENDIO: " + dip[i].Stipendio + "€ " + "\n";  
           //STAMPA INFORMAZIONI STATISTICHE NEL FORM
        }
        stat1.setText(s);
    }//GEN-LAST:event_vel4ActionPerformed

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
            java.util.logging.Logger.getLogger(Supermercato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supermercato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supermercato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supermercato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supermercato().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Dipendente1;
    public static javax.swing.JLabel Dipendente2;
    public static javax.swing.JLabel Dipendente3;
    public static javax.swing.JLabel Dipendente4;
    public static javax.swing.JLabel Dipendente5;
    public static javax.swing.JLabel Dipendente6;
    private javax.swing.JPanel Principale;
    private javax.swing.JTabbedPane Sotto;
    private javax.swing.JPanel Start;
    public javax.swing.JButton button1;
    private javax.swing.JButton button2;
    public javax.swing.JButton button3;
    public javax.swing.JButton button4;
    public javax.swing.JButton button5;
    public javax.swing.JButton button6;
    public javax.swing.JTextArea coda1;
    public javax.swing.JTextArea coda2;
    public javax.swing.JTextArea coda3;
    public javax.swing.JTextArea coda4;
    public javax.swing.JTextArea coda5;
    public javax.swing.JTextArea coda6;
    private javax.swing.JLabel desk1;
    private javax.swing.JLabel desk2;
    private javax.swing.JLabel desk3;
    private javax.swing.JLabel desk4;
    private javax.swing.JLabel desk5;
    private javax.swing.JLabel desk6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    public javax.swing.JLabel jLabel36;
    public javax.swing.JLabel jLabel37;
    public javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    public javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    public javax.swing.JLabel jLabel46;
    public javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSlider jSlider3;
    private javax.swing.JSlider jSlider4;
    private javax.swing.JSlider jSlider5;
    public javax.swing.JLabel l1;
    public javax.swing.JLabel l2;
    public javax.swing.JTextArea stat1;
    private javax.swing.JButton vel;
    private javax.swing.JButton vel2;
    private javax.swing.JButton vel3;
    private javax.swing.JButton vel4;
    // End of variables declaration//GEN-END:variables
}
