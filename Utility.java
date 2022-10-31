package net.zebedee;

import java.util.Scanner;

public class Utility {

    private Scanner sc = new Scanner(System.in, "Windows-1250");

    private Databaze databaze;

    public Utility() {
        databaze = new Databaze();
        databaze.pridaniPojisteneho("Luděk", "Mařík", 45, "123 456 789");
        databaze.pridaniPojisteneho("Václav", "Děděček", 75, "798 543 154");
        databaze.pridaniPojisteneho("Pavel", "Novotný", 25, "456 789 123");
    }

    public void pridejPojistence() {
        System.out.println("Zadejte křestní jméno: ");
        String jmeno = sc.nextLine();
        System.out.println("Zadejte příjmení: ");
        String prijmeni = sc.nextLine();
        System.out.println("Zadejte věk: ");
        int vek = Integer.parseInt(sc.nextLine());
        System.out.println("Zadejte telefonní číslo: ");
        String telefonniCislo = sc.nextLine();
        databaze.pridaniPojisteneho(jmeno, prijmeni, vek, telefonniCislo);
    }

    public void najdiPojisteneho() {
        System.out.println("Zadejte jméno pojištěného:");
        String hledaneJmeno = sc.nextLine();
        System.out.println("Zadejte příjmení pojištěného:");
        String hledanePrijmeni = sc.nextLine();
        databaze.najdiPojisteneho(hledaneJmeno, hledanePrijmeni);
    }

    public void vypisPojistene() {
        databaze.vypisPojistene();
    }

    public void ukonceniProgramu() {
        System.out.println("Program byl ukončen.");
    }

    public void spatnyVyber() {
        System.out.println("Neplatná volba, zadejte prosím číslo v rozmezí 1 - 4:");
    }
}
