package Figuras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame implements ActionListener {
    private Container contenedor;
    private JButton cilindro, esfera, pirámide;

    public VentanaPrincipal() {
        inicio();
        setTitle("Figuras");
        setSize(350, 160);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        cilindro = new JButton("Cilindro");
        cilindro.setBounds(20, 50, 80, 23);
        cilindro.addActionListener(this);

        esfera = new JButton("Esfera");
        esfera.setBounds(125, 50, 80, 23);
        esfera.addActionListener(this);

        pirámide = new JButton("Pirámide");
        pirámide.setBounds(225, 50, 100, 23);
        pirámide.addActionListener(this);

        contenedor.add(cilindro);
        contenedor.add(esfera);
        contenedor.add(pirámide);
    }

    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == esfera) {
            VentanaEsfera ventanaEsfera = new VentanaEsfera();
            ventanaEsfera.setVisible(true);
        }
        if (evento.getSource() == cilindro) {
            VentanaCilindro ventanaCilindro = new VentanaCilindro();
            ventanaCilindro.setVisible(true);
        }
        if (evento.getSource() == pirámide) {
            VentanaPirámide ventanaPirámide = new VentanaPirámide();
            ventanaPirámide.setVisible(true);
        }
    }
}
