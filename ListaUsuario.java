import java.util.ArrayList;
import java.util.Map;

public class ListaUsuario {
    public Map<String, ArrayList<String>> carrito;

    @SuppressWarnings("unchecked")
    ListaUsuario() {
        carrito = MapFactory.getInstance(3);// Este elemento está sujeto a cambios para realizar diversas pruebas
    }

    public void Añadir_Producto(String Categoria, String Producto) {
        if (Inventario.inventory.containsKey(Categoria)) {
            if (carrito.containsKey(Categoria)) {
                carrito.get(Categoria).add(Producto);
            } else {
                ArrayList<String> temp = new ArrayList<>();
                temp.add(Producto);
                carrito.put(Categoria, temp);
            }
        } else {
            System.out.println(
                    "Lo lamentamos, la categoría seleccionada no existe en el inventario. \nNo es posible completar la tarea");
        }

    }

    public void MostrarListado() {
        if (carrito != null) {
            for (Map.Entry<String, ArrayList<String>> e : carrito.entrySet()) {
                System.out.println(e.getKey() + "\t" + e.getValue());
            }
        } else {
            System.out.println("No hay nada en la colección");
        }

    }

    public void MostrarListado_Ordenado() {
        if (carrito != null) {
            for (Map.Entry<String, ArrayList<String>> e : carrito.entrySet()) {
                System.out.println(e.getKey());
                for (String producto : e.getValue()) {
                    System.out.println("\t" + producto);
                }
            }
        } else {
            System.out.println("No hay nada en la colección");
        }

    }
}
