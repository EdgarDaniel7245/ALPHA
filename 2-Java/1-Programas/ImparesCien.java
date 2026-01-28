import javax.swing.JOptionPane;

public class ImparesCien {
    public static void main(String[] args) {
        String impares = "";

        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                impares += i + ", ";
            }
        }

        JOptionPane.showMessageDialog(null, "Números impares del 0 al 100:\n" + impares);
    }
}