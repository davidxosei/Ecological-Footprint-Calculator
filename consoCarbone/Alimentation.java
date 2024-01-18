package consoCarbone;


 /** Cette classe représente l'empreinte carbonne de l'alimentation d'un utilisateur
 * Elle hérite de la classe consoCarbone
 */
public class Alimentation extends ConsoCarbone{
	private double txBoeuf;
	private double txVege;
	private double impact;
	public static double a = 8;
	public static double b = 1.6;
	public static double c = 0.9;
	
	/**
	 * Ce constructeur génère une instance de la classe
	 * @param txBoeuf : Le taux de repas à base de Boeuf 
	 * @param txVege : Le taux de repas végétarien
	 */
	public Alimentation (double txBoeuf,double txVege) throws IllegalArgumentException{
		if (txBoeuf < 0 || txBoeuf > 1) { 
			throw new  IllegalArgumentException("Le taux de repas à base de Boeuf doit être entre 0 et 1 or "+ txBoeuf + " n'est pas entre 0 et 1");
		}
		this.txBoeuf = txBoeuf;
		if (txVege < 0 || txVege > 1) { 
			throw new  IllegalArgumentException("Le taux de repas végétarien doit être entre 0 et 1 or "+ txVege + " n'est pas entre 0 et 1");
		}
		this.txVege = txVege;
		this.impact = a*txBoeuf+b*(1-txVege-txBoeuf)+c*txVege;
	}
	/**
	 * Cette méthode renvoie l'attribut txBoeuf
	 * @return double
	 */
	public double gettxBoeuf () {
		return txBoeuf;
	}

	/**
	 * Cette méthode renvoie l'attribut txVege
	 * @return double
	 */
	public double gettxVege () {
		return txVege;
	}
	/**
	 * Cette méthode renvoie l'attribut impact
	 * @return double
	 */
	public double getimpact () {
		return impact;
	}
	/**
	 * Cette méthode permet de modifier l'attribut txBoeuf
	 * @param txBoeuf : Le taux de repas à base de Boeuf 
	 */
	public void settxBoeuf (double txBoeuf) throws IllegalArgumentException{
		if (txBoeuf < 0 || txBoeuf > 1) { 
			throw new  IllegalArgumentException("Le taux de repas à base de Boeuf doit être entre 0 et 1 or "+ txBoeuf + " n'est pas entre 0 et 1");
		}
		this.txBoeuf = txBoeuf;
		this.impact = a*txBoeuf+b*(1-txVege-txBoeuf)+c*txVege;
	}

	/**
	 * Cette méthode permet de modifier l'attribut txVege
	 * @param txVege : Le taux de repas végétarien
	 */
	public void settxVege (double txVege) throws IllegalArgumentException{
		if (txVege < 0 || txVege > 1) { 
			throw new  IllegalArgumentException("Le taux de repas végétarien doit être entre 0 et 1 or "+ txVege + " n'est pas entre 0 et 1");
		}
		this.txVege = txVege;
		this.impact = a*txBoeuf+b*(1-txVege-txBoeuf)+c*txVege;
	}

	/**
	 * Cette méthode renvoie l'empreinte carbone moyenne d'un français par an en alimentation
	 * @return String
	 */
	public static String empreinteCarbone (){
		return "Le français moyen consomme \nViandes et poissons : 1144 kilogrammes de CO2 par an \nProduits laitiers et oeufs : 408 kilogrammes de CO2 par an \nAutres : 538 kilogrammes CO2 par an \nBoissons : 263 kilogrammes CO2 par an"; 
	}
	
	/**
	 * Cette méthode renvoie les attributs de l'instance
	 * @return String
	 */
	@Override
	public String toString(){
		return ("Le taux de repas à base de boeuf de cette personne est :"+ this.txBoeuf +" \nLe taux de repas végétarien de cette personne est :"+ this.txVege +"\nL'impact de l'alimentation de cette personne est "+ this.impact);
	}

	
	/*public static void main(String args[]){
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
	}*/
}







