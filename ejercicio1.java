import java.util.Scanner;

class ejercicio1 {

    public static void salidaPorConsola() {

        String nombre = " ";
        int edad = 0;

        Scanner sc1 = new Scanner(System.in);

        // pide el nombre del trabajador por consola
        System.out.println("Escriba su nombre.");
        nombre = sc1.next();

        // pide la edad del trabajador por consola
        System.out.println("Escriba su edad.");
        edad = sc1.nextInt();

        // finalmente, imprime los datos del trabajador
        System.out.println("Los datos del empleado son: " + nombre + ", " + edad);

        sc1.close();
    }

    public static void main(String[] args) {

        ejercicio1.salidaPorConsola();

    }

}
