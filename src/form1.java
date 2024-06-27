import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {


    private JButton multiplica;
    public JPanel mainPanel;
    private JLabel respuesta1;
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
    private JLabel respuesta2;

    public form1() {
        multiplica.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float numero1 = Float.parseFloat(num1.getText());
                float numero2 = Float.parseFloat(num2.getText());
                float resultado = numero1 * numero2;
                respuesta1.setText("Respuesta: "+ String.format("%.2f", resultado));
                respuesta2.setText("");

            }
        });
        suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float numero1 = Float.parseFloat(num1.getText());
                float numero2 = Float.parseFloat(num2.getText());
                float resultado = numero1 + numero2;
                respuesta1.setText("Respuesta: "+ String.format("%.2f", resultado));
                respuesta2.setText("");

            }
        });
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float numero1 = Float.parseFloat(num1.getText());
                float numero2 = Float.parseFloat(num2.getText());
                if (numero2 == 0) {
                    respuesta1.setText("No se puede dividir para 0");
                }else {
                    float resultado = numero1 / numero2;
                    respuesta1.setText("Respuesta: " + String.format("%.2f", resultado));
                    respuesta2.setText("");

                }
            }
        });
        resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                float numero1 = Float.parseFloat(num1.getText());
                float numero2 = Float.parseFloat(num2.getText());
                float resultado = numero1 - numero2;
                respuesta1.setText("Respuesta: "+ String.format("%.2f", resultado));
                respuesta2.setText("");

            }
        });
        potencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float numero1 = Float.parseFloat(num1.getText());
                float numero2 = Float.parseFloat(num2.getText());
                float resultado = (float) Math.pow(numero1,numero2);
                respuesta1.setText("Respuesta: "+ String.format("%.2f", resultado));
                respuesta2.setText("");

            }
        });
        raiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float numero1 = Float.parseFloat(num1.getText());
                float numero2 = Float.parseFloat(num2.getText());
                float resultado1 = (float) Math.sqrt(numero1);
                float resultado2 = (float) Math.sqrt(numero2);
                respuesta1.setText("Respuesta(del primer numero): "+ String.format("%.2f", resultado1));
                respuesta2.setText("Respuesta(del segundo numero): "+ String.format("%.2f", resultado2));

            }
        });
        seno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float numero1 = Float.parseFloat(num1.getText());
                float numero2 = Float.parseFloat(num2.getText());
                float resultado1 = (float) Math.sin(numero1);
                float resultado2 = (float) Math.sin(numero2);
                respuesta1.setText("Respuesta(del primer numero): "+ String.format("%.2f", resultado1));
                respuesta2.setText("Respuesta(del segundo numero): "+ String.format("%.2f", resultado2));
            }
        });
        coseno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float numero1 = Float.parseFloat(num1.getText());
                float numero2 = Float.parseFloat(num2.getText());
                float resultado1 = (float) Math.cos(numero1);
                float resultado2 = (float) Math.cos(numero2);
                respuesta1.setText("Respuesta(del primer numero): "+ String.format("%.2f", resultado1));
                respuesta2.setText("Respuesta(del segundo numero): "+ String.format("%.2f", resultado2));
            }
        });
        tangente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float numero1 = Float.parseFloat(num1.getText());
                float numero2 = Float.parseFloat(num2.getText());
                float resultado1 = (float) Math.tan(numero1);
                float resultado2 = (float) Math.tan(numero2);
                respuesta1.setText("Respuesta(del primer numero): "+ String.format("%.2f", resultado1));
                respuesta2.setText("Respuesta(del segundo numero): "+ String.format("%.2f", resultado2));
            }
        });
    }
}
