import java.util.ArrayList;

public class test0new {

	public static void main(String[] args) {
		
		table t=new table();
		chaise c=new chaise();
		bureau b=new bureau();
		
		expeditionHomeDepot exp_hd=new expeditionHomeDepot();
		expeditionRona exp_r=new expeditionRona();
		expeditionCanadianTire exp_ct=new expeditionCanadianTire();
		
		
		ArrayList<Fabrication> listHomeDepot=new ArrayList<Fabrication>();
		listHomeDepot.add(t);
		listHomeDepot.add(c);
		listHomeDepot.add(b);
		
		System.out.println("obtention des materiaux");
		System.out.println("--------------------------------------------------");
		
		t.obtenirMateriaux(40, "planches de bois");
		c.obtenirMateriaux(23, "planches de bois");
		b.obtenirMateriaux(279, "planches de bois");
		
		System.out.println("--------------------------------------------------");
		
		for (Fabrication f:listHomeDepot) {
			f.construire();
			f.accept(exp_hd);
			System.out.println("--------------------------------------------------");

		}
		
		
		
	}
}
