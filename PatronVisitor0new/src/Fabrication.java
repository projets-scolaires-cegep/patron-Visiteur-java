

public interface Fabrication {
	
	void obtenirMateriaux(int qte,String matierepremiere);
	void construire();
	
	boolean accept(FabricationVisitor visitor);
	
}
