import java.util.Scanner;

public class ejercicio5 {

    public static void rango() {

        int numero = 0;

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Escribe un número entre el 1 y el 50.");
        numero = sc1.nextInt();

        if (numero >= 1 && numero <= 50) {
            if (numero % 2 == 0) {
                System.out.println("Número par");
            } else {
                System.out.println("Número impar");
            }
        } else {
            System.out.println("El número no es válido.");
            ejercicio5.rango();
        }

        sc1.close();

    }

    public static void main(String[] args) {

        ejercicio5.rango();

    }

}
