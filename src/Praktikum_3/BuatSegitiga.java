package Praktikum_3;
import java.util.Scanner;

public class BuatSegitiga {
	public static int inputdata() {
		Scanner input = new Scanner(System.in);
		int data;
		System.out.print("Masukkan angka : ");
		data = input.nextInt();
		return data;
	}
	
	public static void buatSegitiga(int ulang) {
		for(int i = 1; i <= ulang; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println("");
		}
	}
	
	public static void main(String args[]) {
		int ulang = inputdata();
		buatSegitiga(ulang);
		System.out.println("Tinggi segitiga =" + ulang);
	}
}
