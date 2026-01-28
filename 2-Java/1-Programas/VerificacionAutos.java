import javax.swing.JOptionPane;

public class VerificacionAutos {
    public static void main(String[] args) {
        double sumaPuntos = 0;
        double menorContaminacion = 10000;
        double mayorContaminacion = 0;

        for (int i = 1; i <= 25; i++) {
            double puntos = Double.parseDouble(JOptionPane.showInputDialog("Puntos contaminantes del auto " + i + ":"));
            sumaPuntos += puntos;

            if (puntos < menorContaminacion) menorContaminacion = puntos;
            if (puntos > mayorContaminacion) mayorContaminacion = puntos;
        }

        JOptionPane.showMessageDialog(null, "Promedio de puntos: " + (sumaPuntos / 25) +
                "\nMenos contaminante: " + menorContaminacion +
                "\nMás contaminante: " + mayorContaminacion);
    }
}