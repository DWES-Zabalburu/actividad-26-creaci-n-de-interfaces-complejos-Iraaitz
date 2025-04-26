/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zabalburu.daw1.actividad26.forms;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author DAW1
 */
public class MiPerfilForm extends JFrame {
    // Define el tamaño de la ventana como 600x700
    private Dimension dmVentana = new Dimension(600,700);
    
    // Título de la ventana (etiqueta)
    private JLabel lblTitulo = new JLabel("Actualiza tu Perfil");
    
    // Etiquetas y campos de texto para los datos del perfil
    private JLabel lblNombre = new JLabel("Nombre completo");
    private JTextField txtNombre = new JTextField();
    
    private JLabel lblEmail = new JLabel("Correo electrónico");
    private JTextField txtEmail = new JTextField();
    
    private JLabel lblTelefono = new JLabel("Teléfono");
    private JTextField txtTelefono = new JTextField();
    
    private JLabel lblDireccion = new JLabel("Dirección");
    private JTextField txtDireccion = new JTextField();
    
    private JLabel lblWeb = new JLabel("Sitio Web");
    private JTextField txtWeb = new JTextField();
    
    // Botones para cancelar y guardar cambios
    private JButton btnCancelar = new JButton("Cancelar");
    private JButton btnGuardar = new JButton("Guardar");
    
    // Panel para el título, con diseño FlowLayout alineado a la izquierda
    private JPanel pnlTitulo = new JPanel(new FlowLayout(FlowLayout.LEFT));
    // Panel para los botones, con diseño FlowLayout alineado a la derecha con separación de 10p
    private JPanel pnlBotones = new JPanel(new FlowLayout(FlowLayout.RIGHT,10,0));
    
    // Panel que contiene los datos del formulario, organizado en 5 filas y 1 columna
    private JPanel pnlDatos = new JPanel(new GridLayout(5,1,0,5));
    
    // Color azul personalizado que se usará en varios elementos
    private final Color BLUE = new Color(41, 127, 184);
    
    public MiPerfilForm(){
        // Destablece el título de la ventana
        this.setTitle("Mi Perfil");
        // Define el tamaño de la ventana con el objeto dmVentana
        this.setSize(dmVentana);
        //Estilos para el título (fuente Calibri, negrita, tamaño 28)
        lblTitulo.setFont(new Font("Calibri", Font.BOLD,28));
        // Cambia el color de letra del título a blanco
        lblTitulo.setForeground(Color.WHITE);
        // El fondo del panel del título es azul
        pnlTitulo.setBackground(BLUE);
        // Agrega un borde vacío (espaciado interno) al panel del título
        pnlTitulo.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));
        // Añade el label del título al panel de título
        pnlTitulo.add(lblTitulo);
        // Se agrega el panel del título en la parte superior (NORTH) de la ventana
        this.add(pnlTitulo,BorderLayout.NORTH);
        
        // Agrega al panel de datos los campos de formulario, usando el método añadirControl
        pnlDatos.add(añadirControl(lblNombre,txtNombre));
        pnlDatos.add(añadirControl(lblEmail,txtEmail));
        pnlDatos.add(añadirControl(lblTelefono,txtTelefono));
        pnlDatos.add(añadirControl(lblDireccion,txtDireccion));
        pnlDatos.add(añadirControl(lblWeb,txtWeb));
        
        // Se le da un margen interno al panel de datos
        pnlDatos.setBorder(BorderFactory.createEmptyBorder(10, 10,30,10));
        // Pinta el fondo del panel de datos de blanco.
        pnlDatos.setBackground(Color.WHITE);
        // Agrega el panel de datos al centro de la ventana (por defecto BorderLayout.CENTER)
        this.add(pnlDatos);
        
        // Estilo del botón "Cancelar": fondo gris claro
        btnCancelar.setBackground(Color.LIGHT_GRAY);
        // Agrega el botón "Cancelar" al panel de botones
        pnlBotones.add(btnCancelar);
        // Estilo del botón "Guardar": fondo azul
        btnGuardar.setBackground(BLUE);
        // Agrega el botón "Guardar" al panel de botones
        pnlBotones.add(btnGuardar);
        
        // Recorren todos los botones en el panel de botones para aplicar estilos comunes
        for(Component c : pnlBotones.getComponents()){
            // Castea cada componente a JButton
            JButton b = (JButton) c;
            // Quita el borde por defecto del botón
            b.setBorder(null);
            // Establece un tamaño para los botones
            b.setPreferredSize(new Dimension(170,50));
            // Cambio el texto de los botones a blanco
            b.setForeground(Color.WHITE);
            // Aplica una fuente Calibri en negrita de tamaño 18
            b.setFont(new Font("Calibri", Font.BOLD,18));
        }
        
        // Agrega margen inferior y derecho al panel de botones
        pnlBotones.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 10));
        // Pinta de blanco el fondo del panel de botones
        pnlBotones.setBackground(Color.WHITE);
        // Agrega el panel de botones en la parte inferior (SOUTH) de la ventana
        this.add(pnlBotones, BorderLayout.SOUTH);
        // Centra la ventana en la pantalla
        this.setLocationRelativeTo(null);
        // Define que cerrar la ventana termine la aplicación
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // Hace visible la ventana
        this.setVisible(true);
    }
    
    private JPanel añadirControl(JLabel lbl, JTextField txt) {
        // Crea un nuevo panel con diseño BorderLayout
        JPanel pnlControl = new JPanel(new BorderLayout());
        // Fondo blanco para el panel
        pnlControl.setBackground(Color.WHITE);
        // Configura el borde del campo de texto: línea azul abajo y margen interno
        txt.setBorder(BorderFactory.createCompoundBorder(
                        BorderFactory.createMatteBorder(0, 0, 2, 0, BLUE),  // Línea azul de 2px abajo
                        BorderFactory.createEmptyBorder(5,2,2,2)));         // Espacio interior
        // Establece la fuente del campo de texto (Calibri, normal, tamaño 20)
        txt.setFont(new Font("Calibri", Font.PLAIN,20));
        // Establece la fuente del label (Calibri, negrita, tamaño 14)
        lbl.setFont(new Font("Calibri", Font.BOLD,14));
        // Pone margen interno al panel
        pnlControl.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        // Agrega la etiqueta en la parte superior del panel
        pnlControl.add(lbl, BorderLayout.NORTH);
        // Agrega el campo de texto en el centro del panel
        pnlControl.add(txt);
        return pnlControl;
    }
}


/* 
--BorderFactory: Es una clase que crea bordes fácilmente, como márgenes (EmptyBorder), líneas (MatteBorder), bordes combinados (CompoundBorder), etc.

--FlowLayout: Es un administrador de diseño que coloca los componentes uno al lado del otro (horizontalmente) y respeta alineaciones (izquierda, centro, derecha) y márgenes entre ellos.

--GridLayout: Organiza componentes en forma de una cuadrícula de filas y columnas, todos del mismo tamaño.

--BorderLayout: Organiza los componentes en cinco regiones: NORTH, SOUTH, EAST, WEST, CENTER.

Método                  ¿Qué crea?          ¿Visible?   Ejemplo de uso
createEmptyBorder	Espacio interno     No se ve	Márgenes
createMatteBorder	Línea de color      Se ve       Subrayado, contornos
createCompoundBorder	Combinación de dos bordes	Depende	Línea + Espacio

*/