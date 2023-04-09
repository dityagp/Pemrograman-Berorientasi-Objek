
public class SegitigaSiku {
	double tinggi;
	double alas;
	double sisimiring;
	
	public SegitigaSiku() {}
	public SegitigaSiku(double tinggi,double alas,double sisimiring) {
		this.tinggi=tinggi;
		this.alas=alas;
		this.sisimiring=sisimiring;
	}
	
	public void setTinggi(double tinggi) {
		this.tinggi=tinggi;
	}
	
	public void setAlas(double alas) {
		this.alas=alas;
	}
	
	public void setSisimiring(double sisimiring) {
		this.sisimiring=sisimiring;
	}
	
	public double getTinggi() {
		return tinggi;
	}
	
	public double getAlas() {
		return alas;
	}
	
	public double getSisimiring() {
		return sisimiring;
	}
	
	public double getKeliling() {
		return tinggi+alas+sisimiring;
	}
	
	public double getLuas() {
		return (alas*tinggi)/2;
	}
}

