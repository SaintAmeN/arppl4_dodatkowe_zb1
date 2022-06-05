package pl.sda.arp4;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//11. Wczytuj liczby tak długo aż ich suma będzie równa 0
//12. Wczytaj 10 liczb i wypisz ich medianę
//13. Wczytaj 5 liczb i wypisz je usuwając duplikaty (tj. dla liczby, która występuje więcej niż raz wypisz ją raz)
//14. Wczytaj ilość liczb i potem wypisz tyle początkowych liczb pierwszych ile wczytano
public class DodatkoweZbior1_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // to jest dodatkowe, nie musiałem tego robić, ale zbiore liczby do kolekcji
        List<Integer> listaLiczb = new ArrayList<>();

        int suma = 0;
        do{
            System.out.println("Wpisz liczbe:");
            int liczba =scanner.nextInt();

            suma += liczba;
            listaLiczb.add(liczba);
        }while (suma != 0);

        System.out.println("Suma jest równa 10. Podano liczby: " + listaLiczb);
    }
}
