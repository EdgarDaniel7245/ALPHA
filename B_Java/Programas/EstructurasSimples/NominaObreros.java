import javax.swing.JOptionPane;

public class NominaObreros {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos obreros hay?"));
        int i = 1;

        while (i <= n) {
            int horas = Integer.parseInt(JOptionPane.showInputDialog("Horas trabajadas del obrero " + i + ":"));
            double salario;

            if (horas <= 40) {
                salario = horas * 20;
            } else {
                salario = (40 * 20) + ((horas - 40) * 25);
            }

            JOptionPane.showMessageDialog(null, "El obrero " + i + " gana: $" + salario);
            i++;
        }
    }
}