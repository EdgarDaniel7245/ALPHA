import javax.swing.JOptionPane;
public class PromedioAlumnoCiclos {
    public static void main(String[] args) {
        int numeroCali = 0;
        double calif = 0.0, promedio = 0.0;

        numeroCali = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de calificaciones a promedio"));
        for (int i = 1; i <= numeroCali ; i++){
            calif = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificación ") + i);
        }
    }
}
