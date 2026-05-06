package patronVisitor0;

public class table implements Fabrication{

	@Override
	public void obtenirMateriaux(int qte, String matierepremiere) {
		// TODO Auto-generated method stub
		System.out.println(String.valueOf(qte)+" "+
		matierepremiere+" ont ete obtenu pour la fabrication de la table");
	}

	@Override
	public void construire() {
		// TODO Auto-generated method stub
		System.out.println("Table en construction");
	}

	@Override
	public boolean expedierHomeDepot() {
		// TODO Auto-generated method stub
		System.out.println("Table:En expedition vers HomeDepot");
		return true;
	}

	@Override
	public boolean expedierRona() {
		// TODO Auto-generated method stub
		System.out.println("Table:En expedition vers Rona");
		return true;
	}

	@Override
	public boolean expedierCanadianTire() {
		// TODO Auto-generated method stub
		System.out.println("Table:En expedition vers Canadian Tire");
		return true;
	}

}
