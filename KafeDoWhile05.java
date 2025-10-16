import java.util.Scanner;

public class KafeDoWhile05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti;
        String namaPelanggan; 
        int totalHarga;
        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;

        do {
            System.out.print("Masukkan Nama pelanggan (ketik 'batal' untuk keluar) : ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
            break;
            }
            System.out.println("jumlah Kopi : ");
            kopi = sc.nextInt();
            System.out.println("jumlah Teh : ");
            teh = sc.nextInt();
            System.out.println("jumlah Roti : ");
            roti = sc.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            sc.nextLine();
        } while (true);
        
    }
}
