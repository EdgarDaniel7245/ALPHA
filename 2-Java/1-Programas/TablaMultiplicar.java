import javax.swing.JOptionPane;

public class TablaMultiplicar {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("¿De qué número quieres la tabla?"));
        String resultado = "";

        for (int i = 1; i <= 10; i++) {
            int producto = numero * i;
            resultado += numero + " x " + i + " = " + producto + "\n";
        }

        JOptionPane.showMessageDialog(null, "Tabla del " + numero + ":\n" + resultado);
    }
}