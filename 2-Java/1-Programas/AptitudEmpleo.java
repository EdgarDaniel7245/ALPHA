import javax.swing.JOptionPane;

public class AptitudEmpleo {
    public static void main(String[] args) {

        int edad, experiencia;
        String tieneTitulo, tieneCertificaciones;
        String estado;

        String inputEdad = JOptionPane.showInputDialog("Ingrese la edad del candidato:");
        edad = Integer.parseInt(inputEdad);
        String inputExp = JOptionPane.showInputDialog("Ingrese los años de experiencia:");
        experiencia = Integer.parseInt(inputExp);

        tieneTitulo = JOptionPane.showInputDialog("¿Tiene Título Universitario? (Si/No)");
        tieneCertificaciones = JOptionPane.showInputDialog("¿Tiene Certificaciones? (Si/No)");


        if (edad >= 25 && edad <= 40) {

            if (experiencia >= 3 || (tieneTitulo.equalsIgnoreCase("Si") && experiencia == 2)) {

                estado = "Aceptado";


                if (tieneCertificaciones.equalsIgnoreCase("Si") && edad <= 35) {
                    estado = "Aceptado con Preferencia";
                }

            } else {

                estado = "Rechazado";
            }

        } else {

            estado = "Rechazado";
        }

        String mensajeSalida = "--- Resultados de la Postulación ---\n" +
                "Edad: " + edad + " años\n" +
                "Experiencia: " + experiencia + " años\n" +
                "Tiene Título: " + tieneTitulo + "\n" +
                "Tiene Certificaciones: " + tieneCertificaciones + "\n\n" +
                "Estado: " + estado;

        JOptionPane.showMessageDialog(null, mensajeSalida);

    }
}
