package consoCarbone;
/**
 * Cette classe est abstraite 
 * Elle implémente l'interface comparable
 * Elle possède un attribut static qui comptabilise le nombre d'instance de la classe
 */
public abstract class ConsoCarbone implements Comparable<ConsoCarbone>{
	protected int id;
	private static int nb;
	protected double impact;
	
	/**
	 * Ce constructeur génère une instance de la classe
	 * Il initialise un attribut qui représente l'identificateur de l'objet
	 */
	public ConsoCarbone(){
		this.id = nb++;
		
	}
	public ConsoCarbone (double impact) {
        this.impact = impact;
		this.id = nb++;
    }
	
	/**
	 * Cette méthode renvoie l'attribut id
	 * @return int
	 */
	public int getid(){
		return id;
	}
	/**
	 * Cette méthode permet de modifier l'attribut id
	 */
	public void setid(int id){
		this.id = id;
	}
	
	public double getImpact() {
		return this.impact;
	}
	
	/**
	 * Cette méthode renvoie l'attribut id et permet de l'afficher
	 * @return String
	 */
	@Override
	public String toString (){
		return "L'identificateur de cet objet est "+ this.id;
	}
	
	/**
	 * Cette méthode compare l'objet courant avec un autre objet de la classe et nous dit si il est plus grand plus petit ou égal à ce dernier en comparant leur impact
	 * @return int
	 */
	@Override
	public int compareTo (ConsoCarbone o){
		if (this.impact > o.impact){
			return 1;
		}
		else if (this.impact == o.impact){
			return 0;
		}
		else{
			return -1;
		}
	}
				

	/*public static void main(String args[]){
		ConsoCarbone test = new ConsoCarbone();
		Alimentation test1 = new Alimentation(0,0);
		System.out.println(test.getid());
		test.setid(10);
		System.out.println(test.getid());
		System.out.println(test1.getid());
		System.out.println(test.toString());
	 }	*/
}
