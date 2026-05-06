import java.util.ArrayList;

public class test1 {
	
	public static void main(String[] args) {
		
		livre l=new livre("L'Etranger",5,11.95f);
		livre l1=new livre("Outliers",7,23.75f);
		
		vetement v=new vetement("chandail",12,2.5f,20f);
		vetement v1=new vetement("veste",39,5f,35f);
		
		veriftransportVisitor t=new veriftransportVisitor();
		
		ArrayList<Produits> listTransport=new ArrayList<Produits>();
		listTransport.add(l);
		listTransport.add(l1);
		listTransport.add(v);
		listTransport.add(v1);
		
		
		float limite=500f;
		float somme=0f;
		
		for (Produits p:listTransport) {
			somme=somme + p.accept(t);
		}
		
		if (somme<limite) {
			System.out.println("Le poids total est de "+String.valueOf(somme)+" kg. Vous etes libre de partir.");
		}else {
			System.out.println("Trop lourd, le poids total est de "+String.valueOf(somme)
			+" kg alors que la limite est de "+String.valueOf(limite)+" kg.");
		}
		
		
	}

}
