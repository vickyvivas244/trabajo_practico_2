package ar.edu.unju.fi.ejercicio7.Main;

import ar.edu.unju.fi.ejercicio5.Model.Producto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = Producto.precargarProductos();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Menú de opciones:");
            System.out.println("1 – Mostrar productos disponibles");
            System.out.println("2 – Mostrar productos faltantes");
            System.out.println("3 – Incrementar los precios de los productos en un 20%");
            System.out.println("4 – Mostrar productos de categoría Electrohogar disponibles para la venta");
            System.out.println("5 – Ordenar productos por precio de forma descendente");
            System.out.println("6 – Mostrar productos con nombres en mayúsculas");
            System.out.println("7 – Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarProductosDisponibles(productos);
                    break;
                case 2:
                    mostrarProductosFaltantes(productos);
                    break;
                case 3:
                    incrementarPrecios(productos);
                    break;
                case 4:
                    mostrarElectrohogarDisponibles(productos);
                    break;
                case 5:
                    ordenarPorPrecioDescendente(productos);
                    break;
                case 6:
                    mostrarNombresEnMayusculas(productos);
                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }
        scanner.close();
    }

    private static void mostrarProductosDisponibles(List<Producto> productos) {
        Consumer<Producto> mostrarProducto = p -> {
            if (p.isEstado()) {
                p.MostrarDatos();
            }
        };
        productos.forEach(mostrarProducto);
    }

    private static void mostrarProductosFaltantes(List<Producto> productos) {
        Predicate<Producto> productoFaltante = p -> !p.isEstado();
        List<Producto> productosFaltantes = productos.stream().filter(productoFaltante).collect(Collectors.toList());
        productosFaltantes.forEach(Producto::MostrarDatos);
    }

    private static void incrementarPrecios(List<Producto> productos) {
        Function<Producto, Producto> incrementarPrecio = p -> {
            p.setPrecio(p.getPrecio() * 1.20);
            return p;
        };
        List<Producto> productosIncrementados = productos.stream().map(incrementarPrecio).collect(Collectors.toList());
        productosIncrementados.forEach(Producto::MostrarDatos);
    }

    private static void mostrarElectrohogarDisponibles(List<Producto> productos) {
       
        Predicate<Producto> esElectrohogarDisponible = p -> p.getNombre().toLowerCase().contains("electro") && p.isEstado();
        List<Producto> electrohogarDisponibles = productos.stream().filter(esElectrohogarDisponible).collect(Collectors.toList());
        electrohogarDisponibles.forEach(Producto::MostrarDatos);
    }

    private static void ordenarPorPrecioDescendente(List<Producto> productos) {
        productos.sort(Comparator.comparing(Producto::getPrecio).reversed());
        productos.forEach(Producto::MostrarDatos);
    }

    private static void mostrarNombresEnMayusculas(List<Producto> productos) {
        Function<Producto, Producto> convertirNombreMayusculas = p -> {
            p.setNombre(p.getNombre().toUpperCase());
            return p;
        };
        List<Producto> productosConNombresMayusculas = productos.stream().map(convertirNombreMayusculas).collect(Collectors.toList());
        productosConNombresMayusculas.forEach(Producto::MostrarDatos);
    }
}
