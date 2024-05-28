package tugas;

public class Film26 {
    int id;
    String judul;
    double rating;
    Film26 next;
    Film26 prev;

    public Film26(int id, String judul, double rating){
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }

    public String toString(){
        return "ID: "+ id +"\nJudul Film: "+ judul +"\nRating: "+rating;
    }
}