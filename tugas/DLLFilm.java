package tugas;

public class DLLFilm {
    Film26 head;
    Film26 tail;

    public void addFirst(int id, String judul, double rating) {
        Film26 newNode = new Film26(id, judul, rating);
        if (head == null){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void addLast(int id, String judul, double rating){
        Film26 newNode = new Film26(id, judul, rating);
        if (head == null){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void  addAtIndex(int id, String judul, double rating, int index){
        if (index <= 0){
            addFirst(id, judul, rating);
            return;
        }

        Film26 newNode = new Film26(id, judul, rating);
        Film26 current = head;
        for (int i = 0; i < index - 1 && current != null; i++){
            current = current.next;
        }
        
        if (current == null){
            addLast(id, judul, rating);
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            if (current.next != null){
                current.next.prev = newNode;
            }
            current.next = newNode;
            if (newNode.next == null){
                tail = newNode;
            }
        }
    }

    public void removeFirst(){
        if (head == null){
            return;
        }
        if (head.next == null){
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast(){
        if (head == null){
            return;
        }
        if (head.next == null){
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void removeAtIndex(int index){
        if (index <= 0){
            removeFirst();
            return;
        }
        Film26 current = head;
        for (int i = 0; i < index && current != null; i++){
            current = current.next;
        }
        
        if (current == null || current.prev == null){
            return;
        }

        if (current.next == null){
            tail = current.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    public Film26 searchById(int id){
        Film26 current = head;
        while (current != null){
            if (current.id == id){
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void sortDescending(){
        if (head == null){
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            Film26 current = head;
            while (current.next != null){
                if (current.rating < current.next.rating){
                    int tempId = current.id;
                    String tempJudul = current.judul;
                    double tempRating = current.rating;

                    current.id = current.id;
                    current.judul = current.judul;
                    current.rating = current.next.rating;

                    current.next.id = tempId;
                    current.next.judul = tempJudul;
                    current.next.rating = tempRating;

                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    public void printFilms(){
        Film26 current = head;
        while (current != null){
            System.out.println(current);
            current = current.next;
        }
    }
}