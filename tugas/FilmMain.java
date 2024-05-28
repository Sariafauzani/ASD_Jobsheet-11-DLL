package tugas;
import java.util.Scanner;

public class FilmMain {
    public static void menu(){
        System.out.println("==================================");
        System.out.println("DAFTAR FILM LAYAR LEBAR");
        System.out.println("==================================");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data index Tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari ID Film");
        System.out.println("9. Urut Data Rating Film-DESC");
        System.out.println("10. Keluar");
        System.out.println("==================================");
    }

    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        DLLFilm filmList = new DLLFilm();
        int pilih;

        do {
            menu();
            pilih = sc26.nextInt();
            sc26.nextLine();

            switch (pilih){
                case 1:
                   System.out.println("------------------------------");
                   System.out.println("Masukkan Data Film Posisi Awal");
                   System.out.print("ID Film:\n");
                   int idAwal = sc26.nextInt();
                   sc26.nextLine();
                   System.out.print("Judul Film:\n");
                   String judulAwal = sc26.nextLine();
                   System.out.print("Rating Film:\n");
                   double ratingAwal = sc26.nextDouble();
                   filmList.addFirst(idAwal, judulAwal, ratingAwal);
                   break;
                case 2:
                   System.out.println("-------------------------------");
                   System.out.println("Masukkan Data Posisi Akhir");
                   System.out.print("ID Film:\n");
                   int idAkhir = sc26.nextInt();
                   sc26.nextLine();
                   System.out.print("Judul Film:\n");
                   String judulAkhir = sc26.nextLine();
                   System.out.print("Rating Film:\n");
                   double ratingAkhir = sc26.nextDouble();
                   filmList.addLast(idAkhir, judulAkhir, ratingAkhir);
                   break;
                case 3:
                   System.out.println("-------------------------------");
                   System.out.println("Masukkan Data Film\nUrutan ke-");
                   System.out.print("ID Film:\n");
                   int IdTertentu = sc26.nextInt();
                   sc26.nextLine();
                   System.out.print("Judul Film:\n");
                   String judulTertentu = sc26.nextLine();
                   System.out.print("Rating Film:\n");
                   double ratingTertentu = sc26.nextDouble();
                   System.out.println();
                   filmList.addAtIndex(IdTertentu, judulTertentu, ratingTertentu, IdTertentu);
                   break;
                case 4:
                   filmList.removeFirst();
                   System.out.println("Data pertama telah dihapus.");
                   break;
                case 5:
                   filmList.removeLast();
                   System.out.println("Data terakhir telah dihapus.");
                   break;
                case 6:
                   System.out.println("-------------------------------");
                   System.out.print("Masukkan data yang ingin dihapus: ");
                   int indexHapus = sc26.nextInt();
                   filmList.removeAtIndex(indexHapus);
                   System.out.println("Data pada posisi "+ indexHapus + " telah dihapus.");
                   break;
                case 7:
                   System.out.println("-------------------------------");
                   System.out.println("Cetak Data");
                   filmList.printFilms();
                   break;
                case 8:
                   System.out.println("-------------------------------");
                   System.out.println("Cari ID Film");
                   System.out.print("ID:\n");
                   int searchById = sc26.nextInt();
                   Film26 FilmDitemukan = filmList.searchById(searchById);
                   if (FilmDitemukan != null){
                    System.out.println("Film Ditemukan: "+ FilmDitemukan);
                   } else {
                    System.out.println("Film dengan ID "+ searchById + " tidak ditemukan.");
                   }
                   break;
                case 9:
                   filmList.sortDescending();
                   System.out.println("Data telah diurutkan berdasarkan rating secara DESC");
                   break;
                case 10:
                   System.out.println("Terima kasih!");
                   break;
                default:
                   System.out.println("Pilihan tidak valid. Silahkan pilih 1-10.");
            }
        } while (pilih != 10);

        sc26.close();
    }
}
