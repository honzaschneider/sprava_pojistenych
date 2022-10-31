package net.zebedee;

import java.util.ArrayList;

public class Databaze {

    private ArrayList<Pojistenec> pojistenci;

    public Databaze() {
        pojistenci = new ArrayList<>();
    }

    public void pridaniPojisteneho(String jmeno, String prijmeni, int vek, String telefonniCislo) {
        pojistenci.add(new Pojistenec(jmeno, prijmeni, vek, telefonniCislo));
    }

    public void vypisPojistene() {
        for (Pojistenec p : pojistenci) {
            System.out.println(p);
            System.out.println("");
        }
    }

    public void najdiPojisteneho(String hledaneJmeno, String hledanePrijmeni) {
        ArrayList<Pojistenec> nalezeniPojistenci = new ArrayList<>();
        for (Pojistenec p : pojistenci) {
            if (p.getJmeno().equals(hledaneJmeno) && p.getPrijmeni().equals(hledanePrijmeni)) {
                nalezeniPojistenci.add(p);
            }
        }
        if (!nalezeniPojistenci.isEmpty()) {
            if (nalezeniPojistenci.size() == 1) {
                System.out.println("Nalezen pojištěnec:");
                System.out.println(nalezeniPojistenci.get(0));
            } else if(nalezeniPojistenci.size() > 1) {
                System.out.println("Nalezení pojištěnci:");
                for (Pojistenec p : nalezeniPojistenci) {
                    System.out.println(p);
                }
            }
        } else {
            System.out.println("Pojištěnec nebyl nalezen.");
        }
    }
}
