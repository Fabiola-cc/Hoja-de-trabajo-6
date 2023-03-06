import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PruebasGenerales {
    ListaUsuario lu = new ListaUsuario();
    Inventario i = new Inventario();

    @Test
    void añadir_Producto() {
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
    void ProductCategory() {
        assertEquals(i.ProductCategory("té frios"), "bebidas");
        assertEquals(i.ProductCategory("mesas de jardín"), "mueble de terraza");
        assertEquals(i.ProductCategory("sofás camas"), "sillones de masaje");
        assertEquals(i.ProductCategory("sirope de regaliz"), "condimentos");
        assertEquals(i.ProductCategory("pasas"), "frutas");
        assertEquals(i.ProductCategory("res"), "carnes");
        assertEquals(i.ProductCategory("leche entera"), "lácteos");
    }

}