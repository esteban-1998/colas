import java.util.Queue;
import java.util.Scanner;

public class Metodo {
    Scanner sc = new Scanner(System.in);

    public Queue<objconstructor> Ingresar(Queue<objconstructor> A) {
        objconstructor o = new objconstructor();
        System.out.println("Ingrese Nombre:");
        o.setNombre(sc.next());
        System.out.println("ingrese cedula:");
        o.setCedula(sc.nextInt());
        System.out.println("ingrese edad:");
        o.setEdad(sc.nextInt());
        System.out.println("ingrese si tiene auxilio");
        o.setAuxilio(sc.next());
        System.out.println("ingrese si es desplazado");
        o.setDesplazado(sc.next());
        System.out.println("ingrese estracto");
        o.setEstracto(sc.nextInt());
        A.offer(o);
        return A;
    }
    public boolean ValidarDesplazamiento(Queue<objconstructor> A, int Cedula) {
        boolean es = true;
 
        // if (A.ValidarDesplazamiento()) {
            for (objconstructor o : A) {
                if (o.getCedula()== Cedula) {
                    if (o.getDesplazado().equalsIgnoreCase("SI")) {
                        return true;
                    } else {
                        return false;
                    }
                }
 
            }
        }

 
    public auxilio (Queue<objconstructor> A)
    {
        for ( objconstructor : A) {
            if (o.getEdad() < 18) {
                o.setedad(1400000 * .8);
            } else {
                o.setEdad(1400000);
                return A;
            }
        }
    }

    public Queue<objconstructor> modificar(Queue<objconstructor> A) {
        String dato = "";
        System.out.println("ingrese el dato que desea modificar");
        
        dato= sc.next();
        for (objconstructor o : A) {
            if(o.getNombre().equalsIgnoreCase(dato))
            {System.out.println("ingrese si es desplazado");
            o.setDesplazado(sc.next());
            System.out.println("ingrese si tiene auxilio");
            o.setAuxilio(sc.next());
            }
            
        }
        return A;
    }

}