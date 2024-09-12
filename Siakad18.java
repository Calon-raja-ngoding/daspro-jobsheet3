/**
 * Siakad18
 */
import java.util.Scanner;
public class Siakad18 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       String nama, nim, kelas;
       byte absen;
       double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

       System.out.print("Masukkan nama:");
       nama = sc.nextLine();
       System.out.print("Masukkan NIM:");
       nim = sc.nextLine();
       System.out.print("Masukkan kelas:");
       kelas = sc.nextLine();
       System.out.print("Masukkan  no absen:");
       absen = sc.nextByte();

       System.out.print("Masukkan nilai kuis:");
       nilaiKuis = sc.nextDouble();
       System.out.print("Masukkan nilai tugas:");
       nilaiTugas = sc.nextDouble();
       System.out.print("Masukkan nilai UTS:");
       nilaiUTS = sc.nextDouble();
       System.out.print("Masukkan nilai UAS:");
       nilaiUAS = sc.nextDouble();

       nilaiAkhir = (nilaiKuis * 20) / 100 + (nilaiTugas * 15) / 100 + (nilaiUTS * 30) / 100 + (nilaiUAS * 35) / 100;

       System.out.println(" Nama:" + nama + " Nim: " + nim);
       System.out.println(" Kelas: " + kelas + " Absen: " + absen);
       System.out.println("Nilai akhir: " + nilaiAkhir);

    }
}