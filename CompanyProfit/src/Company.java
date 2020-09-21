
public class Company {

	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String dateOfEstablishment;
	
	public String getDateOfEstablishment() {
		return dateOfEstablishment;
	}
	
	public void setDateOfEstablishment(String dateOfEstablishment) {
		this.dateOfEstablishment = dateOfEstablishment;
	}
	
	public String bulstat;
	
	public String getBulstat() {
		return bulstat;
		}
	public void setBulstat(String bulstat, int length) {
		this.setBulstat(bulstat, length = 10);
	}
	
	public Company(String name, String dateOfEstablishment, String bulstat) {
		this.name = name;
		this.dateOfEstablishment = dateOfEstablishment;
		this.bulstat = bulstat;
	}
}
