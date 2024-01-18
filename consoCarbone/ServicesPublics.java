//package consoCarbone;

/**
 * Cette classe représente l'empreinte carbone des services publiques pour un utilisateur
 * C'est un singleton seulement une seule instance de cette classe peut être crée
 */
public class ServicesPublics {
	private static ServicesPublics instance;
	private double impact;
	
	/**
	 *  Ce constructeur génère une instance de la classe
	 *  Il ne peut être appelé que dans la classe
	 *  @param impact : l'empreinte carbone des services publiques
	 */
	private ServicesPublics (double impact) throws IllegalArgumentException{
		if (impact != 1.5){
			throw new  IllegalArgumentException("L'impact des services publics ne peut pas être différent de 1.5 or "+ impact +" est différent de 1.5");
		}
		this.impact = impact;
	}
	
	/**
	 * Cette méthode appele le constructeur pour crée une instance de la classe si et seulement si aucune instance n'a déjà été crée
	 * Elle renvoie l'instance de la classe 
	 * @param impact : l'empreinte carbone des services publiques
	 */
	public static ServicesPublics getInstance(double impact){
		if ( instance == null){
			instance = new ServicesPublics(impact);
		}
		return instance;
	}
	
	public double getImpact() {
		return this.impact;
	}
}