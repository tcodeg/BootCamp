import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Torneo {
private String nombre;
private Date fecha;
List<Carrera> carreras = new ArrayList<>(); //Carreras que se van realizar


public Torneo(String nombre, Date fecha) {
	this.nombre = nombre;
	this.fecha = fecha;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public Date getFecha() {
	return fecha;
}

public void setFecha(Date fecha) {
	this.fecha = fecha;
}

public Iterator<Carrera> getCarreras() {
	Iterator<Carrera> it = carreras.iterator();
	return it;
}
/**
 * METODO DE AGREGAR CARRERAS AL TORNEO 
 * @param n
 */
public void setCarreras(Carrera n) {
	carreras.add(n);
}

	
}
