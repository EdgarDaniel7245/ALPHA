import javax.swing.JOptionPane;

public class Menu {
  
    public static void main(String[] args) {
        double cali = 0.0;
        int n = 0;
        double prom = 0.0;
        String menu="", opcion = "";
        boolean sentinel = true;

        menu = "===== MENU GENERAL =====\n" +
        "1/A) Promedio de Calificaciones\n" +
        "2/B) Opcion 2\n" +
        "3/C) Opcion 3\n" +
        "4/D) Salir\n" +
        "Elegir Opición: ";
do{
        opcion = JOptionPane.showInputDialog( null, menu);

        switch (opcion.toUpperCase()) {
            case "1":
            case "A":
                n = Integer.parseInt
                (JOptionPane.showInputDialog
                    ("Introduce el número de Calificaciones"));

                if (n>0) {
                    for (int i = 1; i <=n; i++) {
                        cali = Double.parseDouble
                        (JOptionPane.showInputDialog("Introduce la calificación " + i));
                        if (cali>=0.0 && cali <=10.0) {

                            prom+=cali;

                        }else{
                            JOptionPane.showMessageDialog
                            (null, "Calificación fuera de rango.");
                            i--; // i = i - 1
                        }

                        prom/=n; //prom = prom / n;

                    }
                }else{
                    JOptionPane.showMessageDialog(null, "El número de calificaciones no puede ");
                }
            break;

            case "2":
            case "B":
                JOptionPane.showMessageDialog(null, "Opción 2");
            break;

            case "3":
            case "C":
                JOptionPane.showMessageDialog(null, "Opción 3");
            break;

            case "4":
            case "D":
                JOptionPane.showMessageDialog(null, "Salir");
            sentinel = false;
            break;

            default:
                JOptionPane.showMessageDialog(null, "Opción no valida");

        }

    }while (sentinel);    


    }
    
}
