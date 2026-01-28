import javax.swing.JOptionPane;

public class CalcomaniasAutos {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos autos entran a la CDMX?"));
        int cont = 1;
        int amarilla=0, rosa=0, roja=0, verde=0, azul=0;

        while (cont <= n) {
            int placa = Integer.parseInt(JOptionPane.showInputDialog("Auto " + cont + ": Ingresa el último dígito de la placa:"));

            if (placa == 1 || placa == 2) amarilla++;
            else if (placa == 3 || placa == 4) rosa++;
            else if (placa == 5 || placa == 6) roja++;
            else if (placa == 7 || placa == 8) verde++;
            else if (placa == 9 || placa == 0) azul++;

            cont++;
        }

        JOptionPane.showMessageDialog(null, "Total de autos por calcomanía:" +
                "\nAmarilla: " + amarilla + "\nRosa: " + rosa + "\nRoja: " + roja +
                "\nVerde: " + verde + "\nAzul: " + azul);
    }
}