package Praktikum_4;
import java.util.Scanner;

public class TestSiswa {
	public static void main (String args []) {
		Scanner input = new Scanner(System.in);
		String nama;
		int npm;
		
		System.out.print("Masukkan nama : ");
		nama = input.next();
		System.out.print("Masukkan npm : ");
		npm = input.nextInt();
		
		Siswa anak = new Siswa ();
		anak.setNama(nama);
		anak.setNrp(npm);
		
		System.out.print("Nama siswa : " + anak.nama + "\nNPM Siswa : " + anak.nrp);
		
		}
	}
