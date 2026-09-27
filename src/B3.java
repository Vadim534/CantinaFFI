import java.util.Locale;
import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Produs[] produse = {
                new Produs("Zeama de casa", 24.50, 10),
                new Produs("Piure cu parjoala", 46.00, 5),
                new Produs("Salata de varza", 18.00, 15),
                new Produs("Compot", 12.00, 8)
        };


        System.out.println("************ PRODUSE DISPONIBILE ************");
        for (Produs p : produse) {
            System.out.println(p);
        }
        System.out.println("*********************************************");

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nIntroduceți denumirea produsului dorit: ");
        String denumireCautata = scanner.nextLine();

        Produs produsGasit = null;
        for (Produs p : produse) {

            if (p.getDenumire().equalsIgnoreCase(denumireCautata.trim())) {
                produsGasit = p;
                break;
            }
        }

        if (produsGasit == null) {
            System.out.println("Eroare: Produsul \"" + denumireCautata + "\" nu există în meniu!");
        } else {
            System.out.print("Introduceți numărul de porții dorit: ");
            int portii = scanner.nextInt();


            if (produsGasit.esteDisponibil(portii)) {
                double costTotal = produsGasit.costPentru(portii);
                System.out.printf("Produs disponibil! Costul pentru %d porții de '%s' este: %.2f lei%n",
                        portii, produsGasit.getDenumire(), costTotal);
            } else {
                System.out.printf("Stoc insuficient! În stoc mai sunt doar %d porții de '%s'.%n",
                        produsGasit.getStoc(), produsGasit.getDenumire());
            }
        }

        scanner.close();
    }
}
