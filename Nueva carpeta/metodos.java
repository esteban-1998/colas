import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class metodos {
    Scanner sc = new Scanner(System.in);

    public Stack<Obj> LLenarPila(Stack<Obj> p) {
        boolean bandera = true;
        while (bandera) {
            Obj o = new Obj();
            System.out.println("Ingrese el numero");
            o.setNumero(sc.nextInt());
            p.push(o);
            System.out.println("Desea agregar mas numeros 1) si, 2) no");
            int opt = sc.nextInt();
            if (opt == 2) {
                bandera = false;
            }
        }
        return p;
    }

    public Queue<Obj> LLenarCola(Queue<Obj> p) {
        boolean bandera = true;
        while (bandera) {
            Obj o = new Obj();
            System.out.println("Ingrese el numero");
            o.setNumero(sc.nextInt());
            p.offer(o);
            System.out.println("Desea agregar mas numeros 1) si, 2) no");
            int opt = sc.nextInt();
            if (opt == 2) {
                bandera = false;
            }
        }
        return p;
    }

    public LinkedList<Obj> LLenarLista(LinkedList<Obj> p) {
        boolean bandera = true;
        while (bandera) {
            Obj o = new Obj();
            System.out.println("Ingrese el numero");
            o.setNumero(sc.nextInt());
            p.add(o);
            System.out.println("Desea agregar mas numeros 1) si, 2) no");
            int opt = sc.nextInt();
            if (opt == 2) {
                bandera = false;
            }
        }
        return p;
    }

    public void MostrarPila(Stack<Obj> p) {
        for (Obj o : p) {
            System.out.println(" " + o.getNumero());
        }
    }

    public void MostrarCola(Queue<Obj> p) {
        for (Obj o : p) {
            System.out.println(" " + o.getNumero());
        }
    }

    public void Mostrarlista(LinkedList<Obj> p) {
        for (Obj o : p) {
            System.out.println(" " + o.getNumero());
        }
    }
}
