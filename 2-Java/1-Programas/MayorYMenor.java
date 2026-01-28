import javax.swing.JOptionPane;

public class MayorYMenor {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números vas a ingresar?"));


        double primerNumero = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el número 1:"));
        double mayor = primerNumero;
        double menor = primerNumero;


        for (int i = 2; i <= n; i++) {
            double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el número " + i + ":"));

            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        JOptionPane.showMessageDialog(null, "El número Mayor es: " + mayor +
                "\nEl número Menor es: " + menor);
    }
}