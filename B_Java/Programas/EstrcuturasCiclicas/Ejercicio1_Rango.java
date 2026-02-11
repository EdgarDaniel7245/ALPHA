import javax.swing.JOptionPane;

public class Ejercicio1_Rango {
    public static void main(String[] args) {

        int inicio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de inicio del rango:"));
        int fin = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de fin del rango:"));


        if (inicio > fin) {
            int temp = inicio;
            inicio = fin;
            fin = temp;
        }

        String resultado = "Análisis del rango " + inicio + " a " + fin + ":\n";


        for (int i = inicio; i <= fin; i++) {
            resultado += i + " es ";
            

            if (i % 2 == 0) {
                resultado += "PAR";
            } else {
                resultado += "IMPAR";
            }
            resultado += "\n";
        }


        JOptionPane.showMessageDialog(null, resultado);
    }
}