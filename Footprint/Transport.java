package consoCarbone;

public class Transport extends ConsoCarbone{
	private boolean possede;
	private Taille taille;
	private int kilomAnnee;
	private int amortissement;
	private double impact;

	public Transport(boolean possede, Taille taille, int kilomAnnee, int Amortissement){
		this.possede = possede;
		this.taille = taille;
		this.kilomAnnee = kilomAnnee;
		this.amortissement = amortissement;
		if (possede == false) {
			this.impact = 0;
		}
		else{
			this.impact = kilomAnnee*1.93*0.0001+taille.getProd()/amortissement;
		}
	}
	public String toString(){ 
		return "L'impact des déplacements des utilisateurs est " + impact ;
	}
	
	public static String empreinteCarbone (){
		return ("Un français moyen consomme \nVoiture  : 1972 kilogrammes de CO2 par an \nAvion  : 480 kilogrammes de CO2 par an\nFret et messagerie :  383 kilogrammes de CO2 par an \nTrain et bus 85 kilogrammes de CO2 par an"); 
	} 	
	
	public boolean getpossede(){
		return possede;
	}
	
	public int getkilomAnnee(){
		return kilomAnnee;
	}
	
	public int getamortissement(){
		return amortissement;
	}
	
	public double getimpact(){
		return impact;
	}

	public double gettaille(){
		return taille.getProd();
	}

	public void setpossede(boolean possede){
		this.possede = possede;
		if (possede == false) {
			this.impact = 0;
		}
		else{
			this.impact = kilomAnnee*1.93*0.0001+taille.getProd()/amortissement;
		}
	}

	public void setkilomAnnee(int kilomAnnee){
		this.kilomAnnee = kilomAnnee;
		if (possede == false) {
			this.impact = 0;
		}
		else{
			this.impact = kilomAnnee*1.93*0.0001+taille.getProd()/amortissement;
		}
	}

	public void setamortissement(int amortissement){
		this.amortissement = amortissement;
		if (possede == false) {
			this.impact = 0;
		}
		else{
			this.impact = kilomAnnee*1.93*0.0001+taille.getProd()/amortissement;
		}
	}

	public void settaille(Taille taille){
			this.taille=taille;
			if (possede == false) {
				this.impact = 0;
			}
			else{
				this.impact = kilomAnnee*1.93*0.0001+taille.getProd()/amortissement;
			}
	}

	public static void main(String args[]){
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
	}
}
		






