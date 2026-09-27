import java.util.Locale;
import java.util.Scanner;

public class B2 {

    public static void main(String[] args) {

             Locale.setDefault(Locale.US);

            double PretZeama = 24.5;
            double PretPirjoala = 46;
            double PretSalata = 18;
            double PretCompot = 12;

            System.out.println("************Meniul zilei************");
            System.out.printf("1. Zeama de casa      : %6.2f lei%n", PretZeama);
            System.out.printf("2. Piure cu parjoala  : %6.2f lei%n", PretPirjoala);
            System.out.printf("3. Salata de varza    : %6.2f lei%n", PretSalata);
            System.out.printf("4. Compot             : %6.2f lei%n", PretCompot);
            System.out.println("0. Finalizare comanda");
            System.out.println("************************************");

            Scanner scanner = new Scanner(System.in);

            double totalAcumulat = 0.0;

            System.out.print("Alegeti produsul dorit (1-4 sau 0 pt finalizare): ");
            int produsSelectat = scanner.nextInt();

            int PretZeamainc =0;
            int PretPirjoalainc =0;
            int PretSalatainc = 0;
            int PretCompotinc =0;

        while (produsSelectat != 0) {
                if (produsSelectat == 1) {
                    totalAcumulat += PretZeama;
                    PretZeamainc++;
                } else if (produsSelectat == 2) {
                    totalAcumulat += PretPirjoala;
                    PretPirjoalainc++;
                } else if (produsSelectat == 3) {
                    totalAcumulat += PretSalata;
                    PretSalatainc++;
                } else if (produsSelectat == 4) {
                    totalAcumulat += PretCompot;
                    PretCompotinc++;
                } else {
                    System.out.println("Ati introdus un produs inexistent, va rog sa alegeti iar!!!");
                }

                System.out.print("Alegeti produsul dorit (1-4 sau 0 pt finalizare): ");
                produsSelectat = scanner.nextInt();
            }


            double reducere = 0.0;
            if (totalAcumulat > 100.0) {
                reducere = totalAcumulat * 0.15;
            }

            double sumaDePlata = totalAcumulat - reducere;


            System.out.println("\n--- BON FISCAL ---");
        if (PretZeamainc > 0)
            System.out.printf("\nZeama de casa  " + " x " + PretZeamainc + " = " + PretZeama * PretZeamainc);
        if (PretPirjoalainc > 0)
            System.out.printf("\nPiure cu parjoala  " + " x " + PretPirjoalainc + " = " + PretPirjoala * PretPirjoalainc);
        if (PretSalatainc > 0)
            System.out.printf("\nSalata de varza  " + " x " + PretSalatainc + " = " + PretSalata * PretSalatainc);
        if (PretCompotinc > 0)
            System.out.printf("\nCompot   " + " x " + PretCompotinc + " = " + PretCompot * PretCompotinc);
            System.out.printf("\nTotal acumulat : %6.2f lei%n", totalAcumulat);
            System.out.printf("Reducere (15%%) : %6.2f lei%n", reducere);
            System.out.printf("Suma de plata  : %6.2f lei%n", sumaDePlata);

            scanner.close();
    }
}



