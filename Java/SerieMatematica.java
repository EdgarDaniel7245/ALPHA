import javax.swing.JOptionPane;

public class SerieMatematica {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Número de términos (n):"));
        double x = Double.parseDouble(JOptionPane.showInputDialog("Valor de x:"));
        double suma = 0;

        for (int i = 1; i <= n; i++) {
            double exponente = 3.0 / (3.0 * i);
            double numerador = Math.pow(x, exponente);

            double denominador = (2 * i) - 1;

            double termino = numerador / denominador;


            if (i % 2 == 1) {
                suma = suma + termino;
            } else {
                suma = suma - termino;
            }
        }

        JOptionPane.showMessageDialog(null, "El resultado de la serie es: " + suma);
    }
}