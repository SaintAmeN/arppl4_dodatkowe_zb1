package pl.sda.arp4;


import java.util.Scanner;

//14. Wczytaj ilość liczb i potem wypisz tyle początkowych liczb pierwszych ile wczytano
public class DodatkoweZbior1_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ilość liczb:");
        int ilosc = scanner.nextInt();

        // jedynka jest liczbą pierwszą
        int licznikPierwszych = 1;
        int liczba = 2;
        do {
            double pierwiastekZLiczby = Math.sqrt(liczba);
            boolean jestPierwsza = true;
            for (int i = 2; i <= Math.ceil(pierwiastekZLiczby); i++) {
                if(liczba % i == 0){
                    // liczba jest podzielna przez i
                    jestPierwsza = false;
                    break;
                }
            }
            if( jestPierwsza ){
                System.out.print(liczba + " ");
                licznikPierwszych++;
            }
            liczba++;
        } while (licznikPierwszych < ilosc);
    }
}
