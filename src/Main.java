import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        setColori();
    }
    public static void setColori() {
        HashSet<String> colori = new HashSet<String>();
        colori.add("rosso");
        colori.add("bianco");
        colori.add("nero");

        System.out.println("Colori: " + colori.toString() + ", Numero colori: " + colori.size());
    }
}