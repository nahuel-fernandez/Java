package ordenados;

import java.util.Comparator;

import entidades.Producto;

public class OrdenProducto<P> implements Comparator<P>{

	@Override
	public int compare(P p1, P p2) {
		int ord = ((Producto)p1).getBanco().compareTo(((Producto)p2).getBanco());
		if (ord != 0) {
            return ord;
        }
        ord = ((Producto)p1).getSucursal().compareTo(((Producto)p2).getSucursal());
        if (ord != 0) {
            return ord;
        }
        return ((Producto)p1).getNumeroEntero().compareTo(((Producto)p2).getNumeroEntero());
	}

}
