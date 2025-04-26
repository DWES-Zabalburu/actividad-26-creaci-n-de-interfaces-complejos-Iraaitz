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
import javax.swing.border.LineBorder;


/**
 *
 * @author DAW1
 */

public class GameZoneFrm extends JFrame {
    
    // Tamaño de la ventana
    private Dimension dmVentana = new Dimension(500, 550);

    // Colores personalizados
    private final Color COLOR_FONDO = new Color(20, 20, 30);
    private final Color COLOR_VERDE = new Color(0, 255, 128);
    private final Color COLOR_ROJO = new Color(255, 51, 51);
    private final Color COLOR_CAMPOS = new Color(40, 40, 60);

    // Componentes
    private JLabel lblTitulo = new JLabel("GAME ZONE");

    private JLabel lblGamertag = new JLabel("GAMERTAG");
    private JTextField txtGamertag = new JTextField();

    private JLabel lblEmail = new JLabel("EMAIL");
    private JTextField txtEmail = new JTextField();

    private JLabel lblPassword = new JLabel("PASSWORD");
    private JTextField txtPassword = new JTextField();

    private JButton btnRegistrarse = new JButton("REGISTRARSE");
    private JButton btnCancelar = new JButton("CANCELAR");

    private JPanel pnlTitulo = new JPanel(new FlowLayout(FlowLayout.CENTER));
    private JPanel pnlDatos = new JPanel(new GridLayout(3,1,0,20));
    private JPanel pnlBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 0));

    public GameZoneFrm(){
        // Título que se muestra en la barra superior de la ventana
        this.setTitle("GameZone - Registro"); 
        this.setSize(dmVentana); 
        // Usa BorderLayout para organizar los paneles en norte, centro, sur, etc.
        this.setLayout(new BorderLayout()); 
        this.getContentPane().setBackground(COLOR_FONDO); 


        // --- Configurar Título ---
        lblTitulo.setFont(new Font("Impact", Font.PLAIN, 32));
        lblTitulo.setForeground(COLOR_VERDE);
        pnlTitulo.setBackground(COLOR_CAMPOS);
        pnlTitulo.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, COLOR_VERDE));  // Añade un borde inferior verde
        pnlTitulo.add(lblTitulo); // Añade el título dentro del panel
        this.add(pnlTitulo, BorderLayout.NORTH);  // Coloca el panel de título en la parte superior de la ventana

        // --- Configurar Datos ---
        pnlDatos.setBackground(COLOR_FONDO);
        pnlDatos.setBorder(BorderFactory.createEmptyBorder(30, 20, 30, 20)); //Márgenes internos alrededor de los datos
        
        pnlDatos.add(añadirControl(lblGamertag, txtGamertag));      // Añade el primer campo (Gamertag) al panel de datos
        pnlDatos.add(añadirControl(lblEmail, txtEmail));            // Añade el segundo campo (Email) al panel de datos
        pnlDatos.add(añadirControl(lblPassword, txtPassword));      // Añade el tercer campo (Password) al panel de dato

        this.add(pnlDatos, BorderLayout.CENTER);

        // --- Configurar Botones ---
        btnRegistrarse.setBackground(COLOR_VERDE);
        btnCancelar.setBackground(COLOR_ROJO);

        configurarBoton(btnRegistrarse);  // Color de fondo verde para el botón de registrarse
        configurarBoton(btnCancelar);      // Color de fondo rojo para el botón de cancelar

        pnlBotones.setBackground(COLOR_FONDO);       // Fondo del panel de botones igual al fondo general
        pnlBotones.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));        //// Márgenes internos arriba y abajo
        pnlBotones.add(btnRegistrarse);     // Añade el botón de registrarse al panel de botones
        pnlBotones.add(btnCancelar);        // Añade el botón de cancelar al panel de botones

        this.add(pnlBotones, BorderLayout.SOUTH);

        // --- Configurar Ventana ---
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private JPanel añadirControl(JLabel lbl, JTextField txt) {
        JPanel pnlControl = new JPanel(new BorderLayout(0, 10)); // Crea un panel con separación vertical entre el label y el campo
        pnlControl.setBackground(COLOR_FONDO);

        lbl.setForeground(COLOR_VERDE);                 // Color verde para las etiquetas
        lbl.setFont(new Font("Arial", Font.BOLD, 16));  // Fuente de las etiquetas
        
        txt.setBackground(COLOR_CAMPOS);
        txt.setForeground(Color.WHITE);
        txt.setFont(new Font("Arial", Font.PLAIN, 18));   // Fuente de los campos de texto
        txt.setCaretColor(Color.WHITE);                   // Color del cursor en los campos de texto
        
        txt.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(2, 2, 2, 2, COLOR_VERDE),  // Borde exterior verde de 2px en todos los lados
                BorderFactory.createEmptyBorder(10, 10, 10, 10)));         // Espaciado interno dentro del campo de texto

        pnlControl.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0)); // Espaciado arriba y abajo del panel de control
        pnlControl.add(lbl, BorderLayout.NORTH);        // Añade el label en la parte superior del panel
        pnlControl.add(txt, BorderLayout.CENTER);       // Añade el campo de texto en el centro del panel

        return pnlControl;
    }

    private void configurarBoton(JButton btn){
        btn.setForeground(Color.BLACK);
        btn.setFont(new Font("Arial", Font.BOLD, 16));
        btn.setFocusPainted(false);     // Elimina el borde azul que aparece al hacer click en el botón
        btn.setBorder(null);
        btn.setPreferredSize(new Dimension(150, 50));
    }

}
