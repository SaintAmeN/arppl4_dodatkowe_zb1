package pl.sda.arp4;


import java.util.Arrays;
import java.util.Scanner;

//13. Wczytaj 5 liczb i wypisz je usuwając duplikaty (tj. dla liczby, która występuje więcej niż raz wypisz ją raz)
//14. Wczytaj ilość liczb i potem wypisz tyle początkowych liczb pierwszych ile wczytano
public class DodatkoweZbior1_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tablicaLiczb = new int[5];
        for (int i = 0; i < tablicaLiczb.length; i++) {
            System.out.println("Podaj liczbe:");
            tablicaLiczb[i] = scanner.nextInt();
        }

        System.out.println("Nie duplikaty: ");
        for (int i = 0; i < tablicaLiczb.length; i++) {
            int liczbaSzukana = tablicaLiczb[i];

            boolean znaleziono = false;
            for (int j = i+1; j < tablicaLiczb.length; j++) {
                int liczbaPorownywana = tablicaLiczb[j];
                if (liczbaPorownywana == liczbaSzukana) {
                    znaleziono = true;
                }
            }
            if(!znaleziono){
                System.out.print(liczbaSzukana + " ");
            }
        }
        System.out.println();
    }
}
