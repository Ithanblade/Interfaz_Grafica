import javax.swing.*;

public class    Main {
    public static void main(String[] args) {


        /*
        String primernum = JOptionPane.showInputDialog("Ingrese el primer numero");
        String segundonum = JOptionPane.showInputDialog("Ingrese el segundo numero");

        //convertir los string en INT

        int numero1 = Integer.parseInt(primernum);
        int numero2 = Integer.parseInt(segundonum);
        int suma = numero1 + numero2; // sumar numeros
        int resta = numero1 - numero2; // sumar numeros
        int multiplicacion = numero1 * numero2; // sumar numeros
        int division = numero1 / numero2;

        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + suma,"Suma de dos enteros",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"El resultado de la resta es: " + resta,"Resta de dos enteros",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"El resultado de la multiplicacion es: " + multiplicacion,"Multiplicacion de dos enteros",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"El resultado de la division es: " + division,"Division de dos enteros",JOptionPane.PLAIN_MESSAGE);
         */

        JFrame frame = new JFrame("Mi aplicación");
        frame.setContentPane(new form1() .mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
}