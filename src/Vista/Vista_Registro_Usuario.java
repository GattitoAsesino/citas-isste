/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;
import Clases.Usuario;
<<<<<<< HEAD
=======
<<<<<<< HEAD
import Modelo.FacadeAutenticacion;
=======
>>>>>>> 6118f81ec0f4b599572035f386ef92f2ab5b4abe
>>>>>>> 81ff1a1d08283a68c3df382084c707dd485ef697
import Modelo.RegistrarUsuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author crist
 */
public class Vista_Registro_Usuario extends javax.swing.JFrame {
    private Connection conn;

    /**
     * Creates new form Vista_Registro_Ususario
     */
    public Vista_Registro_Usuario(Connection Cx) {
        initComponents();
        conn = Cx;
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        apellido_p = new javax.swing.JTextField();
        apellido_m = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        curp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rfc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        confirmar_contraseña = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Registrarse = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        iniciarSesion = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        equipoMedico1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        inicio = new javax.swing.JLabel();
        equipo_Medico = new javax.swing.JLabel();
        preguntas_Frecuentes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro Usuario");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(166, 213, 213));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO_ISSSTE.png"))); // NOI18N
        jLabel1.setInheritsPopupMenu(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(749, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.getAccessibleContext().setAccessibleDescription("");

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 70));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");

        nombre.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Apellido Paterno");

        apellido_p.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        apellido_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellido_pActionPerformed(evt);
            }
        });

        apellido_m.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        apellido_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellido_mActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Apellido Materno");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("CURP");

        curp.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        curp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curpActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setText("RFC");

        rfc.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        rfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfcActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setText("Correo Electronico");

        correo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setText("Contraseña");

        confirmar_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmar_contraseñaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setText("Confirmar contraseña");

        jPanel4.setBackground(new java.awt.Color(88, 153, 153));

        Registrarse.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Registrarse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Registrarse.setText("Registrarse");
        Registrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Registrarse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Registrarse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel16.setText("¿Ya tienes una cuenta?,");

        iniciarSesion.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        iniciarSesion.setForeground(new java.awt.Color(0, 153, 255));
        iniciarSesion.setText("Inicia Sesión");
        iniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iniciarSesionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(55, 55, 55)
                                .addComponent(rfc, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(apellido_p, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(apellido_m, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(curp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(confirmar_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(correo)
                                        .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(428, 428, 428)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iniciarSesion)))
                .addContainerGap(336, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellido_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellido_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(curp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmar_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(iniciarSesion))
                .addGap(16, 16, 16))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 1100, 630));

        equipoMedico1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        equipoMedico1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        equipoMedico1.setText("Dudas y contacto: atencionciudadana@issste.gob.mx o al 55-4000-1000");
        equipoMedico1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(equipoMedico1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 657, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(equipoMedico1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 770, 1200, 40));

        inicio.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        inicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inicio.setText("Inicio");
        inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inicioMouseClicked(evt);
            }
        });

        equipo_Medico.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        equipo_Medico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        equipo_Medico.setText("Equipo Médico");
        equipo_Medico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        equipo_Medico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                equipo_MedicoMouseClicked(evt);
            }
        });

        preguntas_Frecuentes.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        preguntas_Frecuentes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        preguntas_Frecuentes.setText("Preguntas Frecuentes");
        preguntas_Frecuentes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        preguntas_Frecuentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                preguntas_FrecuentesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(equipo_Medico, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(preguntas_Frecuentes, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 825, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inicio, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(equipo_Medico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(preguntas_Frecuentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1200, 30));

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

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void apellido_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellido_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellido_pActionPerformed

    private void apellido_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellido_mActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellido_mActionPerformed

    private void curpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_curpActionPerformed

    private void rfcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rfcActionPerformed

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoActionPerformed

    private void RegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarseMouseClicked
        // TODO add your handling code here:
        String rfcText = rfc.getText();
        String curpText = curp.getText();
        String Nombre = nombre.getText();
        String correoText = correo.getText();
        String contraseñaText = new String(contraseña.getPassword());
        String confirmarContraseñaText = new String(confirmar_contraseña.getPassword());
        String apellidoMaternoText = apellido_m.getText();
        String apellidoPaternoText = apellido_p.getText();    
        if (Nombre.length()==0 || correoText.length()==0 ||contraseñaText.length()==0 || confirmarContraseñaText.length()==0 ||apellidoMaternoText.length()==0 ||apellidoPaternoText.length()==0 ){
                JOptionPane.showMessageDialog(this, "Rellena todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        if(validarCurp(curpText) && validarRFC(rfcText)){
            
            if (!contraseñaText.equals(confirmarContraseñaText)) {
                JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
            return;
            }
            
        // Crear el objeto Usuario si la contraseña coincide
        Usuario usuario = new Usuario(rfcText, curpText, correoText, contraseñaText, Nombre, apellidoMaternoText, apellidoPaternoText);
<<<<<<< HEAD
=======
<<<<<<< HEAD
        if(FacadeAutenticacion.registrar(conn, usuario)){
            Iniciar_Sesion iniciar = new Iniciar_Sesion(conn);
            iniciar.setVisible(true);
            this.setVisible(false);
        }
=======
>>>>>>> 81ff1a1d08283a68c3df382084c707dd485ef697
            try {
            if(RegistrarUsuario.registrar(conn, usuario)){
                Iniciar_Sesion iniciar = new Iniciar_Sesion(conn);
                iniciar.setVisible(true);
                this.setVisible(false);
            }
            } catch (SQLException ex) {
                Logger.getLogger(Vista_Registro_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
<<<<<<< HEAD
=======
>>>>>>> 6118f81ec0f4b599572035f386ef92f2ab5b4abe
>>>>>>> 81ff1a1d08283a68c3df382084c707dd485ef697
        }   
    }//GEN-LAST:event_RegistrarseMouseClicked

    private void iniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarSesionMouseClicked
        // TODO add your handling code here:
        Iniciar_Sesion iniciar = new Iniciar_Sesion(conn);
        iniciar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_iniciarSesionMouseClicked

    private void confirmar_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmar_contraseñaActionPerformed
        String rfcText = rfc.getText();
        String curpText = curp.getText();
        String Nombre = nombre.getText();
        String correoText = correo.getText();
        String contraseñaText = new String(contraseña.getPassword());
        String confirmarContraseñaText = new String(confirmar_contraseña.getPassword());
        String apellidoMaternoText = apellido_m.getText();
        String apellidoPaternoText = apellido_p.getText();    
        if (Nombre.length()==0 || correoText.length()==0 ||contraseñaText.length()==0 || confirmarContraseñaText.length()==0 ||apellidoMaternoText.length()==0 ||apellidoPaternoText.length()==0 ){
                JOptionPane.showMessageDialog(this, "Rellena todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        if(validarCurp(curpText) && validarRFC(rfcText)){
            
            if (!contraseñaText.equals(confirmarContraseñaText)) {
                JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
            return;
            }
            
        // Crear el objeto Usuario si la contraseña coincide
        Usuario usuario = new Usuario(rfcText, curpText, correoText, contraseñaText, Nombre, apellidoMaternoText, apellidoPaternoText);
<<<<<<< HEAD
=======
<<<<<<< HEAD
        if(FacadeAutenticacion.registrar(conn, usuario)){
            Iniciar_Sesion iniciar = new Iniciar_Sesion(conn);
            iniciar.setVisible(true);
            this.setVisible(false);
        }
=======
>>>>>>> 81ff1a1d08283a68c3df382084c707dd485ef697
            try {
            if(RegistrarUsuario.registrar(conn, usuario)){
                Iniciar_Sesion iniciar = new Iniciar_Sesion(conn);
                iniciar.setVisible(true);
                this.setVisible(false);
            }
            } catch (SQLException ex) {
                Logger.getLogger(Vista_Registro_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
<<<<<<< HEAD
=======
>>>>>>> 6118f81ec0f4b599572035f386ef92f2ab5b4abe
>>>>>>> 81ff1a1d08283a68c3df382084c707dd485ef697
        }
    }//GEN-LAST:event_confirmar_contraseñaActionPerformed

    private void inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioMouseClicked
        // TODO add your handling code here:
        Vista_Principal vista = new Vista_Principal(conn);
        vista.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_inicioMouseClicked

    private void equipo_MedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equipo_MedicoMouseClicked
        // TODO add your handling code here:
        Equipo_Medico equipo = new Equipo_Medico(conn);
        this.setVisible(false);
        equipo.setVisible(true);
    }//GEN-LAST:event_equipo_MedicoMouseClicked

    private void preguntas_FrecuentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_preguntas_FrecuentesMouseClicked
        // TODO add your handling code here:
        Preguntas_Frecuentes_Principal preguntas = new Preguntas_Frecuentes_Principal(conn);
        preguntas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_preguntas_FrecuentesMouseClicked
    private boolean validarCurp(String curpText){
        System.out.println(curpText.length());
    if(curpText.length()!=18){
            JOptionPane.showMessageDialog(null, "La curp ingresada es incorrecta");
            System.out.println("total");
            return false;
    }   else {
            for(int i=0 ; i<curpText.length();i++){
                if(i <=3 && curpText.charAt(i)== '0' &&curpText.charAt(i)== '1' &&curpText.charAt(i)== '2'&&curpText.charAt(i)== '3'
                        &&curpText.charAt(i)== '4' &&curpText.charAt(i)== '5' &&curpText.charAt(i)== '6' &&curpText.charAt(i)== '7'
                        &&curpText.charAt(i)== '8' &&curpText.charAt(i)== '9' ){
                    JOptionPane.showMessageDialog(null, "La curp ingresada es incorrecta");
                    System.out.println("0 al 3 EN "+i+ " en "+ curpText.charAt(i));
                    return false;
                }else if(i >= 4 && i<= 9 && curpText.charAt(i)!= '0' &&curpText.charAt(i)!= '1' &&curpText.charAt(i)!= '2'&&curpText.charAt(i)!= '3'
                        &&curpText.charAt(i)!= '4' &&curpText.charAt(i)!= '5' &&curpText.charAt(i)!= '6' &&curpText.charAt(i)!= '7'
                        &&curpText.charAt(i)!= '8' &&curpText.charAt(i)!= '9' ){
                    JOptionPane.showMessageDialog(null, "La curp ingresada es incorrecta");
                    System.out.println("4 al 9 EN "+i+ " en "+ curpText.charAt(i));
                    return false;
                }else if(i >=10 && i<= 16 &&  curpText.charAt(i)== '0' &&curpText.charAt(i)== '1' &&curpText.charAt(i)== '2'&&curpText.charAt(i)== '3'
                        &&curpText.charAt(i)== '4' &&curpText.charAt(i)== '5' &&curpText.charAt(i)== '6' &&curpText.charAt(i)== '7'
                        &&curpText.charAt(i)== '8' &&curpText.charAt(i)== '9' ){
                    JOptionPane.showMessageDialog(null, "La curp ingresada es incorrecta");
                    System.out.println("10 al 16 EN "+i+ " en "+ curpText.charAt(i));
                    return false;
                } else if(i ==17 &&  curpText.charAt(i)!= '0' &&curpText.charAt(i)!= '1' &&curpText.charAt(i)!= '2'&&curpText.charAt(i)!= '3'
                        &&curpText.charAt(i)!= '4' &&curpText.charAt(i)!= '5' &&curpText.charAt(i)!= '6' &&curpText.charAt(i)!= '7'
                        &&curpText.charAt(i)!= '8' &&curpText.charAt(i)!= '9' ){
                    JOptionPane.showMessageDialog(null, "La curp ingresada es incorrecta");
                    System.out.println("17 EN "+i+ " en "+ curpText.charAt(i));
                    return false;
                }
            }
        }
    return true;
    }
    private boolean validarRFC(String rfcText){
    if(rfcText.length()!=13){
            JOptionPane.showMessageDialog(null, "La rfc ingresada es incorrecta");
            System.out.println("total");
            return false;
    }   else {
            for(int i=0 ; i<rfcText.length();i++){
                if(i <=3 && rfcText.charAt(i)== '0' &&rfcText.charAt(i)== '1' &&rfcText.charAt(i)== '2'&&rfcText.charAt(i)== '3'
                        &&rfcText.charAt(i)== '4' &&rfcText.charAt(i)== '5' &&rfcText.charAt(i)== '6' &&rfcText.charAt(i)== '7'
                        &&rfcText.charAt(i)== '8' &&rfcText.charAt(i)== '9'){
                    JOptionPane.showMessageDialog(null, "La rfc ingresada es incorrecta");
                    System.out.println("0 al 3 EN "+i+ " en "+ rfcText.charAt(i));
                    return false;
                }else if(i >= 4 && i<= 9 && rfcText.charAt(i)!= '0' &&rfcText.charAt(i)!= '1' &&rfcText.charAt(i)!= '2'&&rfcText.charAt(i)!= '3'
                        &&rfcText.charAt(i)!= '4' &&rfcText.charAt(i)!= '5' &&rfcText.charAt(i)!= '6' &&rfcText.charAt(i)!= '7'
                        &&rfcText.charAt(i)!= '8' &&rfcText.charAt(i)!= '9'){
                    JOptionPane.showMessageDialog(null, "La rfc ingresada es incorrecta");
                    System.out.println("4 al 9 EN "+i+ " en "+ rfcText.charAt(i));
                    return false;
                }else if(i >=10 && i<= 11 && rfcText.charAt(i)== '0' &&rfcText.charAt(i)== '1' &&rfcText.charAt(i)== '2'&&rfcText.charAt(i)== '3'
                        &&rfcText.charAt(i)== '4' &&rfcText.charAt(i)== '5' &&rfcText.charAt(i)== '6' &&rfcText.charAt(i)== '7'
                        &&rfcText.charAt(i)== '8' &&rfcText.charAt(i)== '9'){
                    JOptionPane.showMessageDialog(null, "La rfc ingresada es incorrecta");
                    System.out.println("10 al 11 EN "+i+ " en "+ rfcText.charAt(i));
                    return false;
                } else if(i ==12 && rfcText.charAt(i)!= '0' &&rfcText.charAt(i)!= '1' &&rfcText.charAt(i)!= '2'&&rfcText.charAt(i)!= '3'
                        &&rfcText.charAt(i)!= '4' &&rfcText.charAt(i)!= '5' &&rfcText.charAt(i)!= '6' &&rfcText.charAt(i)!= '7'
                        &&rfcText.charAt(i)!= '8' &&rfcText.charAt(i)!= '9'){
                    JOptionPane.showMessageDialog(null, "La rfc ingresada es incorrecta");
                    System.out.println("12 EN "+i+ " en "+ rfcText.charAt(i));
                    return false;
                }
            }
        }
    return true;
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Registrarse;
    private javax.swing.JTextField apellido_m;
    private javax.swing.JTextField apellido_p;
    private javax.swing.JPasswordField confirmar_contraseña;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField curp;
    private javax.swing.JLabel equipoMedico1;
    private javax.swing.JLabel equipo_Medico;
    private javax.swing.JLabel iniciarSesion;
    private javax.swing.JLabel inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel preguntas_Frecuentes;
    private javax.swing.JTextField rfc;
    // End of variables declaration//GEN-END:variables
}
