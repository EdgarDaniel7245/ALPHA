import javax.swing.JOptionPane;

public class EstimuloAcademico {
    public static void main(String[] args) {
        // Definición de variables
        double promedio, descuento, precioUni, totalPagar;
        String nivel;
        int reprobadas, unidades;

        // Entrada de Datos
        promedio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el promedio académico:"));
        nivel = JOptionPane.showInputDialog("Ingrese el nivel (P: Preparatoria, R: Profesional):");

        // Proceso
        if (nivel.equalsIgnoreCase("P")) {
            // --- PREPARATORIA ---
            precioUni = 180.0 / 5.0;
            if (promedio >= 9.5) {
                unidades = 55;
                descuento = 0.25;
            } else if (promedio >= 9.0) {
                unidades = 50;
                descuento = 0.10;
            } else if (promedio > 7.0) {
                unidades = 50;
                descuento = 0.0;
            } else {
                // Promedio <= 7.0
                reprobadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de materias reprobadas:"));

                if (reprobadas <= 3) {
                    unidades = 45;
                } else {
                    unidades = 40;
                }
                descuento = 0.0;
            }
        } else {
            // --- PROFESIONAL ---
            precioUni = 300.0 / 5.0;
            if (promedio >= 9.5) {
                unidades = 55;
                descuento = 0.20;
            } else {
                unidades = 55;
                descuento = 0.0;
            }
        }

        // Cálculo Final
        totalPagar = (precioUni * unidades) * (1 - descuento);

        // Salida de Resultados
        String mensaje = String.format(
                "--- Detalle de Colegiatura ---\n" +
                        "Total a pagar: $%,.2f",
                totalPagar
        );
        JOptionPane.showMessageDialog(null, mensaje);
    }
}