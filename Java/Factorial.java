import javax.swing.JOptionPane;

public class Factorial {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número para calcular su factorial:"));
        double factorial = 1;

        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "No existe factorial de números negativos.");
        } else {
            for (int i = 1; i <= numero; i++) {
                factorial = factorial * i;
            }
            JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es: " + factorial);
        }
    }
}