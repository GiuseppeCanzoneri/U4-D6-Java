package Es1;

import java.util.Scanner;

public class ArrayManager {
    private int[] array;

    public ArrayManager() {
        array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) + 1;
        }
    }

    public void printArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int position;
        int value;
        do {
            try {
                System.out.print("Inserisci una posizione (da 1 a 5) o 0 per uscire: ");
                position = scanner.nextInt();
                if (position == 0) {
                    break;
                }
                if (position < 1 || position > 5) {
                    throw new IllegalArgumentException("Posizione non valida.");
                }
                System.out.print("Inserisci un valore (da 1 a 10): ");
                value = scanner.nextInt();
                if (value < 1 || value > 10) {
                    throw new IllegalArgumentException("Valore non valido.");
                }
                array[position - 1] = value;
                printArray();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Errore: input non valido.");
                scanner.nextLine();
            }
        } while (true);
        scanner.close();
    }
}

