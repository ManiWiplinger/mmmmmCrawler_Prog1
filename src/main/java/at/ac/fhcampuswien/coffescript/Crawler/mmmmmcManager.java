package at.ac.fhcampuswien.coffescript.Crawler;

import java.util.HashSet;
import java.util.TreeSet;

public class mmmmmcManager {
    private TreeSet<mmmmmC> content = new TreeSet<mmmmmC>();
    private int depth=0;

    public mmmmmcManager(HashSet<String> baseLinks, int depth) {
        this.depth = depth;
        this.content= nextDepthLinks(baseLinks);
    }

    public int getDepth() {
        return depth;
    }

    public TreeSet<mmmmmC> getContent() {
        return content;
    }

    private TreeSet<mmmmmC> nextDepthLinks(HashSet<String> links){
        TreeSet<mmmmmC> temp = new TreeSet<mmmmmC>();
        for(String URL : links){
            System.out.println(URL);
            mmmmmC test= new mmmmmC(URL);
            System.out.println(test.toString());
            //TODO mmmmmcCompareTo muss funktionieren https://www.geeksforgeeks.org/how-to-sort-a-treeset-with-user-defined-objects-in-java/
        }
        depth++;
        return temp;
    }
}