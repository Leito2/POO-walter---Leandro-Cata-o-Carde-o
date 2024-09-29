package Figuras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPirámide extends JFrame implements ActionListener {
    private Container contenedor;
    private JLabel base, altura, apotema, volumen, superficie;
    private JTextField campoBase, campoAltura, campoApotema;
    private JButton calcular;

    public VentanaPirámide() {
        inicio();
        setTitle("Pirámide");
        setSize(280, 240);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        base = new JLabel("Base (cms):");
        base.setBounds(20, 20, 135, 23);
        campoBase = new JTextField();
        campoBase.setBounds(120, 20, 135, 23);

        altura = new JLabel("Altura (cms):");
        altura.setBounds(20, 50, 135, 23);
        campoAltura = new JTextField();
        campoAltura.setBounds(120, 50, 135, 23);

        apotema = new JLabel("Apotema (cms):");
        apotema.setBounds(20, 80, 135, 23);
        campoApotema = new JTextField();
        campoApotema.setBounds(120, 80, 135, 23);

        calcular = new JButton("Calcular");
        calcular.setBounds(120, 110, 135, 23);
        calcular.addActionListener(this);

        volumen = new JLabel("Volumen (cm3):");
        volumen.setBounds(20, 140, 135, 23);
        superficie = new JLabel("Superficie (cm2):");
        superficie.setBounds(20, 170, 135, 23);

        contenedor.add(base);
        contenedor.add(campoBase);
        contenedor.add(altura);
        contenedor.add(campoAltura);
        contenedor.add(apotema);
        contenedor.add(campoApotema);
        contenedor.add(calcular);
        contenedor.add(volumen);
        contenedor.add(superficie);
    }

    public void actionPerformed(ActionEvent event) {
        boolean error = false;
        double baseValue = 0;
        double alturaValue = 0;
        double apotemaValue = 0;

        try {
            baseValue = Double.parseDouble(campoBase.getText());
            alturaValue = Double.parseDouble(campoAltura.getText());
            apotemaValue = Double.parseDouble(campoApotema.getText());
            Piramide pirámide = new Piramide(baseValue, alturaValue, apotemaValue);
            volumen.setText("Volumen (cm3): " + String.format("%.2f", pirámide.calcularVolumen()));
            superficie.setText("Superficie (cm2): " + String.format("%.2f", pirámide.calcularSuperficie()));
        } catch (Exception e) {
            error = true;
        } finally {
            if (error) {
                JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de número", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
