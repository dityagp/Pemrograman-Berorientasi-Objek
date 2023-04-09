
public class PrismaSegitigaMain {
	
	public static void main(String[] args) {
		PrismaSegitiga prismasegitiga=new PrismaSegitiga(5,6,8,9);
		System.out.println("Alas prisma segitiga = "+prismasegitiga.getAlas());
		System.out.println("Tinggi Alas prisma segitiga = "+prismasegitiga.getTinggi());
		System.out.println("Sisi Miring dari alas prisma segitiga = "+prismasegitiga.getSisimiring());
		System.out.println("Tinggi prisma segitiga = "+prismasegitiga.getTinggiprisma());
		System.out.println("Volume prisma segitiga = "+prismasegitiga.getVolume());
		System.out.println("Luas permukaan prisma segitiga = "+prismasegitiga.getLuas());
	}
}
