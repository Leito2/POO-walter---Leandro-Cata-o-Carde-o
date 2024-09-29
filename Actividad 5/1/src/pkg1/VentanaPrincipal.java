package Notas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Esta clase denominada VentanaPrincipal define una interfaz gráfica que permitirá 
 * crear un array de notas. Luego, se puede calcular el promedio de notas, la desviación,
 * la nota mayor y la nota menor del array.
 * @version 1.2/2020
 */
public class VentanaPrincipal extends JFrame implements ActionListener {
    // Un contenedor de elementos gráficos
    private Container contenedor;
    // Etiquetas estáticas de cada nota
    private JLabel nota1, nota2, nota3, nota4, nota5, promedio, desviación, mayor, menor;
    // Campos de ingreso de cada nota
    private JTextField campoNota1, campoNota2, campoNota3, campoNota4, campoNota5;
    // Botones para realizar cálculos y para borrar las notas
    private JButton calcular, limpiar;

    /** 
     * Constructor de la clase VentanaPrincipal 
     */
    public VentanaPrincipal() {
        inicio();
        setTitle("Notas"); // Establece el título de la ventana
        setSize(280, 380); // Establece el tamaño de la ventana
        setLocationRelativeTo(null); // La ventana se posiciona en el centro de la pantalla
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Establece que el botón de cerrar permite salir de la aplicación
        setResizable(false); // Establece que el tamaño de la ventana no se puede cambiar
    }

    /** 
     * Método que crea la ventana con sus diferentes componentes gráficos 
     */
    private void inicio() {
        contenedor = getContentPane(); // Obtiene el panel de contenidos de la ventana
        contenedor.setLayout(null); // Establece que el contenedor no tiene un layout

        // Establece la etiqueta y el campo de texto de la nota 1
        nota1 = new JLabel("Nota 1:");
        nota1.setBounds(20, 20, 135, 23);
        campoNota1 = new JTextField();
        campoNota1.setBounds(105, 20, 135, 23);

        // Establece la etiqueta y el campo de texto de la nota 2
        nota2 = new JLabel("Nota 2:");
        nota2.setBounds(20, 50, 135, 23);
        campoNota2 = new JTextField();
        campoNota2.setBounds(105, 50, 135, 23);

        // Establece la etiqueta y el campo de texto de la nota 3
        nota3 = new JLabel("Nota 3:");
        nota3.setBounds(20, 80, 135, 23);
        campoNota3 = new JTextField();
        campoNota3.setBounds(105, 80, 135, 23);

        // Establece la etiqueta y el campo de texto de la nota 4
        nota4 = new JLabel("Nota 4:");
        nota4.setBounds(20, 110, 135, 23);
        campoNota4 = new JTextField();
        campoNota4.setBounds(105, 110, 135, 23);

        // Establece la etiqueta y el campo de texto de la nota 5
        nota5 = new JLabel("Nota 5:");
        nota5.setBounds(20, 140, 135, 23);
        campoNota5 = new JTextField();
        campoNota5.setBounds(105, 140, 135, 23);

        // Establece el botón Calcular
        calcular = new JButton("Calcular");
        calcular.setBounds(20, 170, 100, 23);
        calcular.addActionListener(this); // Agrega al botón un ActionListener

        // Establece el botón Limpiar
        limpiar = new JButton("Limpiar");
        limpiar.setBounds(125, 170, 80, 23);
        limpiar.addActionListener(this); // Agrega al botón un ActionListener

        // Establece la etiqueta del promedio con su valor numérico
        promedio = new JLabel("Promedio = ");
        promedio.setBounds(20, 210, 135, 23);

        // Establece la etiqueta de la desviación con su valor numérico
        desviación = new JLabel("Desviación = ");
        desviación.setBounds(20, 240, 200, 23);

        // Establece la etiqueta de la nota mayor con su valor numérico
        mayor = new JLabel("Nota mayor = ");
        mayor.setBounds(20, 270, 120, 23);

        // Establece la etiqueta de la nota menor con su valor numérico
        menor = new JLabel("Nota menor = ");
        menor.setBounds(20, 300, 120, 23);

        // Se añade cada componente gráfico al contenedor de la ventana
        contenedor.add(nota1);
        contenedor.add(campoNota1);
        contenedor.add(nota2);
        contenedor.add(campoNota2);
        contenedor.add(nota3);
        contenedor.add(campoNota3);
        contenedor.add(nota4);
        contenedor.add(campoNota4);
        contenedor.add(nota5);
        contenedor.add(campoNota5);
        contenedor.add(calcular);
        contenedor.add(limpiar);
        contenedor.add(promedio);
        contenedor.add(desviación);
        contenedor.add(mayor);
        contenedor.add(menor);
    }

    /** 
     * Método que gestiona los eventos generados en la ventana principal 
     */
    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == calcular) { // Si se pulsa el botón Calcular
            Notas notas = new Notas(); // Se crea un objeto Notas
            // Se obtiene y convierte el valor numérico de cada nota
            notas.listaNotas[0] = Double.parseDouble(campoNota1.getText());
            notas.listaNotas[1] = Double.parseDouble(campoNota2.getText());
            notas.listaNotas[2] = Double.parseDouble(campoNota3.getText());
            notas.listaNotas[3] = Double.parseDouble(campoNota4.getText());
            notas.listaNotas[4] = Double.parseDouble(campoNota5.getText());

            // Se muestran los resultados formateados
            promedio.setText("Promedio = " + String.format("%.2f", notas.calcularPromedio()));
            desviación.setText("Desviación estándar = " + String.format("%.2f", notas.calcularDesviación()));
            mayor.setText("Valor mayor = " + String.valueOf(notas.calcularMayor()));
            menor.setText("Valor menor = " + String.valueOf(notas.calcularMenor()));
        }

        // Si se pulsa el botón Limpiar, se dejan en blanco los campos de notas
        if (evento.getSource() == limpiar) {
            campoNota1.setText("");
            campoNota2.setText("");
            campoNota3.setText("");
            campoNota4.setText("");
            campoNota5.setText("");
            promedio.setText("Promedio = ");
            desviación.setText("Desviación = ");
            mayor.setText("Nota mayor = ");
            menor.setText("Nota menor = ");
        }
    }
}
