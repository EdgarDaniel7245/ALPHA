import javax.swing.JOptionPane;

public class AccesoJuego {
    public static void main(String[] args) {

        int edad;
        double altura; // En metros, ej: 1.65
        String companiaAdulto;
        String resultado;

        String inputEdad = JOptionPane.showInputDialog("Ingrese la edad del visitante:");
        edad = Integer.parseInt(inputEdad);

        String inputAltura = JOptionPane.showInputDialog("Ingrese la altura en metros (ej: 1.60):");
        altura = Double.parseDouble(inputAltura);

        companiaAdulto = JOptionPane.showInputDialog("¿Viene acompañado de un adulto? (Si/No)");

        // Lógica
        if (altura >= 1.40) {

            if (edad >= 12) {
                resultado = "Acceso Permitido";
            } else {
                // Menor de 12 pero con altura suficiente
                if (companiaAdulto.equalsIgnoreCase("Si")) {
                    resultado = "Acceso Permitido (Con Acompañante)";
                } else {
                    resultado = "Acceso Denegado (Requiere Acompañante)";
                }
            }

        } else {
            // No cumple altura mínima
            resultado = "Acceso Denegado por Seguridad (Altura)";
        }

        String mensajeSalida = "--- Validación de Seguridad ---\n" +
                "Edad: " + edad + " años\n" +
                "Altura: " + altura + "m\n" +
                "Acompañado: " + companiaAdulto + "\n\n" +
                "Status: " + resultado;

        JOptionPane.showMessageDialog(null, mensajeSalida);
    }
}