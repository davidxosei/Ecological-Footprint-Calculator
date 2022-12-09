package consoCarbone;
public enum Taille {P(4.2),G(19);
		private double prod;
		
		private Taille(double prod){
			this.prod = prod;
		}

		public double getProd(){
			return prod;
		}

};
