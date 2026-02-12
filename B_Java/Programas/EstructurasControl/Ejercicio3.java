import javax.swing.JOptionPane;

public class Ejercicio3 {
    public static void main(String[] args) {
        int anio = Integer.parseInt
        (JOptionPane.showInputDialog("Año del vehículo:"));
        int tipo = Integer.parseInt
        (JOptionPane.showInputDialog("Tipo (1=Particular, 2=Carga, 3=Público):"));
        int emisiones = Integer.parseInt
        (JOptionPane.showInputDialog("Nivel de emisiones:"));

        String resultado = "Verificación rechazada";
        if (tipo == 1 && emisiones <= 50) resultado = "Verificación aprobada";
        else if (tipo == 2 && emisiones <= 70) resultado = "Verificación aprobada";
        else if (tipo == 3 && emisiones <= 60) resultado = "Verificación aprobada";
        String advertencia = "";
        if (anio < 2005) advertencia = "\nADVERTENCIA: Vehículo antiguo, requiere revisión especial";

        JOptionPane.showMessageDialog(null, resultado + advertencia);
    }
}