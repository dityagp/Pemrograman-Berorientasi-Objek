
public class PrismaSegitiga extends SegitigaSiku {
	double tinggiprisma;

public PrismaSegitiga (double tinggi,double alas,double sisimiring,double tinggiprisma) {
	super(tinggi,alas,sisimiring);
	this.tinggiprisma=tinggiprisma;
}

public void setTinggiprisma(double tinggiprisma) {
	this.tinggiprisma=tinggiprisma;
}

public double getTinggiprisma() {
	return tinggiprisma;
}

public double getVolume() {
	double volume=((getAlas()*getTinggi())/2)*getTinggiprisma();
	return volume;
}

public double getLuas() {
	double luas=getTinggiprisma()*(getAlas()+getTinggi()+getSisimiring())+(getAlas()*getTinggi());
	return luas;
}
}