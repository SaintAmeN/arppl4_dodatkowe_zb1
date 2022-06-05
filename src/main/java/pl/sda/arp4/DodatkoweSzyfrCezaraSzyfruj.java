package pl.sda.arp4;

import java.util.Scanner;

public class DodatkoweSzyfrCezaraSzyfruj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst:");
        String tekst = scanner.nextLine();

        System.out.println("Podaj liczbę która będzie kluczem szyfru:");
        int klucz = scanner.nextInt();

        // robimy kopię
        char[] wynik = tekst.toCharArray();
        for (int i = 0; i < wynik.length; i++) {
            int litera = wynik[i];

            if(Character.isAlphabetic(litera)){
                if(Character.isUpperCase(litera)){
                    litera -= 'A';
                    litera += klucz;
                    litera = litera % 25;
                    litera += 'A';
                }else if(Character.isLowerCase(litera)){
                    litera -= 'a';
                    litera += klucz;
                    litera = litera % 25;
                    litera += 'a';
                }
            }
            wynik[i] = (char)litera;
        }

        String wynikString = new String(wynik);
        System.out.println("Wynik: " + wynikString);
    }
}
