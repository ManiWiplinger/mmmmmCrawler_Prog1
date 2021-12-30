package at.ac.fhcampuswien.coffescript;

import at.ac.fhcampuswien.coffescript.Crawler.mmmmmC;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("Hallo, wonach suchen wir heute?");
        Scanner scan = new Scanner(System.in);
        String eingabe  = scan.nextLine();
        HashSet<String> data = new mmmmmC().getPageLinks("http://www." + eingabe + ".at/");
        System.out.println(data.toString());
    }
}
