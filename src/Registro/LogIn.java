package Registro;

import java.awt.Panel;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class LogIn extends javax.swing.JFrame {
    
    public static ArrayList<Persona> personas = new ArrayList();

    //fila 2 silla 12
    public LogIn() {
        initComponents();
        this.setLocationRelativeTo(null);
        personas.add(new Empleado(
                12, "Supervisor", "Eduardo Castellon",
                "Tinker100", "h", "Francisco Morazán", new Date(2005, 9, 19)));
        /*
        Empleado:   Eduardo Enrique Castellon Molina 
                    contra: Tinker100
         */
        personas.add(new Civil(
                "Melvin Rosas",
                "Manolo1000", "h", "Francisco Morazán", new Date(2004, 3, 24)));
        /*
        Civi:   Melvin Joel Castro Rosas
                contra: Manolo1000
         */
        
            
        
       DefaultComboBoxModel IdListModel = (DefaultComboBoxModel) CB_ListaId.getModel();
       IdListModel.addElement(personas.get(1).getIdentidad());
       
       CB_ListaId.setModel(IdListModel);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuEmpleados = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tab_InfoTramite = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tab_InfoCiv = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        CB_ListaId = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Tex_Nombre = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        Tex_Contra = new javax.swing.JTextField();
        Tex_Sexo = new javax.swing.JTextField();
        Tex_Dep = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        C_Calendario = new com.toedter.calendar.JCalendar();
        B_Modificar = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        B_CerrarSession = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        L_NombreBienvenido = new javax.swing.JLabel();
        MenuCiviles = new javax.swing.JDialog();
        jPanel11 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();
        Tex_NombreTram = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        Tex_DescTram = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        B_Tramitar = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        B_CerrarSession1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        L_NombreBienvenido1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        L_Nombre = new javax.swing.JTextField();
        B_Entrar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        B_Salir = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        LP_contra = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        Tab_InfoTramite.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre Tramite", "Descripcion", "Fecha", "No. Identidad"
            }
        ));
        jScrollPane3.setViewportView(Tab_InfoTramite);

        Tab_InfoCiv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre completo", "No. Identidad", "Fecha de Nacimiento"
            }
        ));
        jScrollPane4.setViewportView(Tab_InfoCiv);

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Informacion de civiles:");

        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Tramites:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        jTabbedPane1.addTab("Informacion Civiles", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CB_ListaId.setBackground(new java.awt.Color(255, 255, 255));
        CB_ListaId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CB_ListaIdItemStateChanged(evt);
            }
        });
        CB_ListaId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_ListaIdActionPerformed(evt);
            }
        });
        jPanel7.add(CB_ListaId, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 23, 231, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Contraseña:");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 148, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Sexo:");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 214, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Nombre:");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 77, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Departamento:");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 286, -1, -1));

        Tex_Nombre.setBackground(new java.awt.Color(255, 255, 255));
        Tex_Nombre.setBorder(null);
        jPanel7.add(Tex_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 101, 231, -1));
        jPanel7.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 129, 231, 13));

        Tex_Contra.setBackground(new java.awt.Color(255, 255, 255));
        Tex_Contra.setBorder(null);
        jPanel7.add(Tex_Contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 173, 231, -1));

        Tex_Sexo.setBackground(new java.awt.Color(255, 255, 255));
        Tex_Sexo.setBorder(null);
        jPanel7.add(Tex_Sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 239, 231, -1));

        Tex_Dep.setBackground(new java.awt.Color(255, 255, 255));
        Tex_Dep.setBorder(null);
        jPanel7.add(Tex_Dep, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 311, 231, -1));
        jPanel7.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 195, 231, 13));
        jPanel7.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 261, 231, 13));
        jPanel7.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 333, 231, 13));
        jPanel7.add(C_Calendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 87, 219, 187));

        B_Modificar.setBackground(new java.awt.Color(102, 102, 255));
        B_Modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_ModificarMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Modificar");

        javax.swing.GroupLayout B_ModificarLayout = new javax.swing.GroupLayout(B_Modificar);
        B_Modificar.setLayout(B_ModificarLayout);
        B_ModificarLayout.setHorizontalGroup(
            B_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, B_ModificarLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        B_ModificarLayout.setVerticalGroup(
            B_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_ModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.add(B_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 130, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Fecha:");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 62, -1, -1));

        jTabbedPane1.addTab("Modificar Civiles", jPanel7);

        jPanel5.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 570, 410));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jPanel10.setBackground(new java.awt.Color(102, 102, 255));

        B_CerrarSession.setBackground(new java.awt.Color(204, 204, 204));
        B_CerrarSession.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B_CerrarSession.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_CerrarSession.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_CerrarSessionMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Cerrar Session");

        javax.swing.GroupLayout B_CerrarSessionLayout = new javax.swing.GroupLayout(B_CerrarSession);
        B_CerrarSession.setLayout(B_CerrarSessionLayout);
        B_CerrarSessionLayout.setHorizontalGroup(
            B_CerrarSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_CerrarSessionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        B_CerrarSessionLayout.setVerticalGroup(
            B_CerrarSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, B_CerrarSessionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel7.setText("Bienvenido");

        L_NombreBienvenido.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L_NombreBienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B_CerrarSession, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(L_NombreBienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B_CerrarSession, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jPanel8.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 590, 150));

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 570, 180));

        javax.swing.GroupLayout MenuEmpleadosLayout = new javax.swing.GroupLayout(MenuEmpleados.getContentPane());
        MenuEmpleados.getContentPane().setLayout(MenuEmpleadosLayout);
        MenuEmpleadosLayout.setHorizontalGroup(
            MenuEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
        );
        MenuEmpleadosLayout.setVerticalGroup(
            MenuEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane2.setBackground(new java.awt.Color(0, 0, 0));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        Tex_NombreTram.setBackground(new java.awt.Color(255, 255, 255));
        Tex_NombreTram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tex_NombreTramActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Nombre:");

        Tex_DescTram.setBackground(new java.awt.Color(255, 255, 255));
        Tex_DescTram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tex_DescTramActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Descripcion:");

        B_Tramitar.setBackground(new java.awt.Color(102, 102, 255));
        B_Tramitar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_TramitarMouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Tramitar");

        javax.swing.GroupLayout B_TramitarLayout = new javax.swing.GroupLayout(B_Tramitar);
        B_Tramitar.setLayout(B_TramitarLayout);
        B_TramitarLayout.setHorizontalGroup(
            B_TramitarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, B_TramitarLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        B_TramitarLayout.setVerticalGroup(
            B_TramitarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, B_TramitarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel18))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Tex_NombreTram)
                            .addComponent(Tex_DescTram, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel19))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(B_Tramitar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tex_NombreTram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tex_DescTram, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(B_Tramitar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Informacion Civiles", jPanel12);

        jPanel11.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 570, 410));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel14.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jPanel16.setBackground(new java.awt.Color(102, 102, 255));

        B_CerrarSession1.setBackground(new java.awt.Color(204, 204, 204));
        B_CerrarSession1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B_CerrarSession1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_CerrarSession1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_CerrarSession1MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Cerrar Session");

        javax.swing.GroupLayout B_CerrarSession1Layout = new javax.swing.GroupLayout(B_CerrarSession1);
        B_CerrarSession1.setLayout(B_CerrarSession1Layout);
        B_CerrarSession1Layout.setHorizontalGroup(
            B_CerrarSession1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_CerrarSession1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        B_CerrarSession1Layout.setVerticalGroup(
            B_CerrarSession1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, B_CerrarSession1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel9.setText("Bienvenido");

        L_NombreBienvenido1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L_NombreBienvenido1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B_CerrarSession1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(L_NombreBienvenido1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B_CerrarSession1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jPanel14.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 590, 150));

        jPanel11.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 570, 180));

        javax.swing.GroupLayout MenuCivilesLayout = new javax.swing.GroupLayout(MenuCiviles.getContentPane());
        MenuCiviles.getContentPane().setLayout(MenuCivilesLayout);
        MenuCivilesLayout.setHorizontalGroup(
            MenuCivilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MenuCivilesLayout.setVerticalGroup(
            MenuCivilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("STFangsong", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro De Las Personas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(38, 38, 38))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 430, 110));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Contra:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 70, 40));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 70, 40));

        L_Nombre.setBackground(new java.awt.Color(255, 255, 255));
        L_Nombre.setBorder(null);
        L_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L_NombreActionPerformed(evt);
            }
        });
        jPanel1.add(L_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 280, -1));

        B_Entrar.setBackground(new java.awt.Color(102, 102, 255));
        B_Entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_Entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_EntrarMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Entrar");

        javax.swing.GroupLayout B_EntrarLayout = new javax.swing.GroupLayout(B_Entrar);
        B_Entrar.setLayout(B_EntrarLayout);
        B_EntrarLayout.setHorizontalGroup(
            B_EntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_EntrarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        B_EntrarLayout.setVerticalGroup(
            B_EntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_EntrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(B_Entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, 40));

        B_Salir.setBackground(new java.awt.Color(102, 102, 255));
        B_Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_SalirMouseClicked(evt);
            }
        });

        jLabel5.setText("Salir");

        javax.swing.GroupLayout B_SalirLayout = new javax.swing.GroupLayout(B_Salir);
        B_Salir.setLayout(B_SalirLayout);
        B_SalirLayout.setHorizontalGroup(
            B_SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, B_SalirLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        B_SalirLayout.setVerticalGroup(
            B_SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, B_SalirLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jPanel1.add(B_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, -1, 30));

        LP_contra.setBackground(new java.awt.Color(255, 255, 255));
        LP_contra.setForeground(new java.awt.Color(153, 153, 153));
        LP_contra.setBorder(null);
        LP_contra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LP_contraActionPerformed(evt);
            }
        });
        jPanel1.add(LP_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 280, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 280, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 280, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void L_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L_NombreActionPerformed

    }//GEN-LAST:event_L_NombreActionPerformed

    private void B_EntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_EntrarMouseClicked
        
        String nombre = L_Nombre.getText();
        String contra = LP_contra.getText();
        
        boolean existePersona = false;
        for (Persona persona : personas) {
            if (persona.getNombre().equals(nombre)) {
                existePersona = true;
            }
            
        }
        if (existePersona) {
            
            int cont = 0;
            int index = 0;
            boolean buscandoContra = true;
            for (Persona persona : personas) {
                if (persona.getNombre().equals(nombre)) {
                    if (persona.getContra().equals(contra)) {
                        buscandoContra = false;
                        index = cont;
                    }
                }
                cont++;
            }
            if (buscandoContra) {
                JOptionPane.showMessageDialog(rootPane, "Contraseña incorrecta");
            } else {
                
                if (personas.get(index) instanceof Empleado) {
                    L_NombreBienvenido.setText(personas.get(index).getNombre());
                    this.setVisible(false);
                    MenuEmpleados.setLocationRelativeTo(null);
                    MenuEmpleados.setModal(true);
                    MenuEmpleados.pack();
                    MenuEmpleados.setVisible(true);
                }
                if (personas.get(index) instanceof Civil) {
                    L_NombreBienvenido1.setText(personas.get(index).getNombre());
                    this.setVisible(false);
                    MenuCiviles.setLocationRelativeTo(null);
                    MenuCiviles.setModal(true);
                    MenuCiviles.pack();
                    MenuCiviles.setVisible(true);
                    
                }
                
            }
            
        } else {
            JOptionPane.showMessageDialog(rootPane, "El nombre es invalido");
        }
        L_Nombre.setText("");
        LP_contra.setText("");
    }//GEN-LAST:event_B_EntrarMouseClicked

    private void B_SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_SalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_B_SalirMouseClicked

    private void LP_contraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LP_contraActionPerformed
       
    }//GEN-LAST:event_LP_contraActionPerformed

    private void B_CerrarSessionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_CerrarSessionMouseClicked
        MenuEmpleados.setLocationRelativeTo(this);
        MenuEmpleados.setModal(true);
        MenuEmpleados.pack();
        MenuEmpleados.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_B_CerrarSessionMouseClicked

    private void B_CerrarSession1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_CerrarSession1MouseClicked
        MenuCiviles.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_B_CerrarSession1MouseClicked

    private void B_ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_ModificarMouseClicked
       
       int index = CB_ListaId.getSelectedIndex();
        
        
       String nvNombre = Tex_Nombre.getText();
       String nvContra = Tex_Contra.getText();
       String nvSexo = Tex_Sexo.getText();
       String nvDep = Tex_Dep.getText();
       Date nvFecha = C_Calendario.getDate();
       
       personas.get(index).setNombre(nvNombre);
       personas.get(index).setContra(nvContra);
       personas.get(index).setSexo(nvSexo);
       personas.get(index).setDepartamento(nvDep);
       personas.get(index).setFechaNcimiento(nvFecha);
          
    }//GEN-LAST:event_B_ModificarMouseClicked

    private void CB_ListaIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_ListaIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_ListaIdActionPerformed

    private void CB_ListaIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CB_ListaIdItemStateChanged
        if (CB_ListaId.getSelectedItem() != null){
            int index = CB_ListaId.getSelectedIndex();
            
            Tex_Nombre.setText(personas.get(index).getNombre());
            Tex_Contra.setText(personas.get(index).getContra());
            Tex_Sexo.setText(personas.get(index).getSexo());
            Tex_Dep.setText(personas.get(index).getDepartamento());
            C_Calendario.setDate(personas.get(index).getFechaNcimiento());
        }
    }//GEN-LAST:event_CB_ListaIdItemStateChanged

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        DefaultTableModel infoTab = new DefaultTableModel();
        String titulosCiv[] = {"Nombre Completo","No. Identidad","Fecha de Nacimiento"};
        infoTab.setColumnIdentifiers(titulosCiv);
        
        Tab_InfoCiv.setModel(infoTab);
        infoTab.addRow(new Object[]{personas.get(1).getNombre(), personas.get(1).getIdentidad(), personas.get(1).getFechaNcimiento()});
                
        DefaultTableModel infoTarmite = new DefaultTableModel();
        String titulosTram[] = {"Nombre de Tramite","Descripcion","Fecha","No. Identidad"};
        
        Tab_InfoTramite.setModel(infoTarmite);
//        infoTarmite.addRow(new Object[]{((Civil)personas.get(1).ge;
        
        
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void Tex_NombreTramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tex_NombreTramActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tex_NombreTramActionPerformed

    private void Tex_DescTramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tex_DescTramActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tex_DescTramActionPerformed

    private void B_TramitarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_TramitarMouseClicked
        String nombreTram = Tex_NombreTram.getText();
        String descTram = Tex_DescTram.getText();
        
         Tramite tramite = new Tramite(nombreTram, descTram, personas.get(1).getIdentidad(), new Date()); 
    }//GEN-LAST:event_B_TramitarMouseClicked
    
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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel B_CerrarSession;
    private javax.swing.JPanel B_CerrarSession1;
    private javax.swing.JPanel B_Entrar;
    private javax.swing.JPanel B_Modificar;
    private javax.swing.JPanel B_Salir;
    private javax.swing.JPanel B_Tramitar;
    private javax.swing.JComboBox<String> CB_ListaId;
    private com.toedter.calendar.JCalendar C_Calendario;
    private javax.swing.JPasswordField LP_contra;
    private javax.swing.JTextField L_Nombre;
    private javax.swing.JLabel L_NombreBienvenido;
    private javax.swing.JLabel L_NombreBienvenido1;
    private javax.swing.JDialog MenuCiviles;
    private javax.swing.JDialog MenuEmpleados;
    private javax.swing.JTable Tab_InfoCiv;
    private javax.swing.JTable Tab_InfoTramite;
    private javax.swing.JTextField Tex_Contra;
    private javax.swing.JTextField Tex_Dep;
    private javax.swing.JTextField Tex_DescTram;
    private javax.swing.JTextField Tex_Nombre;
    private javax.swing.JTextField Tex_NombreTram;
    private javax.swing.JTextField Tex_Sexo;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
