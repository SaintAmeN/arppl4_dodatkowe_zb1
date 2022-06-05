package pl.sda.arp4;


import java.util.Scanner;

//4. Wczytaj jedną liczbę (`a`) i wypisz wynik działania `a` silnia - używaj tylko mnożenia
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
public class DodatkoweZbior1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe a:");
        int a = scanner.nextInt();

//        Opcja 1:
//        int wynik = 1;
//        for (int i = 1; i <= a; i++) {
//            wynik *= i;
//        }
//        System.out.println("Wynik a!: " + wynik);

//        Opcja 2
        int wynik = 1;
        while (a >= 1){
            wynik *= a;
            a--;
        }
        System.out.println("Wynik a!: " + wynik);
    }
}
