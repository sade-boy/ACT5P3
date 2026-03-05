package actividad5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame {

    public Ventana() {

        setTitle("Ventana");
        setSize(500,350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        iniciarComponentes();

        setVisible(true);
    }

    public void iniciarComponentes() {

        setLayout(new BorderLayout());

        
        JLabel titulo = new JLabel("Interés");
        titulo.setFont(new Font("Arial", Font.BOLD, 26));
        titulo.setForeground(Color.red);

        JPanel panelTitulo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelTitulo.setBackground(Color.WHITE);
        panelTitulo.add(titulo);

        add(panelTitulo, BorderLayout.NORTH);


        
        JPanel panelCentro = new JPanel(new BorderLayout());
        panelCentro.setBackground(Color.green);

        JLabel texto = new JLabel("Calcular interés");

        JPanel arriba = new JPanel(new FlowLayout(FlowLayout.LEFT));
        arriba.setOpaque(false);
        arriba.add(texto);

        panelCentro.add(arriba, BorderLayout.NORTH);


        JPanel datos = new JPanel(new GridLayout(3,2,10,10));
        datos.setOpaque(false);

        JTextField capital = new JTextField("1500");
        JTextField tiempo = new JTextField("2");
        JTextField tasa = new JTextField("0.1");

        datos.add(new JLabel("Capital:"));
        datos.add(capital);

        datos.add(new JLabel("Tiempo:"));
        datos.add(tiempo);

        datos.add(new JLabel("Tasa interés:"));
        datos.add(tasa);

        panelCentro.add(datos, BorderLayout.CENTER);


        JPanel botones = new JPanel(new FlowLayout());
        botones.setOpaque(false);

        botones.add(new JButton("Calcular"));
        botones.add(new JButton("Cancelar"));

        panelCentro.add(botones, BorderLayout.SOUTH);

        add(panelCentro, BorderLayout.CENTER);


        
        JPanel resultado = new JPanel(new GridLayout(2,2,10,10));
        resultado.setBackground(Color.orange);

        JTextField interes = new JTextField();
        JTextField monto = new JTextField();

        resultado.add(new JLabel("Interes:"));
        resultado.add(interes);

        resultado.add(new JLabel("Monto:"));
        resultado.add(monto);

        add(resultado, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new Ventana();
    }
}