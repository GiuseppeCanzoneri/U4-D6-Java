package Es2;

import java.util.Scanner;

public class CarFuelManager {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int km;
        int litri;
        double kmPerLitro;
        do {
            try {
                System.out.print("Inserisci il numero di km percorsi o 0 per uscire: ");
                km = scanner.nextInt();
                if (km == 0) {
                    break;
                }
                System.out.print("Inserisci il numero di litri consumati: ");
                litri = scanner.nextInt();
                if (litri == 0) {
                    throw new ArithmeticException("Divisione per zero.");
                }
                kmPerLitro = (double) km / litri;
                System.out.println("Il numero di km/litro percorsi è: " + kmPerLitro);
            } catch (ArithmeticException e) {
                System.out.println("Errore: divisione per zero.");
            } catch (Exception e) {
                System.out.println("Errore: input non valido.");
                scanner.nextLine();
            }
        } while (true);
        scanner.close();
    }
}
