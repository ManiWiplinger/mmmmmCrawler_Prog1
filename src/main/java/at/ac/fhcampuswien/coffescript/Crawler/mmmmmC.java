package at.ac.fhcampuswien.coffescript.Crawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class mmmmmC {
    private HashSet<String> links;

    public mmmmmC() {
        links = new HashSet<String>();
    }

    public void getPageLinks(String URL) {
        final int MaxDepth = 3;
        int depth = 0;
        if (!links.contains(URL) && (depth < MaxDepth)) {
            try {
                if (links.add(URL)) {//if not add it to the index
                    System.out.println( depth + " Link:" + URL);

                }
                links.add(URL);
                Document document = Jsoup.connect(URL).get();//Fetch the HTML code
                System.out.println(document);
                Elements linksOnPage = document.select("a[href]");//Parse the HTML to extract links to other URLs
                depth++;
                for (Element page : linksOnPage) {//For each extracted URL... go back to Step 4.
                    getPageLinks(page.attr("abs:href"));
                }
            } catch (IOException e) {
                System.err.println("For '"+ URL + "': " + e.getMessage());
            }
        }
    }
}
