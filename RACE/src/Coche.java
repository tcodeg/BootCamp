
public class Coche {
	private int idCoche;
	private String Marca;
	private String Modelo;
	
	public Coche(int idCoche, String marca, String modelo) {

		this.idCoche = idCoche;
		this.Marca = marca;
		this.Modelo = modelo;
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

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return Marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		Marca = marca;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return Modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	
	
	
}
