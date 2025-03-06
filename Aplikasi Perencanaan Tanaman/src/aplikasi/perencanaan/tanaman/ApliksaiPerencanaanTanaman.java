package aplikasi.perencanaan.tanaman;

import java.util.ArrayList;
import java.util.Scanner;

public class ApliksaiPerencanaanTanaman {
    private static final int MAX_PLANTS = 100; // Konstanta
    private static ArrayList<Plant> plantList = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        while (running) {
            System.out.println("\n=== Alat Perencanaan Tanaman ===");
            System.out.println("1. Tambah Tanaman");
            System.out.println("2. Lihat Daftar Tanaman");
            System.out.println("3. Hapus Tanaman");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi newline
            
            switch (choice) {
                case 1:
                    if (plantList.size() < MAX_PLANTS) {
                        System.out.print("Masukkan nama tanaman: ");
                        String name = scanner.nextLine();
                        System.out.print("Masukkan waktu tumbuh (hari): ");
                        int growthTime = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Masukkan musim tanam: ");
                        String season = scanner.nextLine();
                        
                        Plant newPlant = new Plant(name, growthTime, season);
                        plantList.add(newPlant);
                        System.out.println("Tanaman berhasil ditambahkan!");
                    } else {
                        System.out.println("Daftar tanaman penuh!");
                    }
                    break;
                
                case 2:
                    if (plantList.isEmpty()) {
                        System.out.println("Belum ada tanaman dalam daftar.");
                    } else {
                        for (int i = 0; i < plantList.size(); i++) {
                            System.out.println((i + 1) + ". " + plantList.get(i));
                        }
                    }
                    break;
                
                case 3:
                    System.out.print("Masukkan nomor tanaman yang ingin dihapus: ");
                    int index = scanner.nextInt() - 1;
                    if (index >= 0 && index < plantList.size()) {
                        plantList.remove(index);
                        System.out.println("Tanaman berhasil dihapus!");
                    } else {
                        System.out.println("Nomor tidak valid!");
                    }
                    break;
                
                case 4:
                    running = false;
                    System.out.println("Terima kasih telah menggunakan Alat Perencanaan Tanaman!");
                    break;
                
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }
        
        scanner.close();
    }
}
