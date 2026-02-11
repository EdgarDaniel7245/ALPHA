import javax.swing.JOptionPane;

public class Ejercicio2_Factorial {
    public static void main(String[] args) {
        int numero = -1;


        do {
            String entrada = JOptionPane.showInputDialog("Ingresa un número entero positivo para calcular su factorial:");
            

            if (entrada == null) return; 

            numero = Integer.parseInt(entrada);


            if (numero < 0) {
                JOptionPane.showMessageDialog(null, "El número debe ser positivo. Intenta de nuevo.");
                continue; 
            }

        } while (numero < 0);


        long factorial = 1; 
        

        if (numero == 0) {
            factorial = 1;
        } else {
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }
        }

        JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es: " + factorial);
    }
}