package patronVisitor0;

public class test0 {
	
	public static void main(String[] args) {
		
			table t=new table();
			t.obtenirMateriaux(20, "planches de bois");
			t.construire();
			t.expedierHomeDepot();
			
			System.out.println("--------------------------------------------------");
				
			chaise c=new chaise();
			c.obtenirMateriaux(10, "planches de bois");
			c.construire();
			t.expedierRona();
			
	
	}
}
