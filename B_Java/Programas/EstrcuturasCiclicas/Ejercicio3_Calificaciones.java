import javax.swing.JOptionPane;

public class Ejercicio3_Calificaciones {
    public static void main(String[] args) {
        double suma = 0;
        int contador = 0;
        int aprobados = 0;
        int reprobados = 0;
        
        
        while (true) {
            String entrada = JOptionPane.showInputDialog("Ingresa una calificación (o -1 para terminar):");
            if (entrada == null) break;
            
            double calificacion = Double.parseDouble(entrada);


            if (calificacion == -1) {
                break;
            }


            if (calificacion < 0 || calificacion > 10) {
                JOptionPane.showMessageDialog(null, "Calificación inválida (0-10). Intenta de nuevo.");
                continue;
            }


            suma += calificacion;
            contador++;

            if (calificacion >= 6) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        if (contador > 0) {
            double promedio = suma / contador;
            String reporte = "Resultados:\n" +
                             "Promedio: " + String.format("%.2f", promedio) + "\n" +
                             "Aprobados: " + aprobados + "\n" +
                             "Reprobados: " + reprobados;
            JOptionPane.showMessageDialog(null, reporte);
        } else {
            JOptionPane.showMessageDialog(null, "No se ingresaron calificaciones.");
        }
    }
}