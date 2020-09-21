
	public class CompanyET extends Company {

		public CompanyET(String name, String dateOfEstablishment, String bulstat) {
			super(name, dateOfEstablishment, bulstat);
			
		}
		public String ownerName;

		public String getOwnerName() {
			return ownerName;
		}

		public void setOwnerName(String ownerName) {
			this.ownerName = "Ivan Ivanov";
		}
		public Double initialCapital;

		public Double getInitialCapital() {
			return initialCapital;
		}

		public void setInitialCapital(Double initialCapital) {
			this.initialCapital = (double) 100000;
		}
		
		public Double currentCapital;

		public Double getCurrentCapital() {
			return currentCapital;
		}

		public void setCurrentCapital(Double currentCapital) {
			this.currentCapital = (double) 105000;
		}
		
		double profit = 
			(currentCapital - initialCapital);
			
		
		public double profit(double d) {
			
			return this.profit;
		}
		final String name = "Everest EOOD";
		final String dateOfEstablishment = "10.01.2016 ã.";
		final String bulstat = "BG123456";
		//final String ownerName1 = "Ivan Ivanov";
		//final Double initialCapital1 = (double) 100000;
		//final Double currentCapital1 = (double) 105000;
		//final Double profit1 = (currentCapital1 - initialCapital1);
	
	public static void main(String[] args, String name, String dateOfEstablishment, String bulstat, String ownerName, Double profit) {
		
		System.out.print("The Company %s was established in %s with bulstat %s and owner %s has a profit %d.");
	}
	}