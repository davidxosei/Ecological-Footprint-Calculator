//package consoCarbone;
/**
 * Cette classe est une énumération représentant les différentes taille des voitures 
 */
public enum Taille {P(4.2),G(19);
		private double prod;
		
		/**
		 * Ce constructeur génère une instance de la classe
		 * @param prod : l'impact de la production d'une voiture sur l'environnement
		 */
		private Taille(double prod){
			this.prod = prod;
		}

		/**
		 * Cette méthode renvoie la valeure de l'attribut prod
		 * @return double
		 */
		public double getProd(){
			return prod;
		}

};
