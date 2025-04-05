package COMIDASRAPIDAS;


import java.util.Scanner;
class Menu {
    public static void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n🌭 Menú de Comidas Rápidas 🍔");
            System.out.println("1. Hotdog");
            System.out.println("2. Burger");
            System.out.println("3. Chorizo");
            System.out.println("4. French Fries");
            System.out.println("5. Ver pedidos guardados");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            while (!sc.hasNextInt()) {
                System.out.print("Entrada inválida. Intente de nuevo: ");
                sc.next();
            }

            opcion = sc.nextInt();
            Metodos.procesarOpcion(opcion, sc);

        } while (opcion != 0);
    }
}
