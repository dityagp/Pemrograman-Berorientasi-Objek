
public class SegitigaSikuMain {
	public static void main(String[] args) {
		SegitigaSiku segitigaSiku=new SegitigaSiku();
		segitigaSiku.setTinggi(7);
		segitigaSiku.setAlas(5);
		segitigaSiku.setSisimiring(9);
		System.out.println("Tinggi segitiga = "+segitigaSiku.getTinggi()+" Alas segitiga = "+segitigaSiku.getAlas()+" Sisi Miring segitiga = "+segitigaSiku.getSisimiring()+
				" Sehingga memiliki keliling = "+segitigaSiku.getKeliling()+" dan Luas = "+segitigaSiku.getLuas());
		
		SegitigaSiku s2=new SegitigaSiku(13,5,9);
		System.out.println("Tinggi segitiga = "+s2.getTinggi()+" Alas segitiga = "+s2.getAlas()+" Sisi Miring segitiga = "+s2.getSisimiring()+
				" Sehingga memiliki keliling = "+s2.getKeliling()+" dan Luas = "+s2.getLuas());
	}
}
