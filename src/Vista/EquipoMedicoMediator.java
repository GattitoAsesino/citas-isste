/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Clases.Medico;
import Modelo.Registrar_Informe;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kiwik
 */
public class EquipoMedicoMediator implements VistaMediator {
    private Connection conn;
    private javax.swing.JComboBox<String> especialidadComboBox;
    private javax.swing.JComboBox<Medico> medicoComboBox;
    private javax.swing.JTable comentarios;
    private javax.swing.JLabel fotoImg;

    public EquipoMedicoMediator(Connection conn,
                                 javax.swing.JComboBox<String> especialidadComboBox,
                                 javax.swing.JComboBox<Medico> medicoComboBox,
                                 javax.swing.JTable comentarios,
                                 javax.swing.JLabel fotoImg) {
        this.conn = conn;
        this.especialidadComboBox = especialidadComboBox;
        this.medicoComboBox = medicoComboBox;
        this.comentarios = comentarios;
        this.fotoImg = fotoImg;
    }

    @Override
    public void onEspecialidadSeleccionada(String especialidad) {
        try {
            medicoComboBox.removeAllItems();
            String query = "SELECT id, nombre, especialidad, correo FROM especialistas WHERE especialidad = ?";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, especialidad);
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    Medico m = new Medico(rs.getInt("id"), rs.getString("nombre"), especialidad, rs.getString("correo"));
                    medicoComboBox.addItem(m);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onMedicoSeleccionado(Medico medico) {
        if (medico == null) return;

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Comentarios");
        comentarios.setModel(model);

        String query = "SELECT opinion FROM opinionesequipomedico WHERE id_medico = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, medico.getId());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("opinion")});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try (Statement stmt = conn.createStatement()) {
            String imgQuery = "SELECT img FROM usuarios WHERE id = " + Registrar_Informe.getIdMedico2(conn, medico.getCorreo());
            ResultSet rs = stmt.executeQuery(imgQuery);
            if (rs.next()) {
                String rutaImg = rs.getString("img");
                if (rutaImg != null) {
                    Image foto = java.awt.Toolkit.getDefaultToolkit().getImage(rutaImg);
                    fotoImg.setIcon(new ImageIcon(foto));
                } else {
                    fotoImg.setIcon(null);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
