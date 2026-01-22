import javax.swing.JOptionPane;

public class MuestreoPesos {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿A cuántas personas vas a encuestar?"));

        double pesoNinos = 0, pesoJovenes = 0, pesoAdultos = 0, pesoViejos = 0;
        int cantNinos = 0, cantJovenes = 0, cantAdultos = 0, cantViejos = 0;

        for (int i = 1; i <= n; i++) {
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de la persona " + i + ":"));
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el peso de la persona " + i + ":"));

            if (edad <= 12) {
        pesoNinos += peso;
        cantNinos++;
    } else if (edad <= 29) {
        pesoJovenes += peso;
        cantJovenes++;
    } else if (edad <= 59) {
        pesoAdultos += peso;
        cantAdultos++;
    } else {
        pesoViejos += peso;
        cantViejos++;
    }
}

String mensaje = "Promedios:\n";
        if(cantNinos > 0) mensaje += "Niños: " + (pesoNinos/cantNinos) + "\n";
        if(cantJovenes > 0) mensaje += "Jóvenes: " + (pesoJovenes/cantJovenes) + "\n";
        if(cantAdultos > 0) mensaje += "Adultos: " + (pesoAdultos/cantAdultos) + "\n";
        if(cantViejos > 0) mensaje += "Viejos: " + (pesoViejos/cantViejos) + "\n";

        JOptionPane.showMessageDialog(null, mensaje);
    }
}