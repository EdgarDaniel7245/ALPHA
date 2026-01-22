import javax.swing.JOptionPane;

public class EvaluacionCredito {
    public static void main(String[] args) {

        double salarioMensual;
        String historialCrediticio;
        String estadoSolicitud;

        // Entrada de datos
        String inputSalario = JOptionPane.showInputDialog("Ingrese su salario mensual:");
        salarioMensual = Double.parseDouble(inputSalario);

        String inputDeudas = JOptionPane.showInputDialog("¿Tiene deudas pendientes? (Si/No)");
        
        historialCrediticio = JOptionPane.showInputDialog("¿Su historial crediticio es Bueno? (Si/No)");

        // Lógica de negocio (Estructura idéntica a tu ejemplo)
        if (salarioMensual >= 15000) {

            if (inputDeudas.equalsIgnoreCase("No")) {
                
                estadoSolicitud = "Aprobado";

                // Bonificación si tiene buen historial
                if (historialCrediticio.equalsIgnoreCase("Si")) {
                    estadoSolicitud = "Aprobado con Tasa Preferencial";
                }

            } else {
                // Tiene salario pero tiene deudas
                if (historialCrediticio.equalsIgnoreCase("Si")) {
                    estadoSolicitud = "Aprobado Condicionado (Requiere Aval)";
                } else {
                    estadoSolicitud = "Rechazado por Deudas";
                }
            }

        } else {
            estadoSolicitud = "Rechazado por Ingresos Insuficientes";
        }

        // Salida
        String mensajeSalida = "--- Resultados de Crédito ---\n" +
                "Salario: $" + salarioMensual + "\n" +
                "Tiene Deudas: " + inputDeudas + "\n" +
                "Historial: " + historialCrediticio + "\n\n" +
                "Dictamen Final: " + estadoSolicitud;

        JOptionPane.showMessageDialog(null, mensajeSalida);
    }
}