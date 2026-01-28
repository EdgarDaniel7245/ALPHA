import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
        double consumo = Double.parseDouble
        (JOptionPane.showInputDialog("Ingrese consumo mensual (kWh):"));
        int tarifa = Integer.parseInt
        (JOptionPane.showInputDialog("Seleccione Tarifa (1=Básica, 2=Intermedia, 3=Alta):"));

        double costoKwh = 0;
        double recargoPorcentaje = 0;
        switch (tarifa) {
            case 1:
                costoKwh = 0.85;
                if (consumo > 250) recargoPorcentaje = 0.12;
                break;
            case 2:
                costoKwh = 1.25;
                if (consumo > 500) recargoPorcentaje = 0.18;
                else if (consumo >= 300) recargoPorcentaje = 0.10;
                break;
            case 3:
                costoKwh = 2.10;
                if (consumo > 400) recargoPorcentaje = 0.25;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Tarifa inválida");
                return;
        }
        double subtotal = consumo * costoKwh;
        double montoRecargo = subtotal * recargoPorcentaje;
        double total = subtotal + montoRecargo;

        String mensaje = "";
        if (total > 1500) mensaje = "Consumo elevado: se recomienda ahorro de energía";
        if (consumo < 100) mensaje = "Usuario con consumo eficiente";

        JOptionPane.showMessageDialog(null, 
            "Tarifa: " + tarifa +
            "\nConsumo: " + consumo + " kWh" +
            "\nCosto por kWh: $" + costoKwh +
            "\nRecargos: $" + montoRecargo +
            "\nTotal a pagar: $" + total +
            "\n" + mensaje);
    }
}