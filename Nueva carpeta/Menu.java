import java.util.Scanner;
import java.util.Stack;

public class Menu {
    public void MenuPilas() {
        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();
        Stack<Obj> pila = new Stack<>();
        boolean seguir = true;
        int opt = 0, numero = 0;
        while (seguir) {
            System.out.println("Bienvenido a la segunda unidad de nacho lee");
            System.out.println("donde mi mamá me mima es más dificil");
            System.out.println("Que desea realizar");
            System.out.println("1) llenarPila");
            System.out.println("2) mostrar Pila");
            System.out.println("3) Modificar Pila");
            System.out.println("4) eliminar");
            System.out.println("5) Salir");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    pila = m.LLenarPila(pila);
                    break;
                case 2:
                    m.MostrarPila(pila);
                    break;
                case 3:
                    System.out.println("pagina en mantenimiento");
                    break;
                case 4:
                    System.out.println("Pagina en mantenimieto");

                    break;
                case 5:
                    System.out.println("Gracias por venir ");
                    seguir = false;
                    break;

                default:
                    System.out.println("home de 1 a 5 no joda");
                    break;
            }

        }
    }
}
