import javax.swing.JOptionPane;

public class CalificacionesGrupo {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos alumnos son en el grupo?"));
        double suma = 0;
        double califBaja = 100; // Iniciamos con un valor alto

        for (int i = 1; i <= n; i++) {
            double calif = Double.parseDouble(JOptionPane.showInputDialog("Calificación del alumno " + i + ":"));
            suma = suma + calif;

            if (calif < califBaja) {
                califBaja = calif;
            }
        }

        double media = suma / n;
        JOptionPane.showMessageDialog(null, "Calificación media: " + media + "\nCalificación más baja: " + califBaja);
    }
}