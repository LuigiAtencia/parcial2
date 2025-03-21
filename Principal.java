import java.util.Scanner;
import java.util.Stack;

public class Principal {
    public static void main(String[] args) {
        Metodos m = new Metodos();
        boolean continuar = true;
        int opt2 = 0;
        Scanner sc = new Scanner(System.in);
        Stack<Repuesto> pila = m.LLenarPila1();
        m.MostrarPila(pila);
        int opt = 0;
        while (continuar) {
            System.out.println("ingrese 1 si desea buscar o 2 si desea vender , 3 si desea modificar");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                case 2:
                    m.Registro(pila, opt);
                    break;
                case 3:
                    m.ModificarRegistro(pila);
                    break;
                default:
                    System.out.println("pagina en mantenimiento ");
                    break;
            }

            System.out.println("desea continuar con otra accion 1: si ,2: no");
            opt2 = sc.nextInt();
            if (opt2 == 2) {
                continuar = false;
            }
        }

    }
}
