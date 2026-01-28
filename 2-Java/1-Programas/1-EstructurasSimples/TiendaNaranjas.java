import javax.swing.JOptionPane;

public class TiendaNaranjas {
    public static void main(String[] args) {
        double totalTienda = 0;
        double precioKilo = 20.0;

        for (int i = 1; i <= 15; i++) {
            double kilos = Double.parseDouble(JOptionPane.showInputDialog("Cliente " + i + ": ¿Cuántos kilos lleva?"));
            double totalPagar = kilos * precioKilo;

            if (kilos > 10) {
                totalPagar = totalPagar - (totalPagar * 0.15); // Descuento 15%
            }

            JOptionPane.showMessageDialog(null, "El cliente " + i + " pagará: $" + totalPagar);
            totalTienda += totalPagar;
        }

        JOptionPane.showMessageDialog(null, "La tienda percibió en total: $" + totalTienda);
    }
}