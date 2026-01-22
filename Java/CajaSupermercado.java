import javax.swing.JOptionPane;

public class CajaSupermercado {
    public static void main(String[] args) {
        double totalCompra = 0;
        String respuesta;

        do {
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Precio del artículo:"));
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de artículos iguales:"));

            double subtotal = precio * cantidad;
            totalCompra += subtotal;

            respuesta = JOptionPane.showInputDialog("Subtotal artículo: $" + subtotal + "\n¿Desea agregar otro artículo? (Si/No)");

        } while (respuesta.equalsIgnoreCase("Si"));

        JOptionPane.showMessageDialog(null, "El total de toda la compra es: $" + totalCompra);
    }
}