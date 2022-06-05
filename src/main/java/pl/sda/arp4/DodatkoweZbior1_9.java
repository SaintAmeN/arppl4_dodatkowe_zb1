package pl.sda.arp4;


import java.util.Scanner;

//9. Wczytuj liczby tak długo aż użytkownik poda 5 liczb i potem wypisz ich średnią arytmetyczną
//10. Wczytuj liczby tak długo aż ich suma będzie równa 10 (edited)
//11. Wczytuj liczby tak długo aż ich suma będzie równa 0
//12. Wczytaj 10 liczb i wypisz ich medianę
//13. Wczytaj 5 liczb i wypisz je usuwając duplikaty (tj. dla liczby, która występuje więcej niż raz wypisz ją raz)
//14. Wczytaj ilość liczb i potem wypisz tyle początkowych liczb pierwszych ile wczytano
public class DodatkoweZbior1_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tablica = new int[5];
        int iloscMniejszych = 0, iloscWiekszych = 0;

        for (int i = 0; i < tablica.length; i++) {
            System.out.println("Podaj liczbe: " + (i + 1));
            int liczba = scanner.nextInt();

            tablica[i] = liczba;
        }

        double suma = 0;
        for (int j = 0; j < tablica.length; j++) {
            suma += tablica[j];
        }
        double srednia = suma / tablica.length;
        System.out.println("Srednia: " + srednia);
    }
}
