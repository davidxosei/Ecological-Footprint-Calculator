//package consoCarbone2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Cette classe représente un utilisateur et son empreinte carbone dans chaque domaine
 */
public class Utilisateur {
	Alimentation alimentation;
	private BienConso bienconso;
	private logement logement;
	Transport transport;
	private ServicesPublics services;
	private List<voiture> voitures = new ArrayList<>();
	
    /**
	 * Ce constructeur génère une instance de la classe
	 * @param alimentation : l'alimentation de l'utilisateur
	 * @param bienconso : les dépenses de l'utilisateur
	 * @param logement : le logement de l'utilisateur
	 * @param transport : les transports de l'utilisateur
	 * @param services : les services publiques de l'utilisateur
	 */
	public Utilisateur (Alimentation alimentation, BienConso bienconso, logement logement, Transport transport, ServicesPublics services){
		this.alimentation = alimentation;
		this.bienconso = bienconso;
		this.logement = logement;
		this.transport = transport;
		this.services = services;
	}

    /**
	 * Ce constructeur génère une instance de la classe
	 * @param fichier : fichier texte contenant les informations de l'utilisateur
	 */
	public Utilisateur(String fichier) {
        try(BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String line = reader.readLine();
            while(line != null) {
                String[] param = line.split(" , ");
                String nom = param[0];
               
                if(nom.equalsIgnoreCase("Alimentation")) {
                    double str = Double.parseDouble(param[1]);
                    double str1 = Double.parseDouble(param[2]);
                    this.alimentation = new Alimentation(str, str1);
                }
                if(nom.equalsIgnoreCase("Bienconso")) {
                    double impa = Double.parseDouble(param[1]);
                    this.bienconso = new BienConso(impa);
                }
                if(nom.equalsIgnoreCase("Logement")) {
                    CE A;
                    Integer sp = Integer.parseInt(param[2]);
                    switch(param[1]) {
                        case "A":
                            A = CE.A;
                            this.logement = new logement(A, sp);
                            break;
                        case "B":
                            A = CE.B;
                            this.logement = new logement(A, sp);
                            break;
                        case "C":
                            A = CE.C;
                            this.logement = new logement(A, sp);
                            break;
                        case "D":
                            A = CE.D;
                            this.logement = new logement(A, sp);
                            break;
                        case "E":
                            A = CE.E;
                            this.logement = new logement(A, sp);
                            break;
                        case "F":
                            A = CE.F;
                            this.logement = new logement(A, sp);
                            break;
                        case "G":
                            A = CE.G;
                            this.logement = new logement(A, sp);
                            break;
                    }
                        
                        

                    }
                if(nom.equalsIgnoreCase("Transport")) {
                    boolean B;
                    Taille P;
                    Integer kma = Integer.parseInt(param[3]);
                    Integer amo = Integer.parseInt(param[4]);
                    if(param[1].equals("true")) {
                        B = true;
                        if(param[2].equals("P")) {
                            P = Taille.P;
                            this.transport = new Transport(B, P, kma, amo);
                        }
                        if(param[2].equals("G")) {
                            P = Taille.G;
                            this.transport = new Transport(B, P, kma, amo);
                        }
                    }
                    if(param[1].equals("false")) {
                        B = false;
                        if(param[2].equals("P")) {
                            P = Taille.P;
                            this.transport = new Transport(B, P, kma, amo);
                        }
                        if(param[2].equals("G")) {
                            P = Taille.G;
                            this.transport = new Transport(B, P, kma, amo);
                        }
                    }
                   
                }
                if(nom.equalsIgnoreCase("Services")) {
                    double imp = Double.parseDouble(param[1]);
                    this.services = ServicesPublics.getInstance(imp);
                }
                line = reader.readLine();
            }
            reader.close();
        }
        catch(Exception e) {
            System.out.println("Une erreur s'est produite");
        }
    }
	/**
	 * Cette méthode renvoie la somme de toutes les empreintes carbone de l'utlisateur
     * @return double
	 */
	public double calculerEmpreinte (){
		return alimentation.getimpact() + bienconso.getImpact() + logement.getImpact() + transport.getImpact() + services.getImpact();
	}
		
    /**
	 * cette méthode renvoie chaque empreinte carbone de l'utilisateur
	 */
	public void detaillerEmpreinte (){
		System.out.println("L'empreinte carbone de cet(te) Utilisateur(trice) est \nEn alimentation : "+ alimentation.getimpact() +"\nEn dépenses annuelles : "+ bienconso.getMontant() + "\nEn logement : " + logement.getImpact() + "\nEn transport : " + transport.getImpact() + "\nEn services : " + services.getImpact());
	}
	
    /**
	 * cette méthode trie par ordre décroissant dans une liste les empreintes carbone de l'utilisateur
	 */
	public void ordonner() {
		List<Double> consommations = new ArrayList<>();
		consommations.add(alimentation.getimpact());
		consommations.add(bienconso.getImpact());
		consommations.add(logement.getImpact());
		consommations.add(transport.getImpact());
		consommations.add(services.getImpact());
		Collections.sort(consommations);

		for(double impact : consommations) {
			System.out.println(impact);
		}

		System.out.println("Pour obtenir un mode de vie plus durable, vous devriez essayer de réduire votre empreinte carbone. Vous pouvez utiliser des transports en commun ou un vélo au lieu de conduire.\n Vous pouvez également économiser l'énergie à la maison, manger moins de viande et de produits laitiers. ");


	}

}

