import javax.swing.JOptionPane;

public class Tienda {
    public static void main(String[] args) {
        double importe = 0;
        double totalVendido = 0;
        int ventasValidas = 0;
        int intentosInvalidos = 0;
        int cantPeque = 0;
        int cantMed = 0;
        int cantGrande = 0;
        String listaPeque = "";
        String listaMed = "";
        String listaGrande = "";
        double ventaMasAlta = 0;
        double promedio = 0;

        while (true) {
            String entrada = JOptionPane.showInputDialog(null, "Ingrese el importe de venta.\n(Ingrese -1 para finalizar):");
            if (entrada == null) {
                break;
            }
            importe = Double.parseDouble(entrada);
            if (importe == -1) {
                break;
            }
            if (importe < 0) {
                intentosInvalidos++;
                JOptionPane.showMessageDialog(null, "Error: Importe inválido.");
            } else {
                ventasValidas++;
                totalVendido += importe;
                if (importe < 500) {
                    cantPeque++;
                    if (listaPeque.equals("")) {
                        listaPeque += (int)importe;
                    } else {
                        listaPeque += ", " + (int)importe;
                    }
                } else if (importe < 2000) {
                    cantMed++;
                    if (listaMed.equals("")) {
                        listaMed += (int)importe;
                    } else {
                        listaMed += ", " + (int)importe;
                    }
                } else {
                    cantGrande++;
                    if (listaGrande.equals("")) {
                        listaGrande += (int)importe;
                    } else {
                        listaGrande += ", " + (int)importe;
                    }
                }
                if (importe > ventaMasAlta) {
                    ventaMasAlta = importe;
                } else if (importe == ventaMasAlta) {
                }
            }
        }
        if (ventasValidas > 0) {
            promedio = totalVendido / ventasValidas;
        }
        String resumen = "Resultados:\n" +
                "Ventas validas: " + ventasValidas + "\n" +
                "Ventas pequeñas: " + cantPeque + " (" + listaPeque + ")\n" +
                "Ventas medianas: " + cantMed + " (" + listaMed + ")\n" +
                "Ventas grandes: " + cantGrande + " (" + listaGrande + ")\n" +
                "Total vendido: " + (int)totalVendido + "\n" +
                "Promedio: " + (int)promedio + "\n" +
                "Venta máxima: " + (int)ventaMasAlta + "\n" +
                "Inválidos: " + intentosInvalidos;
        JOptionPane.showMessageDialog(null, resumen);
    }
}