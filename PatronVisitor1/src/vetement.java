
public class vetement implements Produits{

	String nom;
	int quantite;
	float poids;
	float prix;
	
	
	public vetement(String nom, int quantite, float poids, float prix) {
		super();
		this.nom = nom;
		this.quantite = quantite;
		this.poids = poids;
		this.prix = prix;
	}


	@Override
	public float accept(OperationProduitsVisitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}
	
	
}
