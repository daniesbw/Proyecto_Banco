/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Daniel
 */
public class Main extends javax.swing.JFrame {

    static Random azar = new Random();

    /**
     * Creates new form Main
     */
    public Main() {

        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Inputs");
        banco = new Banco();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        c_metodo = new javax.swing.ButtonGroup();
        ventanaPersonas = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        personaActual = new javax.swing.JLabel();
        pg_personas = new javax.swing.JProgressBar();
        jl_reloj1 = new javax.swing.JLabel();
        jf_metodo1 = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_colaPersonas1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_cajerosStatus = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tp_transaccion = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        jl_reloj = new javax.swing.JLabel();
        jl_contPersonas = new javax.swing.JLabel();
        jf_results = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_cajeros = new javax.swing.JTree();
        jScrollPane4 = new javax.swing.JScrollPane();
        jt_gestiones = new javax.swing.JTable();
        jd_metodo2 = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        ta_cajerosStatus1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jl_reloj2 = new javax.swing.JLabel();
        jl_contPersonas1 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jt_cajero1 = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        jt_cajero2 = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        jt_cajero3 = new javax.swing.JTable();
        jScrollPane12 = new javax.swing.JScrollPane();
        jt_cajero4 = new javax.swing.JTable();
        jScrollPane13 = new javax.swing.JScrollPane();
        jt_cajero5 = new javax.swing.JTable();
        jl_cont2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        primerMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        b_metodo1 = new javax.swing.JRadioButton();
        b_metodo2 = new javax.swing.JRadioButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        cb_cantcajeros = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CREADOR DE PERSONAS");

        personaActual.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        personaActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        pg_personas.setMaximum(700);

        jl_reloj1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jl_reloj1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_reloj1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pg_personas, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jl_reloj1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(51, 51, 51)
                .addComponent(personaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(pg_personas, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        javax.swing.GroupLayout ventanaPersonasLayout = new javax.swing.GroupLayout(ventanaPersonas.getContentPane());
        ventanaPersonas.getContentPane().setLayout(ventanaPersonasLayout);
        ventanaPersonasLayout.setHorizontalGroup(
            ventanaPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ventanaPersonasLayout.setVerticalGroup(
            ventanaPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jt_colaPersonas1.setBackground(new java.awt.Color(0, 0, 0));
        jt_colaPersonas1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jt_colaPersonas1.setForeground(new java.awt.Color(255, 255, 255));
        jt_colaPersonas1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cola Personas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jt_colaPersonas1);

        ta_cajerosStatus.setEditable(false);
        ta_cajerosStatus.setBackground(new java.awt.Color(0, 0, 0));
        ta_cajerosStatus.setColumns(20);
        ta_cajerosStatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ta_cajerosStatus.setForeground(new java.awt.Color(255, 255, 255));
        ta_cajerosStatus.setRows(5);
        jScrollPane1.setViewportView(ta_cajerosStatus);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SIMULACION");

        tp_transaccion.setBackground(new java.awt.Color(0, 0, 0));
        tp_transaccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tp_transaccion.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setViewportView(tp_transaccion);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ESTATUS ACTUAL");

        jl_reloj.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jl_reloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jl_contPersonas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jl_reloj, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jl_contPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane5)))
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_reloj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jl_contPersonas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jf_metodo1Layout = new javax.swing.GroupLayout(jf_metodo1.getContentPane());
        jf_metodo1.getContentPane().setLayout(jf_metodo1Layout);
        jf_metodo1Layout.setHorizontalGroup(
            jf_metodo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jf_metodo1Layout.setVerticalGroup(
            jf_metodo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("RESULTADOS");
        jLabel5.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jt_cajeros.setBackground(new java.awt.Color(255, 255, 255));
        jt_cajeros.setForeground(new java.awt.Color(0, 0, 0));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Cajeros");
        jt_cajeros.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jt_cajeros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_cajerosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jt_cajeros);

        jt_gestiones.setBackground(new java.awt.Color(255, 255, 255));
        jt_gestiones.setForeground(new java.awt.Color(0, 0, 0));
        jt_gestiones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GESTIONES"
            }
        ));
        jScrollPane4.setViewportView(jt_gestiones);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jf_resultsLayout = new javax.swing.GroupLayout(jf_results.getContentPane());
        jf_results.getContentPane().setLayout(jf_resultsLayout);
        jf_resultsLayout.setHorizontalGroup(
            jf_resultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jf_resultsLayout.setVerticalGroup(
            jf_resultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        ta_cajerosStatus1.setEditable(false);
        ta_cajerosStatus1.setBackground(new java.awt.Color(0, 0, 0));
        ta_cajerosStatus1.setColumns(20);
        ta_cajerosStatus1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ta_cajerosStatus1.setForeground(new java.awt.Color(255, 255, 255));
        ta_cajerosStatus1.setRows(5);
        jScrollPane7.setViewportView(ta_cajerosStatus1);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SIMULACION");

        jl_reloj2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jl_reloj2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jl_contPersonas1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jt_cajero1.setBackground(new java.awt.Color(0, 0, 0));
        jt_cajero1.setForeground(new java.awt.Color(255, 255, 255));
        jt_cajero1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cajero 1"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(jt_cajero1);

        jt_cajero2.setBackground(new java.awt.Color(0, 0, 0));
        jt_cajero2.setForeground(new java.awt.Color(255, 255, 255));
        jt_cajero2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cajero 2"
            }
        ));
        jScrollPane10.setViewportView(jt_cajero2);

        jt_cajero3.setBackground(new java.awt.Color(0, 0, 0));
        jt_cajero3.setForeground(new java.awt.Color(255, 255, 255));
        jt_cajero3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cajero 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane11.setViewportView(jt_cajero3);

        jt_cajero4.setBackground(new java.awt.Color(0, 0, 0));
        jt_cajero4.setForeground(new java.awt.Color(255, 255, 255));
        jt_cajero4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cajero 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane12.setViewportView(jt_cajero4);

        jt_cajero5.setBackground(new java.awt.Color(0, 0, 0));
        jt_cajero5.setForeground(new java.awt.Color(255, 255, 255));
        jt_cajero5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cajero 5"
            }
        ));
        jScrollPane13.setViewportView(jt_cajero5);

        jl_cont2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jl_reloj2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(jl_cont2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(191, 191, 191)
                        .addComponent(jl_contPersonas1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addGap(76, 76, 76)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jl_reloj2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(jl_contPersonas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jl_cont2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jd_metodo2Layout = new javax.swing.GroupLayout(jd_metodo2.getContentPane());
        jd_metodo2.getContentPane().setLayout(jd_metodo2Layout);
        jd_metodo2Layout.setHorizontalGroup(
            jd_metodo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jd_metodo2Layout.setVerticalGroup(
            jd_metodo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        primerMenu.setBackground(new java.awt.Color(204, 204, 204));
        primerMenu.setForeground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("EL MEJOR BANCO DEL MUNDO");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("METODO DE USO DE LOS CAJEROS");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CANTIDAD DE CAJEROS");

        c_metodo.add(b_metodo1);
        b_metodo1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        b_metodo1.setText("METODO 1");

        c_metodo.add(b_metodo2);
        b_metodo2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        b_metodo2.setText("METODO 2");
        b_metodo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_metodo2ActionPerformed(evt);
            }
        });

        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jToggleButton1.setText("INICIAR");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });

        cb_cantcajeros.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cb_cantcajeros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniel\\Dropbox\\5 Periodo\\Estructura de Datos\\Semana 8\\Banco\\Imagenes\\logo-small.png")); // NOI18N

        javax.swing.GroupLayout primerMenuLayout = new javax.swing.GroupLayout(primerMenu);
        primerMenu.setLayout(primerMenuLayout);
        primerMenuLayout.setHorizontalGroup(
            primerMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(primerMenuLayout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addGroup(primerMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(primerMenuLayout.createSequentialGroup()
                        .addGroup(primerMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_cantcajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(primerMenuLayout.createSequentialGroup()
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, primerMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(68, 68, 68))
            .addGroup(primerMenuLayout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addGroup(primerMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(primerMenuLayout.createSequentialGroup()
                        .addComponent(b_metodo1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(b_metodo2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        primerMenuLayout.setVerticalGroup(
            primerMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, primerMenuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(primerMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(primerMenuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(primerMenuLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_cantcajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(primerMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_metodo1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_metodo2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(primerMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(primerMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_metodo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_metodo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_metodo2ActionPerformed

    public void enseñarTransa(int cantCajeros, ArrayList<Cajero> pCajeros) {
        jf_metodo1.setVisible(false);

        jf_results.setTitle("RESULTADOS");
        jf_results.pack();
        jf_results.setLocationRelativeTo(null);
        jf_results.setVisible(true);

        inicioResults(cantCajeros);
        cajeros = pCajeros;
    }

    /*
        METODO INICIAR
     */

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        if (b_metodo1.isSelected() == true || b_metodo2.isSelected() == true && cb_cantcajeros.getItemAt(cb_cantcajeros.getSelectedIndex()) != "") {//Safe coding

            cantCajeros = Integer.parseInt(cb_cantcajeros.getItemAt(cb_cantcajeros.getSelectedIndex()));
            banco.crearCajeros(cantCajeros);

            if (b_metodo1.isSelected() == true) {
                metodo1IsSelected = true;
                agregarPersonasCola();
            } else if (b_metodo2.isSelected() == true) {
                metodo2IsSelected = true;
                agregarPersonas2();
            }

            this.setVisible(false);

            //Mostrar ventana creando personas
            ventanaPersonas.setTitle("Creando Personas...");
            ventanaPersonas.pack();
            ventanaPersonas.setLocationRelativeTo(null);
            ventanaPersonas.setVisible(true);

            Thread hilo = new Thread(runnable);
            hilo.start();

        } else {
            JOptionPane.showMessageDialog(this, "TIENE QUE LLENAR TODO!");
        }
    }//GEN-LAST:event_jToggleButton1MouseClicked

    //Ver las transacciones de un cajeros
    private void jt_cajerosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_cajerosMouseClicked
        int row = jt_cajeros.getClosestRowForLocation(
                evt.getX(), evt.getY());//Conseguir el cajero seleccionado

        if (row != 0) {
            Cajero cajeroSelected = cajeros.get(row - 1);

            DefaultTableModel model = (DefaultTableModel) jt_gestiones.getModel();
            model.getDataVector().removeAllElements();
            for (int i = 0; i < cajeroSelected.gestiones.getP().size(); i++) {
                model.addRow(new Object[]{cajeroSelected.gestiones.getP().get(i)});
            }
        }

    }//GEN-LAST:event_jt_cajerosMouseClicked

    public void agregarPersonasCola() {
        for (int i = 0; i < 70; i++) {
            int edadRand = azar.nextInt(70 - 18) + 18;
            banco.addPersona(new Persona(edadRand, getNombreRandom(), getApellidoRandom()));
        }
    }

    public void agregarPersonas2() {

        for (int i = 0; i < 70; i++) {
            int edadRand = azar.nextInt(70 - 18) + 18;

            //CONSEGUIR LOS TAMAÑOS DE LAS COLAS EN LOS CAJEROS
            ArrayList<Integer> sizesPersona = new ArrayList();
            for (int j = 0; j < banco.getCajeros().size(); j++) {
                sizesPersona.add(banco.getCajeros().get(j).sizePersonas());
            }

            //REVISAR SI TODOS SON IGUALES
            boolean mismoTamaño = sizesPersona.stream()
                    .distinct()
                    .count() <= 1;

            if (mismoTamaño == true) {//Si todos tienen el mismo tamaño 
                int cajeroSeleccionadoRandom = azar.nextInt(banco.getCajeros().size());

                banco.getCajeros().get(cajeroSeleccionadoRandom).personas.PONE(
                        new Persona(edadRand, getNombreRandom(), getApellidoRandom()));

            } else {//SI TIENEN DIFERENTES TAMAÑOS 

                Cajero tem = banco.getCajeros().get(0);
                for (Cajero p : banco.getCajeros()) {
                    int pSize = p.sizePersonas();
                    if (pSize < tem.sizePersonas()) {
                        tem = p;
                    }
                }

                int pos = banco.getCajeros().indexOf(tem);//GET POSICION DEL CAJERO MAS PEQUEÑO 

                banco.getCajeros().get(pos).getPersonas().PONE(
                        new Persona(edadRand, getNombreRandom(), getApellidoRandom()));
            }

        }
    }

    public String getNombreRandom() {
        ArrayList<String> nombres = new ArrayList();
        nombres.add("Daniel");
        nombres.add("Pedro");
        nombres.add("Javier");
        nombres.add("Carlos");
        nombres.add("Angel");
        nombres.add("Claudio");
        nombres.add("Mario");
        nombres.add("Alejandro");
        nombres.add("Juanca");
        nombres.add("David");
        nombres.add("Adalberto");
        nombres.add("Horacio");

        nombres.add("Sofia");
        nombres.add("Maria");
        nombres.add("Scarlet");
        nombres.add("Steffany");
        nombres.add("Claudy");
        nombres.add("Camila");
        nombres.add("Angela");
        nombres.add("Andrea");
        nombres.add("Olivia");
        nombres.add("Emily");
        nombres.add("Isabella");

        Collections.shuffle(nombres);

        return nombres.get(0);
    }

    public String getApellidoRandom() {
        ArrayList<String> apellidos = new ArrayList();
        apellidos.add("González");
        apellidos.add("Rojas");
        apellidos.add("Sanchez");
        apellidos.add("Muños");
        apellidos.add("Perez");
        apellidos.add("Silva");
        apellidos.add("Contreras");

        Collections.shuffle(apellidos);

        return apellidos.get(0);
    }

    public void inicioResults(int cajeros) {
        DefaultTreeModel m = (DefaultTreeModel) jt_cajeros.getModel();
        DefaultMutableTreeNode cabeza = (DefaultMutableTreeNode) m.getRoot();
        for (int i = 0; i < cajeros; i++) {
            DefaultMutableTreeNode n = new DefaultMutableTreeNode("Cajero " + (i + 1));
            cabeza.add(n);
        }
        m.reload();

    }

    public void actualizarDatos2() {
        //JTable cajero 1
        DefaultTableModel model = (DefaultTableModel) jt_cajero1.getModel();
        model.setRowCount(0);
        try {

            if (banco.getCajeros().get(0) != null) {//Si existe el cajero
                for (int j = 0; j < banco.getCajeros().get(0).sizePersonas(); j++) {
                    Persona temp = (Persona) banco.getCajeros().get(0).getPersonas().getP().get(j);
                    model.addRow(new Object[]{temp.getNom() + " " + temp.getApellido()});
                }
            }
        } catch (IndexOutOfBoundsException e) {
        }
        //JTable cajero 2
        model = (DefaultTableModel) jt_cajero2.getModel();
        model.setRowCount(0);
        try {
            if (banco.getCajeros().get(1) != null) {//Si existe el cajero
                for (int j = 0; j < banco.getCajeros().get(1).sizePersonas(); j++) {
                    Persona temp = (Persona) banco.getCajeros().get(1).getPersonas().getP().get(j);
                    model.addRow(new Object[]{temp.getNom() + " " + temp.getApellido()});
                }
            }
        } catch (IndexOutOfBoundsException e) {
        }

        //JTable cajero 3
        model = (DefaultTableModel) jt_cajero3.getModel();
        model.setRowCount(0);
        try {
            if (banco.getCajeros().get(2) != null) {//Si existe el cajero
                for (int j = 0; j < banco.getCajeros().get(2).sizePersonas(); j++) {
                    Persona temp = (Persona) banco.getCajeros().get(2).getPersonas().getP().get(j);
                    model.addRow(new Object[]{temp.getNom() + " " + temp.getApellido()});
                }
            }
        } catch (IndexOutOfBoundsException e) {
        }

        //JTable cajero 4
        model = (DefaultTableModel) jt_cajero4.getModel();
        model.setRowCount(0);
        try {
            if (banco.getCajeros().get(3) != null) {//Si existe el cajero
                for (int j = 0; j < banco.getCajeros().get(3).sizePersonas(); j++) {
                    Persona temp = (Persona) banco.getCajeros().get(3).getPersonas().getP().get(j);
                    model.addRow(new Object[]{temp.getNom() + " " + temp.getApellido()});
                }
            }
        } catch (IndexOutOfBoundsException e) {
        }

        //JTable cajero 5
        model = (DefaultTableModel) jt_cajero5.getModel();
        model.setRowCount(0);
        try {
            if (banco.getCajeros().get(4) != null) {//Si existe el cajero
                for (int j = 0; j < banco.getCajeros().get(4).sizePersonas(); j++) {
                    Persona temp = (Persona) banco.getCajeros().get(4).getPersonas().getP().get(j);
                    model.addRow(new Object[]{temp.getNom() + " " + temp.getApellido()});
                }
            }
        } catch (IndexOutOfBoundsException e) {
        }

        //ESTATUS
        try {
            String estatus = "";
            for (int j = 0; j < banco.getCajeros().size(); j++) {
                if (banco.getCajeros().get(j).getPersonas().getP().size() != 0) {
                    estatus += "Cajero " + (j + 1) + " " + banco.getCajeros().get(j).getPersonas().FRENTE() + "\n";
                } else {
                    estatus += "Cajero " + (j + 1) + " " + "VACIO" + "\n";
                }

            }
            ta_cajerosStatus1.setText("");
            ta_cajerosStatus1.setText(estatus);
        } catch (IndexOutOfBoundsException e) {
        }

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    Runnable cronometro = new Runnable() {
        @Override
        public void run() {
            try {
                Thread hiloMetodo2 = new Thread(hilo_metodo2);
                hiloMetodo2.start();

                int minuto = 0;
                int segundo = 0;
                while (minuto != 2) {
                    segundoGlobal++;
                    if (segundo == 60) {
                        segundo = 0;
                        minuto += 1;
                    }

                    jl_reloj.setText("0" + minuto + " : " + segundo);
                    jl_reloj1.setText("0" + minuto + " : " + segundo);

                    //Metodo 2
                    jl_reloj2.setText("0" + minuto + " : " + segundo);
                    segundo++;
                    jLabel10.setText(String.valueOf(segundoGlobal));
                    Thread.sleep(1000);
                }

                hiloMetodo2.stop();
                jd_metodo2.setVisible(false);
                    enseñarTransa(banco.getCajeros().size(), banco.getCajeros());
            } catch (InterruptedException e) {

            }
        }
    };

    Runnable hilo_metodo2 = new Runnable() {
        @Override
        public void run() {
            try {
                int personasTotales = 1;
                while (segundoGlobal < 120 && personasTotales != 0) {

                    int y = 0;
                    for (int i = 0; i < banco.getCajeros().size(); i++) {

                        int sizepresonas = banco.getCajeros().get(i).sizePersonas();
                        for (int j = 0; j < sizepresonas; j++) {
                            banco.getCajeros().get(i).getPersonas().QUITA(banco.getCajeros().get(i).getPersonas());
                            actualizarDatos2();
                            banco.getCajeros().get(i).transaccion2();
                            y++;
                            jl_cont2.setText(String.valueOf(y));
                            int tiempo = azar.nextInt(3000 - 1000) + 1000;//Tiempo de 1 - 3 secs
                            Thread.sleep(tiempo);
                        }
                        actualizarDatos2();
                    }
                    JOptionPane.showMessageDialog(jd_metodo2, "Metodo 2 terminado");
                    jd_metodo2.setVisible(false);
                    enseñarTransa(banco.getCajeros().size(), banco.getCajeros());

                    int tempSize = 0;
                    for (int i = 0; i < banco.getCajeros().size(); i++) {
                        tempSize += banco.getCajeros().get(i).sizePersonas();
                    }

                    personasTotales = tempSize;
                }

                if (segundoGlobal < 120) {
                    agregarPersonas2();
                    actualizarDatos2();
                } else {
                    jd_metodo2.setVisible(false);
                    enseñarTransa(banco.getCajeros().size(), banco.getCajeros());

                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    };

    Runnable runnable = new Runnable() {
        @Override
        public void run() {

            if (metodo1IsSelected == true) {
                int i = 0;
                while (pg_personas.getValue() != 700) {
                    try {
                        Thread.sleep(500);
                        personaActual.setText(banco.getPersonas().getP().get(i).toString());
                        pg_personas.setValue(pg_personas.getValue() + 10);
                        i++;

                    } catch (InterruptedException e) {
                    }
                }

                JOptionPane.showMessageDialog(null, "PERSONAS AGREGADAS A LA COLA");

                ventanaPersonas.setVisible(false);
                jf_metodo1.setTitle("Metodo 1");
                jf_metodo1.pack();
                jf_metodo1.setLocationRelativeTo(null);
                jf_metodo1.setVisible(true);

                DefaultTableModel model = (DefaultTableModel) jt_colaPersonas1.getModel();
                for (int j = 0; j < banco.getPersonas().getP().size(); j++) {
                    Persona temp = (Persona) banco.getPersonas().getP().get(j);
                    model.addRow(new Object[]{temp.getNom() + " " + temp.getApellido()});
                }

                for (int j = 0; j < cantCajeros; j++) {
                    ta_cajerosStatus.append("Cajero " + (j + 1) + " LIBRE\n");
                }

                banco.Metodo1(ta_cajerosStatus, jt_colaPersonas1, jf_metodo1, tp_transaccion, jl_contPersonas);
                Thread hilo_cronometro = new Thread(cronometro);
                hilo_cronometro.start();
            } else {//METODO 2
                //PROGRESSBAR SIMULACION CREAR PERSONAS

                while (pg_personas.getValue() != 700) {
                    try {

                        for (Cajero caj : banco.getCajeros()) {

                            for (int j = 0; j < caj.getPersonas().getP().size(); j++) {
                                personaActual.setText(caj.getPersonas().getP().get(j).toString());
                                pg_personas.setValue(pg_personas.getValue() + 10);//aumentar valor del ProgressBar
                                Thread.sleep(500);
                            }
                        }

                    } catch (InterruptedException e) {
                    }
                }

                JOptionPane.showMessageDialog(null, "PERSONAS AGREGADAS A LA COLA");
                ventanaPersonas.setVisible(false);

                actualizarDatos2();

                Thread hilo_cronometro = new Thread(cronometro);
                hilo_cronometro.start();

                jd_metodo2.setTitle("METODO 2");
                jd_metodo2.setModal(true);
                jd_metodo2.pack();
                jd_metodo2.setLocationRelativeTo(null);
                jd_metodo2.setVisible(true);

            }
        }
    };
    Banco banco = new Banco();
    int cantCajeros = 0;
    boolean metodo1IsSelected = false;
    boolean metodo2IsSelected = false;
    ArrayList<Cajero> cajeros;
    int segundoGlobal = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton b_metodo1;
    private javax.swing.JRadioButton b_metodo2;
    private javax.swing.ButtonGroup c_metodo;
    private javax.swing.JComboBox<String> cb_cantcajeros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JDialog jd_metodo2;
    private javax.swing.JFrame jf_metodo1;
    private javax.swing.JFrame jf_results;
    private javax.swing.JLabel jl_cont2;
    private javax.swing.JLabel jl_contPersonas;
    private javax.swing.JLabel jl_contPersonas1;
    private javax.swing.JLabel jl_reloj;
    private javax.swing.JLabel jl_reloj1;
    private javax.swing.JLabel jl_reloj2;
    private javax.swing.JTable jt_cajero1;
    private javax.swing.JTable jt_cajero2;
    private javax.swing.JTable jt_cajero3;
    private javax.swing.JTable jt_cajero4;
    private javax.swing.JTable jt_cajero5;
    private javax.swing.JTree jt_cajeros;
    private javax.swing.JTable jt_colaPersonas1;
    private javax.swing.JTable jt_gestiones;
    private javax.swing.JLabel personaActual;
    private javax.swing.JProgressBar pg_personas;
    private javax.swing.JPanel primerMenu;
    private javax.swing.JTextArea ta_cajerosStatus;
    private javax.swing.JTextArea ta_cajerosStatus1;
    private javax.swing.JTextPane tp_transaccion;
    private javax.swing.JFrame ventanaPersonas;
    // End of variables declaration//GEN-END:variables
}
