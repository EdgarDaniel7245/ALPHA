import javax.swing.JOptionPane;

public class NumeroPrimo {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número para saber si es primo:"));
        boolean esPrimo = true;

        if (numero <= 1) esPrimo = false;
        else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break; // Rompe el ciclo si encuentra un divisor
                }
            }
        }

        if (esPrimo) JOptionPane.showMessageDialog(null, "El número " + numero + " ES Primo.");
        else JOptionPane.showMessageDialog(null, "El número " + numero + " NO es Primo.");
    }
}