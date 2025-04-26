/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.zabalburu.daw1.actividad26;

import com.zabalburu.daw1.actividad26.forms.MiPerfilForm;
import com.zabalburu.daw1.actividad26.forms.GameZoneFrm;

/**
 *
 * @author DAW1
 */
public class Actividad26 {

        public static void main(String[] args) {
            MiPerfilForm ventana1 = new MiPerfilForm(); //  Crear una instancia de la primera ventana
            

             // Añadir un listener para detectar cuando la primera ventana se cierra
             ventana1.addWindowListener(new java.awt.event.WindowAdapter() {
                 @Override
                 public void windowClosed(java.awt.event.WindowEvent e) {
                     // Cuando se cierra la primera ventana, abrir la segunda
                     GameZoneFrm ventana2 = new GameZoneFrm();
                 }
             });
        }
}