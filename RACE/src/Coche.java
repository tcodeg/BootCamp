import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Coche {
	private int idCoche = 0;
	private String marca;
	private String modelo;
	private double velocidad;
	public static final double VELOCIDADMAX = 240;
	private double distanciaAcu;
	
	public Coche(String marca, String modelo) {
		this.setVelocidad(0);;
		this.setIdCoche(this.getIdCoche()+1);
		this.marca = marca;
		this.modelo = modelo;
	}

	/**
	 * @return the idCoche
	 */
	public int getIdCoche() {
		return idCoche;
	}

	/**
	 * @param idCoche the idCoche to set
	 */
	public void setIdCoche(int idCoche) {
		this.idCoche = idCoche;
	}

	public double getVelocidadmax() {
		return VELOCIDADMAX;
	}


	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public void setVelocimetro() { //hasta recorrido final en carrera.
		Random ale = new Random();
		Timer seg = new Timer();
		TimerTask correr = new TimerTask() {
			public void run() {
				do {
					int n = 1 + ale.nextInt(2); //generamos número aleatorio 1 || 2
					if(n==1) //si sale 1 aceleramos
					{
						setVelocidad(setAceleracion()); //aceleramos el coche
						setDistanciaAcu(getDistanciaAcu()+10);
					}
					else //si sale 2 frenamos
					{
						setVelocidad(setFrenado()); //frenamos el coche
				        setDistanciaAcu(getVelocidad());
					}
				}while(getVelocidad()<0 && getVelocidad()>VELOCIDADMAX);
				if(getDistanciaAcu()==100) // equiparar a distancia final para parar tarea.
				{
				   seg.cancel();
				}
			}
		};
		seg.schedule(correr, 0, 1000);
	}

	public double setAceleracion() {
		return this.velocidad = getVelocidad() + 10;
	}
	
	public double setFrenado() {
	   return this.velocidad = getVelocidad() -10;
	}
	
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public double getDistanciaAcu() {
		return distanciaAcu;
	}

	public void setDistanciaAcu(double distanciaAcu) {
		this.distanciaAcu = distanciaAcu;
	}

	@Override
	public String toString() {
		return "Coche [idCoche=" + idCoche + ", marca=" + marca + ", modelo=" + modelo
				+ ", velocidad=" + velocidad + ", distanciaAcu=" + distanciaAcu + "]";
	}

	
}
