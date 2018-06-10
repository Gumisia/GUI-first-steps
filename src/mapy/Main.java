package mapy;

import java.awt.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    /*

        klucz - wartosc

        y = - x ^ 2


        x = 2, y = -4
        x = -2, y = -4


        tab['klucz'} = wartość


     */

    public static void main(String[] args) {

//        Map<Integer, String> map = new HashMap(); // nie jest uporzątkowana jak TreeMap
//        Map<Integer, String> map = new TreeMap();
//        TreeMap<Integer, String> map = new TreeMap();
        TreeMap<Integer, Pracownik> map = new TreeMap();

        Pracownik[] pracowniks = {

                new Pracownik("Agnieszka"),
                new Pracownik("Bartek"),
                new Pracownik("Aleksander"),
                new Pracownik("Arkadiusz"),
                new Pracownik("Agnieszka"),
                new Pracownik("Bartek"),
                new Pracownik("Aleksander"),
                new Pracownik("Arkadiusz"),
                new Pracownik("Agnieszka"),
                new Pracownik("Bartek"),
                new Pracownik("Aleksander"),
                new Pracownik("Arkadiusz"),
                new Pracownik("Agnieszka"),
                new Pracownik("Bartek"),
                new Pracownik("Aleksander"),
                new Pracownik("Arkadiusz"),
                new Pracownik("Agnieszka"),
                new Pracownik("Bartek"),
                new Pracownik("Aleksander"),
                new Pracownik("Arkadiusz"),
                new Pracownik("Agnieszka"),
                new Pracownik("Bartek"),
                new Pracownik("Aleksander"),
                new Pracownik("Arkadiusz"),
                new Pracownik("Agnieszka"),
                new Pracownik("Bartek"),
                new Pracownik("Aleksander"),
                new Pracownik("Arkadiusz"),
                new Pracownik("Agnieszka"),
                new Pracownik("Bartek"),
                new Pracownik("Aleksander"),
                new Pracownik("Arkadiusz")
        };

        for(Pracownik pracownik : pracowniks){
            map.put(pracownik.getID(), pracownik);
        }
        System.out.println(map);

        map.remove(3); // usuwamy element o ID 3
        System.out.println(map);

        map.put(4, new Pracownik("Asia"));
        System.out.println(map); // podmienia wartość dla ID 4

        map.put(3, new Pracownik("Gabi"));
        System.out.println(map); // dodaje 3 element jeśli nie ma ID 3


        System.out.println("\nMap\n");

        for(Map.Entry<Integer, Pracownik> wpis : map.entrySet()){
            System.out.println("ID pracownika: " + wpis.getKey());
            System.out.println("Imię pracownika: " + wpis.getValue().getImie());
        }

        /*

            A = {4. 5. 6. 7. 8}
            B = {5. 6}
         */

        Map<Integer, Pracownik> subMap = map.subMap(0, 11); // wypisze <1,10>
        if(subMap.isEmpty()) {
            System.out.println("Empty");
        }
        else {
            System.out.println("\nSubMap\n");
            for (Map.Entry<Integer, Pracownik> wpis : subMap.entrySet()) {
                System.out.println("ID pracownika: " + wpis.getKey());
                System.out.println("Imię pracownika: " + wpis.getValue().getImie());
            }
        }

        Map<Date, Event> exampleMap;




    }
}

class Pracownik{

    String imie;
    private int ID;
    public static int i=0;

    public Pracownik(){
        i++;
        ID = i;
    }

    Pracownik(String imie){
        this();
        this.imie = imie;
    }

    public int getID() {
        return ID;
    }

    public String getImie() {
        return imie;
    }

    @Override
    public String toString() {
        return imie;
    }
}
