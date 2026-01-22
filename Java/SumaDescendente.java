import javax.swing.JOptionPane;

public class SumaDescendente {
    public static void main(String[] args) {
        int suma = 0;
        String serie = "";

        for (int i = 100; i >= 0; i -= 2) {
            suma = suma + i;
            serie += i + " "; // Guardamos el número para mostrarlo
        }

        JOptionPane.showMessageDialog(null, "La serie es: " + serie +
                "\nLa suma total es: " + suma);
    }
}