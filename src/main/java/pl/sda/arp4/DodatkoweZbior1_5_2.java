package pl.sda.arp4;


import java.util.Scanner;

//5. Wczytuj liczby tak długo aż użytkownik poda 5 liczb większych od zera i potem wypisz największą z nich
//6. Wczytuj liczby tak długo aż użytkownik poda 5 liczb większych od zera i potem wypisz największą i najmniejszą z nich uwzględniając podane liczby ujemne
//7. Wczytuj liczby tak długo aż użytkownik poda 5 liczb większych od zera, 5 liczb mniejszych od zera (łącznie 10) i potem wypisz ich sumę
//8. Wczytuj liczby tak długo aż użytkownik poda 5 liczb większych od zera, 5 liczb mniejszych od zera (łącznie 10) i potem wypisz największą i najmniejszą z nich
//9. Wczytuj liczby tak długo aż użytkownik poda 5 liczb i potem wypisz ich średnią arytmetyczną
//10. Wczytuj liczby tak długo aż ich suma będzie równa 10 (edited)
//11. Wczytuj liczby tak długo aż ich suma będzie równa 0
//12. Wczytaj 10 liczb i wypisz ich medianę
//13. Wczytaj 5 liczb i wypisz je usuwając duplikaty (tj. dla liczby, która występuje więcej niż raz wypisz ją raz)
//14. Wczytaj ilość liczb i potem wypisz tyle początkowych liczb pierwszych ile wczytano
public class DodatkoweZbior1_5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tablica = new int[5];
//        Opcja 1:
        for (int i = 0; i < tablica.length; i++) {
            System.out.println("Podaj liczbe: " + (i + 1));
            int liczba = scanner.nextInt();

            if (liczba < 0){
                i--;
            }else{
                tablica[i] = liczba;
            }
        }

        int najwieksza = tablica[0];
        for (int j = 1; j < tablica.length; j++) {
            if(tablica[j] > najwieksza) {
                najwieksza = tablica[j];
            }
        }
        
        System.out.println("Najwieksza: " + najwieksza);
    }
}
