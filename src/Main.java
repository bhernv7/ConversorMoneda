import java.net.URI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ConsultaMonedas consultaPares = new ConsultaMonedas();
        System.out.println("Escriba el monto a convertir");

        int montoBase = Integer.valueOf(reader.nextLine());
        Monedas monedas = consultaPares.conversionMonedas("USD","EUR", montoBase);
        System.out.println(monedas);

    }
}
