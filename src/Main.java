import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World");

        String primernum = JOptionPane.showInputDialog("Ingrese el primer numero");
        String segundonum = JOptionPane.showInputDialog("Ingrese el segundo numero");

        //convertir los string en INT
        int numero1 = Integer.parseInt(primernum);
        int numero2 = Integer.parseInt(segundonum);
        int suma = numero1 + numero2; // sumar numeros

        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + suma,"Suma de dos enteros",JOptionPane.PLAIN_MESSAGE);




    }
}