package at.ac.fhcampuswien.coffescript.Crawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.HashSet;

public class mmmmmC {
    private HashSet<String> links;
    int countLinks = 0;

    public mmmmmC() {
        links = new HashSet<String>();
        countLinks=0;
    }

    public HashSet<String> getPageLinks(String URL) {
        if (!links.contains(URL)){
            try {
                Document document = Jsoup.connect(URL).get();//Fetch the HTML code
                Elements linksOnPage = document.select("a[href]");//Parse the HTML to extract links to other URLs
                for (Element page : linksOnPage) {//For each extracted URL... go back to Step 4.
                    links.add(page.attr("abs:href"));
                }
                return links;
            } catch (IOException e) {
                System.err.println("For '"+ URL + "': " + e.getMessage());
            }
        }
        return links;
    }

    @Override
    public String toString() {
        return "Link "+(countLinks+1)+":";
    }
}
