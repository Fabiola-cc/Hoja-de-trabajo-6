import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    static Inventario inventario;
    static ListaUsuario lu;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        inventario = new Inventario();
        lu = new ListaUsuario();

        System.out.println("Bienvenid@");
        Boolean continuar = true;
        do {
            menúPrincipal();
            int resp = solicitarI("\n\n¿Deseas realizar algo más?\n1. Sí\t2. No");
            if (resp == 2) {
                continuar = false;
            }
        } while (continuar);
    }

    public static void menúPrincipal() {
        System.out.println("\n¿Qué desea realizar?");
        System.out.println(
                "1.Añadir producto a listado\n2.Mostrar la categoría de un producto\n3.Mostrar colección\n4.Mostrar colección ordenada por tipo\n5.Mostrar inventario\n6.Mostrar inventario ordenada por tipo\n");
        int accion = solicitarI("");
        switch (accion) {
            case 1: // Añadir producto a listado
                System.out.println("¿Qué producto desea añadir?");
                String producto = sc.nextLine().toLowerCase();
                System.out.println("¿Cuál es la categoría de este?");
                String categoria = sc.nextLine().toLowerCase();
                lu.Añadir_Producto(categoria, producto);
                break;
            case 2: // Mostrar la categoría de un producto
                System.out.println("¿Qué producto deseas buscar?");
                String prod = sc.nextLine().toLowerCase();
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

    /**
     * Imprime una solicitud y recibe un dato tipo int
     * Evita una excepción -InputMismatchException- volviendo a solicitar el dato en
     * caso de que ocurra. (Utilizada continuamente en distintos programas)
     *
     * @Author Fabiola Contreras
     * @param solicitud texto que describe lo solicitado
     * @return entero ingresado por el usuario
     */
    public static int solicitarI(String solicitud) {
        System.out.println(solicitud);
        int solicitar = 0;
        Boolean correcto = false;
        do {
            try {
                solicitar = sc.nextInt();
                correcto = true;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("¡Cuidado! Ingresa un número entero.");
            }
        } while (correcto == false);
        sc.nextLine(); // Elimina la posibilidad de saltarse una linea de solicitud después
        return solicitar;
    }
}
