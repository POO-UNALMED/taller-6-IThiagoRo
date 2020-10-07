package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	public static ArrayList<Pais> paises = new ArrayList<>();
	public int nfabricantes;

	public Pais(String nombre) {
		this.nombre = nombre;
		paises.add(this);
	}
	
	public static Pais paisMasVendedor() {
		int max = 0;
		int aux = 0;
		for(int i = 0; i < paises.size(); i++) {
			if(paises.get(i).nfabricantes > aux) {
				aux = paises.get(i).nfabricantes;
				max = i;
			}
		}
		
		return paises.get(max);
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
