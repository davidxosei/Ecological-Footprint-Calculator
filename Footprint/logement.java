package consoCarbone;

public class logement extends ConsoCarbone{
	private int superficie;
	private CE ce;
        private double impact;
	

	public logement(CE ce,int superficie){
		this.ce = ce;
		this.superficie = superficie;
		this.impact = ce.geta()*superficie;
	}
	
	public double getImpact(){
		return impact;
	}
	
	@Override
	public String toString (){
		return ("La superficie du logement est "+ this.superficie + " m2\nLa classe énergétique du logement est " + ce.geta() + "\nL'impact du logement en termes d'émissions de GES est " + this.impact +" TCO2eq");
	}
	
	public static String empreinteCarbone(){
		return "Le français moyen consomme \nEnergie et utilité : 1696 kilogrammes de CO2 par an\nConstruction et gros entretien : 675 kilogrammes de CO2 par an \nEquipement des logements : 335 kilogrammes de CO2 par an\n";
}

	public static void main(String args[]){
		CE A = CE.A;
		logement test = new logement(A,10);
		System.out.println(test.getImpact());
		System.out.println(test.empreinteCarbone());
		System.out.println(test.toString());
	}
}
