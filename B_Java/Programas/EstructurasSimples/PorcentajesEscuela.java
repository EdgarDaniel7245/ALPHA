import javax.swing.JOptionPane;

public class PorcentajesEscuela {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos alumnos son?"));
        int aprobados = 0;
        int reprobados = 0;

        for (int i = 1; i <= n; i++) {
            double calificacion = Double.parseDouble(JOptionPane.showInputDialog("Calificación del alumno " + i + ":"));

            if (calificacion >= 70) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        double porcAprobados = (aprobados * 100.0) / n;
        double porcReprobados = (reprobados * 100.0) / n;

        JOptionPane.showMessageDialog(null, "Total Alumnos: " + n +
                "\nAprobados: " + aprobados + " (" + porcAprobados + "%)" +
                "\nReprobados: " + reprobados + " (" + porcReprobados + "%)");
    }
}