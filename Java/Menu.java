import javax.swing.JOptionPane;

public class Menu {
  
    public static void main(String[] args) {
        
        String menu="", opcion = "";
        boolean sentinel = true;

        menu = "===== MENU GENERAL =====\n" +
        "1/A) Opcion 1\n" +
        "2/B) Opcion 2\n" +
        "3/C) Opcion 3\n" +
        "4/D) Salir\n" +
        "Elegir Opición: ";
do{
        opcion = JOptionPane.showInputDialog( null, menu);

        switch (opcion.toUpperCase()) {
            case "1":
            case "A":
                JOptionPane.showMessageDialog(null, "Opción 1");
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
