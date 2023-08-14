import java.util.Scanner;

public class SepetUygulamasi {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int elmakgfiyat = 6;
		int armutkgfiyat = 10;
		int karpuzkgfiyat = 12;
		int cilekkgfiyat = 16;
		int nektarikgfiyat = 19;
		
		
		System.out.print("Kac kg Elma Aldiniz?: ");
		double elmakgsi = scanner.nextDouble();
		double elmafiyat = (elmakgfiyat * elmakgsi);
		System.out.println("Elmanin Tutari: " + elmafiyat + "TL");
		
		
		System.out.print("Kac kg Armut Aldiniz?: ");
		double armutkgsi = scanner.nextDouble();
		double armutfiyat = (armutkgfiyat * armutkgsi);
		System.out.println("Armutun Tutari: " + armutfiyat + "TL");
		
		
		System.out.print("Kac kg Karpuz Aldiniz?: ");
		double karpuzkgsi = scanner.nextDouble();
		double karpuzfiyat = (karpuzkgfiyat * karpuzkgsi);
		System.out.println("Karpuzun Tutari: " + karpuzfiyat + "TL");
		
		
		System.out.print("Kac kg Cilek Aldiniz?: ");
		double cilekkgsi = scanner.nextDouble();
		double cilekfiyat = (cilekkgfiyat * cilekkgsi);
		System.out.println("Cilegin Tutari: " + cilekfiyat + "TL");
		
		
		System.out.print("Kac kg Nektari Aldiniz?: ");
		double nektarikgsi = scanner.nextDouble();
		double nektarifiyat = (nektarikgfiyat * nektarikgsi);
		System.out.println("Nektari Tutari: " + nektarifiyat + "TL");
		
		double toplamfiyat = (elmafiyat + armutfiyat + karpuzfiyat + cilekfiyat + nektarifiyat);
		
		System.out.println("Odemeniz Gereken Tutar: " + toplamfiyat + "TL");
		
		
		
		
	}

}
