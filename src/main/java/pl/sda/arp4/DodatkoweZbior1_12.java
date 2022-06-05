package pl.sda.arp4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//12. Wczytaj 10 liczb i wypisz ich medianę
//13. Wczytaj 5 liczb i wypisz je usuwając duplikaty (tj. dla liczby, która występuje więcej niż raz wypisz ją raz)
//14. Wczytaj ilość liczb i potem wypisz tyle początkowych liczb pierwszych ile wczytano
public class DodatkoweZbior1_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tablicaLiczb = new int[10];
        for (int i = 0; i < tablicaLiczb.length; i++) {
            System.out.println("Podaj liczbe:");
            tablicaLiczb[i] = scanner.nextInt();
        }

        Arrays.sort(tablicaLiczb);

        double mediana;
        if (tablicaLiczb.length % 2 == 0) {
            // Parzyste 0 1 2 3 [4 5] 6 7 8 9
            int rozmiarListy = tablicaLiczb.length;     // 10
            int indeksSrodkowegoElementu = rozmiarListy / 2; // 5 (a musimy zrobić sumę 4+5)

            int liczba1 = tablicaLiczb[indeksSrodkowegoElementu];
            int liczba2 = tablicaLiczb[indeksSrodkowegoElementu - 1];
            mediana = (liczba1 + liczba2) / 2.0;
        } else {
            // Nieparzyste 0 1 2 3 [4] 5 6 7 8
            int rozmiarListy = tablicaLiczb.length;     // 9
            int indeksSrodkowegoElementu = rozmiarListy / 2; // 4

            mediana = tablicaLiczb[indeksSrodkowegoElementu];
        }
        System.out.println("Mediana = " + mediana);
        System.out.println("Liczby posortowane: " + Arrays.asList(tablicaLiczb));
    }
}
