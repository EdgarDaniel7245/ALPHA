import javax.swing.JOptionPane;

public class CalidadHuevos {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas gallinas hay?"));
        double sumaCalidad = 0;

        for (int i = 1; i <= n; i++) {
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Gallina " + i + ": Peso:"));
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura:"));
            int huevos = Integer.parseInt(JOptionPane.showInputDialog("Número de huevos:"));

            double calidad = (peso * altura) / huevos;
            sumaCalidad += calidad;
        }

        double promedioCalidad = sumaCalidad / n;
        double precioKilo;

        if (promedioCalidad >= 15) precioKilo = 1.2 * promedioCalidad;
        else if (promedioCalidad > 8) precioKilo = 1.0 * promedioCalidad;
        else precioKilo = 0.8 * promedioCalidad;

        JOptionPane.showMessageDialog(null, "Precio por kilo de huevo fijado en: $" + precioKilo);
    }
}
