package net.zebedee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "Windows-1250");
        Utility editace = new Utility();
        int menu = 0;

        while (menu != 4) {
            System.out.println("------------------------------");
            System.out.println("  Evidence pojištěných osob");
            System.out.println("------------------------------");
            System.out.println("Vyberte si akci:");
            System.out.println("1 - Přidat nového pojištěného");
            System.out.println("2 - Vypsat všechny pojištěné");
            System.out.println("3 - Vyhledat pojištěného");
            System.out.println("4 - Ukončit program");
            menu = Integer.parseInt(sc.nextLine());
            System.out.println("");
            switch (menu) {
                case 1:
                    editace.pridejPojistence();
                    break;
                case 2:
                    editace.vypisPojistene();
                    break;
                case 3:
                    editace.najdiPojisteneho();
                    break;
                case 4:
                    editace.ukonceniProgramu();
                    break;
                default:
                    editace.spatnyVyber();
                    break;
            }
        }
    }
}