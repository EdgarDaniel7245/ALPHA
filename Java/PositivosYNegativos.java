import javax.swing.JOptionPane;

public class PositivosYNegativos {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números vas a ingresar?"));
        double sumaPositivos = 0;
        double prodNegativos = 1; // Iniciamos en 1 para multiplicar
        boolean hayNegativos = false; // Para saber si mostrar el resultado negativo o no

        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(JOptionPane.showInputDialog("Número " + i + ":"));

            if (num >= 0) {
                sumaPositivos += num;
            } else {
                prodNegativos *= num;
                hayNegativos = true;
            }
        }

        String mensaje = "Suma de Positivos: " + sumaPositivos;

        if (hayNegativos) {
            mensaje += "\nMultiplicación de Negativos: " + prodNegativos;
        } else {
            mensaje += "\nNo se ingresaron números negativos.";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }
}