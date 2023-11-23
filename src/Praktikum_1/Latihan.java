package Praktikum_1;
import java.util.Scanner;

public class Latihan {
	public static void main (String args[]) {
//		 System.out.println("Hello Word!");
//		 initial variable
		 int angka1, angka2, hasil;
//		 intial input user
		 Scanner input = new Scanner(System.in);
//		 input user
		 System.out.println("===========");
		 System.out.println("Program pertambahan");
		 System.out.print("===========");
		 System.out.print("\n masukkan angka ke-1: ");
		 angka1 = input.nextInt();
		 
		 System.out.print("Masukkan angka ke-2: ");
		 angka2 = input.nextInt();
//		 hasil inputan
		 hasil = angka1 + angka2;
		 System.out.println("Hasilnya adalah : " + hasil);
		 
//		 soal 2
		 String namaDepan,namaBelakang,fullName;
		 
		 System.out.print("Masukkan nama depan : ");
		 namaDepan = input.next();
		 
		 System.out.print("Masukkan nama belakang : ");
		 namaBelakang = input.next();
		 
		 fullName = namaDepan + " " + namaBelakang;
		 System.out.println("Nama saya adalah : " + fullName);
		 
		 
	 }
}
