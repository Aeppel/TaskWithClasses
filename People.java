package biba;

import java.util.ArrayList;

public class People {
    public static void main(String[] args) {
        int randomOfficers = (int) (Math.random() * 100);
        int randomInnocents = (int) (Math.random() * 100);
        ArrayList<Object> policemen = new ArrayList<>(randomOfficers);
        ArrayList<Object> people = new ArrayList<>(randomInnocents);
        for (int i = 0; i < randomOfficers; i++) {
            PoliceOfficer policeman = new PoliceOfficer();
            policemen.add(i, policeman);

        } for (int i = 0; i < randomInnocents; i++) {
            Innocents citizens = new Innocents();
            people.add(i, citizens);

        }
        System.out.println("Полицейских: " + policemen.size());
        System.out.println("Гражданских: " + people.size());
    }
}
