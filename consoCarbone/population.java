//package consoCarbone2;
import java.util.ArrayList;


public class population{
	private ArrayList<Utilisateur> utilisateurs;
	
	public population () {
		utilisateurs = new ArrayList<Utilisateur>();
	}
	
	public void incitVege () {
		double b;
		for (Utilisateur a : this.utilisateurs) {
			b = a.alimentation.gettxBoeuf();
			a.alimentation.settxBoeuf(b/2);
			b = a.alimentation.gettxVege();
			a.alimentation.settxVege(b*2);
		}
	}
	
	public void incitTransport () {
		double b;
		for (Utilisateur a : this.utilisateurs) {
			b = a.transport.getkilomAnnee();
			a.transport.setkilomAnnee((int) (b/4));
		}
	}
	
	/*public static main () {
		alimentation test1 = new alimentation(0.5,0.5);
		Taille P = Taille.P;
		BienConso test2 = new BienConso(P);
		CE A = CE.A;
		logement test3 = new logement(A,10);
		Transport test4 = new Transport(true,Taille.P,10,10);
		ServicesPublics test5 = getInstance(10);
		Utilisateur a = new Utilisateur(test1, test2, test3, test4, test5);
		alimentation test7 = new alimentation(0.2,0.8);
		Transport test6 = new Transport(true,Taille.P,8,10);
		Utilisateur b = new Utilisateur(test7, test2, test3, test6, test5);
		population p = population();
		p.utilisateurs.add(a);
		p.utilisateurs.add(b);
		System.out.println(a.alimentation.gettxBoeuf());
		System.out.println(a.alimentation.gettxVege());
		System.out.println(a.transport.getkilomAnnee());
		System.out.println(b.alimentation.gettxBoeuf());
		System.out.println(b.alimentation.gettxVege());
		System.out.println(b.transport.getkilomAnnee());
		p.incitVege();
		p.incitTransport();
		System.out.println(a.alimentation.gettxBoeuf());
		System.out.println(a.alimentation.gettxVege());
		System.out.println(a.transport.getkilomAnnee());
		System.out.println(b.alimentation.gettxBoeuf());
		System.out.println(b.alimentation.gettxVege());
		System.out.println(b.transport.getkilomAnnee());
		
	}*/
	
}