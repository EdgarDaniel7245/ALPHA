import javax.swing.JOptionPane;

public class PromedioEdadesGenero {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos alumnos son?"));
        int i = 1;
        double sumaHombres = 0, sumaMujeres = 0, sumaTotal = 0;
        int conHombres = 0, conMujeres = 0;

        while (i <= n) {
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad del alumno " + i + ":"));
            String sexo = JOptionPane.showInputDialog("Sexo (H/M):");

            sumaTotal += edad;

            if (sexo.equalsIgnoreCase("H")) {
                sumaHombres += edad;
                conHombres++;
            } else {
                sumaMujeres += edad;
                conMujeres++;
            }
            i++;
        }

        String msg = "Promedio Total: " + (sumaTotal/n) + "\n";
        if(conHombres > 0) msg += "Promedio Hombres: " + (sumaHombres/conHombres) + "\n";
        if(conMujeres > 0) msg += "Promedio Mujeres: " + (sumaMujeres/conMujeres);

        JOptionPane.showMessageDialog(null, msg);
    }
}