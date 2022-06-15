import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Almacen {

	
	static List<Garaje> listGarajeAll = new ArrayList<>();

	public Almacen() {
		// TODO Auto-generated constructor stub
	}
	
	abstract void setGaraje(Garaje n);
	/**
	 * 
	 * @return un Iterator de todos los garajes.
	 */
	public static Iterator<Garaje> listGarajeAll() {
		// TODO Auto-generated method stub
		Iterator<Garaje> it = listGarajeAll.iterator();
		return it;
	}

}
