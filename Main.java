import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bienvenid@");
        Boolean continuar = true;
        do {
            menúPrincipal();
            System.out.println("\n\n¿Deseas realizar algo más?\n1. Sí\t2. No");
            int resp = sc.nextInt();
            sc.nextLine();
            if (resp == 2) {
                continuar = false;
            }
        } while (continuar);
    }

    public static void menúPrincipal() {
        Inventario inventario = new Inventario();
        ListaUsuario lu = new ListaUsuario();

        System.out.println("\n¿Qué desea realizar?");
        System.out.println(
                "1.Añadir producto a listado\n2.Mostrar la categoría de un producto\n3.Mostrar colección\n4.Mostrar colección ordenada por tipo\n5.Mostrar inventario\n6.Mostrar inventario ordenada por tipo\n");
        int accion = sc.nextInt();
        sc.nextLine();
        switch (accion) {
            case 1: // Añadir producto a listado
                System.out.println("¿Qué producto desea añadir?");
                String categoria = sc.nextLine();
                System.out.println("¿Cuál es la categoría de este?");
                String producto = sc.nextLine();
                lu.Añadir_Producto(categoria.toLowerCase(), producto.toLowerCase());
                break;
            case 2: // Mostrar la categoría de un producto
                System.out.println("¿Qué producto deseas buscar?");
                String prod = sc.nextLine();
                inventario.ProductCategory(prod);
                break;
            case 3: // Mostrar colección
                lu.MostrarListado();
                break;
            case 4: // Mostrar colección ordenada por tipo
                lu.MostrarListado_Ordenado();
                break;
            case 5: // Mostrar inventario
                inventario.MostrarInventario();
                break;
            case 6: // Mostrar inventario ordenada por tipo
                inventario.MostrarInventario_Ordenado();
                break;
        }
    }
}
