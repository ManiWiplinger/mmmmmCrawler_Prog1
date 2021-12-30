package at.ac.fhcampuswien.coffescript.Crawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.HashSet;
import java.util.TreeSet;

public class mmmmmC{
    private String URL="";
    private HashSet<String> links = new HashSet<String>();

    public mmmmmC(String URL) {
        this.URL = URL;
        parseHTML();
    }

    public void parseHTML(){
        if (!links.contains(URL)){
            try {
                Document document = Jsoup.connect(URL).get();//Fetch the HTML code
                Elements linksOnPage = document.select("a[href]");//Parse the HTML to extract links to other URLs
                for (Element page : linksOnPage) {//For each extracted URL... go back to Step 4.
                    links.add(page.attr("abs:href"));
                }
            } catch (IOException e) {
                System.err.println("For '"+ URL + "': " + e.getMessage());
            }
        }
    }
    public HashSet<String> getPageLinks() {
        return links;
    }
    public int getCountLinks() {
        return links.size();
    }

    public String getURL() {
        return URL;
    }

    @Override
    public String toString() {
        TreeSet<String> temp= new TreeSet<String>(links);
        StringBuilder out= new StringBuilder();
        int i=1;
        for(String tmp : temp){
            out.append("Link ").append(i).append(": ").append(tmp).append("\n");
            i++;
        }
        return out.toString();
    }
}
