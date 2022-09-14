import java.util.Scanner;

public class ejercicio2 {

    public static void checkAge() {

        int edad = 0;

        Scanner sc1 = new Scanner(System.in);

        // Pregunta la edad del usuario por consola
        System.out.println("Escriba su edad.");
        edad = sc1.nextInt();

        // Comprueba si el usuario es menor o mayor de edad según la edad introducida
        // por consola
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }

        sc1.close();

    }

    public static void main(String[] args) {

        ejercicio2.checkAge();

    }

}
