import javax.swing.*;
    public class TienditaZuniga {
        public static void main(String[] args) {
            int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos dias vas a ingresar?"));

            double PrimerVenta = Double.parseDouble(JOptionPane.showInputDialog("Ingresa La Venta 1:"));
            double Maxima = PrimerVenta,Minima = PrimerVenta,VentaMedia = 10000.0,VentaCero=0.0,Promedio,SumaVentas=0.0;

            for (int i = 2; i <= n; i++) {
                double Venta = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la Venta " + i + ":"));
                if (Venta > Maxima) {
                    Maxima = Venta;
                }
                if (Venta < Minima && Venta != 0){
                    Minima = Venta;
                }
                if (Venta>VentaMedia){
                }
                if (Venta == VentaCero){
                }
                SumaVentas+=Venta;
            }
            Promedio=(SumaVentas+PrimerVenta)/n;
            JOptionPane.showMessageDialog(null, "La Venta Mayor es: " + Maxima +
                    "\nLa Venta Menor es: " + Minima +
                    "\nLas Ventas que Superaron los 10000 son: " + VentaMedia +
                    "\nLas Ventas Cero son: " + VentaCero +
                    "\nEl Promedio de Ventas es: " + Promedio);
        }
    }