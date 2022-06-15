
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 	
			Iterator it;
			System.out.println("Menu RACE CONTROL");
			System.out.println("********************");
			Scanner sc = new Scanner(System.in);
			@SuppressWarnings("unused")
			int opc, opc1, opc2;
			do {

				System.out.println("1.- Garajes (Escuderias).");
				System.out.println("2.- Torneos.");
				System.out.println("3.- Carreras.");
				System.out.println("4.- Salir.");
				opc = sc.nextInt(); 
				switch (opc) 
				{
					case 1:
						sc.nextLine();
						System.out.println("1.- Introducir Garaje.");
						System.out.println("2.- Introducir Coche en Garaje");
						System.out.println("3.- Listar Garajes.");
						System.out.println("4.- Listar coches de un Garaje");
						opc = sc.nextInt();
				      		switch(opc) 
				      		{
				      			case 1:
				      				//Introducimos garaje.
				      				sc.nextLine();
				      				System.out.println("¿Introduce el nombre del garaje?");
				      				Garaje gar = new Garaje(sc.next());
				      				gar.setGaraje(gar); //damos de alta un garaje
				      			break;
				      			case 2:
				      				it = Almacen.listGarajeAll();
				      				sc.nextLine();
				      				System.out.println("¿En que garaje quieres Guardar coche?");
				      				String nombre=sc.next(); //buscamos garaje
				      				while(it.hasNext())
				      				{
				      					Garaje c = (Garaje) it.next();
				      					if(nombre.compareTo(c.getNombre())==0)
				      					{
				      						sc.nextLine();
				      						System.out.println("¿Introduce la Marca?");
				      						String marca=sc.next();
				      						sc.nextLine();
				      						System.out.println("¿Introduce el Modelo?");
				      						String modelo = sc.nextLine();
				      						Coche c1 = new Coche(marca,modelo);
				      						c.setCocheGaraje(c1); //introducimos el coche en garaje.
				      					}
				      				}
				      				it=null;
				      			break;
				      			case 3:
				      				it = Almacen.listGarajeAll();
				      				while(it.hasNext())
				      				{
				      					System.out.println(it.next());
				      				}
				      				it = null;
				      			break;
				      			case 4:
				      				sc.nextLine();
				      				it = Almacen.listGarajeAll();
				      				System.out.println("¿Introduce el nombre del garaje?");
				      				String nombreg = sc.next();
				      				while(it.hasNext()) {
				      					Garaje garencontrado = (Garaje)it.next();
				      					if(garencontrado.getNombre().compareTo(nombreg)==0)
										{
				      						System.out.println("garaje encontrado");
				      						Iterator<Coche> itc = garencontrado.listCoche();
				      						while(itc.hasNext())
				      						{
				      							System.out.println(itc.next().toString());
				      						}
				      						itc=null;
										}
				      				}
				      				it = null;
				      			break;
				      			
				      			default:
				      				
				      			break;
				      		}
				      break;
					case 2:
						sc.nextLine();
						System.out.println("1.- Alta Garajes Parcipantes (Escuderias).");
						System.out.println("2.- Añádir Carreras al Torneo.");
						System.out.println("3.- Listar Puntuaciones coches por carrera");
						System.out.println("4.- Listar ganador y participantes del torneo por puntos.");
						opc2 = sc.nextInt(); 
						System.out.println("¿Introduce el nombre del torneo?");
						String nombre = sc.next();
						Date nueva = new Date();
						Torneo nuevot = new Torneo(nombre,nueva);
						switch (opc2) 
						{
							case 1:
								sc.nextLine();
								System.out.println("1.- Introducir Garaje.");
								System.out.println("2.- Introducir Coche en Garaje");
								System.out.println("3.- Listar Garajes.");
								System.out.println("4.- Listar coches de un Garaje");
								opc2 = sc.nextInt();	
								switch(opc2) {
								case 1:
									System.out.println("¿Introduce el nombre del garaje a participar?");
									break;
								}
								break;
							default:
							break;
						}
					case 3:
						System.out.println("Entramos en carreras");
					//Carrera car = new Carrera();
						break;
					default:
						System.out.println("El programa ha finalizado.");
						System.exit(0);
						break;
				}
			} while(opc>=1 && opc<=4);
			sc.close();
		}
		catch(NumberFormatException e) {
			System.out.println("Solo introduce numeros");
		}
	}
}
