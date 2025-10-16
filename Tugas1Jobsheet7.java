import java.util.Scanner;
    public interface Tugas1Jobsheet7 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalTiket = 0;
        int totalPendapatan = 0;
        
        while (true) {
           System.out.print("Masukkan jumlah tiket yang dibeli (atau 0 untuk keluar): ");
           int jumlahTiket = input.nextInt();
            if (jumlahTiket == 0) {
            break;
            } else if (jumlahTiket < 0) {
            continue;

            } int hargaTiket = 50000;
            if (jumlahTiket > 10) {
        hargaTiket *= 0.85;
            } else if (jumlahTiket > 4) {
            hargaTiket *= 0.9;
            } totalTiket += jumlahTiket;

           totalPendapatan += hargaTiket * jumlahTiket;
           System.out.println("Total tiket terjual: " + totalTiket);
           System.out.println("Total pendapatan: Rp " + totalPendapatan);
           
        } input.close();
    }
}
