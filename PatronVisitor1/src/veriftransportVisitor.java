
public class veriftransportVisitor implements OperationProduitsVisitor{

	@Override
	public float visit(livre livre) {
		// TODO Auto-generated method stub
		return livre.poids;
	}

	@Override
	public float visit(vetement vetement) {
		// TODO Auto-generated method stub
		return (vetement.quantite*vetement.poids);
	}

}
