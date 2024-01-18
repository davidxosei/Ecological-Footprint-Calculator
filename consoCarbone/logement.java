package consoCarbone;

/**
 * Cette classe représente l'empreinte carbone d'un logement en fonction de sa superficie et de sa classe énergétiquee
 * 
 */


public class logement extends ConsoCarbone{
	private int superficie;
	private CE ce;
    private double impact;
	
    /**
     * Le constructeur crée une instance de la classe logement avec comme attribut une classe énergétique une superficie et un impact ecologique 
     * @param ce : la classe énergétique
     * @param superficie : la taille du logement
     */
	public logement(CE ce,int superficie) throws IllegalArgumentException {
		this.ce = ce;
		if (superficie <= 0) {
			throw new IllegalArgumentException("La superficie ne peut pas être négative ou nulle or "+ superficie + " est négatif ou nul");
		}
		this.superficie = superficie;
		this.impact = ce.geta()*superficie;
	}
	
	/**
	 * Cette méthode retourne la valeure de l'attribut superficie de l'instance
	 * @return double 
	 */
	public double getSuperficie () {
		return this.superficie;
	}
	
	/**
	 * Cette méthode retourne la valeure de l'attribut impact de l'instance
	 * @return double 
	 */
	public double getImpact(){
		return impact;
	}
	
	/**
	 * Cette méthode renvoie les valeures des attributs de l'instance
	 * @param String
	 */
	@Override
	public String toString (){
		return ("La superficie du logement est "+ this.superficie + " m2\nLa classe énergétique du logement est " + ce.geta() + "\nL'impact du logement en termes d'émissions de GES est " + this.impact +" TCO2eq");
	}
	
	/**
	 * Cette méthode renvoie l'empreinte carbone moyenne d'un français par an en logement
	 * @return String
	 */
	public static String empreinteCarbone(){
		return "Le français moyen consomme \nEnergie et utilité : 1696 kilogrammes de CO2 par an\nConstruction et gros entretien : 675 kilogrammes de CO2 par an \nEquipement des logements : 335 kilogrammes de CO2 par an\n";
	}
	
	/*public static void main(String args[]){
		CE A = CE.A;
		logement test = new logement(A,10);
		System.out.println(test.getImpact());
		System.out.println(test.empreinteCarbone());
		System.out.println(test.toString());
	}*/
}
