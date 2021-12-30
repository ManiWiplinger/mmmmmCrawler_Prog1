package at.ac.fhcampuswien.coffescript;

import at.ac.fhcampuswien.coffescript.Crawler.mmmmmC;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hallo, wonach suchen wir heute?");
        Scanner scan = new Scanner(System.in);
        String eingabe  = scan.nextLine();

        new mmmmmC().getPageLinks("http://www."+eingabe+".at/");
    }
}
