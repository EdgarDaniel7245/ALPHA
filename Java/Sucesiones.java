import javax.swing.JOptionPane;

public class Sucesiones {
    public static void main(String[] args) {
        int n5 = Integer.parseInt(JOptionPane.showInputDialog("Ejercicio 5: ¿Hasta qué valor N?"));
        String serie5 = "Serie: ";
        int suma5 = 0;
        int num = 20;
        while(num <= n5) {
            serie5 += num + ", ";
            suma5 += num;
            num += 5;
        }
        JOptionPane.showMessageDialog(null, serie5 + "\nSuma: " + suma5);

        int n6 = Integer.parseInt(JOptionPane.showInputDialog("Ejercicio 6: ¿Cuántos términos (n)?"));
        String serie6 = "Serie Cuadrada: ";
        int suma6 = 0;
        for(int i=1; i<=n6; i++){
            int cuadrado = i * i;
            serie6 += cuadrado + ", ";
            suma6 += cuadrado;
        }
        JOptionPane.showMessageDialog(null, serie6 + "\nSuma: " + suma6);
    }
}