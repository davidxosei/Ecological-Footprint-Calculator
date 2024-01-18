package consoCarbone;

/**
 *  Cette classe représente le montant des dépenses annuelles d'un utilisateur
 * Elle hérite de la classe consoCarbone
 */
public class BienConso extends ConsoCarbone{
	private double montant;
	private double impact;

	/**
	 * Ce constructeur génère une instance de la classe
	 * @param impact : l'empreinte carbone de l'utilisateur
	 */
	public BienConso(double impact){
		this.impact = impact;
		this.montant = 1750*this.impact;
	}
	/**
	 * Cette méthode renvoie l'attribut montant
	 * @return double
	 */
	public double getMontant(){
		return montant;
	}
	/**
	 * Cette méthode renvoie les dépenses moyenne d'un français 
	 * @return String
	 */
	public static String empreinteCarbone (){
		return ("Le français moyen consomme \nAchat et usages internet et technologies : 1180 kilogrammes de CO2 par an \nAutres bien et services : 682 kilogrammes de CO2 par an \nHabillement : 763 kilogrammes de CO2 par an");
	}  

	/**
	 * Cette méthode renvoie le montant des dépenses de l'utilisateur
	 * @return String
	 */
	@Override
	public String toString(){
		return ("Le montant des dépenses annuelles de cette personne est "+ this.montant);
	}

	/*public static void main (String args[]){
		//Taille P = Taille.P;
		BienConso test = new BienConso(P);
		System.out.println(test.getMontant());
		System.out.println(empreinteCarbone());
		System.out.println(test.toString());
	}*/
}
