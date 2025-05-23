/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Clases.Medico;

/**
 *
 * @author kiwik
 */
public interface VistaMediator {
    void onEspecialidadSeleccionada(String especialidad);
    void onMedicoSeleccionado(Medico medico);
}
