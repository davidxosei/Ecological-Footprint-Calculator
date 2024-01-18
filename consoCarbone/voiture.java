//package consoCarbone;

/**
 * Cette classe les voitures de certains utilisateurs 
 * Elle hérite de la classe transport
 */
public class voiture extends Transport{
	private String marque;
	private int anneecons;
	private int places;
	
	/**
	 * Ce constructeur génère une instance de la classe
	 * @param possede : indique si il possede ou non une voiture
	 * @param taille : la taille de la voiture
	 * @param kilomAnnee : le nombre de kilomètre parcouru par la voiture
	 * @param Amortissement : l'amortissement de la voiture
	 * @param marque : la marque de la voiure
	 * @param annecons : année de construction de la voiture
	 * @param place : 
	 */
	public voiture (boolean possede, Taille taille, int kilomAnnee, int Amortissement, String marque, int annecons, int places ){
		super(possede,taille,kilomAnnee,Amortissement);
		this.marque = marque;
		this.anneecons = annecons;
		this.places = places;
	}
	public String getMarque(){
		return this.marque;
	}
	public int getanneCons(){
		return this.anneecons;
	}
	public int getPlaces() {
		return this.places;
	}
}