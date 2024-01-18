import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Alimentation alimentation;
        
        BienConso bienConso = new BienConso(1);
        logement logement = new logement(CE.A, 1);
        Transport transport = new Transport(false, Taille.P, 0, 0);
        ServicesPublics services;
        List<Utilisateur> populations = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Afficher le menu et lire l'option choisie par l'utilisateur.rice
        int option;
        do {
            System.out.println("\n~~~ Menu ~~~\n");
            System.out.println("1. Créer un nouvel utilisateur ou utilisatrice");
            System.out.println("2. Charger un utilisateur ou utilisatrice à partir d'un fichier texte");
            System.out.println("3. Afficher la population");
            System.out.println("4. Afficher l'empreinte carbone moyenne d'un.e français.e");
            System.out.println("5. Quitter");
            System.out.print("Entrez votre choix : ");
            option = sc.nextInt();
            System.out.println();

            switch (option) {
                case 1:
                    // Créer un nouvel utilisateur ou utilisatrice
                    
                    // Demander à l'utilisateur.rice de saisir les informations de l'alimentation
                    System.out.print("Entrez le taux de repas à base de boeuf : ");
                    double txBoeuf = sc.nextDouble();
                    System.out.print("Entrez le taux de repas végétariens : ");
                    double txVege = sc.nextDouble();
                    alimentation = new Alimentation(txBoeuf, txVege);
                    

                    // Demander à l'utilisateur.rice de saisir les informations sur les biens de consommation
                    
                    System.out.print("Entrez l'impact environnemental : ");
                    Double ta = sc.nextDouble();
                    //Taille P;
                    bienConso = new BienConso(ta);
                    //Erreur que je comprends pas ()
                    //bienConso = new BienConso(P);
                    

                    // Demander à l'utilisateur.rice de saisir les informations sur les logements
                    
                    String response;
                    
                    // Demander à l'utilisateur.rice s'il possède un logement
                    System.out.print("Avez-vous un logement (o/n) ? ");
                    response = sc.next();

                    if (response.equalsIgnoreCase("o")) {
                        // Demander à l'utilisateur.rice de saisir les informations sur le logement
                        System.out.print("Entrez la superficie du logement en m² : ");
                        int superficie = sc.nextInt();
                        System.out.print("Entrez la classe énergétique du logement (A, B, C, D, E, F, G) : ");
                        String ce = sc.next();
                        CE A;
                        
                        switch(ce) {
                            case "A":
                                A = CE.A;
                                logement = new logement(A, superficie);
                                break;
                            case "B":
                                A = CE.B;
                                logement = new logement(A, superficie);
                                break;
                            case "C":
                                A = CE.C;
                                logement = new logement(A, superficie);
                                break;
                            case "D":
                                A = CE.D;
                                logement = new logement(A, superficie);
                                break;
                            case "E":
                                A = CE.E;
                                logement = new logement(A, superficie);
                                break;
                            case "F":
                                A = CE.F;
                                logement = new logement(A, superficie);
                                break;
                            case "G":
                                A = CE.G;
                                logement = new logement(A, superficie);
                                break;
                            default:
                                System.out.print("Option non valide. Veuillez reesayer");
                        }
                        
                        
                    }
                    
                    // Demander à l'utilisateur.rice de saisir les informations sur le transport
                    System.out.print("Possédez-vous une voiture (o/n) ? ");
                    response = sc.next();
                    if (response.equalsIgnoreCase("o")) {
                        // Demander à l'utilisateur.rice de saisir les informations sur la voiture
                        System.out.print("Quelle est la taille de votre voiture (P/G) ? ");
                        String taille = sc.next();
                        Taille T;
                        switch(taille) {
                            case "P":
                                T = Taille.P;
                                System.out.print("Combien de kilomètres parcourez-vous par an ? ");
                                int kilomAnnee = sc.nextInt();
                                System.out.print("Combien de temps conservez-vous votre voiture (en années) ? ");
                                int amortissement = sc.nextInt();
                                transport = new Transport(true, T, kilomAnnee, amortissement);
                                break;
                            case "G":
                                T = Taille.G;
                                System.out.print("Combien de kilomètres parcourez-vous par an ? ");
                                int kilomAnnee2 = sc.nextInt();
                                System.out.print("Combien de temps conservez-vous votre voiture (en années) ? ");
                                int amortissement2 = sc.nextInt();
                                transport = new Transport(true, T, kilomAnnee2, amortissement2);
                                break;
                            default:
                                System.out.println("Option non valide. Veuillez reessayer");
                        }
                        
                    } else {
                        transport = new Transport(false,null,0, 0);
                        
                    }
                    services = ServicesPublics.getInstance(1.5);
                    Utilisateur u = new Utilisateur(alimentation, bienConso, logement, transport, services);
                    populations.add(u);
                    break;
                case 2:
                    // Charger un utilisateur ou utilisatrice à partir d'un fichier texte
                    System.out.println("Votre fichier doit être constitué de la manière suivante: \n");
                    System.out.println("Alimentation , txBoeuf , txVege\nBienconso , impact\nLogement , Classe Energetique , Superficie\nTransport , Posession , Taille , kilommètre par an , amortissement\nServices , impact\n");
                    String filename = sc.next();
                    Utilisateur ut = new Utilisateur(filename);
                    populations.add(ut);
                    
                    break;
                case 3:
                    // Afficher la population
                    int i = 1;
                    System.out.println();
                    if (populations.isEmpty()) {
                        System.out.println("Il faut d'abord ajouter un.e Utilisateur.trice pour accéder à la population.\n");
                    }
                    else {
                        for (Utilisateur uti : populations) {
                            System.out.println();
                            System.out.println("Utilisateur(trice) "+i);
                            System.out.println("Voici la consommation carbone totale : "+uti.calculerEmpreinte());
                            uti.detaillerEmpreinte();
                            i++;
                        }
                        

                    }
                    break;
                case 4:
                    System.out.println("\nPour comparer les différences d'empreinte Carbone voici les consomations moyennes pour un.e Français.e\n");
                    System.out.println(Alimentation.empreinteCarbone());
                    System.out.println(BienConso.empreinteCarbone());
                    System.out.println(Transport.empreinteCarbone());
                    System.out.println(logement.empreinteCarbone());
                    break;
                case 5:
                    // Quitter l'application
                    break;
                default:
                    System.out.println("\nOption non valide. Veuillez réessayer.\n");
                    break;
                    
            }
        } while (option != 5);

        // Fermer l'objet Scanner
        sc.close();
    }
}
