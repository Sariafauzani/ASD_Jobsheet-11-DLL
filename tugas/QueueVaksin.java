package tugas;
import java.util.LinkedList;
import java.util.Queue;

public class QueueVaksin {
    private static class Penerima {
        int noAntrian;
        String nama;

        Penerima(int noAntrian, String nama){
            this.noAntrian = noAntrian;
            this.nama = nama;
        }
    }

    private Queue<Penerima> queue = new LinkedList<>();

    public void enqueue(int noAntrian, String nama){
        Penerima penerima = new Penerima(noAntrian, nama);
        queue.add(penerima);
        System.out.println("Penerima Vaksin ditambahkan ke Antrian");
    }

    public String dequeue(){
        if (queue.isEmpty()){
            return null;
        } else {
            Penerima penerima = queue.poll();
            return penerima.nama;
        }
    }

    public void print(){
        if (queue.isEmpty()){
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar Penerima Vaksin:");
            for (Penerima penerima : queue){
                System.out.println("Nomor Antrian: "+ penerima.noAntrian+", Nama: "+penerima.nama);
            }
        }
    }
    public int size(){
        return queue.size();
    }
}
