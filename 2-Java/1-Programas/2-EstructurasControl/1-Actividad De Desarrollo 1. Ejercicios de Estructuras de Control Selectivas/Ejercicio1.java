import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {

        double parcial1 = Double.parseDouble
        (JOptionPane.showInputDialog("Ingrese calificación del Primer Parcial:"));
        double parcial2 = Double.parseDouble
        (JOptionPane.showInputDialog("Ingrese calificación del Segundo Parcial:"));
        double proyecto = Double.parseDouble
        (JOptionPane.showInputDialog("Ingrese calificación del Proyecto Final:"));

        double promedio = (parcial1 + parcial2) / 2; 

        String estatus = "";
        if (promedio >= 70 && proyecto >= 60) {
            estatus = "Aprobado";
        } else if (promedio >= 50 && promedio <= 69) {
            estatus = "Extraordinario";
        } else {
            estatus = "Reprobado";
        }
        String mensajeExtra = "";

        if (promedio >= 95) {
            mensajeExtra = "\n¡Alumno con excelencia académica!";
        }
        JOptionPane.showMessageDialog(null, 
            "Promedio Final: " + promedio + 
            "\nEstatus: " + estatus + 
            mensajeExtra);
    }
}