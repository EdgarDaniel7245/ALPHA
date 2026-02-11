import javax.swing.JOptionPane;

public class MasaAireAutos {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos vehículos son?"));
        double sumaMasa = 0;

        for (int i = 1; i <= n; i++) {
            double presion = Double.parseDouble(JOptionPane.showInputDialog("Vehículo " + i + ": Presión:"));
            double volumen = Double.parseDouble(JOptionPane.showInputDialog("Volumen:"));
            double temperatura = Double.parseDouble(JOptionPane.showInputDialog("Temperatura:"));

            double masa = (presion * volumen) / (0.37 * (temperatura + 460));
            sumaMasa += masa;
        }

        JOptionPane.showMessageDialog(null, "Promedio de masa de aire: " + (sumaMasa / n));
    }
}