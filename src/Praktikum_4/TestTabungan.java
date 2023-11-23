package Praktikum_4;

import java.util.Scanner;

public class TestTabungan {
	public static void main(String args[]) {
		Scanner input = new Scanner (System.in);
		int saldo, tarikTunai;
		
		System.out.print("Masukkan jumlah saldo :");
		saldo = input.nextInt();
		Tabungan Tabungan = new Tabungan(saldo);
		System.out.print("Saldo awal :" + Tabungan.saldo);
		
		System.out.print("Masukkan saldo penarikan :");
		tarikTunai = input.nextInt();
		Tabungan.ambilUang(tarikTunai);
		System.out.print("Jumlah uang yang diambil :" + tarikTunai);
		System.out.print("Saldo sekarang :" + Tabungan.saldo);
	}
}
