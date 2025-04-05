package COMIDASRAPIDAS;

import COMIDASRAPIDAS.Productos.*;
import java.util.*;

class Metodos {
    public static boolean leerBooleano(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String input = sc.next().toLowerCase();
            if (input.equals("true") || input.equals("false")) {
                return Boolean.parseBoolean(input);
            } else {
                System.out.println("⚠ Entrada inválida. Escriba 'true' o 'false'.");
            }
        }
    }

    public static void procesarOpcion(int opcion, Scanner sc) {
        switch (opcion) {
            case 1:
                boolean toc = leerBooleano(sc, "¿Desea hotdog con tocineta? (true/false): ");
                boolean ques = leerBooleano(sc, "¿Desea queso adicional? (true/false): ");
                Hotdog h = new Hotdog(toc, ques);
                System.out.println("Pedido: " + h);
                Archivo.guardarPedido(h);
                break;
            case 2:
                System.out.print("Seleccione tipo de carne (1=Sencilla, 2=Doble, 3=Triple): ");
                int tipo;
                while (!sc.hasNextInt() || (tipo = sc.nextInt()) < 1 || tipo > 3) {
                    System.out.print("⚠ Opción inválida. Intente de nuevo: ");
                    sc.nextLine();
                }
                Burger b = new Burger(tipo);
                System.out.println("Pedido: " + b);
                Archivo.guardarPedido(b);
                break;
            case 3:
                boolean ens = leerBooleano(sc, "¿Desea ensalada? (true/false): ");
                Chorizo c = new Chorizo(ens);
                System.out.println("Pedido: " + c);
                Archivo.guardarPedido(c);
                break;
            case 4:
                sc.nextLine(); // limpiar buffer
                System.out.print("¿Cómo desea las papas? (Crujientes Doradas / Bien Fritas): ");
                String estilo = sc.nextLine();
                FrenchFries f = new FrenchFries(estilo);
                System.out.println("Pedido: " + f);
                Archivo.guardarPedido(f);
                break;
            case 5:
                Archivo.leerPedidos();
                break;
            case 0:
                System.out.println("Gracias por visitarnos. ¡Hasta pronto!");
                break;
            default:
                System.out.println("Opción inválida. Intente de nuevo.");
        }
    }
}