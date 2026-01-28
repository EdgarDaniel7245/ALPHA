import javax.swing.JOptionPane;

public class DescuentoBolita {
    public static void main(String[] args) {
        String respuesta;

        do {
            double compra = Double.parseDouble(JOptionPane.showInputDialog("Importe de la compra:"));
            String color = JOptionPane.showInputDialog("Color de la bolita (Roja, Amarilla, Blanca):");
            double descuento = 0;

            if (color.equalsIgnoreCase("Roja")) descuento = 0.40;
            else if (color.equalsIgnoreCase("Amarilla")) descuento = 0.25;


            double total = compra - (compra * descuento);
            JOptionPane.showMessageDialog(null, "Total a pagar: $" + total);

            respuesta = JOptionPane.showInputDialog("¿Hay otro cliente? (Si/No)");

        } while (respuesta.equalsIgnoreCase("Si"));
    }
}