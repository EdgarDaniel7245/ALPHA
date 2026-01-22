import javax.swing.JOptionPane;

public class ComisionesVendedores {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos vendedores son?"));
        int contador = 1;

        while (contador <= n) {
            double sueldoBase = Double.parseDouble(JOptionPane.showInputDialog("Vendedor " + contador + ": Sueldo base:"));
            double venta1 = Double.parseDouble(JOptionPane.showInputDialog("Venta 1:"));
            double venta2 = Double.parseDouble(JOptionPane.showInputDialog("Venta 2:"));
            double venta3 = Double.parseDouble(JOptionPane.showInputDialog("Venta 3:"));

            double comision = (venta1 + venta2 + venta3) * 0.10;
            double total = sueldoBase + comision;

            JOptionPane.showMessageDialog(null, "Vendedor " + contador +
                    "\nComisión ganada: $" + comision +
                    "\nSueldo Total: $" + total);

            contador++; // Importante aumentar el contador
        }
    }
}