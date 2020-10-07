package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	public static ArrayList<Pais> paises = new ArrayList<>();
	public int nvehiculos;

	public Pais(String nombre) {
		this.nombre = nombre;
		paises.add(this);
	}
	
	public static Pais paisMasVendedor() {
		Pais max = null;
		int aux = 0;
		for(Pais p: paises) {
			if(p.nvehiculos > aux) {
				aux = p.nvehiculos;
				max = p;
			}
		}
		return max;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static ArrayList<Pais> getPaises() {
		return paises;
	}

	public static void setPaises(ArrayList<Pais> paises) {
		Pais.paises = paises;
	}
	
	

}
