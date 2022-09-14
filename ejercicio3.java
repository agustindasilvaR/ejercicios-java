import java.util.Scanner;

public class ejercicio3 {

    public static void correoPlusNombre() {

        String nombre = " ";
        String correo = " ";

        Scanner sc1 = new Scanner(System.in);

        // pide email al usuario
        System.out.println("Introduce tu email.");
        correo = sc1.next();

        // pide nombre al usuario
        System.out.println("Introduce tu nombre.");
        nombre = sc1.next();

        System.out.println("Los datos son: " + nombre + ", " + correo);

        sc1.close();

    }

    public static void main(String[] args) {

        ejercicio3.correoPlusNombre();

    }

}
