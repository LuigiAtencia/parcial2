import java.lang.ref.Reference;
import java.util.Scanner;
import java.util.Stack;
import javax.swing.JOptionPane;

public class Metodos {
    int opt = 0;
    Scanner sc = new Scanner(System.in);

    public Stack<Repuesto> LLenarPila1() {
        Stack<Repuesto> pila = new Stack<>();
        Boolean bandera = true;

        while (bandera) {
            Repuesto o = new Repuesto();
            o.setMarca(JOptionPane.showInputDialog("Ingrese el Marca"));
            o.setCantidad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad")));
            o.setReferencia(JOptionPane.showInputDialog("Ingrese la referencia"));
            o.setPrecio(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Precio")));
            pila.push(o);
            System.out.println("Desea agregar mas registros 1: SI, 2: NO");
            while (!sc.hasNextInt()) {
                System.out.println("Error, ingrese un dato númerico.");
                sc.next();
            }
            opt = sc.nextInt();
            while (opt < 1 || opt > 2) {
                System.out.println("esa opcion no existe por favor valide nuevo ");
                opt = sc.nextInt();
            }
            if (opt == 2) {
                bandera = false;
            }
        }
        return pila;
    }

    public void MostrarPila(Stack<Repuesto> pila) {
        for (Repuesto o : pila) {
            System.out.println(o.getMarca());
            System.out.println(o.getCantidad());
            System.out.println(o.getPrecio());
            System.out.println(o.getReferencia());
        }
    }

    public void Registro(Stack<Repuesto> pila, int opt) {
        String referencia = "";
        boolean existe = false;
        if (opt == 1) {
            System.out.println("ingrese la referencia que desea buscar");
        } else {
            System.out.println("ingrese la referencia del producto a comprar: ");
        }

        referencia = sc.next();
        if (opt == 1) {
            for (Repuesto o : pila) {
                if (referencia.equalsIgnoreCase(o.getReferencia())) {
                    System.out.println(o.getMarca());
                    System.out.println(o.getCantidad());
                    System.out.println(o.getPrecio());
                    System.out.println(o.getReferencia());
                    existe = true;
                }

            }
            if (!existe) {
                System.out.println("la referencia no existe o ne se encuentra");
            }
        } else {
            Stack<Repuesto> pilaaux = new Stack<>();
            for (Repuesto carrito : pila) {
                if (carrito.getReferencia().equalsIgnoreCase(referencia)) {
                    pila.remove(carrito);
                    System.out.println("Referencia vendida");

                }
            }
            while (!pilaaux.isEmpty()) {
                pila.push(pilaaux.pop());
            }
            MostrarPila(pila);

        }

    }

    public void ModificarRegistro(Stack<Repuesto> pila) {
        String referencia = "";
        System.out.println("ingrese la referencia que desea modificar");
        referencia = sc.next();
        for (Repuesto Repuesto : pila) {
            if (Repuesto.getReferencia().equalsIgnoreCase(referencia)) {
                
                System.out.println("ingrese el nuevo precio");
                Repuesto.setPrecio(sc.nextInt());
                System.out.println("ingrese la nueva cantidad");
                Repuesto.setCantidad(sc.nextInt());
                System.out.println(referencia);

            }
        }
        MostrarPila(pila);
    }
}
