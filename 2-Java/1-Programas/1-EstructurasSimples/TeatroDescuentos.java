import javax.swing.JOptionPane;

public class TeatroDescuentos {
    public static void main(String[] args) {
        String respuesta;
        double dineroPerdido = 0;
        double precioBoleto = 100.0;

        do {
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad del cliente:"));

            if (edad < 5) {
                JOptionPane.showMessageDialog(null, "No puede entrar al teatro.");
            } else {
                double descuento = 0;
                if (edad <= 14) descuento = 0.35;
                else if (edad <= 19) descuento = 0.25;
                else if (edad <= 45) descuento = 0.10;
                else if (edad <= 65) descuento = 0.25;
                else descuento = 0.35; // 66 en adelante

                double montoDescuento = precioBoleto * descuento;
                dineroPerdido += montoDescuento;

                JOptionPane.showMessageDialog(null, "Paga: $" + (precioBoleto - montoDescuento));
            }

            respuesta = JOptionPane.showInputDialog("¿Otro cliente? (Si/No)");

        } while (respuesta.equalsIgnoreCase("Si"));

        JOptionPane.showMessageDialog(null, "El teatro dejó de percibir (pérdidas por descuentos): $" + dineroPerdido);
    }
}
