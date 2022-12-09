package consoCarbone;

public class alimentation extends ConsoCarbone{
	private double txBoeuf;
	private double txVege;
	private double impact;
	public static double a = 8;
	public static double b = 1.6;
	public static double c = 0.9;
	
	public alimentation (double txBoeuf,double txvege) {
		if (txBoeuf >= 0 && txBoeuf <= 1) { 
			this.txBoeuf = txBoeuf;	
		}
		else{
			System.out.println("la valeure en paramètre n'est pas valide");
		}
		this.txVege = txVege;
		this.impact = a*txBoeuf+b*(1-txVege-txBoeuf)+c*txVege;
	}

	public double gettxBoeuf () {
		return txBoeuf;
	}

	public double gettxVege () {
		return txVege;
	}

	public double getimpact () {
		return impact;
	}

	public void settxBoeuf (double txBoeuf){
		if (txBoeuf < 0 || txBoeuf > 1){ 
			System.out.println("Erreur la valeure en paramètre n'est pas valide");
			return;
		}
		this.txBoeuf = txBoeuf;
	}

	public void settxVege (double txVege){
		this.txVege = txVege;
	}

	public void setimpact (double impact){
		this.impact = impact;
	}
	
	public static String empreinteCarbone (){
		return "Le français moyen consomme \nViandes et poissons : 1144 kilogrammes de CO2 par an \nProduits laitiers et oeufs : 408 kilogrammes de CO2 par an \nAutres : 538 kilogrammes CO2 par an \nBoissons : 263 kilogrammes CO2 par an"; 
	}
	
	@Override
	public String toString(){
		return ("Le taux de repas à base de boeuf de cette personne est :"+ this.txBoeuf +" \nLe taux de repas végétarien de cette personne est :"+ this.txVege +"\nL'impact de l'alimentation de cette personne est "+ this.impact);
	}

	public static void main(String args[]){
		alimentation test = new alimentation(2,3);
		System.out.println(test.gettxBoeuf());
		System.out.println(test.gettxVege());
		System.out.println(test.getimpact());
		test.settxBoeuf(4);
		test.settxVege(5);
		test.setimpact(6);
		System.out.println(test.gettxBoeuf());
		System.out.println(test.gettxVege());
		System.out.println(test.getimpact());
		System.out.println(empreinteCarbone());
		System.out.println(test.toString());
	}
}







