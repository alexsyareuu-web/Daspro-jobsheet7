import java.util.Scanner;

public class Tugas2Jobsheet7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalPendapatan = 0;

        while (true) {
            System.out.print("Masukkan jenis kendaraan (1: Mobil, 2: Motor, 0: Keluar): ");
            int jenisKendaraan = input.nextInt();

            if (jenisKendaraan == 0) {
                break;
            }

            System.out.print("Masukkan durasi parkir (dalam jam): ");
            int durasiParkir = input.nextInt();

            int tarifParkir = 0;

            if (durasiParkir > 5) {
                tarifParkir = 12500;
            } else {
                if (jenisKendaraan == 1) { // Mobil
                    tarifParkir = durasiParkir * 3000;
                } else if (jenisKendaraan == 2) { // Motor
                    tarifParkir = durasiParkir * 2000;
                } else {
                    System.out.println("Jenis kendaraan tidak valid.");
                    continue;
                }
            }

            totalPendapatan += tarifParkir;

            System.out.println("Total tarif parkir: Rp " + tarifParkir);
            System.out.println("Total pendapatan saat ini: Rp " + totalPendapatan);
        }

        input.close();
    }
}
