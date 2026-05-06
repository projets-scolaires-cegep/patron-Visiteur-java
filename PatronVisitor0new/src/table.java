
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
	public boolean accept(FabricationVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
		return true;
	}

}
