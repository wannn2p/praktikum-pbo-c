package Praktikum_2;
import java.util.Scanner;

public class PengkondisianSwitch {
	public static void main (String args[]){
//		initial
		int angka1, angka2, hasil;
		String  perhitungan;
		Scanner input = new Scanner(System.in);
//		input user
		System.out.print("Masukkan angka 1 : ");
		angka1 = input.nextInt();
		
		System.out.print("Masukkan angka 2 :  ");
		angka2 = input.nextInt();
		
		System.out.print("List perhitungan : "
				+ "\n + : Pertambahan"
				+ "\n - : Pengurangan"
				+ "\n * : Perkalian"
				+ "\n / : Pembagian"
				+ "\n Masukkan angka perhitungan : ");
		perhitungan = input.next();
//		kondisi switch
		switch(perhitungan) {
		case "+" :
			hasil = angka1 + angka2;
			System.out.print("Hasilnya adalah : " + hasil);
			break;
		case "-" :
			hasil = angka1 - angka2;
			System.out.print("Hasilnya adalah : " + hasil);
			break;
		case "*" :
			hasil = angka1 * angka2;
			System.out.print("Hasilnya adalah : " + hasil);
			break;
		case "/" :
			hasil = angka1 / angka2;
			System.out.print("Hasilnya adalah : " + hasil);
			break;
		default:
			System.out.print("Masukkan simbol yang benar!");
		}
		
	}
}
