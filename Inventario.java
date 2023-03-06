import java.util.ArrayList;
import java.util.Map;

public class Inventario {
    public Map<String, ArrayList<String>> inventory;
    private ArrayList<String> lista;

    Inventario() {
        guardarInventario();
    }

    @SuppressWarnings("unchecked")
    private void guardarInventario() {
        inventory = MapFactory.getInstance(1);// Este elemento está sujeto a cambios para realizar
                                              // diversas pruebas
        lista = Read_File._readfile("ListadoProducto (2).txt//");
        lista.add("fin | fin");
        ArrayList<String> values = new ArrayList<>(); // Permite guardar los datos para el mapa
        for (String elemento : lista) {

            String[] temp = elemento.split("\\|"); // Divide categoría de valor

            if (!values.isEmpty()) {
                if (temp[0].trim().equals(values.get(0))) {
                    values.add(temp[1].trim());
                } else {
                    ArrayList<String> copy = new ArrayList<>();
                    copy.addAll(values);
                    addToMap(copy.get(0), copy);
                    values.clear();
                    values.add(temp[0].trim());
                    values.add(temp[1].trim());
                }
            } else {
                values.add(temp[0].trim());
                values.add(temp[1].trim());
            }
        }

    }

    private void addToMap(String category, ArrayList<String> products) {
        products.remove(0);
        inventory.put(category, products);
    }

    public void MostrarInventario() {
        for (String string : lista) {
            String[] inv = string.split("\\|");
            System.out.println(inv[0].trim() + "\t\t" + inv[1].trim());
        }
    }

    public void MostrarInventario_Ordenado() {
        for (Map.Entry<String, ArrayList<String>> e : inventory.entrySet())
            // Printing key-value pairs
            System.out.println(e.getKey() + " " + e.getValue());
    }
}
