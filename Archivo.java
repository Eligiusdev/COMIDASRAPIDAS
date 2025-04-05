package COMIDASRAPIDAS;

import java.util.*;
import java.io.*;
class Archivo {
    public static void guardarPedido(Producto p) {
        try (PrintWriter pw = new PrintWriter(new FileWriter("pedidos.txt", true))) {
            pw.println(p.toString());
        } catch (IOException e) {
            System.out.println("Error al guardar el pedido: " + e.getMessage());
        }
    }

    public static void leerPedidos() {
        System.out.println("\n📂 Pedidos Guardados:");
        Map<String, Integer> contador = new HashMap<>();
        Map<String, Double> precios = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("pedidos.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println("- " + linea);
                contador.put(linea, contador.getOrDefault(linea, 0) + 1);
                double precio = extraerPrecio(linea);
                precios.put(linea, precios.getOrDefault(linea, 0.0) + precio);
            }
            System.out.println("\n📊 Resumen de pedidos:");
            for (String item : contador.keySet()) {
                System.out.println("» " + item + " x" + contador.get(item) + " | Total = $" + precios.get(item));
            }
        } catch (FileNotFoundException e) {
            System.out.println("No hay pedidos guardados todavía.");
        } catch (IOException e) {
            System.out.println("Error al leer los pedidos: " + e.getMessage());
        }
    }

    private static double extraerPrecio(String linea) {
        try {
            int index = linea.lastIndexOf("$");
            if (index != -1) {
                return Double.parseDouble(linea.substring(index + 1));
            }
        } catch (Exception e) {
            return 0.0;
        }
        return 0.0;
    }
}