import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {


    private JButton multiplica;
    public JPanel mainPanel;
    private JLabel nombre_lbl;
    private JButton suma;
    private JTextField num2;
    private JButton divide;
    private JTextField num1;
    private JButton resta;
    private JButton raiz;
    private JButton potencia;
    private JButton seno;
    private JButton coseno;
    private JButton tangente;

    public form1() {
        multiplica.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float numero1 = Float.parseFloat(num1.getText());
                float numero2 = Float.parseFloat(num2.getText());
                float resultado = numero1 * numero2;
                nombre_lbl.setText("Respuesta: "+ resultado);
            }
        });
        suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float numero1 = Float.parseFloat(num1.getText());
                float numero2 = Float.parseFloat(num2.getText());
                float resultado = numero1 + numero2;
                nombre_lbl.setText("Respuesta: "+ resultado);
            }
        });
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float numero1 = Float.parseFloat(num1.getText());
                float numero2 = Float.parseFloat(num2.getText());
                if (numero2 == 0) {
                    nombre_lbl.setText("No se puede dividir para 0");
                }else {
                    float resultado = numero1 / numero2;
                    nombre_lbl.setText("Respuesta: " + resultado);
                }
            }
        });
        resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                float numero1 = Float.parseFloat(num1.getText());
                float numero2 = Float.parseFloat(num2.getText());
                float resultado = numero1 - numero2;
                nombre_lbl.setText("Respuesta: "+ resultado);
            }
        });
    }
}
