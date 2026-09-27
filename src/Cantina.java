import java.util.Locale;
import java.util.Scanner;

public class Cantina {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);   // import java.util.Locale;

        double PretZeama = 24.5;
        double PretPirjoala = 46;
        double PretSalata = 18;
        double PretCompot = 12;

        System.out.println("************Meniul zilei************");
        System.out.printf("1. Zeama de casa      : %6.2f lei%n", PretZeama);
        System.out.printf("2. Piure cu parjoala  : %6.2f lei%n", PretPirjoala);
        System.out.printf("3. Salata de varza    : %6.2f lei%n", PretSalata);
        System.out.printf("4. Compot             : %6.2f lei%n", PretCompot);
        System.out.println("************************************");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Alegeti produsul dorit: ");
        int produsSelectat = scanner.nextInt();

        while  (produsSelectat <1 || produsSelectat>4) {
            System.out.println("Ati introdus un produs inexistent , va rog sa alegeti iar !!! ");
            System.out.print("Alegeti produsul dorit: ");
            produsSelectat = scanner.nextInt();
        }


        System.out.print("Introduceti numarul de portii: ");
        int portii = scanner.nextInt();

        double costTotal = 0;

        if (produsSelectat==1) costTotal=portii*PretZeama;
        if (produsSelectat==2) costTotal=portii*PretPirjoala;
        if (produsSelectat==3) costTotal=portii*PretSalata;
        if (produsSelectat==4) costTotal=portii*PretCompot;

        System.out.println("Spre achitare : " + costTotal);
        scanner.close();
    }


}
