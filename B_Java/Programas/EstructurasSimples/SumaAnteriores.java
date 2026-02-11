import javax.swing.JOptionPane;

public class SumaAnteriores {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número:"));
        int suma = 0;
        String serie = "";

        for (int i = 1; i < numero; i++) {
            suma = suma + i;
            serie += i + "+";
        }

        JOptionPane.showMessageDialog(null, "Suma de los números antes del " + numero + ":\n" +
                serie + " = " + suma);
    }
}