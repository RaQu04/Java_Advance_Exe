package Szkola;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Board tablica_lg = new Board("Tablica LG", 1111);
        Board tablica_samsung = new Board("Tablica samsung", 2222);

        Chair krzeslo_ciemne = new Chair("Krzesło ciemne", 3333);
        Chair krzeslo_jasne = new Chair("Krzesło jasne", 4444);

        Table stol_brazowy = new Table("Stół brązowy", 5555);
        Table stol_jasny = new Table("Stół jasny", 6666);

        Sala sala1 = new Sala(1, 15,
                tablica_lg, 1,
                krzeslo_ciemne, 15,
                stol_brazowy, 15);

        Sala sala2 = new Sala(2, 20,
                tablica_samsung, 2,
                krzeslo_ciemne, 20,
                stol_jasny, 20);

        Sala sala3 = new Sala(3, 25,
                tablica_lg, 3,
                krzeslo_ciemne, 25,
                stol_jasny, 25);


        Set<Sala> sale = new HashSet<>();

        sale.add(sala1);
        sale.add(sala2);
        sale.add(sala3);

        for (Sala sala : sale) {
            System.out.println(sala);
        }

    }
}
