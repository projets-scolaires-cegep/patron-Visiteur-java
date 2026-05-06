
public class livre implements Produits{

	String nom;
	float poids;
	float prix;
	
	public livre(String nom, float poids, float prix) {
		super();
		this.nom = nom;
		this.poids = poids;
		this.prix = prix;
	}
	

	@Override
	public float accept(OperationProduitsVisitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}
	
	
	
}
