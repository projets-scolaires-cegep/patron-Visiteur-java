
public class bureau implements Fabrication{

	@Override
	public void obtenirMateriaux(int qte, String matierepremiere) {
		// TODO Auto-generated method stub
		System.out.println(String.valueOf(qte)+" "+
		matierepremiere+" ont ete obtenu pour la fabrication du bureau");
		
	}

	@Override
	public void construire() {
		// TODO Auto-generated method stub
		System.out.println("Bureau en construction");
		
	}

	@Override
	public boolean accept(FabricationVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
		return true;
	}

}
