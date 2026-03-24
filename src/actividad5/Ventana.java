package actividad5;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Ventana extends JFrame {

    public Ventana() {

        setTitle("Sistema de Facturación");
        setSize(720,650);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        iniciarComponentes();
        setVisible(true);
    }

    public void iniciarComponentes() {
        mostrarFactura();
    }

    public void mostrarFactura() {

        setLayout(null);

        JPanel panel = new JPanel(null);
        panel.setBounds(0,0,720,650);
        panel.setBackground(new Color(245, 247, 240));
        add(panel);

        JLabel titulo = new JLabel("Sistema de Facturación");
        titulo.setBounds(20,10,400,30);
        titulo.setForeground(new Color(34, 139, 87));
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 22));
        panel.add(titulo);

        panel.add(tituloSeccion("Datos del Cliente",20,40));
        panel.add(separador(20,60,660));

        JPanel cliente = panelBox(20,70,660,100);
        panel.add(cliente);

        cliente.add(label("Documento:",10,10));
        cliente.add(input("123456",110,10));

        cliente.add(label("Nombre:",320,10));
        cliente.add(input("Jhon Doe",400,10));

        cliente.add(label("Dirección:",10,50));
        cliente.add(input("Calle 1 #123",110,50));

        cliente.add(label("Teléfono:",320,50));
        cliente.add(input("5554433",400,50));

        panel.add(tituloSeccion("Información de la Factura",20,180));
        panel.add(separador(20,200,660));

        JPanel factura = panelBox(20,210,660,60);
        panel.add(factura);

        factura.add(label("Factura N°:",10,10));
        factura.add(label("1",120,10));

        factura.add(label("Fecha:",350,10));
        factura.add(label("23/03/2026",420,10));

        panel.add(tituloSeccion("Detalle de Productos",20,280));
        panel.add(separador(20,300,660));

        String[] columnas = {"Producto","Cant","Precio","Total"};
        String[][] datos = {
                {"Agua","2","500","1000"},
                {"Cereal","5","1000","5000"},
                {"Leche","2","300","600"}
        };

        JTable tabla = new JTable(datos, columnas);
        tabla.setBackground(Color.WHITE);
        tabla.setForeground(Color.BLACK);
        tabla.setRowHeight(28);
        tabla.setFont(new Font("Segoe UI", Font.PLAIN, 13));

        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(20,310,660,150);
        panel.add(scroll);

        panel.add(tituloSeccion("Resumen de Pago",20,470));
        panel.add(separador(20,490,660));

        panel.add(label("SubTotal:",20,500));
        panel.add(label("6600.0",120,500));

        panel.add(label("% Descuento:",20,530));
        JTextField desc = input("5",150,530);
        panel.add(desc);

        panel.add(label("Descuento: 330.0",250,530));

        panel.add(label("IVA 19%:",20,560));
        panel.add(label("1254.0",120,560));

        panel.add(label("Total:",20,590));
        panel.add(label("7524.0",120,590));

        JButton finalizar = new JButton("Finalizar factura");
        finalizar.setBounds(450,560,200,40);
        finalizar.setBackground(new Color(34,139,87));
        finalizar.setForeground(Color.WHITE);
        finalizar.setFont(new Font("Segoe UI", Font.BOLD, 14));
        finalizar.setFocusPainted(false);
        finalizar.setBorder(null);
        panel.add(finalizar);

        finalizar.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                    this,
                    "La factura se ha realizado con éxito!",
                    "Información",
                    JOptionPane.INFORMATION_MESSAGE
            );
        });
    }

    public JPanel panelBox(int x, int y, int w, int h){
        JPanel p = new JPanel(null);
        p.setBounds(x,y,w,h);
        p.setBackground(Color.WHITE);
        p.setBorder(new LineBorder(new Color(200,200,200),1,true));
        return p;
    }

    public JLabel label(String txt, int x, int y){
        JLabel l = new JLabel(txt);
        l.setBounds(x,y,180,25);
        l.setForeground(new Color(60,60,60));
        l.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        return l;
    }

    public JTextField input(String txt, int x, int y){
        JTextField t = new JTextField(txt);
        t.setBounds(x,y,150,25);
        t.setBackground(Color.WHITE);
        t.setForeground(Color.BLACK);
        t.setBorder(new LineBorder(new Color(180,180,180)));
        return t;
    }

    public JLabel tituloSeccion(String txt, int x, int y){
        JLabel t = new JLabel(txt);
        t.setBounds(x,y,300,25);
        t.setForeground(new Color(34,139,87));
        t.setFont(new Font("Segoe UI", Font.BOLD, 15));
        return t;
    }

    public JSeparator separador(int x, int y, int w){
        JSeparator s = new JSeparator();
        s.setBounds(x,y,w,1);
        s.setForeground(new Color(34,139,87));
        return s;
    }

    public static void main(String[] args) {
        new Ventana();
    }
}