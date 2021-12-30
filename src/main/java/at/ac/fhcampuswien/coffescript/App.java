package at.ac.fhcampuswien.coffescript;

import at.ac.fhcampuswien.coffescript.Crawler.mmmmmC;
import at.ac.fhcampuswien.coffescript.Crawler.mmmmmcManager;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Hallo, wonach soll ich für dich suchen?");
        String eingabe  = scan.nextLine();
        System.out.print("Wie weit soll ich gehen?");
        int depth  = scan.nextInt();
        mmmmmC data = new mmmmmC("http://www." + eingabe + ".at/");
        System.out.println(data.toString());
        mmmmmcManager dataDepth = new mmmmmcManager(data.getPageLinks(),depth);
        /**for(mmmmmC out : dataDepth.getContent()){
            System.out.println(out.toString());
        }**/
    }
}
