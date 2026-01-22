import javax.swing.*;

public class PromedioAlumnoCiclosV2 {
    public static void main(String[] args) {
        int numeroCali = 0;
        numeroCali = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de calificaciones a promedio"));
        for (int i = 1; i <= numeroCali ; i++){
            JOptionPane.showInputDialog(null, "El promedio de la Materia de Metodologia de la programacion es:");
        }
    }
}



