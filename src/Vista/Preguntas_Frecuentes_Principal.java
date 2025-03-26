/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author crist
 */
public class Preguntas_Frecuentes_Principal extends javax.swing.JFrame {
    private Connection conn;
    private Map<String, String> preguntasYRespuestas;
    /**
     * Creates new form Preguntas_Frecuentes_Principal
     */
    public Preguntas_Frecuentes_Principal(Connection conn) {
        initComponents();
        this.conn=conn;
        cargarPreguntasYRespuestas();
        configurarComboBox();
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
        jPanel7 = new javax.swing.JPanel();
        IniciarSesion = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        Registrarse = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        equipoMedico1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        preguntaComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        respuestaTextArea = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        inicio = new javax.swing.JLabel();
        equipo_Medico = new javax.swing.JLabel();
        preguntas_Frecuentes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Preguntas Frecuentes ");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(166, 213, 213));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO_ISSSTE.png"))); // NOI18N
        jLabel1.setInheritsPopupMenu(false);

        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.setPreferredSize(new java.awt.Dimension(90, 35));

        IniciarSesion.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        IniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IniciarSesion.setText("Iniciar Sesion");
        IniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IniciarSesionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(88, 153, 153));
        jPanel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel9.setPreferredSize(new java.awt.Dimension(90, 35));

        Registrarse.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Registrarse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Registrarse.setText("Registrarse");
        Registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Registrarse, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Registrarse, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 514, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 70));

        equipoMedico1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        equipoMedico1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        equipoMedico1.setText("Dudas y contacto: atencionciudadana@issste.gob.mx o al 55-4000-1000");
        equipoMedico1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(equipoMedico1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 657, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(equipoMedico1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 770, 1200, 40));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Preguntas Frecuentes\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14))); // NOI18N

        preguntaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preguntaComboBoxActionPerformed(evt);
            }
        });

        respuestaTextArea.setColumns(20);
        respuestaTextArea.setRows(5);
        jScrollPane1.setViewportView(respuestaTextArea);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(preguntaComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 897, Short.MAX_VALUE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(preguntaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 1100, 610));

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

    private void IniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IniciarSesionMouseClicked
        Iniciar_Sesion iniciar = new Iniciar_Sesion(conn);
        iniciar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_IniciarSesionMouseClicked

    private void RegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarseMouseClicked
        // TODO add your handling code here:
        Vista_Registro_Usuario registroU = new Vista_Registro_Usuario(conn);
        registroU.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegistrarseMouseClicked

    private void preguntaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preguntaComboBoxActionPerformed
        // TODO add your handling code here:
        mostrarRespuesta();
    }//GEN-LAST:event_preguntaComboBoxActionPerformed

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

    private void cargarPreguntasYRespuestas() {
        preguntasYRespuestas = new HashMap<>();
        preguntasYRespuestas.put("¿Cómo puedo agendar una cita médica?", "Para agendar una cita médica, siga estos pasos:\n1. Inicie sesión en su cuenta ISSSTE.\n2. Vaya a la sección 'Agendar Cita'.\n3. Seleccione la especialidad y el médico deseado.\n4. Elija la fecha y la hora disponibles que más le convengan.\n5. Confirme su cita.");
        preguntasYRespuestas.put("¿Qué documentos necesito para mi cita médica?", "Los documentos que necesita llevar a su cita médica incluyen:\n- Su identificación oficial (INE, pasaporte, etc.).\n- Su tarjeta del ISSSTE.\n- Cualquier referencia médica o estudios previos relacionados con su consulta.");
        preguntasYRespuestas.put("¿Cómo puedo consultar mi historial clínico?", "Para consultar su historial clínico:\n1. Inicie sesión en su cuenta ISSSTE.\n2. Vaya a la sección 'Historial Clínico'.\n3. Aquí podrá ver todas sus consultas, diagnósticos y resultados de estudios médicos.");
        preguntasYRespuestas.put("¿Qué servicios médicos ofrece el ISSSTE?", "El ISSSTE ofrece una amplia gama de servicios médicos, incluyendo:\n- Consultas generales y especializadas.\n- Servicios de emergencia.\n- Estudios de laboratorio y diagnóstico.\n- Programas de prevención y promoción de la salud.\n- Atención hospitalaria y quirúrgica.");
        preguntasYRespuestas.put("¿Cómo puedo actualizar mis datos personales?", "Para actualizar sus datos personales:\n1. Inicie sesión en su cuenta ISSSTE.\n2. Vaya a la sección 'Perfil'.\n3. Haga clic en 'Editar' y actualice la información necesaria.\n4. Guarde los cambios.");
        preguntasYRespuestas.put("¿Qué debo hacer si no puedo asistir a una cita programada?", "Si no puede asistir a una cita programada, por favor:\n1. Inicie sesión en su cuenta ISSSTE.\n2. Vaya a la sección 'Citas Programadas'.\n3. Seleccione la cita que desea cancelar.\n4. Haga clic en 'Cancelar Cita' y confirme la cancelación.");
        preguntasYRespuestas.put("¿Cómo puedo acceder a los servicios de emergencia del ISSSTE?", "En caso de emergencia:\n- Diríjase al servicio de urgencias más cercano del ISSSTE.\n- Llame al número de emergencia del ISSSTE disponible las 24 horas.");
        preguntasYRespuestas.put("¿Qué programas de prevención ofrece el ISSSTE?", "El ISSSTE ofrece varios programas de prevención, tales como:\n- Campañas de vacunación.\n- Programas de detección temprana de enfermedades crónicas.\n- Talleres de educación en salud.\n- Programas de bienestar y prevención de enfermedades.");
        preguntasYRespuestas.put("¿Puedo solicitar una segunda opinión médica en el ISSSTE?", "Sí, puede solicitar una segunda opinión médica. Para hacerlo:\n1. Inicie sesión en su cuenta ISSSTE.\n2. Vaya a la sección 'Solicitar Segunda Opinión'.\n3. Seleccione el médico especialista para la segunda opinión.\n4. Proporcione los detalles de su consulta inicial y los estudios realizados.");
        preguntasYRespuestas.put("¿Cómo puedo contactar al servicio de atención al cliente del ISSSTE?", "Para contactar al servicio de atención al cliente:\n- Llame al número de teléfono del ISSSTE: 55-1234-5678.\n- Envíe un correo electrónico a: atencion@issste.gob.mx.\n- Use el formulario de contacto en la página web o la aplicación del ISSSTE.");
    }
 /**
     * Configura el ComboBox con las preguntas del HashMap.
     */
    private void configurarComboBox() {
        for (String pregunta : preguntasYRespuestas.keySet()) {
            preguntaComboBox.addItem(pregunta);
        }
    }
        private void mostrarRespuesta() {
        String preguntaSeleccionada = (String) preguntaComboBox.getSelectedItem();
        if (preguntaSeleccionada != null) {
            String respuesta = preguntasYRespuestas.get(preguntaSeleccionada);
            respuestaTextArea.setText(respuesta);
        } else {
            respuestaTextArea.setText("");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IniciarSesion;
    private javax.swing.JLabel Registrarse;
    private javax.swing.JLabel equipoMedico1;
    private javax.swing.JLabel equipo_Medico;
    private javax.swing.JLabel inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> preguntaComboBox;
    private javax.swing.JLabel preguntas_Frecuentes;
    private javax.swing.JTextArea respuestaTextArea;
    // End of variables declaration//GEN-END:variables
}
