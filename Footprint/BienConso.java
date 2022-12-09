package consoCarbone;

public class BienConso extends ConsoCarbone{
	private double montant;
	private Taille t;
	
	public BienConso(Taille t){
		this.t = t;
		this.montant = 1750*t.getProd();
	}

	public double getMontant(){
		return montant;
	}

	public static String empreinteCarbone (){
		return ("Le français moyen consomme \nAchat et usages internet et technologies : 1180 kilogrammes de CO2 par an \nAutres bien et services : 682 kilogrammes de CO2 par an \nHabillement : 763 kilogrammes de CO2 par an");
	}  

	@Override
	public String toString(){
		return ("Le montant des dépenses annuelles de cette personne est "+ this.montant);
	}

	public static void main (String args[]){
		Taille P = Taille.P;
		BienConso test = new BienConso(P);
		System.out.println(test.getMontant());
		System.out.println(empreinteCarbone());
		System.out.println(test.toString());
	}
}
