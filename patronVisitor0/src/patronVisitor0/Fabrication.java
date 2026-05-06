package patronVisitor0;

public interface Fabrication {
	
	void obtenirMateriaux(int qte,String matierepremiere);
	void construire();
	
	boolean expedierHomeDepot();
	boolean expedierRona();
	boolean expedierCanadianTire();
}
