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

        System.out.print("Sunteti student bursier? \n | 1 - Da | 0 - Nu | ");
        int raspunsBursier = scanner.nextInt();

        while (raspunsBursier != 0 && raspunsBursier != 1) {
            System.out.println("Ceva nu a mers bine , introduceti iar !!!");
            System.out.print("Sunteti student bursier? \n | 1 - Da | 0 - Nu | ");
            raspunsBursier = scanner.nextInt();
        }
        boolean esteBursier = (raspunsBursier == 1);

        double pretUnitar = 0;
        if (produsSelectat==1) pretUnitar = PretZeama;
        if (produsSelectat==2) pretUnitar = PretPirjoala;
        if (produsSelectat==3) pretUnitar = PretSalata;
        if (produsSelectat==4) pretUnitar = PretCompot;

        double subtotal = portii * pretUnitar;
        double reducere = esteBursier ? subtotal * 0.15 : 0.0;
        double bazaImpozabila = subtotal - reducere;
        double tva = bazaImpozabila * 0.20;
        double total = bazaImpozabila + tva;

        System.out.println("\n--- BON FISCAL ---");
        System.out.printf("Subtotal: %.2f lei%n", subtotal);
        System.out.printf("Reducere: %.2f lei%n", reducere);
        System.out.printf("TVA: %.2f lei%n", tva);
        System.out.printf("Total: %.2f lei%n", total);



        System.out.println("Cat oferiti spre achitare ?");
        int plataClient = scanner.nextInt();
        int rest = (int)total % 1;
        //Sarcina C1
        //bancnote cu valorile nominale de 500, 200, 100, 50, 20, 10, 5 și 1 lei
        int b500 = 0, b200=0, b100=0, b50=0, b20=0, b10=0, b5=0, b1=0;
        int rb500 = 0, rb200= 0, rb100=0, rb50= 0, rb20= 0, rb10= 0, rb5= 0, rb1= 0;
        if (total<=plataClient){
            plataClient=plataClient-rest;


            b500 = plataClient / 500 ;
            rb500 = plataClient % 500;


            b200 = rb500 / 200;
            rb200 = rb500 % 200;

            b100 = rb200 / 100;
            rb100 = rb200 % 100;

            b50 = rb100 / 50;
            rb50 = rb100 % 50;

            b20 = rb50 / 20;
            rb20 = rb50 % 20;

            b10 = rb20 / 10;
            rb10 = rb20 % 10;

            b5 = rb10 / 5;
            rb5 = rb10 % 5;

            b1 = rb5 / 1;
            rb1 = rb5 % 1;
        }
        else System.out.println("Insuficient spre plata");

        System.out.println("Rest : \n"+
                "Bancnote de 500: "+ b500 + "\n" +
                "Bancnote de 200: " + b200 +"\n" +
                "Bancnote de 100: " + b100 +"\n" +
                "Bancnote de 50: " + b50 +"\n" +
                "Bancnote de 20: " + b20 +"\n" +
                "Bancnote de 10: " + b10 +"\n" +
                "Bancnote de 5: " + b5 +"\n" +
                "Bancnote de 1: " + b1 );



        scanner.close();
    }


}
