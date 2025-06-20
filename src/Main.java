import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        List<String> listMonedas = new ArrayList<>();

        String par1 = "";
        String par2 = "";
        boolean working = true;

        listMonedas.add("ARS");
        listMonedas.add("BOB");
        listMonedas.add("BRL");
        listMonedas.add("CLP");
        listMonedas.add("COP");
        listMonedas.add("USD");

        while(working == true) {
            System.out.println("***************************");
            System.out.println("""
                    Bienvenido al conversor de monedas.
                    Elija la conversion que desea ejecutar:
                    
                    1.Dolar [USD] a Peso Argentino [ARS]
                    2.Peso Argentino [ARS] a Dolar [USD]
                    3.Dolar [USD] a Real Brasileño [BRL]
                    4.Real Brasileño [BRL] a Dolar [USD]
                    5.Dolar [USD] a Peso Colombiano [COP]
                    6.Peso Colombiano [COP] a Dolar [USD]
                    7.Salir
                    """);
            System.out.println("***************************");
            int opcion = reader.nextInt();

            switch (opcion){
                case 1 -> {
                    par1 = listMonedas.get(5);
                    par2 = listMonedas.get(0);
                }
                case 2 -> {
                    par1 = listMonedas.get(0);
                    par2 = listMonedas.get(5);
                }
                case 3 -> {
                    System.out.println("Opcion: "+opcion);
                    par1 = listMonedas.get(5);
                    par2 = listMonedas.get(2);
                }
                case 4 -> {
                    System.out.println("Opcion: "+opcion);
                    par1 = listMonedas.get(2);
                    par2 = listMonedas.get(5);
                }
                case 5 -> {
                    System.out.println("Opcion: "+opcion);
                    par1 = listMonedas.get(5);
                    par2 = listMonedas.get(4);
                }
                case 6 -> {
                    System.out.println("Opcion: "+opcion);
                    par1 = listMonedas.get(3);
                    par2 = listMonedas.get(5);
                }
                case 7 -> {
                    System.out.println("Opcion: "+opcion);
                    working = false;

                }
                default -> {
                    System.out.println("Opcion invalida");
                }
            }
            if (opcion>0 && opcion<7) {
                System.out.println("Conversion de " + par1 +" a " + par2);
                ConsultaMonedas conversion = new ConsultaMonedas();
                System.out.println("Escriba el monto a convertir");

                int montoBase = reader.nextInt();
                Monedas monedas = conversion.conversionMonedas(par1, par2, montoBase);
                System.out.println(montoBase + " " + par1 +" equivalen a " + monedas.conversion_result() +
                        " " + par2);
            }
            System.out.println("Saliendo de Convertidor");
        }


    }
}
