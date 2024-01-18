package consoCarbone;
/**
 * Cette classe est une énumération représentant les différentes classes énergétiques d'un logement
 */
public enum CE {A(0.005),B(0.01),C(0.02),D(0.035),E(0.055),F(0.08),G(0.1);
		private final double a;

		/**
		 * Ce constructeur génère une instance de la classe
		 * @param a : l'impact de la consommation énergétique du logement sur l'environnement
		 */
		private CE (double a){
			this.a = a;
		}

		/**
		 * Cette méthode renvoie la valeure de l'attribut a
		 * @return double
		 */
		public double geta(){
			return a;
		}
};
