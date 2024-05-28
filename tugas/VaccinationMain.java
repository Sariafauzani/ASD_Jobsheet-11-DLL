package tugas;
import java.util.Scanner;

public class VaccinationMain {
    public static void menu(){

        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("++++++++++++++++++++++++++++++++\n");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("++++++++++++++++++++++++++++++++");
    }
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        QueueVaksin queue = new QueueVaksin();
        int pilih;

        do {
            menu();
            pilih = sc26.nextInt();
            sc26.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-----------------------------");
                    System.out.print("Nomor Antrian: ");
                    int noAntrian = sc26.nextInt();
                    sc26.nextLine();
                    System.out.print("Nama Penerima: ");
                    String nama = sc26.nextLine();
                    queue.enqueue(noAntrian, nama);
                    break;
                case 2:
                    String removeNama = queue.dequeue();
                    if (removeNama != null) {
                        System.out.println(removeNama +" telah selesai divaksinaasi");
                    } else {
                        System.out.println("Antrian Kosong");
                    }
                    break;
                case 3:
                    queue.print();
                    System.out.println("Sisa Antrian: "+queue.size());
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan pilih 1-4");
        }
    } while (pilih != 4);

    sc26.close();
    }
}