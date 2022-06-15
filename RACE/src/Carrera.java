import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Tomás
 *
 */

public abstract class Carrera 
{
private String nombre;
Coche[][] podio = new Coche[3][3];
private float distanciaFinal;
List<Garaje> garajesParcipantes = new ArrayList<>();
List<Coche> cochesParticipantes = new ArrayList<>();

/*rando para eligir coche , y un coche de cada garaje*/

public Carrera(String nombre, float distanciaFinal) {
	this.nombre = nombre;
	this.setDistanciaFinal(12);
}

protected abstract float getDuracion();


/**
 * 
 * @return ITERATOR DE GARAJES PARTICPANTES.
 */
public Iterator<Garaje> getListaGarajes(){
	return getGarajesParcipantes().iterator();
}
/**
 * Método para introducir  
 * Garajes participantes a la lista
 * garajesParticipantes
 * @param Gar
 */
public void setGarajeParcipante(Garaje Gar) {
	garajesParcipantes.add(Gar);
}

/**
 * @return List<Coche> -> Lista de coches participantes
 */

public Iterator<Coche> getListaCoches() {
	return getCochesParticipantes().iterator();
}

/**
 * Metodo para añadir coches participantes 
 * a la lista cochesParticipantes.
 * @param par
 */
public void setCocheParcipante(Coche par) {
	cochesParticipantes.add(par);
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}


public float getDistanciaFinal() {
	return distanciaFinal;
}


public void setDistanciaFinal(float distanciaFinal) {
	this.distanciaFinal = distanciaFinal;
}


public Coche[][] getPodio() {
	return podio;
}


public void setPodio(Coche[][] podio) {
	this.podio = podio;
}

/*
 * @return lista de garajes participantes.
 */
public List<Garaje> getGarajesParcipantes() {
	return garajesParcipantes;
}

/*
 * @return lista de coches particpantes.
 */
public List<Coche> getCochesParticipantes() {
	return cochesParticipantes;
}
/*
 * @param Coche P, añadimos coches particpante.
 */
public void setCochesParticipantes(Coche p) {
	cochesParticipantes.add(p);
}
/*
 * @param Garaje p, añadimos garaje participantes.
 */
public void setGarajeParticipantes(Garaje p) {
	garajesParcipantes.add(p);
}


}
