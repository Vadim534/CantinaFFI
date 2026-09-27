import java.util.Locale;
import java.util.Scanner;

public class A2 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți nota (0-10): ");
        int nota = scanner.nextInt();

        if(nota<0 || nota >10) System.out.println("Nota Invalida");
        else {
            if (nota <5){
                System.out.println("Nesatisfacator");
            } else if (nota == 5 || nota == 6) {
                System.out.println("Satisfacator");
            } else if (nota == 7 || nota == 8) {
                System.out.println("Bine");
            }
            else if (nota >8) System.out.printf("Excelent");
        }
    }
}
