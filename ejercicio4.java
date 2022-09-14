import java.util.Scanner;

public class ejercicio4 {

    public static void unNumero() {

        int numero = 0;

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Introduce un número");
        numero = sc1.nextInt();

        if (numero != 5) {
            unNumero();
        } else {
            sc1.close();
            return;
        }

        sc1.close();

    }

    public static void main(String[] args) {

        ejercicio4.unNumero();

    }

}
