import javax.swing.JOptionPane;

public class Ejercicio5_Adivina {
    public static void main(String[] args) {

        int secreto = (int) (Math.random() * 100) + 1;
        int intentosMaximos = 5;
        boolean gano = false;

        JOptionPane.showMessageDialog(null, "¡Adivina el número secreto entre 1 y 100!\nTienes " + intentosMaximos + " intentos.");

        for (int i = 1; i <= intentosMaximos; i++) {
            String entrada = JOptionPane.showInputDialog("Intento " + i + " de " + intentosMaximos + ":\nIngresa tu número:");
            
            if (entrada == null) break;

            int intento = Integer.parseInt(entrada);

            if (intento == secreto) {
                JOptionPane.showMessageDialog(null, "¡Felicidades! Adivinaste el número " + secreto + " en el intento " + i);
                gano = true;
                break;
            } else if (intento < secreto) {
                JOptionPane.showMessageDialog(null, "El número secreto es MAYOR.");
            } else {
                JOptionPane.showMessageDialog(null, "El número secreto es MENOR.");
            }
        }

        if (!gano) {
            JOptionPane.showMessageDialog(null, "Lo siento, se acabaron los intentos.\nEl número era: " + secreto);
        }
    }
}