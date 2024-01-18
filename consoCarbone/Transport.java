//package consoCarbone;

/**
 * Cette classe représente l'empreinte carbonne des transports utilisé par un utilisateur
 * Elle hérite de la classe consoCarbone
 */
public class Transport extends ConsoCarbone{
	private boolean possede;
	private Taille taille;
	private int kilomAnnee;
	private int amortissement;  
	private double impact;

	/**
	 * Ce constructeur génère une instance de la classe
	 * @param possede : indique si il possede ou non une voiture
	 * @param taille : la taille de la voiture
	 * @param kilomAnnee : le nombre de kilomètre parcouru par la voiture
	 * @param Amortissement : l'amortissement de la voiture
	 */
	public Transport(boolean possede, Taille taille, int kilomAnnee, int amortissement) throws IllegalArgumentException {
		this.possede = possede;
		this.taille = taille;
		if (kilomAnnee < 0){
			throw new  IllegalArgumentException("Le nombre de kilomètre parcouru par an ne peut pas être négatif or "+ kilomAnnee + " est négatif");
		}
		this.kilomAnnee = kilomAnnee;
		if (amortissement < 0) {
			throw new  IllegalArgumentException("L'amortissement ne peut pas être négatif or "+ amortissement + " est négatif");
		}
		this.amortissement = amortissement;
		if (possede == false) {
			this.impact = 0;
		}
		else{
			this.impact = kilomAnnee*1.93*0.0001+taille.getProd()/amortissement;
		}
	}

	/**
	 * Cette méthode renvoie l'impact des déplacements de l'utilisateur
	 * @return String
	 */
	public String toString(){ 
		return "L'impact des déplacements des utilisateurs est " + impact ;
	}
	
	/**
	 * Cette méthode renvoie l'empreinte carbone moyenne d'un français en transport
	 * @return String
	 */
	public static String empreinteCarbone (){
		return ("Un français moyen consomme \nVoiture  : 1972 kilogrammes de CO2 par an \nAvion  : 480 kilogrammes de CO2 par an\nFret et messagerie :  383 kilogrammes de CO2 par an \nTrain et bus 85 kilogrammes de CO2 par an"); 
	} 	
	
	/**
	 * Cette méthode renvoie l'attribut possede
	 * @return boolean
	 */
	public boolean getpossede(){
		return possede;
	}
	
	/**
	 * Cette méthode renvoie l'attribut kilomAnnee
	 * @return int
	 */
	public int getkilomAnnee(){
		return kilomAnnee;
	}
	
	/**
	 * Cette méthode renvoie l'attribut amortissement
	 * @return int
	 */
	public int getamortissement(){
		return amortissement;
	}
	
	/**
	 * Cette méthode renvoie l'attribut impact
	 * @return double
	 */
	@Override
	public double getImpact(){
		return impact;
	}

	/**
	 * Cette méthode renvoie l'attribut taille
	 * @return double
	 */
	public double gettaille(){
		return taille.getProd();
	}

	/**
	 * Cette méthode permet de modifier l'attribut possede
	 * @param possede : indique si il possede ou non une voiture
	 */
	public void setpossede(boolean possede){
		this.possede = possede;
		if (possede == false) {
			this.impact = 0;
		}
		else{
			this.impact = kilomAnnee*1.93*0.0001+taille.getProd()/amortissement;
		}
	}

	/**
	 * Cette méthode permet de modifier l'attribut kilomAnnee
	 * @param kilomAnnee : le nombre de kilomètre parcouru par la voiture
	 */
	public void setkilomAnnee(int kilomAnnee) throws IllegalArgumentException{
		if (kilomAnnee < 0){
			throw new  IllegalArgumentException("Le nombre de kilomètre parcouru par an ne peut pas être négatif or "+ kilomAnnee + " est négatif");
		}
		this.kilomAnnee = kilomAnnee;
		if (possede == false) {
			this.impact = 0;
		}
		else{
			this.impact = kilomAnnee*1.93*0.0001+taille.getProd()/amortissement;
		}
	}

	/**
	 * Cette méthode permet de modifier l'attribut amortissement
	 * @param amortissement : l'amortissement de la voiture
	 */
	public void setamortissement(int amortissement) throws IllegalArgumentException{
		if (amortissement < 0) {
			throw new  IllegalArgumentException("L'amortissement ne peut pas être négatif or "+ amortissement + " est négatif");
		}
		this.amortissement = amortissement;
		if (possede == false) {
			this.impact = 0;
		}
		else{
			this.impact = kilomAnnee*1.93*0.0001+taille.getProd()/amortissement;
		}
	}

	/**
	 * Cette méthode permet de modifier l'attribut taille
	 * @param taille : la taille de la voiture
	 */
	public void settaille(Taille taille){
			this.taille=taille;
			if (possede == false) {
				this.impact = 0;
			}
			else{
				this.impact = kilomAnnee*1.93*0.0001+taille.getProd()/amortissement;
			}
	}

	/*public static void main(String args[]){
		Transport test = new Transport(true,Taille.P,10,10);
		System.out.println(test.getpossede());
		System.out.println(test.getkilomAnnee());
		System.out.println(test.getamortissement());
		System.out.println(test.gettaille());
		test.setpossede(false);
		test.setkilomAnnee(20);
		test.setamortissement(20);
		test.settaille(Taille.G);
		System.out.println(test.getpossede());
		System.out.println(test.getkilomAnnee());
		System.out.println(test.getamortissement());
		System.out.println(test.empreinteCarbone());
		System.out.println(test.toString());
	}*/
}
		






