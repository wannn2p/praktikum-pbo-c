package Praktikum_2;
import java.util.Scanner;

public class Pengkondisian_IF {
	public static void main (String args[]) {
//		initial
		int angka1, angka2, hasil, perhitungan;
		Scanner input = new Scanner(System.in);
//		input user
		System.out.print("Masukkan angka 1 : ");
		angka1 = input.nextInt();
		
		System.out.print("Masukkan angka 2 :  ");
		angka2 = input.nextInt();
		
		System.out.print("List perhitungan : "
				+ "\n 1 : Pertambahan"
				+ "\n 2 : Pengurangan"
				+ "\n 3 : Perkalian"
				+ "\n 4 : Pembagian"
				+ "\n Masukkan angka perhitungan : ");
		perhitungan = input.nextInt();
//		kondisi if
		if(perhitungan == 1) {
			hasil = angka1 + angka2;
			System.out.print("Hasilnya adalah : " + hasil);
		}else if (perhitungan == 2) {
			hasil = angka1 - angka2;
			System.out.print("Hasilnya adalah : " + hasil);
		}else if (perhitungan == 3) {
			hasil = angka1 * angka2;
			System.out.print("Hasilnya adalah : " + hasil);
		}else if (perhitungan == 4) {
			hasil = angka1 / angka2;
			System.out.print("Hasilnya adalah : " + hasil);
		}else {
			System.out.print("Masukkan list perhitungan yang benar!");
		}
	}
}
