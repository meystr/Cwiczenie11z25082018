//11. Od użytkownika pobierzcie 3 długości odcinków, sprawdźcie czy można z nich zbudować trójkąt
// (suma 2 dowolnych odcinków jest większa od pozostałego).
package pl.sda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Podaj długość pierwszego odcinka: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Podaj długość drugiego odcinka: ");
        Scanner scanner1 = new Scanner(System.in);
        int b = scanner.nextInt();
        System.out.println("Podaj długość trzeciego odcinka: ");
        Scanner scanner2 = new Scanner(System.in);
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Można zbudować trójkąt: ");
        }else
            System.out.println("nie można zbudować trójkąta :(");
    }
}
