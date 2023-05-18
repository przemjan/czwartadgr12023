package podstawy;

public class StringDemo {
    public static void main(String[] args) {

        String imie = "Euzebiusz";

        int dlugosc;

        dlugosc = imie.length();

        char inicjal = imie.charAt(0);

        String duze, male;

        imie = imie.toUpperCase();
        male = imie.toLowerCase();

        System.out.println(imie);

    }
}
