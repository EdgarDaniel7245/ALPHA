import javax.swing.JOptionPane;

public class MilACero {
    public static void main(String[] args) {
        // Opción A: Imprimir en consola (Recomendado para 1001 números)
        System.out.println("--- Conteo del 1000 al 0 ---");
        for (int i = 1000; i >= 0; i--) {
            System.out.println(i);
        }

        JOptionPane.showMessageDialog(null, "El conteo del 1000 al 0 se ha completado.\n(Revisar la consola de salida para ver los números)");

        /* // Opción B: Intentar mostrar en ventana (Puede verse cortado)
        String numeros = "";
        for (int i = 1000; i >= 0; i--) {
             numeros += i + " ";
        }
        JOptionPane.showMessageDialog(null, numeros); 
        */
    }
}