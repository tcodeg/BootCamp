import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Garaje extends Almacen{
private String nombre;
private List<Coche> listcocheGaraje = new ArrayList<>();

public Garaje(String nombre) {
	this.nombre = nombre;
}


public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

/**
 * 
 * @return un Iterator de lista de coches de cada garaje.
 */
public Iterator<Coche> listCoche() {
	Iterator<Coche> it =listcocheGaraje.iterator(); 
	return it;
}



public void setCocheGaraje(Coche coc)
{
	listcocheGaraje.add(coc);
}

public void removeCocheGaraje(Coche coc)
{
	listcocheGaraje.remove(coc);
}



@Override
public String toString() {
	return "Garaje [ nombre=" + nombre + "]";
}


@Override
public void setGaraje(Garaje n) {
		listGarajeAll.add(n);
}



}
