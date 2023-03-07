import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PruebasGenerales {
    ListaUsuario lu;
    Inventario i;

    public PruebasGenerales() {
        lu = new ListaUsuario();
        i = new Inventario();
    }

    @Test
    public void añadir_Producto() {
        lu.Añadir_Producto("bebidas", "Té frios");
        lu.Añadir_Producto("bebidas", "coca cola");
        lu.Añadir_Producto("mueble de terraza", "Mesas de jardín");
        lu.Añadir_Producto("sillones de masaje", "Sofás camas");
        lu.Añadir_Producto("condimentos", "Sirope de regaliz");
        lu.Añadir_Producto("frutas", "Pasas");
        lu.Añadir_Producto("carnes", "Res");
        lu.Añadir_Producto("lácteos", "Leche entera");
    }

    @Test
    public void ProductCategory() {
        assertEquals("bebidas", i.ProductCategory("té frios"));
        assertEquals("mueble de terraza", i.ProductCategory("mesas de jardín"));
        assertEquals("sillones de masaje", i.ProductCategory("sofás camas"));
        assertEquals("condimentos", i.ProductCategory("sirope de regaliz"));
        assertEquals("frutas", i.ProductCategory("pasas"));
        assertEquals("carnes", i.ProductCategory("res"));
        assertEquals("lácteos", i.ProductCategory("leche entera"));
    }

    @Test
    public void MostrarI() {
        i.MostrarInventario();
    }

    @Test
    public void MostrarC() {
        lu.MostrarListado();
    }

}