import javax.swing.JOptionPane;

public class SeriePositiva {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos términos (n)?"));
        double x = Double.parseDouble(JOptionPane.showInputDialog("Valor de X:"));
        double suma = 0;
        String serieTexto = "S = ";

        for (int i = 1; i <= n; i++) {
            double exponente = 3.0 / (3.0 * i);

            double numerador = Math.pow(x, exponente);


            double denominador = (2 * i) - 1;

            double termino = numerador / denominador;
            suma += termino;

            serieTexto += String.format("(%.2f / %.0f) + ", numerador, denominador);
        }

        JOptionPane.showMessageDialog(null, "Resultado de la serie:\n" + suma);
    }
}