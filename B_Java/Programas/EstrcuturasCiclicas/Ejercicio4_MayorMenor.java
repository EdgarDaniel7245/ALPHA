import javax.swing.JOptionPane;

public class Ejercicio4_MayorMenor {
    public static void main(String[] args) {

        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        

        for (int i = 1; i <= 10; i++) {
            String entrada = JOptionPane.showInputDialog("Ingresa el número entero " + i + " de 10:");
            

            if (entrada == null) break; 
            
            int numero = Integer.parseInt(entrada);


            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        String mensaje = "De los 10 números ingresados:\n" +
                         "El Mayor es: " + mayor + "\n" +
                         "El Menor es: " + menor;
                         
        JOptionPane.showMessageDialog(null, mensaje);
    }
}