package proyectox;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        extras();
        setLocationRelativeTo(null);
    }
    
    public void extras() {
        jl_agregar.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_compresion = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_ing_texto = new javax.swing.JTextField();
        bt_comprimir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tf_texto_comprimido = new javax.swing.JTextField();
        jd_exp_math = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_exp_math = new javax.swing.JTextField();
        bt_calcular = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tf_total = new javax.swing.JTextField();
        jd_grafo_bi = new javax.swing.JDialog();
        tp_grafo_bi = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tf_color = new javax.swing.JTextField();
        bt_nodo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cb_nodo1 = new javax.swing.JComboBox<>();
        cb_nodo2 = new javax.swing.JComboBox<>();
        bt_arista = new javax.swing.JButton();
        jd_calc_desemp = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        tp_empleado = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        tf_id = new javax.swing.JTextField();
        tf_area = new javax.swing.JTextField();
        tf_valor = new javax.swing.JTextField();
        bt_agregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_agregar = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tf_nombre_mod = new javax.swing.JTextField();
        tf_area_mod = new javax.swing.JTextField();
        tf_valor_mod = new javax.swing.JTextField();
        bt_modificar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_empleado_mod = new javax.swing.JList<>();
        bt_eliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_arbol = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_expresion = new javax.swing.JMenuItem();
        menu_compremsion = new javax.swing.JMenuItem();
        menu_bicolariable = new javax.swing.JMenuItem();
        menu_desempeno = new javax.swing.JMenuItem();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Comprensión de Texto ");

        jLabel2.setText("Ingrese Texto:");

        bt_comprimir.setText("Comprimir");
        bt_comprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_comprimirActionPerformed(evt);
            }
        });

        jLabel3.setText("Texto Comprimido:");

        javax.swing.GroupLayout jd_compresionLayout = new javax.swing.GroupLayout(jd_compresion.getContentPane());
        jd_compresion.getContentPane().setLayout(jd_compresionLayout);
        jd_compresionLayout.setHorizontalGroup(
            jd_compresionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_compresionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(177, 177, 177))
            .addGroup(jd_compresionLayout.createSequentialGroup()
                .addGroup(jd_compresionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_compresionLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(bt_comprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_compresionLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jd_compresionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addGroup(jd_compresionLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(tf_ing_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf_texto_comprimido))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jd_compresionLayout.setVerticalGroup(
            jd_compresionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_compresionLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(jd_compresionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_ing_texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(bt_comprimir)
                .addGap(66, 66, 66)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(tf_texto_comprimido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Expresión Matemáticas");

        jLabel5.setText("Ingrese Expresión:");

        bt_calcular.setText("Calcular");
        bt_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_calcularActionPerformed(evt);
            }
        });

        jLabel6.setText("Total:");

        javax.swing.GroupLayout jd_exp_mathLayout = new javax.swing.GroupLayout(jd_exp_math.getContentPane());
        jd_exp_math.getContentPane().setLayout(jd_exp_mathLayout);
        jd_exp_mathLayout.setHorizontalGroup(
            jd_exp_mathLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_exp_mathLayout.createSequentialGroup()
                .addGroup(jd_exp_mathLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_exp_mathLayout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(bt_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_exp_mathLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jd_exp_mathLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGroup(jd_exp_mathLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jd_exp_mathLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jd_exp_mathLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(tf_exp_math, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jd_exp_mathLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tf_total)))))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jd_exp_mathLayout.setVerticalGroup(
            jd_exp_mathLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_exp_mathLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel4)
                .addGroup(jd_exp_mathLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_exp_mathLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel5))
                    .addGroup(jd_exp_mathLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(tf_exp_math, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(bt_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jd_exp_mathLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_exp_mathLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(74, 74, 74))
                    .addGroup(jd_exp_mathLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(tf_total, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(54, Short.MAX_VALUE))))
        );

        tp_grafo_bi.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tp_grafo_biStateChanged(evt);
            }
        });

        jLabel7.setText("Color:");

        bt_nodo.setText("Guardar Nodo");
        bt_nodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_nodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(tf_color, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_nodo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addComponent(bt_nodo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        tp_grafo_bi.addTab("Nodo", jPanel1);

        jLabel8.setText("Nodo 1:");

        jLabel9.setText("Nodo 2:");

        bt_arista.setText("Guardar Arista");
        bt_arista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_aristaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cb_nodo1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_nodo2, 0, 257, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addComponent(bt_arista, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cb_nodo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cb_nodo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(bt_arista, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        tp_grafo_bi.addTab("Arista", jPanel2);

        javax.swing.GroupLayout jd_grafo_biLayout = new javax.swing.GroupLayout(jd_grafo_bi.getContentPane());
        jd_grafo_bi.getContentPane().setLayout(jd_grafo_biLayout);
        jd_grafo_biLayout.setHorizontalGroup(
            jd_grafo_biLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tp_grafo_bi)
        );
        jd_grafo_biLayout.setVerticalGroup(
            jd_grafo_biLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tp_grafo_bi)
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel10.setText("Cálculo de Evaluación por Desempeño");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Nuevo Empleado");

        jLabel12.setText("Nombre:");

        jLabel13.setText("ID:");

        jLabel14.setText("Área:");

        jLabel15.setText("Valor:");

        bt_agregar.setText("Agregar");
        bt_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_agregarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jl_agregar);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(bt_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel11))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_nombre)
                            .addComponent(tf_id)
                            .addComponent(tf_area)
                            .addComponent(tf_valor, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel11)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(tf_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addComponent(bt_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        tp_empleado.addTab("Agregar", jPanel3);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Modificación y/o Eliminación de Empleados");

        jLabel17.setText("Nombre:");

        jLabel18.setText("Área:");

        jLabel19.setText("Valor:");

        bt_modificar.setText("Modificar");
        bt_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_modificarActionPerformed(evt);
            }
        });

        jl_empleado_mod.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jl_empleado_modValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(jl_empleado_mod);

        bt_eliminar.setText("Eliminar");
        bt_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel19))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_nombre_mod)
                                    .addComponent(tf_area_mod)
                                    .addComponent(tf_valor_mod, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(bt_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bt_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(tf_nombre_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(tf_area_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(tf_valor_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86)
                        .addComponent(bt_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(bt_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        tp_empleado.addTab("Modificar / Eliminar", jPanel4);

        ta_arbol.setColumns(20);
        ta_arbol.setRows(5);
        jScrollPane2.setViewportView(ta_arbol);

        javax.swing.GroupLayout jd_calc_desempLayout = new javax.swing.GroupLayout(jd_calc_desemp.getContentPane());
        jd_calc_desemp.getContentPane().setLayout(jd_calc_desempLayout);
        jd_calc_desempLayout.setHorizontalGroup(
            jd_calc_desempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_calc_desempLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(142, 142, 142))
            .addGroup(jd_calc_desempLayout.createSequentialGroup()
                .addComponent(tp_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );
        jd_calc_desempLayout.setVerticalGroup(
            jd_calc_desempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_calc_desempLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel10)
                .addGroup(jd_calc_desempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_calc_desempLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(tp_empleado))
                    .addGroup(jd_calc_desempLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");

        menu_expresion.setText("Expresion Matematicas");
        menu_expresion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_expresionActionPerformed(evt);
            }
        });
        jMenu1.add(menu_expresion);

        menu_compremsion.setText("Comprension");
        menu_compremsion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_compremsionActionPerformed(evt);
            }
        });
        jMenu1.add(menu_compremsion);

        menu_bicolariable.setText("Grafo Bicoloriable");
        menu_bicolariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_bicolariableActionPerformed(evt);
            }
        });
        jMenu1.add(menu_bicolariable);

        menu_desempeno.setText("Calculo de Eval. por Desempeño");
        menu_desempeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_desempenoActionPerformed(evt);
            }
        });
        jMenu1.add(menu_desempeno);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 533, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_aristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_aristaActionPerformed
        try {
            String nodo1, nodo2;
            nodo1 = cb_nodo1.getSelectedItem().toString();
            nodo2 = cb_nodo2.getSelectedItem().toString();
            if (nodo1.equals(nodo2)) {
                JOptionPane.showMessageDialog(null, "¡El grafo no será bicoloreable!");
            } else {
                JOptionPane.showMessageDialog(null, "¡El grafo será bicoloreable!");
            }
            lista_aristas.add(new Arista(nodo1, nodo2));
            cb_nodo1.setSelectedIndex(0);
            cb_nodo2.setSelectedIndex(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccione un nodo");
        }

    }//GEN-LAST:event_bt_aristaActionPerformed

    private void bt_nodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_nodoActionPerformed
        try {
            String color;
            color = tf_color.getText();
            lista_nodos.add(new Nodo_Grafo(color));
            tf_color.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese un color");
        }
    }//GEN-LAST:event_bt_nodoActionPerformed

    private void tp_grafo_biStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tp_grafo_biStateChanged
        if (tp_grafo_bi.getSelectedIndex() == 0){
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            for (Nodo_Grafo temp : lista_nodos){
                modelo.addElement(temp);
            }
            cb_nodo1.setModel(modelo);
        }
        if (tp_grafo_bi.getSelectedIndex() == 0){
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            for (Nodo_Grafo temp : lista_nodos){
                modelo.addElement(temp);
            }
            cb_nodo2.setModel(modelo);
        }
    }//GEN-LAST:event_tp_grafo_biStateChanged

    private void menu_bicolariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_bicolariableActionPerformed
        this.jd_grafo_bi.setModal(true);
        this.jd_grafo_bi.pack();
        this.jd_grafo_bi.setLocationRelativeTo(this);
        this.jd_grafo_bi.setVisible(true);
    }//GEN-LAST:event_menu_bicolariableActionPerformed

    private void jl_empleado_modValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jl_empleado_modValueChanged
        if (jl_empleado_mod.getSelectedIndex() > -1) {
            Empleado empleado = (Empleado) modelo.get(jl_empleado_mod.getSelectedIndex());
            tf_nombre_mod.setText(empleado.getNombre());
            tf_area_mod.setText(empleado.getArea());
            tf_valor_mod.setText("" + empleado.getEvaluacion());
        }
    }//GEN-LAST:event_jl_empleado_modValueChanged

    private void bt_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eliminarActionPerformed
        if (jl_empleado_mod.getSelectedIndex() > -1) {
            Empleado empleado = (Empleado) modelo.get(jl_empleado_mod.getSelectedIndex());
            modelo.remove(jl_empleado_mod.getSelectedIndex());
            arbol.remove(empleado);
            if (arbol.getRaiz() != null) {
                ta_arbol.setText(arbol.print());
            } else {
                ta_arbol.setText("");
                tf_nombre_mod.setText("");
                tf_area_mod.setText("");
                tf_valor_mod.setText("");
            }
            JOptionPane.showMessageDialog(this, "Empleado eliminado exitosamente");
        } else {
            JOptionPane.showMessageDialog(this, "¡Seleccione un empleado!");
        }
    }//GEN-LAST:event_bt_eliminarActionPerformed

    private void bt_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_modificarActionPerformed
        if (jl_empleado_mod.getSelectedIndex() > -1) {
            int pos = jl_empleado_mod.getSelectedIndex();
            String nombre, area;
            int valor, id;
            nombre = tf_nombre_mod.getText();
            if (nombre.equals("")) {
                JOptionPane.showMessageDialog(this, "¡Ingrese un nombre!");
                return;
            }
            area = tf_area_mod.getText();
            if (area.equals("")) {
                JOptionPane.showMessageDialog(this, "¡Ingrese un área de trabajo!");
                return;
            }
            try {
                valor = Integer.parseInt(tf_valor_mod.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "¡Ingrese un valor!");
                return;
            }
            if (valor < 0) {
                JOptionPane.showMessageDialog(this, "¡Ingrese un valor positivo!");
                return;
            }
            arbol.CambiarEmpleado(nombre, area, valor, (Empleado) modelo.get(pos));
            arbol.Evaluaciones();
            ta_arbol.setText(arbol.print());
            jl_empleado_mod.repaint();
        } else {
            JOptionPane.showMessageDialog(this, "¡Seleccione un empleado!");
        }
    }//GEN-LAST:event_bt_modificarActionPerformed

    private void bt_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_agregarActionPerformed
        String nombre, area;
        int id, valor;
        nombre = tf_nombre.getText();
        if (nombre.equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese un nombre.");
            return;
        }
        area = tf_area.getText();
        if (area.equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese un área de trabajo.");
            return;
        }
        try {
            valor = Integer.parseInt(tf_valor.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor no válido");
            return;
        }
        try {
            id = Integer.parseInt(tf_id.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID no válido");
            return;
        }
        if (arbol != null && !arbol.isEmpty() && arbol.exists(id)) {
            JOptionPane.showMessageDialog(this, "ID ya existente");
            return;
        }
        if (arbol == null) {
            arbol = new Arbol_Evaluacion(new Empleado(nombre, id, area, valor));
            modelo.addElement(arbol.getRaiz());
            tp_empleado.setVisible(true);
        } else {
            if (jl_agregar.getSelectedIndex() > -1) {
                int pos = jl_agregar.getSelectedIndex();
                Empleado jefe = (Empleado) modelo.get(pos);
                arbol.hoja(jefe, new Empleado(nombre, id, area, valor));
                modelo.addElement(new Empleado(nombre, id, area, valor));
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un Empleado");
                return;
            }
        }
        if (arbol.getRaiz() == null) {
            arbol.raiz(new Empleado(nombre, id, area, valor));
            modelo.addElement(arbol.getRaiz());
        }
        arbol.Evaluaciones();
        ta_arbol.setText(arbol.print());
        tf_nombre.setText("");
        tf_id.setText("");
        tf_area.setText("");
        tf_valor.setText("");
        JOptionPane.showMessageDialog(this, "Empleado agregado exitosamente");
    }//GEN-LAST:event_bt_agregarActionPerformed

    private void menu_desempenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_desempenoActionPerformed
        this.jd_calc_desemp.setModal(true);
        this.jd_calc_desemp.pack();
        this.jd_calc_desemp.setLocationRelativeTo(this);
        this.jd_calc_desemp.setVisible(true);
    }//GEN-LAST:event_menu_desempenoActionPerformed

    private void bt_comprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_comprimirActionPerformed
        Comprension huffman;
        String l = tf_ing_texto.getText();
        huffman = new Comprension(l);
        String m = huffman.hC.binario_final;
        tf_texto_comprimido.setText(m);
    }//GEN-LAST:event_bt_comprimirActionPerformed

    private void menu_compremsionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_compremsionActionPerformed
        this.jd_compresion.setModal(true);
        this.jd_compresion.pack();
        this.jd_compresion.setLocationRelativeTo(this);
        this.jd_compresion.setVisible(true);
    }//GEN-LAST:event_menu_compremsionActionPerformed

    private void menu_expresionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_expresionActionPerformed
        this.jd_exp_math.setModal(true);
        this.jd_exp_math.pack();
        this.jd_exp_math.setLocationRelativeTo(this);
        this.jd_exp_math.setVisible(true);
    }//GEN-LAST:event_menu_expresionActionPerformed

    private void bt_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_calcularActionPerformed
        try {
            Evaluar();
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_bt_calcularActionPerformed

private void Evaluar() throws Exception {
        Calculadora calc = new Calculadora();
        String exp = tf_exp_math.getText();
        tf_total.setText(String.valueOf(calc.calcular(exp)));
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_agregar;
    private javax.swing.JButton bt_arista;
    private javax.swing.JButton bt_calcular;
    private javax.swing.JButton bt_comprimir;
    private javax.swing.JButton bt_eliminar;
    private javax.swing.JButton bt_modificar;
    private javax.swing.JButton bt_nodo;
    private javax.swing.JComboBox<String> cb_nodo1;
    private javax.swing.JComboBox<String> cb_nodo2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JDialog jd_calc_desemp;
    private javax.swing.JDialog jd_compresion;
    private javax.swing.JDialog jd_exp_math;
    private javax.swing.JDialog jd_grafo_bi;
    private javax.swing.JList<String> jl_agregar;
    private javax.swing.JList<String> jl_empleado_mod;
    private javax.swing.JMenuItem menu_bicolariable;
    private javax.swing.JMenuItem menu_compremsion;
    private javax.swing.JMenuItem menu_desempeno;
    private javax.swing.JMenuItem menu_expresion;
    private javax.swing.JTextArea ta_arbol;
    private javax.swing.JTextField tf_area;
    private javax.swing.JTextField tf_area_mod;
    private javax.swing.JTextField tf_color;
    private javax.swing.JTextField tf_exp_math;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_ing_texto;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_nombre_mod;
    private javax.swing.JTextField tf_texto_comprimido;
    private javax.swing.JTextField tf_total;
    private javax.swing.JTextField tf_valor;
    private javax.swing.JTextField tf_valor_mod;
    private javax.swing.JTabbedPane tp_empleado;
    private javax.swing.JTabbedPane tp_grafo_bi;
    // End of variables declaration//GEN-END:variables
    private Arbol_Evaluacion arbol;
    private final DefaultListModel modelo = new DefaultListModel();
    ArrayList<Nodo_Grafo> lista_nodos = new ArrayList();
    ArrayList<Arista> lista_aristas = new ArrayList();
}
