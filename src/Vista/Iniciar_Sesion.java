/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;
import VistaUsuario.Inicio_Usuario;
import Modelo.Sesion;
import Clases.Usuario;
import Vista_Doctor.Vista_Doctor;
import java.sql.Connection;
import javax.swing.JOptionPane;
/**
 *
 * @author crist
 */
public class Iniciar_Sesion extends javax.swing.JFrame {
    
    private Connection conn;
    /**
     * Creates new form IniciarSesión
     */
    public Iniciar_Sesion(Connection conn) {
        initComponents();
        this.conn = conn;
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
        jLabel16 = new javax.swing.JLabel();
        Registrarse = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        iniciar_Sesion = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        correo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        jPanel8 = new javax.swing.JPanel();
<<<<<<< HEAD
        jLabel2 = new javax.swing.JLabel();
        RegisGrupo = new javax.swing.JLabel();
=======
>>>>>>> 2c229d15a4fbd387aa1e0d7557e6575d9243f5cf
        jPanel9 = new javax.swing.JPanel();
        equipoMedico1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        inicio = new javax.swing.JLabel();
        equipo_Medico = new javax.swing.JLabel();
        preguntas_Frecuentes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar Sesion");

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 70));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Iniciar Sesión", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel16.setText("¿No tienes una cuenta?");

        Registrarse.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Registrarse.setForeground(new java.awt.Color(0, 153, 255));
        Registrarse.setText("Registrate");
        Registrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarseMouseClicked(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(88, 153, 153));

        iniciar_Sesion.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        iniciar_Sesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iniciar_Sesion.setText("Iniciar Sesión");
        iniciar_Sesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iniciar_Sesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iniciar_SesionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(iniciar_Sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iniciar_Sesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        correo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setText("Correo Electronico");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setText("Contraseña");

        contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 201, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(55, 55, 55)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(correo)
                    .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

<<<<<<< HEAD
        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("o");

        RegisGrupo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        RegisGrupo.setForeground(new java.awt.Color(0, 153, 255));
        RegisGrupo.setText("Registrar grupo");
        RegisGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisGrupoMouseClicked(evt);
            }
        });

=======
>>>>>>> 2c229d15a4fbd387aa1e0d7557e6575d9243f5cf
        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Registrarse)
<<<<<<< HEAD
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(RegisGrupo)
                .addGap(502, 502, 502))
=======
                .addGap(422, 422, 422))
>>>>>>> 2c229d15a4fbd387aa1e0d7557e6575d9243f5cf
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
<<<<<<< HEAD
                    .addComponent(Registrarse)
                    .addComponent(jLabel2)
                    .addComponent(RegisGrupo))
=======
                    .addComponent(Registrarse))
>>>>>>> 2c229d15a4fbd387aa1e0d7557e6575d9243f5cf
                .addGap(80, 80, 80))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 1100, 640));

        equipoMedico1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        equipoMedico1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        equipoMedico1.setText("Dudas y contacto: atencionciudadana@issste.gob.mx o al 55-4000-1000");
        equipoMedico1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(equipoMedico1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 657, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(equipoMedico1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 770, 1200, 40));

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

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoActionPerformed

    private void iniciar_SesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciar_SesionMouseClicked
        // TODO add your handling code here:
        String correoText = correo.getText();
        String contraseñaText = new String(contraseña.getPassword());
        if(correoText.isEmpty() || contraseñaText.isEmpty()){
            JOptionPane.showMessageDialog(this, "Rellena todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
                return;
        }else{
            Usuario usuario = Sesion.iniciarSesion(conn,correoText,contraseñaText);
            if (usuario==null){
                JOptionPane.showMessageDialog(this, "El usuario y/o contraseña son incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }else if(usuario.getTipo().equals("usuario")){
                JOptionPane.showMessageDialog(null,"Ha iniciado sesion");
                this.setVisible(false);
                Inicio_Usuario inicio = new Inicio_Usuario(usuario,conn);
                inicio.setVisible(true);
            } else if(usuario.getTipo().equals("medico_general")){
                JOptionPane.showMessageDialog(null,"Ha iniciado sesion");
                this.setVisible(false);
                Vista_Doctor inicio = new Vista_Doctor(usuario,conn);
                inicio.setVisible(true);
            
            }
        }        
    }//GEN-LAST:event_iniciar_SesionMouseClicked

    private void RegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarseMouseClicked
        // TODO add your handling code here:
        Vista_Registro_Usuario vistaR = new Vista_Registro_Usuario(conn);
        vistaR.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_RegistrarseMouseClicked

    private void contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaActionPerformed
        // TODO add your handling code here:
        String correoText = correo.getText();
        String contraseñaText = new String(contraseña.getPassword());
        if(correoText.isEmpty() || contraseñaText.isEmpty()){
            JOptionPane.showMessageDialog(this, "Rellena todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
                return;
        }else{
            Usuario usuario = Sesion.iniciarSesion(conn,correoText,contraseñaText);
            if (usuario==null){
                JOptionPane.showMessageDialog(this, "El usuario y/o contraseña son incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }else if(usuario.getTipo().equals("usuario")){
                JOptionPane.showMessageDialog(null,"Ha iniciado sesion");
                this.setVisible(false);
                Inicio_Usuario inicio = new Inicio_Usuario(usuario,conn);
                inicio.setVisible(true);
            }
        }       
    }//GEN-LAST:event_contraseñaActionPerformed

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

<<<<<<< HEAD
    private void RegisGrupoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisGrupoMouseClicked
        Vista_Registro_Grupo vistaGrupo = new Vista_Registro_Grupo(conn);
        vistaGrupo.setVisible(true);
    }//GEN-LAST:event_RegisGrupoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RegisGrupo;
=======
    // Variables declaration - do not modify//GEN-BEGIN:variables
>>>>>>> 2c229d15a4fbd387aa1e0d7557e6575d9243f5cf
    private javax.swing.JLabel Registrarse;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JTextField correo;
    private javax.swing.JLabel equipoMedico1;
    private javax.swing.JLabel equipo_Medico;
    private javax.swing.JLabel iniciar_Sesion;
    private javax.swing.JLabel inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
<<<<<<< HEAD
    private javax.swing.JLabel jLabel2;
=======
>>>>>>> 2c229d15a4fbd387aa1e0d7557e6575d9243f5cf
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel preguntas_Frecuentes;
    // End of variables declaration//GEN-END:variables
}
