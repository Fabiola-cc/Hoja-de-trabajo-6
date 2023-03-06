public class Main {
    public static void main(String[] args) {
        Inventario i = new Inventario();
        System.out.println("\nNormal");
        i.MostrarInventario();
        System.out.println("\nOrdenado");
        i.MostrarInventario_Ordenado();
        System.out.println("");
    }
}
